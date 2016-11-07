package avroclipse.ui.highlighting

import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle

/**
 * @author Damiaan van der Kruk
 */
class AvroIDLHighlightingConfiguration extends DefaultHighlightingConfiguration {
	public static val ANNOTATION = 'Annotation';

	override configure(IHighlightingConfigurationAcceptor acceptor) {

		acceptor.acceptDefaultHighlighting(ANNOTATION, ANNOTATION, Annotation);

		super.configure(acceptor);
	}

	def TextStyle Annotation() {
		val textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(100, 100, 100));
		return textStyle;
	}
}