package avroclipse;

import java.util.List;
import java.util.Vector;

import org.eclipse.xtext.generator.IGenerator;

public class Registry {

	public final static Registry INSTANCE = init();

	private List<IGenerator> _generators;

	private Registry() {
		_generators = new Vector<IGenerator>();
	}

	public List<IGenerator> getGenerators() {
		return _generators;
	}

	public void addGenerator(IGenerator generator) {
		_generators.add(generator);
	}

	private static Registry init() {
		return new Registry();
	}

}
