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

/**
 * @author Damiaan van der Kruk
 */
@RunWith(typeof(XtextRunner))
@InjectWith(typeof(AvroIDLInjectorProvider))
class ParserTests {
	
	@Inject extension ParseHelper<AvroIDLFile>
	@Inject extension ValidationTestHelper

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