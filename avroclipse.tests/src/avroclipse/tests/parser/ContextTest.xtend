package avroclipse.tests.parser

import avroclipse.AvroIDLInjectorProvider
import com.google.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Damiaan van der Kruk
 */
@RunWith(typeof(XtextRunner))
@InjectWith(typeof(AvroIDLInjectorProvider))
class ContextTest {
	
	static val PATH_BASE = 'examples/'
	static val FILE_NAME = 'contexts.avdl'
	
	@Inject extension ResourceSet
	@Inject extension ValidationTestHelper
	
	@Test
	def testNoErrors() {
		res.assertNoErrors
	}
	
	def getRes() {
		getResource(URI.createURI(PATH_BASE + FILE_NAME), true)
	}
}