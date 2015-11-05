package avroclipse.generator.java;

import avroclipse.AvroIDLStandaloneSetup;
import avroclipse.Registry;

public class Standalone {
	public static void main(String[] args) {
		//TODO:
	}
	
	public Standalone() {
		AvroIDLStandaloneSetup.doSetup();
		
		Registry.INSTANCE.getGenerators().add(new JavaWithAnnotationsGenerator());
	}
}
