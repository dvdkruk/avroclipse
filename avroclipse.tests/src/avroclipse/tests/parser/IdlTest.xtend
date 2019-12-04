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
import java.io.File

/**
 * @author Damiaan van der Kruk
 */
@RunWith(typeof(XtextRunner))
@InjectWith(typeof(AvroIDLInjectorProvider))
class IdlTest {
	
	static val PATH_BASE = 'examples/'
	static val FILE_NAME = 'idl.avdl'
	
	@Inject extension ResourceSet
	@Inject extension ValidationTestHelper
	
	//TODO: fix namespace for records
	@Test
	def testNoErrors() {
		res.assertNoErrors //throws an error its oke
	}
	
	def getRes() {
		getResource(URI.createURI(new File(PATH_BASE + "foo.avdl").toURI().toString()), true) //needed for reference
		getResource(URI.createURI(new File(PATH_BASE + FILE_NAME).toURI().toString()), true)
	}
}