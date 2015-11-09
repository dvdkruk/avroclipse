package avroclipse.ui.highlighting

import avroclipse.avroIDL.Annotation
import avroclipse.avroIDL.AvroIDLPackage
import avroclipse.avroIDL.util.AvroIDLSwitch
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.nodemodel.ILeafNode
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator

import static avroclipse.ui.highlighting.AvroIDLSemanticHighlightingCalculator.*

/**
 * @see http://stackoverflow.com/questions/5008773/xtext-using-the-grammar-classes-in-isemantichighlightingcalculator
 * 
 * @author Damiaan van der Kruk
 */
class AvroIDLSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	override provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		if (resource == null) {
			return;
		}

		val switcher = new HighlightingSwitch(acceptor);

		val iter = EcoreUtil.getAllContents(resource, true);
		while (iter.hasNext()) {
			val current = iter.next();
			switcher.doSwitch(current);
		}
	}

	static class HighlightingSwitch extends AvroIDLSwitch<Void> {

		private final IHighlightedPositionAcceptor acceptor;

		new(IHighlightedPositionAcceptor acceptor) {
			this.acceptor = acceptor;
		}

		override Void caseAnnotation(Annotation annotation) {
			val node = getFirstFeatureNode(annotation, AvroIDLPackage.eINSTANCE.annotation_Name);
			highlightNode(node, AvroIDLHighlightingConfiguration.ANNOTATION);
			return null;
		}
		
		def highlightNode(INode node, String id) {
			if (node == null)
				return;
			if (node instanceof ILeafNode) {
				acceptor.addPosition(node.getOffset(), node.getLength(), id);
			} else {
				for (ILeafNode leaf : node.getLeafNodes()) {
					if (!leaf.isHidden()) {
						acceptor.addPosition(leaf.getOffset(), leaf.getLength(), id);
					}
				}
			}
		}
	}

	def static INode getFirstFeatureNode(EObject semantic, EStructuralFeature feature) {
		if (feature == null)
			return NodeModelUtils.findActualNodeFor(semantic);
		val nodes = NodeModelUtils.findNodesForFeature(semantic, feature);
		if (!nodes.isEmpty())
			return nodes.get(0);
		return null;
	}

}