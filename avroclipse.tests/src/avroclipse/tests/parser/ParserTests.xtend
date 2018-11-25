package avroclipse.tests.parser

import avroclipse.AvroIDLInjectorProvider
import avroclipse.avroIDL.AvroIDLFile
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet

/**
 * @author Damiaan van der Kruk
 */
@RunWith(typeof(XtextRunner))
@InjectWith(typeof(AvroIDLInjectorProvider))
class ParserTests {

	@Inject extension ParseHelper<AvroIDLFile>
	@Inject extension ValidationTestHelper
	@Inject ResourceSet rs

	@Test
	def testInvalidNestedUnion() {
		val idlFile = '''
			protocol ExampleInvalidProtocol {
				record NestedUnion {
					union{null, union{int, string}} nestedUnion = null;
				}
			}
		'''.parse

		assertTrue(idlFile.eResource.errors.size > 0)
	}

	@Test
	def testUnionWithMap() {
		val idlFile = '''
			protocol ExampleProtocol {
				record UnionWithArray {
					union{null, map<string>} nullableStringMap = null;
				}
			}
		'''.parse

		idlFile.assertNoErrors
	}

	@Test
	def testUnionWithArray() {
		val idlFile = '''
			protocol ExampleProtocol {
				record UnionWithArray {
					union{null, array<string>} nullableStringArray = null;
				}
			}
		'''.parse

		idlFile.assertNoErrors
	}

	@Test
	def testArrayArgumentType() {
		val idlFile = '''
			protocol ExampleProt {
				void setArrOfInts(array<int> ints);
			}
		'''.parse

		idlFile.assertNoErrors
	}

	@Test
	def testArrayReturnType() {
		val idlFile = '''
			protocol ExampleProt {
				array<int> returnArrOfInts();
			}
		'''.parse

		idlFile.assertNoErrors
	}
	
	@Test
	def namespace_withSpecialCharacters_isParsableWithoutErrors() {
		val idlFile = '''
			@namespace("~!@#$%^&*()_+`1234567890-={:>}?|<")
			protocol WithSpecialCharactersInNamespace {}
		'''.parse
		
		idlFile.assertNoErrors
	}
	
	@Test
	def union_withTypeAnnotations_isParsableWithoutErrors() {
		'''
		protocol Protocol {
			record RecordWithUnion {
			 union{ null, @java-key-class("java.net.URI") map<@java-class("String") string>} UserBank = null;
			}
		}'''.parse
			.assertNoErrors
	}
  
  @Test
	def customTypeLink_withImportTargetInSameNamespace_isParsableWithoutErrors() {
		'''
		@namespace("org.common.objects")
		protocol Door {
		  record Door {
		    string brand;
		  }
		}'''.parse(URI.createURI("door.avdl"), rs)
			.assertNoErrors
			
		'''
		@namespace("org.common.objects")
		protocol House {
		  import idl "door.avdl";
		  
		  Door getDoorBySimpleName();
		  org.common.objects.Door getDoorByFullyQualifiedName();
		}'''.parse(URI.createURI("house.avdl"), rs)
			.assertNoErrors	
	}
}
