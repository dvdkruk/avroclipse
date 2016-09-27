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

/**
 * @author Damiaan van der Kruk
 */
@RunWith(typeof(XtextRunner))
@InjectWith(typeof(AvroIDLInjectorProvider))
class ParserTests {

	@Inject extension ParseHelper<AvroIDLFile>
	@Inject extension ValidationTestHelper

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

}
