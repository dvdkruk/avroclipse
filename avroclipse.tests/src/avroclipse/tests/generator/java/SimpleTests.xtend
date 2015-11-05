package avroclipse.tests.generator.java

import avroclipse.AvroIDLInjectorProvider
import avroclipse.Registry
import avroclipse.avroIDL.AvroIDLFile
import avroclipse.generator.java.JavaWithAnnotationsGenerator
import com.google.inject.Inject
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*
import org.eclipse.xtext.junit4.validation.ValidationTestHelper

@InjectWith(AvroIDLInjectorProvider)
@RunWith(XtextRunner)
class SimpleTests {

	@Inject extension IGenerator underTest
	@Inject extension ParseHelper<AvroIDLFile> parseHelper
	@Inject extension ValidationTestHelper

	@BeforeClass
	def static void setup() {
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
		
		//Test private fields of different types
		assertThat(content, containsString("private String name;"))
		assertThat(content, containsString("private Integer integer;"))
		assertThat(content, containsString("private Long l;"))
		assertThat(content, containsString("private Boolean bool;"))
		assertThat(content, containsString("private byte[] b;"))
		assertThat(content, containsString("private Float f;"))
		assertThat(content, containsString("private Double d;"))
		
		//println(content)
	}
	
	@Test
	def void testTwoRecordsWithReferences() {
		val targetFilePathCoordinates = 'Coordinates.java'
		val targetFilePathPOI = 'POI.java'
		
		val idlFile = '''
			protocol TestProtocol {
				record Coordinates {
					double x;
					double y;
					double z;
				}
				
				record POI {
					string name;
					Coordinates cordinates;
				}
			}
		'''.parse
		
		idlFile.eResource.assertNoErrors
		val fsa = new InMemoryFileSystemAccess()
		
		idlFile.eResource.doGenerate(fsa)
		
		val contentCoordinates = fsa.getContentOfFile(targetFilePathCoordinates)
		val contentPOI = fsa.getContentOfFile(targetFilePathPOI)
		
		assertTrue("File '" + targetFilePathCoordinates + "' is not generated", !contentCoordinates.nullOrEmpty)
		assertTrue("File '" + targetFilePathPOI + "' is not generated", !contentPOI.nullOrEmpty)
		
		println(contentCoordinates)
		println(contentPOI)
	}
	
	def static getContentOfFile(InMemoryFileSystemAccess fsa, String relativeFilePath) {
		if(fsa.allFiles.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + relativeFilePath)) {
			return fsa.textFiles.get(IFileSystemAccess::DEFAULT_OUTPUT + relativeFilePath).toString
		}
		return null
	}
	
}