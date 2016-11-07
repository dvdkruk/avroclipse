package avroclipse.ui.highlighting;

import static com.google.common.collect.Sets.newHashSet;

import java.util.Set;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class AvroIDLAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

	public static final Set<String> ANNOTATIONS = newHashSet("'@namespace'");
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if(ANNOTATIONS.contains(tokenName)) {
			return AvroIDLHighlightingConfiguration.ANNOTATION;
		}
		return super.calculateId(tokenName, tokenType);
	}

}
