package avroclipse;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

public class Helper {

	private Helper() {
	}

	public static void initEclipseGeneratorExtensions() {
		if (isEclipseRunning()) {
			IConfigurationElement[] configElements = Platform.getExtensionRegistry()
					.getConfigurationElementsFor(AvroIDLRuntimeModule.GENERATORS_POINT_ID);
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
