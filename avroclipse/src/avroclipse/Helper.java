package avroclipse;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.generator.IGenerator;

public class Helper {

	private Helper() {
	}

	public static void initEclipseGeneratorExtensions() {
		if (isEclipseRunning()) {
			IConfigurationElement[] configElements = Platform.getExtensionRegistry()
					.getConfigurationElementsFor(AvroIDLRuntimeModule.GENERATORS_POINT_ID);
			try {
				for (IConfigurationElement configElement : configElements) {

					Object o = configElement.createExecutableExtension("class");
					if(o instanceof IGenerator) {
						Registry.INSTANCE.getGenerators().add((IGenerator) o);
					} else {
						throw new IllegalStateException("Object '" + o + "' is not of type '" + IGenerator.class + "'");
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

	public static boolean isEclipseRunning() {
		try {
			return Platform.isRunning();
		} catch (Throwable e) {
			// We assume that Eclipse is not running
		}
		return false;
	}
}
