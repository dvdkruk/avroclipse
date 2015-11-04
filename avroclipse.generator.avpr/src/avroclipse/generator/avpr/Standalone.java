 package avroclipse.generator.avpr;

import avroclipse.AvroIDLStandaloneSetup;
import avroclipse.Registry;

public class Standalone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Standalone() {
		AvroIDLStandaloneSetup.doSetup();
		
		Registry.INSTANCE.getGenerators().add(new GeneratorExtension());
	}

}
