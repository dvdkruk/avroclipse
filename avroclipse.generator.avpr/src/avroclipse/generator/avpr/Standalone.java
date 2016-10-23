 package avroclipse.generator.avpr;

import avroclipse.AvroIDLStandaloneSetup;
import avroclipse.Registry;

public class Standalone {

	public static void main(String[] args) {
		new Standalone();
		
	}

	public Standalone() {
		AvroIDLStandaloneSetup.doSetup();
		
		Registry.INSTANCE.addGenerator(new AvprFileGenerator());
	}

}
