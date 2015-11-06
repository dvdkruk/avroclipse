package avroclipse.tests.generator.java

import avroclipse.AvroIDLInjectorProvider
import avroclipse.Registry
import avroclipse.avroIDL.AvroIDLFile
import avroclipse.generator.java.JavaWithAnnotationsGenerator
import com.google.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

@InjectWith(AvroIDLInjectorProvider)
@RunWith(XtextRunner)
class IdlToJavaTests {

	@Inject extension IGenerator
	@Inject extension ParseHelper<AvroIDLFile>
	@Inject extension ValidationTestHelper
	@Inject extension ResourceSet

	@BeforeClass
	def static void setUp() {
		Registry.INSTANCE.generators.add(new JavaWithAnnotationsGenerator())
	}

	@Test
	def void testOneRecordWithOnlyPrimativeTypes() {
		val targetFilePath = 'TestRecord.java'

		val idlFile = '''
			protocol TestProtocol {
				record TestRecord {
					string name;
					int integer;
					long l;
					boolean bool;
					bytes b;
					float f;
					double d;
				}
			}
		'''.parse

		idlFile.eResource.assertNoErrors
		val fsa = new InMemoryFileSystemAccess()

		idlFile.eResource.doGenerate(fsa)

		val content = fsa.getContentOfFile(targetFilePath)
		assertTrue("File '" + targetFilePath + "' is not generated", !content.nullOrEmpty)
		assertThat(content, containsString("class TestRecord"))

		// Test private fields of different types
		assertThat(content, containsString("String name;"))
		assertThat(content, containsString("Integer integer;"))
		assertThat(content, containsString("Long l;"))
		assertThat(content, containsString("Boolean bool;"))
		assertThat(content, containsString("byte[] b;"))
		assertThat(content, containsString("Float f;"))
		assertThat(content, containsString("Double d;"))

		assertThat(content, containsString("public String getName() {"))
		assertThat(content, containsString("public void setName(String name) {"))

		assertThat(content, containsString("public Double getD() {"))
		assertThat(content, containsString("public void setD(Double d) {"))

	// println(content)
	}

	@Test
	def void testTwoRecordsWithReferences() {
		val targetFilePathCoordinate = 'Coordinate.java'
		val targetFilePathPOI = 'POI.java'

		val idlFile = '''
			protocol TestProtocol {
				record Coordinate {
					double x;
					double y;
					double z;
				}
				
				record POI {
					string name;
					Coordinate coordinate;
				}
			}
		'''.parse

		idlFile.eResource.assertNoErrors
		val fsa = new InMemoryFileSystemAccess()

		idlFile.eResource.doGenerate(fsa)

		val contentCoordinate = fsa.getContentOfFile(targetFilePathCoordinate)
		val contentPOI = fsa.getContentOfFile(targetFilePathPOI)

		assertTrue("File '" + targetFilePathCoordinate + "' is not generated", !contentCoordinate.nullOrEmpty)
		assertTrue("File '" + targetFilePathPOI + "' is not generated", !contentPOI.nullOrEmpty)

		assertThat(contentPOI, containsString("Coordinate coordinate;"))

	// println(contentCoordinate)
	// println(contentPOI)
	}

	@Test
	def void testOneRecordWithNamespace() {
		val targetFilePath = 'org/example/tests/Record0.java'

		val idlFile = '''
			@namespace("org.example.tests")
			protocol TestProtocol {
				record Record0 {
					int id;
				}
			}
		'''.parse

		idlFile.eResource.assertNoErrors
		val fsa = new InMemoryFileSystemAccess()

		idlFile.eResource.doGenerate(fsa)

		val content = fsa.getContentOfFile(targetFilePath)

		assertTrue("File '" + targetFilePath + "' is not generated", !content.nullOrEmpty)

		assertThat(content, containsString("package org.example.tests"))

	// println(content)
	}

	@Test
	def void testTwoRecordsWithDifferentNamespaceReferences() {
		getResource(URI.createURI("examples/echo.avdl"), true)

		val targetFilePath = 'org/example/tests/PingPong.java'

		val idlFile0 = '''
			@namespace("org.example.tests")
			protocol PingPong {
				
				import idl "examples/echo.avdl";
				
				record PingPong {
					org.apache.avro.echo.Ping ping;
					org.apache.avro.echo.Pong pong;
				}
			}
		'''.parse

		idlFile0.eResource.assertNoErrors

		val fsa = new InMemoryFileSystemAccess()

		idlFile0.eResource.doGenerate(fsa)

		val content = fsa.getContentOfFile(targetFilePath)

		assertTrue("File '" + targetFilePath + "' is not generated", !content.nullOrEmpty)

		assertThat(content, containsString("import org.apache.avro.echo.Ping;"))
		assertThat(content, containsString("import org.apache.avro.echo.Pong;"))
		assertThat(content, containsString("Ping ping;"))
		assertThat(content, containsString("Pong pong;"))

	// println(content)
	}
	
	@Test
	def void testEnumType() {
		val targetFilePath = 'org/example/enums/Colors.java'

		val idlFile = '''
			@namespace("org.example.enums")
			protocol EnumTypes {
				enum Colors {
					RED, BLUE, GREEN
				}
			}
		'''.parse

		idlFile.eResource.assertNoErrors
		val fsa = new InMemoryFileSystemAccess()

		idlFile.eResource.doGenerate(fsa)

		val content = fsa.getContentOfFile(targetFilePath)

		assertTrue("File '" + targetFilePath + "' is not generated", !content.nullOrEmpty)

		assertThat(content, containsString("public enum Colors {"))

		println(content)
	}
	
	@Test
	def void testFixedType() {
		val targetFilePath = 'org/example/fixed/MD5.java'

		val idlFile = '''
			@namespace("org.example.fixed")
			protocol FixedTypes {
				fixed MD5(16);
			}
		'''.parse

		idlFile.eResource.assertNoErrors
		val fsa = new InMemoryFileSystemAccess()

		idlFile.eResource.doGenerate(fsa)

		val content = fsa.getContentOfFile(targetFilePath)

		assertTrue("File '" + targetFilePath + "' is not generated", !content.nullOrEmpty)
		
		assertThat(content, containsString("@FixedSize(16)"))

		assertThat(content, containsString("import org.apache.avro.specific.SpecificFixed;"))
		assertThat(content, containsString("org.apache.avro.specific.FixedSize;"))
		
		assertThat(content, containsString("public class MD5 extends SpecificFixed {"))

		println(content)
	}

	@Test
	def void testRecordWithArray() {
		val targetFilePath = 'org/example/array/Record.java'

		val idlFile = '''
			@namespace("org.example.array")
			protocol TestProtocol {
				record Record {
					array<int> ids;
					array<Value> values;
				}
				
				record Value {
					string val;
				}
			}
		'''.parse

		idlFile.eResource.assertNoErrors
		val fsa = new InMemoryFileSystemAccess()

		idlFile.eResource.doGenerate(fsa)

		val content = fsa.getContentOfFile(targetFilePath)

		assertTrue("File '" + targetFilePath + "' is not generated", !content.nullOrEmpty)

		assertThat(content, containsString("import java.util.List;"))
		assertThat(content, containsString("List<Integer> ids;"))
		assertThat(content, containsString("List<Value> values;"))
		
		assertThat(content, containsString("public List<Integer> getIds() {"))
		assertThat(content, containsString("public void setValues(List<Value> values) {"))

	// println(content)
	}
	
	def static getContentOfFile(InMemoryFileSystemAccess fsa, String relativeFilePath) {
		if (fsa.allFiles.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + relativeFilePath)) {
			return fsa.textFiles.get(IFileSystemAccess::DEFAULT_OUTPUT + relativeFilePath).toString
		}
		return null
	}

}