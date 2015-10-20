package avroclipse.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import avroclipse.services.AvdlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAvdlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'protocol'", "'{'", "'}'", "'('", "','", "')'", "'throws'", "'oneway'", "'='", "'void'", "'error'", "'record'", "'union'", "'array'", "'<'", "'>'", "'map'", "'null'", "'int'", "'long'", "'float'", "'double'", "'bytes'", "'string'", "'fixed'", "'enum'", "'@'", "'['", "']'", "'`'", "'-'", "'idl'", "'schema'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAvdlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAvdlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAvdlParser.tokenNames; }
    public String getGrammarFileName() { return "../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g"; }



     	private AvdlGrammarAccess grammarAccess;
     	
        public InternalAvdlParser(TokenStream input, AvdlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AvdlFile";	
       	}
       	
       	@Override
       	protected AvdlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAvdlFile"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:68:1: entryRuleAvdlFile returns [EObject current=null] : iv_ruleAvdlFile= ruleAvdlFile EOF ;
    public final EObject entryRuleAvdlFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvdlFile = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:69:2: (iv_ruleAvdlFile= ruleAvdlFile EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:70:2: iv_ruleAvdlFile= ruleAvdlFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAvdlFileRule()); 
            }
            pushFollow(FOLLOW_ruleAvdlFile_in_entryRuleAvdlFile75);
            iv_ruleAvdlFile=ruleAvdlFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAvdlFile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvdlFile85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAvdlFile"


    // $ANTLR start "ruleAvdlFile"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:77:1: ruleAvdlFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) ) | ( (lv_protocols_1_0= ruleProtocol ) ) )* ;
    public final EObject ruleAvdlFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_protocols_1_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:80:28: ( ( ( (lv_imports_0_0= ruleImport ) ) | ( (lv_protocols_1_0= ruleProtocol ) ) )* )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:81:1: ( ( (lv_imports_0_0= ruleImport ) ) | ( (lv_protocols_1_0= ruleProtocol ) ) )*
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:81:1: ( ( (lv_imports_0_0= ruleImport ) ) | ( (lv_protocols_1_0= ruleProtocol ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }
                else if ( (LA1_0==13||LA1_0==39) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:81:2: ( (lv_imports_0_0= ruleImport ) )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:81:2: ( (lv_imports_0_0= ruleImport ) )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:82:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:82:1: (lv_imports_0_0= ruleImport )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:83:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAvdlFileAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleAvdlFile131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAvdlFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:100:6: ( (lv_protocols_1_0= ruleProtocol ) )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:100:6: ( (lv_protocols_1_0= ruleProtocol ) )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:101:1: (lv_protocols_1_0= ruleProtocol )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:101:1: (lv_protocols_1_0= ruleProtocol )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:102:3: lv_protocols_1_0= ruleProtocol
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAvdlFileAccess().getProtocolsProtocolParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProtocol_in_ruleAvdlFile158);
            	    lv_protocols_1_0=ruleProtocol();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAvdlFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"protocols",
            	              		lv_protocols_1_0, 
            	              		"Protocol");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAvdlFile"


    // $ANTLR start "entryRuleImport"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:126:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:127:2: (iv_ruleImport= ruleImport EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:128:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport195);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport205); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:135:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_type_1_0= ruleImportType ) ) ( (lv_importUri_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importUri_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:138:28: ( (otherlv_0= 'import' ( (lv_type_1_0= ruleImportType ) ) ( (lv_importUri_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:139:1: (otherlv_0= 'import' ( (lv_type_1_0= ruleImportType ) ) ( (lv_importUri_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:139:1: (otherlv_0= 'import' ( (lv_type_1_0= ruleImportType ) ) ( (lv_importUri_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:139:3: otherlv_0= 'import' ( (lv_type_1_0= ruleImportType ) ) ( (lv_importUri_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:143:1: ( (lv_type_1_0= ruleImportType ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:144:1: (lv_type_1_0= ruleImportType )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:144:1: (lv_type_1_0= ruleImportType )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:145:3: lv_type_1_0= ruleImportType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getTypeImportTypeEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImportType_in_ruleImport263);
            lv_type_1_0=ruleImportType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"ImportType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:161:2: ( (lv_importUri_2_0= RULE_STRING ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:162:1: (lv_importUri_2_0= RULE_STRING )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:162:1: (lv_importUri_2_0= RULE_STRING )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:163:3: lv_importUri_2_0= RULE_STRING
            {
            lv_importUri_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importUri_2_0, grammarAccess.getImportAccess().getImportUriSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getImportRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importUri",
                      		lv_importUri_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleImport297); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getImportAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleProtocol"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:191:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:192:2: (iv_ruleProtocol= ruleProtocol EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:193:2: iv_ruleProtocol= ruleProtocol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtocolRule()); 
            }
            pushFollow(FOLLOW_ruleProtocol_in_entryRuleProtocol333);
            iv_ruleProtocol=ruleProtocol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtocol; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocol343); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:200:1: ruleProtocol returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'protocol' ( (lv_name_2_0= ruleEscapableId ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:203:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'protocol' ( (lv_name_2_0= ruleEscapableId ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )* otherlv_5= '}' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:204:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'protocol' ( (lv_name_2_0= ruleEscapableId ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )* otherlv_5= '}' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:204:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'protocol' ( (lv_name_2_0= ruleEscapableId ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )* otherlv_5= '}' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:204:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'protocol' ( (lv_name_2_0= ruleEscapableId ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )* otherlv_5= '}'
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:204:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==39) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:205:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:205:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:206:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProtocolAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleProtocol389);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProtocolRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleProtocol402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getProtocolAccess().getProtocolKeyword_1());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:226:1: ( (lv_name_2_0= ruleEscapableId ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:227:1: (lv_name_2_0= ruleEscapableId )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:227:1: (lv_name_2_0= ruleEscapableId )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:228:3: lv_name_2_0= ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProtocolAccess().getNameEscapableIdParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEscapableId_in_ruleProtocol423);
            lv_name_2_0=ruleEscapableId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProtocolRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"EscapableId");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleProtocol435); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:248:1: ( (lv_elements_4_0= ruleElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=22 && LA3_0<=24)||(LA3_0>=30 && LA3_0<=39)||LA3_0==42) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:249:1: (lv_elements_4_0= ruleElement )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:249:1: (lv_elements_4_0= ruleElement )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:250:3: lv_elements_4_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProtocolAccess().getElementsElementParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElement_in_ruleProtocol456);
            	    lv_elements_4_0=ruleElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProtocolRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_4_0, 
            	              		"Element");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleProtocol469); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleElement"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:278:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:279:2: (iv_ruleElement= ruleElement EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:280:2: iv_ruleElement= ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement505);
            iv_ruleElement=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement515); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:287:1: ruleElement returns [EObject current=null] : (this_TypeDef_0= ruleTypeDef | this_RPCMessage_1= ruleRPCMessage ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDef_0 = null;

        EObject this_RPCMessage_1 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:290:28: ( (this_TypeDef_0= ruleTypeDef | this_RPCMessage_1= ruleRPCMessage ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:291:1: (this_TypeDef_0= ruleTypeDef | this_RPCMessage_1= ruleRPCMessage )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:291:1: (this_TypeDef_0= ruleTypeDef | this_RPCMessage_1= ruleRPCMessage )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=23 && LA4_0<=24)||(LA4_0>=37 && LA4_0<=39)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID||LA4_0==22||(LA4_0>=30 && LA4_0<=36)||LA4_0==42) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:292:5: this_TypeDef_0= ruleTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getTypeDefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeDef_in_ruleElement562);
                    this_TypeDef_0=ruleTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeDef_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:302:5: this_RPCMessage_1= ruleRPCMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getRPCMessageParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRPCMessage_in_ruleElement589);
                    this_RPCMessage_1=ruleRPCMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RPCMessage_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleRPCMessage"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:318:1: entryRuleRPCMessage returns [EObject current=null] : iv_ruleRPCMessage= ruleRPCMessage EOF ;
    public final EObject entryRuleRPCMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRPCMessage = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:319:2: (iv_ruleRPCMessage= ruleRPCMessage EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:320:2: iv_ruleRPCMessage= ruleRPCMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRPCMessageRule()); 
            }
            pushFollow(FOLLOW_ruleRPCMessage_in_entryRuleRPCMessage624);
            iv_ruleRPCMessage=ruleRPCMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRPCMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRPCMessage634); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRPCMessage"


    // $ANTLR start "ruleRPCMessage"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:327:1: ruleRPCMessage returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleReturnTypeLink ) ) ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )* otherlv_6= ')' (otherlv_7= 'throws' ( ( ruleEscapableId ) ) )? ( (lv_oneway_9_0= 'oneway' ) )? otherlv_10= ';' ) ;
    public final EObject ruleRPCMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_oneway_9_0=null;
        Token otherlv_10=null;
        EObject lv_returnType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:330:28: ( ( ( (lv_returnType_0_0= ruleReturnTypeLink ) ) ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )* otherlv_6= ')' (otherlv_7= 'throws' ( ( ruleEscapableId ) ) )? ( (lv_oneway_9_0= 'oneway' ) )? otherlv_10= ';' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:331:1: ( ( (lv_returnType_0_0= ruleReturnTypeLink ) ) ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )* otherlv_6= ')' (otherlv_7= 'throws' ( ( ruleEscapableId ) ) )? ( (lv_oneway_9_0= 'oneway' ) )? otherlv_10= ';' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:331:1: ( ( (lv_returnType_0_0= ruleReturnTypeLink ) ) ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )* otherlv_6= ')' (otherlv_7= 'throws' ( ( ruleEscapableId ) ) )? ( (lv_oneway_9_0= 'oneway' ) )? otherlv_10= ';' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:331:2: ( (lv_returnType_0_0= ruleReturnTypeLink ) ) ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )* otherlv_6= ')' (otherlv_7= 'throws' ( ( ruleEscapableId ) ) )? ( (lv_oneway_9_0= 'oneway' ) )? otherlv_10= ';'
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:331:2: ( (lv_returnType_0_0= ruleReturnTypeLink ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:332:1: (lv_returnType_0_0= ruleReturnTypeLink )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:332:1: (lv_returnType_0_0= ruleReturnTypeLink )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:333:3: lv_returnType_0_0= ruleReturnTypeLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRPCMessageAccess().getReturnTypeReturnTypeLinkParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReturnTypeLink_in_ruleRPCMessage680);
            lv_returnType_0_0=ruleReturnTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRPCMessageRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_0_0, 
                      		"ReturnTypeLink");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:349:2: ( (lv_name_1_0= ruleEscapableId ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:350:1: (lv_name_1_0= ruleEscapableId )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:350:1: (lv_name_1_0= ruleEscapableId )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:351:3: lv_name_1_0= ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRPCMessageAccess().getNameEscapableIdParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEscapableId_in_ruleRPCMessage701);
            lv_name_1_0=ruleEscapableId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRPCMessageRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EscapableId");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleRPCMessage713); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRPCMessageAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:371:1: ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=30 && LA6_0<=36)||LA6_0==42) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:371:2: ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )*
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:371:2: ( (lv_arguments_3_0= ruleArgument ) )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:372:1: (lv_arguments_3_0= ruleArgument )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:372:1: (lv_arguments_3_0= ruleArgument )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:373:3: lv_arguments_3_0= ruleArgument
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRPCMessageAccess().getArgumentsArgumentParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArgument_in_ruleRPCMessage735);
            	    lv_arguments_3_0=ruleArgument();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRPCMessageRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"arguments",
            	              		lv_arguments_3_0, 
            	              		"Argument");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:389:2: (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==17) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:389:4: otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleRPCMessage748); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_4, grammarAccess.getRPCMessageAccess().getCommaKeyword_3_1_0());
            	    	          
            	    	    }
            	    	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:393:1: ( (lv_arguments_5_0= ruleArgument ) )
            	    	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:394:1: (lv_arguments_5_0= ruleArgument )
            	    	    {
            	    	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:394:1: (lv_arguments_5_0= ruleArgument )
            	    	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:395:3: lv_arguments_5_0= ruleArgument
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getRPCMessageAccess().getArgumentsArgumentParserRuleCall_3_1_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleArgument_in_ruleRPCMessage769);
            	    	    lv_arguments_5_0=ruleArgument();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getRPCMessageRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"arguments",
            	    	              		lv_arguments_5_0, 
            	    	              		"Argument");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleRPCMessage785); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getRPCMessageAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:415:1: (otherlv_7= 'throws' ( ( ruleEscapableId ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:415:3: otherlv_7= 'throws' ( ( ruleEscapableId ) )
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleRPCMessage798); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getRPCMessageAccess().getThrowsKeyword_5_0());
                          
                    }
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:419:1: ( ( ruleEscapableId ) )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:420:1: ( ruleEscapableId )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:420:1: ( ruleEscapableId )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:421:3: ruleEscapableId
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRPCMessageRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRPCMessageAccess().getErrorErrorTypeCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEscapableId_in_ruleRPCMessage821);
                    ruleEscapableId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:434:4: ( (lv_oneway_9_0= 'oneway' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:435:1: (lv_oneway_9_0= 'oneway' )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:435:1: (lv_oneway_9_0= 'oneway' )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:436:3: lv_oneway_9_0= 'oneway'
                    {
                    lv_oneway_9_0=(Token)match(input,20,FOLLOW_20_in_ruleRPCMessage841); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_oneway_9_0, grammarAccess.getRPCMessageAccess().getOnewayOnewayKeyword_6_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRPCMessageRule());
                      	        }
                             		setWithLastConsumed(current, "oneway", true, "oneway");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleRPCMessage867); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getRPCMessageAccess().getSemicolonKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRPCMessage"


    // $ANTLR start "entryRuleArgument"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:461:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:462:2: (iv_ruleArgument= ruleArgument EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:463:2: iv_ruleArgument= ruleArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentRule()); 
            }
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument903);
            iv_ruleArgument=ruleArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgument; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument913); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:470:1: ruleArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeLink ) ) ( (lv_name_1_0= ruleEscapableId ) ) (otherlv_2= '=' ( (lv_default_3_0= ruleValue ) ) )? ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_default_3_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:473:28: ( ( ( (lv_type_0_0= ruleTypeLink ) ) ( (lv_name_1_0= ruleEscapableId ) ) (otherlv_2= '=' ( (lv_default_3_0= ruleValue ) ) )? ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:474:1: ( ( (lv_type_0_0= ruleTypeLink ) ) ( (lv_name_1_0= ruleEscapableId ) ) (otherlv_2= '=' ( (lv_default_3_0= ruleValue ) ) )? )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:474:1: ( ( (lv_type_0_0= ruleTypeLink ) ) ( (lv_name_1_0= ruleEscapableId ) ) (otherlv_2= '=' ( (lv_default_3_0= ruleValue ) ) )? )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:474:2: ( (lv_type_0_0= ruleTypeLink ) ) ( (lv_name_1_0= ruleEscapableId ) ) (otherlv_2= '=' ( (lv_default_3_0= ruleValue ) ) )?
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:474:2: ( (lv_type_0_0= ruleTypeLink ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:475:1: (lv_type_0_0= ruleTypeLink )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:475:1: (lv_type_0_0= ruleTypeLink )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:476:3: lv_type_0_0= ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArgumentAccess().getTypeTypeLinkParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeLink_in_ruleArgument959);
            lv_type_0_0=ruleTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArgumentRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"TypeLink");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:492:2: ( (lv_name_1_0= ruleEscapableId ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:493:1: (lv_name_1_0= ruleEscapableId )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:493:1: (lv_name_1_0= ruleEscapableId )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:494:3: lv_name_1_0= ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArgumentAccess().getNameEscapableIdParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEscapableId_in_ruleArgument980);
            lv_name_1_0=ruleEscapableId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArgumentRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EscapableId");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:510:2: (otherlv_2= '=' ( (lv_default_3_0= ruleValue ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:510:4: otherlv_2= '=' ( (lv_default_3_0= ruleValue ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleArgument993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getArgumentAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:514:1: ( (lv_default_3_0= ruleValue ) )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:515:1: (lv_default_3_0= ruleValue )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:515:1: (lv_default_3_0= ruleValue )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:516:3: lv_default_3_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArgumentAccess().getDefaultValueParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleArgument1014);
                    lv_default_3_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_3_0, 
                              		"Value");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleReturnTypeLink"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:540:1: entryRuleReturnTypeLink returns [EObject current=null] : iv_ruleReturnTypeLink= ruleReturnTypeLink EOF ;
    public final EObject entryRuleReturnTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnTypeLink = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:541:2: (iv_ruleReturnTypeLink= ruleReturnTypeLink EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:542:2: iv_ruleReturnTypeLink= ruleReturnTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleReturnTypeLink_in_entryRuleReturnTypeLink1052);
            iv_ruleReturnTypeLink=ruleReturnTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnTypeLink1062); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnTypeLink"


    // $ANTLR start "ruleReturnTypeLink"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:549:1: ruleReturnTypeLink returns [EObject current=null] : (this_VoidTypeLink_0= ruleVoidTypeLink | this_TypeLink_1= ruleTypeLink ) ;
    public final EObject ruleReturnTypeLink() throws RecognitionException {
        EObject current = null;

        EObject this_VoidTypeLink_0 = null;

        EObject this_TypeLink_1 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:552:28: ( (this_VoidTypeLink_0= ruleVoidTypeLink | this_TypeLink_1= ruleTypeLink ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:553:1: (this_VoidTypeLink_0= ruleVoidTypeLink | this_TypeLink_1= ruleTypeLink )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:553:1: (this_VoidTypeLink_0= ruleVoidTypeLink | this_TypeLink_1= ruleTypeLink )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID||(LA10_0>=30 && LA10_0<=36)||LA10_0==42) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:554:5: this_VoidTypeLink_0= ruleVoidTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReturnTypeLinkAccess().getVoidTypeLinkParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVoidTypeLink_in_ruleReturnTypeLink1109);
                    this_VoidTypeLink_0=ruleVoidTypeLink();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VoidTypeLink_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:564:5: this_TypeLink_1= ruleTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReturnTypeLinkAccess().getTypeLinkParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeLink_in_ruleReturnTypeLink1136);
                    this_TypeLink_1=ruleTypeLink();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeLink_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnTypeLink"


    // $ANTLR start "entryRuleVoidTypeLink"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:580:1: entryRuleVoidTypeLink returns [EObject current=null] : iv_ruleVoidTypeLink= ruleVoidTypeLink EOF ;
    public final EObject entryRuleVoidTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidTypeLink = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:581:2: (iv_ruleVoidTypeLink= ruleVoidTypeLink EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:582:2: iv_ruleVoidTypeLink= ruleVoidTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVoidTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleVoidTypeLink_in_entryRuleVoidTypeLink1171);
            iv_ruleVoidTypeLink=ruleVoidTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVoidTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoidTypeLink1181); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVoidTypeLink"


    // $ANTLR start "ruleVoidTypeLink"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:589:1: ruleVoidTypeLink returns [EObject current=null] : ( (lv_target_0_0= 'void' ) ) ;
    public final EObject ruleVoidTypeLink() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;

         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:592:28: ( ( (lv_target_0_0= 'void' ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:593:1: ( (lv_target_0_0= 'void' ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:593:1: ( (lv_target_0_0= 'void' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:594:1: (lv_target_0_0= 'void' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:594:1: (lv_target_0_0= 'void' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:595:3: lv_target_0_0= 'void'
            {
            lv_target_0_0=(Token)match(input,22,FOLLOW_22_in_ruleVoidTypeLink1223); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_target_0_0, grammarAccess.getVoidTypeLinkAccess().getTargetVoidKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVoidTypeLinkRule());
              	        }
                     		setWithLastConsumed(current, "target", lv_target_0_0, "void");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVoidTypeLink"


    // $ANTLR start "entryRuleTypeDef"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:616:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:617:2: (iv_ruleTypeDef= ruleTypeDef EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:618:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef1271);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef1281); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:625:1: ruleTypeDef returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:628:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleType ) ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:629:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleType ) ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:629:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleType ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:629:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleType ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:629:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==39) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:630:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:630:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:631:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypeDefAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleTypeDef1327);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:647:3: ( (lv_type_1_0= ruleType ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:648:1: (lv_type_1_0= ruleType )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:648:1: (lv_type_1_0= ruleType )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:649:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDefAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleTypeDef1349);
            lv_type_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:673:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:674:2: (iv_ruleType= ruleType EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:675:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType1385);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1395); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:682:1: ruleType returns [EObject current=null] : (this_EnumType_0= ruleEnumType | this_FixedType_1= ruleFixedType | this_RecordType_2= ruleRecordType | this_ErrorType_3= ruleErrorType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_EnumType_0 = null;

        EObject this_FixedType_1 = null;

        EObject this_RecordType_2 = null;

        EObject this_ErrorType_3 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:685:28: ( (this_EnumType_0= ruleEnumType | this_FixedType_1= ruleFixedType | this_RecordType_2= ruleRecordType | this_ErrorType_3= ruleErrorType ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:686:1: (this_EnumType_0= ruleEnumType | this_FixedType_1= ruleFixedType | this_RecordType_2= ruleRecordType | this_ErrorType_3= ruleErrorType )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:686:1: (this_EnumType_0= ruleEnumType | this_FixedType_1= ruleFixedType | this_RecordType_2= ruleRecordType | this_ErrorType_3= ruleErrorType )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt12=1;
                }
                break;
            case 37:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            case 23:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:687:5: this_EnumType_0= ruleEnumType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumType_in_ruleType1442);
                    this_EnumType_0=ruleEnumType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnumType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:697:5: this_FixedType_1= ruleFixedType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getFixedTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFixedType_in_ruleType1469);
                    this_FixedType_1=ruleFixedType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FixedType_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:707:5: this_RecordType_2= ruleRecordType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getRecordTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRecordType_in_ruleType1496);
                    this_RecordType_2=ruleRecordType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RecordType_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:717:5: this_ErrorType_3= ruleErrorType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getErrorTypeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleErrorType_in_ruleType1523);
                    this_ErrorType_3=ruleErrorType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ErrorType_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleErrorType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:733:1: entryRuleErrorType returns [EObject current=null] : iv_ruleErrorType= ruleErrorType EOF ;
    public final EObject entryRuleErrorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorType = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:734:2: (iv_ruleErrorType= ruleErrorType EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:735:2: iv_ruleErrorType= ruleErrorType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getErrorTypeRule()); 
            }
            pushFollow(FOLLOW_ruleErrorType_in_entryRuleErrorType1558);
            iv_ruleErrorType=ruleErrorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleErrorType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleErrorType1568); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleErrorType"


    // $ANTLR start "ruleErrorType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:742:1: ruleErrorType returns [EObject current=null] : (otherlv_0= 'error' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) ;
    public final EObject ruleErrorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:745:28: ( (otherlv_0= 'error' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:746:1: (otherlv_0= 'error' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:746:1: (otherlv_0= 'error' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:746:3: otherlv_0= 'error' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleErrorType1605); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getErrorTypeAccess().getErrorKeyword_0());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:750:1: ( (lv_name_1_0= ruleEscapableId ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:751:1: (lv_name_1_0= ruleEscapableId )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:751:1: (lv_name_1_0= ruleEscapableId )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:752:3: lv_name_1_0= ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getErrorTypeAccess().getNameEscapableIdParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEscapableId_in_ruleErrorType1626);
            lv_name_1_0=ruleEscapableId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getErrorTypeRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EscapableId");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleErrorType1638); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getErrorTypeAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:772:1: ( (lv_fields_3_0= ruleField ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=25 && LA13_0<=26)||(LA13_0>=29 && LA13_0<=36)||LA13_0==39||LA13_0==42) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:773:1: (lv_fields_3_0= ruleField )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:773:1: (lv_fields_3_0= ruleField )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:774:3: lv_fields_3_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getErrorTypeAccess().getFieldsFieldParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleField_in_ruleErrorType1659);
            	    lv_fields_3_0=ruleField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getErrorTypeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fields",
            	              		lv_fields_3_0, 
            	              		"Field");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleErrorType1672); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getErrorTypeAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleErrorType"


    // $ANTLR start "entryRuleRecordType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:802:1: entryRuleRecordType returns [EObject current=null] : iv_ruleRecordType= ruleRecordType EOF ;
    public final EObject entryRuleRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordType = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:803:2: (iv_ruleRecordType= ruleRecordType EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:804:2: iv_ruleRecordType= ruleRecordType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordTypeRule()); 
            }
            pushFollow(FOLLOW_ruleRecordType_in_entryRuleRecordType1708);
            iv_ruleRecordType=ruleRecordType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordType1718); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecordType"


    // $ANTLR start "ruleRecordType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:811:1: ruleRecordType returns [EObject current=null] : (otherlv_0= 'record' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) ;
    public final EObject ruleRecordType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:814:28: ( (otherlv_0= 'record' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:815:1: (otherlv_0= 'record' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:815:1: (otherlv_0= 'record' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:815:3: otherlv_0= 'record' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleRecordType1755); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRecordTypeAccess().getRecordKeyword_0());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:819:1: ( (lv_name_1_0= ruleEscapableId ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:820:1: (lv_name_1_0= ruleEscapableId )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:820:1: (lv_name_1_0= ruleEscapableId )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:821:3: lv_name_1_0= ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRecordTypeAccess().getNameEscapableIdParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEscapableId_in_ruleRecordType1776);
            lv_name_1_0=ruleEscapableId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRecordTypeRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EscapableId");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleRecordType1788); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:841:1: ( (lv_fields_3_0= ruleField ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=25 && LA14_0<=26)||(LA14_0>=29 && LA14_0<=36)||LA14_0==39||LA14_0==42) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:842:1: (lv_fields_3_0= ruleField )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:842:1: (lv_fields_3_0= ruleField )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:843:3: lv_fields_3_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleField_in_ruleRecordType1809);
            	    lv_fields_3_0=ruleField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fields",
            	              		lv_fields_3_0, 
            	              		"Field");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleRecordType1822); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecordType"


    // $ANTLR start "entryRuleField"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:871:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:872:2: (iv_ruleField= ruleField EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:873:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField1858);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1868); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:880:1: ruleField returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleFieldType ) ) ( (lv_nameAnnotations_2_0= ruleAnnotation ) )* ( (lv_name_3_0= ruleEscapableId ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleValue ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_nameAnnotations_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_default_5_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:883:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleFieldType ) ) ( (lv_nameAnnotations_2_0= ruleAnnotation ) )* ( (lv_name_3_0= ruleEscapableId ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleValue ) ) )? otherlv_6= ';' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:884:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleFieldType ) ) ( (lv_nameAnnotations_2_0= ruleAnnotation ) )* ( (lv_name_3_0= ruleEscapableId ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleValue ) ) )? otherlv_6= ';' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:884:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleFieldType ) ) ( (lv_nameAnnotations_2_0= ruleAnnotation ) )* ( (lv_name_3_0= ruleEscapableId ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleValue ) ) )? otherlv_6= ';' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:884:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleFieldType ) ) ( (lv_nameAnnotations_2_0= ruleAnnotation ) )* ( (lv_name_3_0= ruleEscapableId ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleValue ) ) )? otherlv_6= ';'
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:884:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==39) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:885:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:885:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:886:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFieldAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleField1914);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:902:3: ( (lv_type_1_0= ruleFieldType ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:903:1: (lv_type_1_0= ruleFieldType )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:903:1: (lv_type_1_0= ruleFieldType )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:904:3: lv_type_1_0= ruleFieldType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFieldType_in_ruleField1936);
            lv_type_1_0=ruleFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"FieldType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:920:2: ( (lv_nameAnnotations_2_0= ruleAnnotation ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==39) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:921:1: (lv_nameAnnotations_2_0= ruleAnnotation )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:921:1: (lv_nameAnnotations_2_0= ruleAnnotation )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:922:3: lv_nameAnnotations_2_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFieldAccess().getNameAnnotationsAnnotationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleField1957);
            	    lv_nameAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"nameAnnotations",
            	              		lv_nameAnnotations_2_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:938:3: ( (lv_name_3_0= ruleEscapableId ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:939:1: (lv_name_3_0= ruleEscapableId )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:939:1: (lv_name_3_0= ruleEscapableId )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:940:3: lv_name_3_0= ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldAccess().getNameEscapableIdParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEscapableId_in_ruleField1979);
            lv_name_3_0=ruleEscapableId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"EscapableId");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:956:2: (otherlv_4= '=' ( (lv_default_5_0= ruleValue ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:956:4: otherlv_4= '=' ( (lv_default_5_0= ruleValue ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleField1992); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:960:1: ( (lv_default_5_0= ruleValue ) )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:961:1: (lv_default_5_0= ruleValue )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:961:1: (lv_default_5_0= ruleValue )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:962:3: lv_default_5_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldAccess().getDefaultValueParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleField2013);
                    lv_default_5_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFieldRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_5_0, 
                              		"Value");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleField2027); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFieldAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleFieldType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:990:1: entryRuleFieldType returns [EObject current=null] : iv_ruleFieldType= ruleFieldType EOF ;
    public final EObject entryRuleFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldType = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:991:2: (iv_ruleFieldType= ruleFieldType EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:992:2: iv_ruleFieldType= ruleFieldType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleFieldType_in_entryRuleFieldType2063);
            iv_ruleFieldType=ruleFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldType2073); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldType"


    // $ANTLR start "ruleFieldType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:999:1: ruleFieldType returns [EObject current=null] : (this_SimpleFieldType_0= ruleSimpleFieldType | this_UnionFieldType_1= ruleUnionFieldType | this_ArrayFieldType_2= ruleArrayFieldType | this_MapFieldType_3= ruleMapFieldType ) ;
    public final EObject ruleFieldType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleFieldType_0 = null;

        EObject this_UnionFieldType_1 = null;

        EObject this_ArrayFieldType_2 = null;

        EObject this_MapFieldType_3 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1002:28: ( (this_SimpleFieldType_0= ruleSimpleFieldType | this_UnionFieldType_1= ruleUnionFieldType | this_ArrayFieldType_2= ruleArrayFieldType | this_MapFieldType_3= ruleMapFieldType ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1003:1: (this_SimpleFieldType_0= ruleSimpleFieldType | this_UnionFieldType_1= ruleUnionFieldType | this_ArrayFieldType_2= ruleArrayFieldType | this_MapFieldType_3= ruleMapFieldType )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1003:1: (this_SimpleFieldType_0= ruleSimpleFieldType | this_UnionFieldType_1= ruleUnionFieldType | this_ArrayFieldType_2= ruleArrayFieldType | this_MapFieldType_3= ruleMapFieldType )
            int alt18=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 42:
                {
                alt18=1;
                }
                break;
            case 25:
                {
                alt18=2;
                }
                break;
            case 26:
                {
                alt18=3;
                }
                break;
            case 29:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1004:5: this_SimpleFieldType_0= ruleSimpleFieldType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldTypeAccess().getSimpleFieldTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimpleFieldType_in_ruleFieldType2120);
                    this_SimpleFieldType_0=ruleSimpleFieldType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SimpleFieldType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1014:5: this_UnionFieldType_1= ruleUnionFieldType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldTypeAccess().getUnionFieldTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnionFieldType_in_ruleFieldType2147);
                    this_UnionFieldType_1=ruleUnionFieldType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnionFieldType_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1024:5: this_ArrayFieldType_2= ruleArrayFieldType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldTypeAccess().getArrayFieldTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayFieldType_in_ruleFieldType2174);
                    this_ArrayFieldType_2=ruleArrayFieldType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayFieldType_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1034:5: this_MapFieldType_3= ruleMapFieldType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldTypeAccess().getMapFieldTypeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMapFieldType_in_ruleFieldType2201);
                    this_MapFieldType_3=ruleMapFieldType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MapFieldType_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldType"


    // $ANTLR start "entryRuleSimpleFieldType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1050:1: entryRuleSimpleFieldType returns [EObject current=null] : iv_ruleSimpleFieldType= ruleSimpleFieldType EOF ;
    public final EObject entryRuleSimpleFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleFieldType = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1051:2: (iv_ruleSimpleFieldType= ruleSimpleFieldType EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1052:2: iv_ruleSimpleFieldType= ruleSimpleFieldType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleFieldType_in_entryRuleSimpleFieldType2236);
            iv_ruleSimpleFieldType=ruleSimpleFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleFieldType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleFieldType2246); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleFieldType"


    // $ANTLR start "ruleSimpleFieldType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1059:1: ruleSimpleFieldType returns [EObject current=null] : ( (lv_type_0_0= ruleTypeLink ) ) ;
    public final EObject ruleSimpleFieldType() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1062:28: ( ( (lv_type_0_0= ruleTypeLink ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1063:1: ( (lv_type_0_0= ruleTypeLink ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1063:1: ( (lv_type_0_0= ruleTypeLink ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1064:1: (lv_type_0_0= ruleTypeLink )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1064:1: (lv_type_0_0= ruleTypeLink )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1065:3: lv_type_0_0= ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSimpleFieldTypeAccess().getTypeTypeLinkParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeLink_in_ruleSimpleFieldType2291);
            lv_type_0_0=ruleTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSimpleFieldTypeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"TypeLink");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleFieldType"


    // $ANTLR start "entryRuleUnionFieldType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1089:1: entryRuleUnionFieldType returns [EObject current=null] : iv_ruleUnionFieldType= ruleUnionFieldType EOF ;
    public final EObject entryRuleUnionFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionFieldType = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1090:2: (iv_ruleUnionFieldType= ruleUnionFieldType EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1091:2: iv_ruleUnionFieldType= ruleUnionFieldType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnionFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleUnionFieldType_in_entryRuleUnionFieldType2326);
            iv_ruleUnionFieldType=ruleUnionFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnionFieldType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnionFieldType2336); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnionFieldType"


    // $ANTLR start "ruleUnionFieldType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1098:1: ruleUnionFieldType returns [EObject current=null] : (otherlv_0= 'union' otherlv_1= '{' ( (lv_types_2_0= ruleTypeLink ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleTypeLink ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleUnionFieldType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_types_2_0 = null;

        EObject lv_types_4_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1101:28: ( (otherlv_0= 'union' otherlv_1= '{' ( (lv_types_2_0= ruleTypeLink ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleTypeLink ) ) )* otherlv_5= '}' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1102:1: (otherlv_0= 'union' otherlv_1= '{' ( (lv_types_2_0= ruleTypeLink ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleTypeLink ) ) )* otherlv_5= '}' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1102:1: (otherlv_0= 'union' otherlv_1= '{' ( (lv_types_2_0= ruleTypeLink ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleTypeLink ) ) )* otherlv_5= '}' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1102:3: otherlv_0= 'union' otherlv_1= '{' ( (lv_types_2_0= ruleTypeLink ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleTypeLink ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleUnionFieldType2373); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUnionFieldTypeAccess().getUnionKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleUnionFieldType2385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnionFieldTypeAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1110:1: ( (lv_types_2_0= ruleTypeLink ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1111:1: (lv_types_2_0= ruleTypeLink )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1111:1: (lv_types_2_0= ruleTypeLink )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1112:3: lv_types_2_0= ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnionFieldTypeAccess().getTypesTypeLinkParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeLink_in_ruleUnionFieldType2406);
            lv_types_2_0=ruleTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnionFieldTypeRule());
              	        }
                     		add(
                     			current, 
                     			"types",
                      		lv_types_2_0, 
                      		"TypeLink");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1128:2: (otherlv_3= ',' ( (lv_types_4_0= ruleTypeLink ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==17) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1128:4: otherlv_3= ',' ( (lv_types_4_0= ruleTypeLink ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleUnionFieldType2419); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getUnionFieldTypeAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1132:1: ( (lv_types_4_0= ruleTypeLink ) )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1133:1: (lv_types_4_0= ruleTypeLink )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1133:1: (lv_types_4_0= ruleTypeLink )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1134:3: lv_types_4_0= ruleTypeLink
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUnionFieldTypeAccess().getTypesTypeLinkParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTypeLink_in_ruleUnionFieldType2440);
            	    lv_types_4_0=ruleTypeLink();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUnionFieldTypeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"types",
            	              		lv_types_4_0, 
            	              		"TypeLink");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleUnionFieldType2454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getUnionFieldTypeAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnionFieldType"


    // $ANTLR start "entryRuleArrayFieldType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1162:1: entryRuleArrayFieldType returns [EObject current=null] : iv_ruleArrayFieldType= ruleArrayFieldType EOF ;
    public final EObject entryRuleArrayFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayFieldType = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1163:2: (iv_ruleArrayFieldType= ruleArrayFieldType EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1164:2: iv_ruleArrayFieldType= ruleArrayFieldType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleArrayFieldType_in_entryRuleArrayFieldType2490);
            iv_ruleArrayFieldType=ruleArrayFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayFieldType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayFieldType2500); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayFieldType"


    // $ANTLR start "ruleArrayFieldType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1171:1: ruleArrayFieldType returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '<' ( (lv_annotation_2_0= ruleAnnotation ) )? ( (lv_type_3_0= ruleTypeLink ) ) otherlv_4= '>' ) ;
    public final EObject ruleArrayFieldType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_annotation_2_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1174:28: ( (otherlv_0= 'array' otherlv_1= '<' ( (lv_annotation_2_0= ruleAnnotation ) )? ( (lv_type_3_0= ruleTypeLink ) ) otherlv_4= '>' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1175:1: (otherlv_0= 'array' otherlv_1= '<' ( (lv_annotation_2_0= ruleAnnotation ) )? ( (lv_type_3_0= ruleTypeLink ) ) otherlv_4= '>' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1175:1: (otherlv_0= 'array' otherlv_1= '<' ( (lv_annotation_2_0= ruleAnnotation ) )? ( (lv_type_3_0= ruleTypeLink ) ) otherlv_4= '>' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1175:3: otherlv_0= 'array' otherlv_1= '<' ( (lv_annotation_2_0= ruleAnnotation ) )? ( (lv_type_3_0= ruleTypeLink ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleArrayFieldType2537); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayFieldTypeAccess().getArrayKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleArrayFieldType2549); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayFieldTypeAccess().getLessThanSignKeyword_1());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1183:1: ( (lv_annotation_2_0= ruleAnnotation ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1184:1: (lv_annotation_2_0= ruleAnnotation )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1184:1: (lv_annotation_2_0= ruleAnnotation )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1185:3: lv_annotation_2_0= ruleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayFieldTypeAccess().getAnnotationAnnotationParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleArrayFieldType2570);
                    lv_annotation_2_0=ruleAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArrayFieldTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"annotation",
                              		lv_annotation_2_0, 
                              		"Annotation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1201:3: ( (lv_type_3_0= ruleTypeLink ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1202:1: (lv_type_3_0= ruleTypeLink )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1202:1: (lv_type_3_0= ruleTypeLink )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1203:3: lv_type_3_0= ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayFieldTypeAccess().getTypeTypeLinkParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeLink_in_ruleArrayFieldType2592);
            lv_type_3_0=ruleTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayFieldTypeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"TypeLink");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleArrayFieldType2604); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getArrayFieldTypeAccess().getGreaterThanSignKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayFieldType"


    // $ANTLR start "entryRuleMapFieldType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1231:1: entryRuleMapFieldType returns [EObject current=null] : iv_ruleMapFieldType= ruleMapFieldType EOF ;
    public final EObject entryRuleMapFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapFieldType = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1232:2: (iv_ruleMapFieldType= ruleMapFieldType EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1233:2: iv_ruleMapFieldType= ruleMapFieldType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleMapFieldType_in_entryRuleMapFieldType2640);
            iv_ruleMapFieldType=ruleMapFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapFieldType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapFieldType2650); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapFieldType"


    // $ANTLR start "ruleMapFieldType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1240:1: ruleMapFieldType returns [EObject current=null] : (otherlv_0= 'map' otherlv_1= '<' ( (lv_annotation_2_0= ruleAnnotation ) )? ( (lv_type_3_0= ruleTypeLink ) ) otherlv_4= '>' ) ;
    public final EObject ruleMapFieldType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_annotation_2_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1243:28: ( (otherlv_0= 'map' otherlv_1= '<' ( (lv_annotation_2_0= ruleAnnotation ) )? ( (lv_type_3_0= ruleTypeLink ) ) otherlv_4= '>' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1244:1: (otherlv_0= 'map' otherlv_1= '<' ( (lv_annotation_2_0= ruleAnnotation ) )? ( (lv_type_3_0= ruleTypeLink ) ) otherlv_4= '>' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1244:1: (otherlv_0= 'map' otherlv_1= '<' ( (lv_annotation_2_0= ruleAnnotation ) )? ( (lv_type_3_0= ruleTypeLink ) ) otherlv_4= '>' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1244:3: otherlv_0= 'map' otherlv_1= '<' ( (lv_annotation_2_0= ruleAnnotation ) )? ( (lv_type_3_0= ruleTypeLink ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleMapFieldType2687); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMapFieldTypeAccess().getMapKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleMapFieldType2699); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMapFieldTypeAccess().getLessThanSignKeyword_1());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1252:1: ( (lv_annotation_2_0= ruleAnnotation ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1253:1: (lv_annotation_2_0= ruleAnnotation )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1253:1: (lv_annotation_2_0= ruleAnnotation )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1254:3: lv_annotation_2_0= ruleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMapFieldTypeAccess().getAnnotationAnnotationParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleMapFieldType2720);
                    lv_annotation_2_0=ruleAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMapFieldTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"annotation",
                              		lv_annotation_2_0, 
                              		"Annotation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1270:3: ( (lv_type_3_0= ruleTypeLink ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1271:1: (lv_type_3_0= ruleTypeLink )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1271:1: (lv_type_3_0= ruleTypeLink )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1272:3: lv_type_3_0= ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapFieldTypeAccess().getTypeTypeLinkParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeLink_in_ruleMapFieldType2742);
            lv_type_3_0=ruleTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMapFieldTypeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"TypeLink");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleMapFieldType2754); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMapFieldTypeAccess().getGreaterThanSignKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapFieldType"


    // $ANTLR start "entryRuleTypeLink"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1300:1: entryRuleTypeLink returns [EObject current=null] : iv_ruleTypeLink= ruleTypeLink EOF ;
    public final EObject entryRuleTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLink = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1301:2: (iv_ruleTypeLink= ruleTypeLink EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1302:2: iv_ruleTypeLink= ruleTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_entryRuleTypeLink2790);
            iv_ruleTypeLink=ruleTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeLink2800); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLink"


    // $ANTLR start "ruleTypeLink"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1309:1: ruleTypeLink returns [EObject current=null] : (this_PrimativeTypeLink_0= rulePrimativeTypeLink | this_CustomTypeLink_1= ruleCustomTypeLink ) ;
    public final EObject ruleTypeLink() throws RecognitionException {
        EObject current = null;

        EObject this_PrimativeTypeLink_0 = null;

        EObject this_CustomTypeLink_1 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1312:28: ( (this_PrimativeTypeLink_0= rulePrimativeTypeLink | this_CustomTypeLink_1= ruleCustomTypeLink ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1313:1: (this_PrimativeTypeLink_0= rulePrimativeTypeLink | this_CustomTypeLink_1= ruleCustomTypeLink )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1313:1: (this_PrimativeTypeLink_0= rulePrimativeTypeLink | this_CustomTypeLink_1= ruleCustomTypeLink )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=30 && LA22_0<=36)) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID||LA22_0==42) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1314:5: this_PrimativeTypeLink_0= rulePrimativeTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLinkAccess().getPrimativeTypeLinkParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimativeTypeLink_in_ruleTypeLink2847);
                    this_PrimativeTypeLink_0=rulePrimativeTypeLink();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimativeTypeLink_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1324:5: this_CustomTypeLink_1= ruleCustomTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLinkAccess().getCustomTypeLinkParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCustomTypeLink_in_ruleTypeLink2874);
                    this_CustomTypeLink_1=ruleCustomTypeLink();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CustomTypeLink_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeLink"


    // $ANTLR start "entryRulePrimativeTypeLink"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1340:1: entryRulePrimativeTypeLink returns [EObject current=null] : iv_rulePrimativeTypeLink= rulePrimativeTypeLink EOF ;
    public final EObject entryRulePrimativeTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimativeTypeLink = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1341:2: (iv_rulePrimativeTypeLink= rulePrimativeTypeLink EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1342:2: iv_rulePrimativeTypeLink= rulePrimativeTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimativeTypeLinkRule()); 
            }
            pushFollow(FOLLOW_rulePrimativeTypeLink_in_entryRulePrimativeTypeLink2909);
            iv_rulePrimativeTypeLink=rulePrimativeTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimativeTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimativeTypeLink2919); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimativeTypeLink"


    // $ANTLR start "rulePrimativeTypeLink"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1349:1: rulePrimativeTypeLink returns [EObject current=null] : ( ( (lv_target_0_1= 'null' | lv_target_0_2= 'int' | lv_target_0_3= 'long' | lv_target_0_4= 'float' | lv_target_0_5= 'double' | lv_target_0_6= 'bytes' | lv_target_0_7= 'string' ) ) ) ;
    public final EObject rulePrimativeTypeLink() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_1=null;
        Token lv_target_0_2=null;
        Token lv_target_0_3=null;
        Token lv_target_0_4=null;
        Token lv_target_0_5=null;
        Token lv_target_0_6=null;
        Token lv_target_0_7=null;

         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1352:28: ( ( ( (lv_target_0_1= 'null' | lv_target_0_2= 'int' | lv_target_0_3= 'long' | lv_target_0_4= 'float' | lv_target_0_5= 'double' | lv_target_0_6= 'bytes' | lv_target_0_7= 'string' ) ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1353:1: ( ( (lv_target_0_1= 'null' | lv_target_0_2= 'int' | lv_target_0_3= 'long' | lv_target_0_4= 'float' | lv_target_0_5= 'double' | lv_target_0_6= 'bytes' | lv_target_0_7= 'string' ) ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1353:1: ( ( (lv_target_0_1= 'null' | lv_target_0_2= 'int' | lv_target_0_3= 'long' | lv_target_0_4= 'float' | lv_target_0_5= 'double' | lv_target_0_6= 'bytes' | lv_target_0_7= 'string' ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1354:1: ( (lv_target_0_1= 'null' | lv_target_0_2= 'int' | lv_target_0_3= 'long' | lv_target_0_4= 'float' | lv_target_0_5= 'double' | lv_target_0_6= 'bytes' | lv_target_0_7= 'string' ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1354:1: ( (lv_target_0_1= 'null' | lv_target_0_2= 'int' | lv_target_0_3= 'long' | lv_target_0_4= 'float' | lv_target_0_5= 'double' | lv_target_0_6= 'bytes' | lv_target_0_7= 'string' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1355:1: (lv_target_0_1= 'null' | lv_target_0_2= 'int' | lv_target_0_3= 'long' | lv_target_0_4= 'float' | lv_target_0_5= 'double' | lv_target_0_6= 'bytes' | lv_target_0_7= 'string' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1355:1: (lv_target_0_1= 'null' | lv_target_0_2= 'int' | lv_target_0_3= 'long' | lv_target_0_4= 'float' | lv_target_0_5= 'double' | lv_target_0_6= 'bytes' | lv_target_0_7= 'string' )
            int alt23=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt23=1;
                }
                break;
            case 31:
                {
                alt23=2;
                }
                break;
            case 32:
                {
                alt23=3;
                }
                break;
            case 33:
                {
                alt23=4;
                }
                break;
            case 34:
                {
                alt23=5;
                }
                break;
            case 35:
                {
                alt23=6;
                }
                break;
            case 36:
                {
                alt23=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1356:3: lv_target_0_1= 'null'
                    {
                    lv_target_0_1=(Token)match(input,30,FOLLOW_30_in_rulePrimativeTypeLink2963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_target_0_1, grammarAccess.getPrimativeTypeLinkAccess().getTargetNullKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimativeTypeLinkRule());
                      	        }
                             		setWithLastConsumed(current, "target", lv_target_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1368:8: lv_target_0_2= 'int'
                    {
                    lv_target_0_2=(Token)match(input,31,FOLLOW_31_in_rulePrimativeTypeLink2992); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_target_0_2, grammarAccess.getPrimativeTypeLinkAccess().getTargetIntKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimativeTypeLinkRule());
                      	        }
                             		setWithLastConsumed(current, "target", lv_target_0_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1380:8: lv_target_0_3= 'long'
                    {
                    lv_target_0_3=(Token)match(input,32,FOLLOW_32_in_rulePrimativeTypeLink3021); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_target_0_3, grammarAccess.getPrimativeTypeLinkAccess().getTargetLongKeyword_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimativeTypeLinkRule());
                      	        }
                             		setWithLastConsumed(current, "target", lv_target_0_3, null);
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1392:8: lv_target_0_4= 'float'
                    {
                    lv_target_0_4=(Token)match(input,33,FOLLOW_33_in_rulePrimativeTypeLink3050); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_target_0_4, grammarAccess.getPrimativeTypeLinkAccess().getTargetFloatKeyword_0_3());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimativeTypeLinkRule());
                      	        }
                             		setWithLastConsumed(current, "target", lv_target_0_4, null);
                      	    
                    }

                    }
                    break;
                case 5 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1404:8: lv_target_0_5= 'double'
                    {
                    lv_target_0_5=(Token)match(input,34,FOLLOW_34_in_rulePrimativeTypeLink3079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_target_0_5, grammarAccess.getPrimativeTypeLinkAccess().getTargetDoubleKeyword_0_4());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimativeTypeLinkRule());
                      	        }
                             		setWithLastConsumed(current, "target", lv_target_0_5, null);
                      	    
                    }

                    }
                    break;
                case 6 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1416:8: lv_target_0_6= 'bytes'
                    {
                    lv_target_0_6=(Token)match(input,35,FOLLOW_35_in_rulePrimativeTypeLink3108); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_target_0_6, grammarAccess.getPrimativeTypeLinkAccess().getTargetBytesKeyword_0_5());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimativeTypeLinkRule());
                      	        }
                             		setWithLastConsumed(current, "target", lv_target_0_6, null);
                      	    
                    }

                    }
                    break;
                case 7 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1428:8: lv_target_0_7= 'string'
                    {
                    lv_target_0_7=(Token)match(input,36,FOLLOW_36_in_rulePrimativeTypeLink3137); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_target_0_7, grammarAccess.getPrimativeTypeLinkAccess().getTargetStringKeyword_0_6());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimativeTypeLinkRule());
                      	        }
                             		setWithLastConsumed(current, "target", lv_target_0_7, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimativeTypeLink"


    // $ANTLR start "entryRuleCustomTypeLink"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1451:1: entryRuleCustomTypeLink returns [EObject current=null] : iv_ruleCustomTypeLink= ruleCustomTypeLink EOF ;
    public final EObject entryRuleCustomTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomTypeLink = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1452:2: (iv_ruleCustomTypeLink= ruleCustomTypeLink EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1453:2: iv_ruleCustomTypeLink= ruleCustomTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCustomTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleCustomTypeLink_in_entryRuleCustomTypeLink3188);
            iv_ruleCustomTypeLink=ruleCustomTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCustomTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomTypeLink3198); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomTypeLink"


    // $ANTLR start "ruleCustomTypeLink"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1460:1: ruleCustomTypeLink returns [EObject current=null] : ( ( ruleEscapableId ) ) ;
    public final EObject ruleCustomTypeLink() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1463:28: ( ( ( ruleEscapableId ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1464:1: ( ( ruleEscapableId ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1464:1: ( ( ruleEscapableId ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1465:1: ( ruleEscapableId )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1465:1: ( ruleEscapableId )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1466:3: ruleEscapableId
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCustomTypeLinkRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCustomTypeLinkAccess().getTargetTypeCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEscapableId_in_ruleCustomTypeLink3245);
            ruleEscapableId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomTypeLink"


    // $ANTLR start "entryRuleFixedType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1487:1: entryRuleFixedType returns [EObject current=null] : iv_ruleFixedType= ruleFixedType EOF ;
    public final EObject entryRuleFixedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFixedType = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1488:2: (iv_ruleFixedType= ruleFixedType EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1489:2: iv_ruleFixedType= ruleFixedType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFixedTypeRule()); 
            }
            pushFollow(FOLLOW_ruleFixedType_in_entryRuleFixedType3280);
            iv_ruleFixedType=ruleFixedType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFixedType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFixedType3290); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFixedType"


    // $ANTLR start "ruleFixedType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1496:1: ruleFixedType returns [EObject current=null] : (otherlv_0= 'fixed' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '(' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= ';' ) ;
    public final EObject ruleFixedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1499:28: ( (otherlv_0= 'fixed' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '(' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= ';' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1500:1: (otherlv_0= 'fixed' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '(' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= ';' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1500:1: (otherlv_0= 'fixed' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '(' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= ';' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1500:3: otherlv_0= 'fixed' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '(' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleFixedType3327); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFixedTypeAccess().getFixedKeyword_0());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1504:1: ( (lv_name_1_0= ruleEscapableId ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1505:1: (lv_name_1_0= ruleEscapableId )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1505:1: (lv_name_1_0= ruleEscapableId )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1506:3: lv_name_1_0= ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFixedTypeAccess().getNameEscapableIdParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEscapableId_in_ruleFixedType3348);
            lv_name_1_0=ruleEscapableId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFixedTypeRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EscapableId");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleFixedType3360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFixedTypeAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1526:1: ( (lv_size_3_0= RULE_INT ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1527:1: (lv_size_3_0= RULE_INT )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1527:1: (lv_size_3_0= RULE_INT )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1528:3: lv_size_3_0= RULE_INT
            {
            lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFixedType3377); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_size_3_0, grammarAccess.getFixedTypeAccess().getSizeINTTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFixedTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"size",
                      		lv_size_3_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleFixedType3394); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFixedTypeAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleFixedType3406); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getFixedTypeAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFixedType"


    // $ANTLR start "entryRuleEnumType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1560:1: entryRuleEnumType returns [EObject current=null] : iv_ruleEnumType= ruleEnumType EOF ;
    public final EObject entryRuleEnumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumType = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1561:2: (iv_ruleEnumType= ruleEnumType EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1562:2: iv_ruleEnumType= ruleEnumType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumTypeRule()); 
            }
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType3442);
            iv_ruleEnumType=ruleEnumType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType3452); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumType"


    // $ANTLR start "ruleEnumType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1569:1: ruleEnumType returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_literals_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleEnumType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_literals_3_0=null;
        Token otherlv_4=null;
        Token lv_literals_5_0=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1572:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_literals_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )* otherlv_6= '}' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1573:1: (otherlv_0= 'enum' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_literals_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )* otherlv_6= '}' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1573:1: (otherlv_0= 'enum' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_literals_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )* otherlv_6= '}' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1573:3: otherlv_0= 'enum' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_literals_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleEnumType3489); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumTypeAccess().getEnumKeyword_0());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1577:1: ( (lv_name_1_0= ruleEscapableId ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1578:1: (lv_name_1_0= ruleEscapableId )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1578:1: (lv_name_1_0= ruleEscapableId )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1579:3: lv_name_1_0= ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumTypeAccess().getNameEscapableIdParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEscapableId_in_ruleEnumType3510);
            lv_name_1_0=ruleEscapableId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnumTypeRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EscapableId");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleEnumType3522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1599:1: ( (lv_literals_3_0= RULE_ID ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1600:1: (lv_literals_3_0= RULE_ID )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1600:1: (lv_literals_3_0= RULE_ID )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1601:3: lv_literals_3_0= RULE_ID
            {
            lv_literals_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumType3539); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_literals_3_0, grammarAccess.getEnumTypeAccess().getLiteralsIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumTypeRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"literals",
                      		lv_literals_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1617:2: (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==17) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1617:4: otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleEnumType3557); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getEnumTypeAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1621:1: ( (lv_literals_5_0= RULE_ID ) )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1622:1: (lv_literals_5_0= RULE_ID )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1622:1: (lv_literals_5_0= RULE_ID )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1623:3: lv_literals_5_0= RULE_ID
            	    {
            	    lv_literals_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumType3574); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_literals_5_0, grammarAccess.getEnumTypeAccess().getLiteralsIDTerminalRuleCall_4_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEnumTypeRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"literals",
            	              		lv_literals_5_0, 
            	              		"ID");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleEnumType3593); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumType"


    // $ANTLR start "entryRuleAnnotation"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1651:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1652:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1653:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation3629);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation3639); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1660:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleAN ) ) (otherlv_2= '(' ( (lv_values_3_0= ruleValues ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1663:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleAN ) ) (otherlv_2= '(' ( (lv_values_3_0= ruleValues ) ) otherlv_4= ')' )? ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1664:1: (otherlv_0= '@' ( (lv_name_1_0= ruleAN ) ) (otherlv_2= '(' ( (lv_values_3_0= ruleValues ) ) otherlv_4= ')' )? )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1664:1: (otherlv_0= '@' ( (lv_name_1_0= ruleAN ) ) (otherlv_2= '(' ( (lv_values_3_0= ruleValues ) ) otherlv_4= ')' )? )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1664:3: otherlv_0= '@' ( (lv_name_1_0= ruleAN ) ) (otherlv_2= '(' ( (lv_values_3_0= ruleValues ) ) otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleAnnotation3676); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1668:1: ( (lv_name_1_0= ruleAN ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1669:1: (lv_name_1_0= ruleAN )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1669:1: (lv_name_1_0= ruleAN )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1670:3: lv_name_1_0= ruleAN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameANParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAN_in_ruleAnnotation3697);
            lv_name_1_0=ruleAN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"AN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1686:2: (otherlv_2= '(' ( (lv_values_3_0= ruleValues ) ) otherlv_4= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==16) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1686:4: otherlv_2= '(' ( (lv_values_3_0= ruleValues ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleAnnotation3710); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1690:1: ( (lv_values_3_0= ruleValues ) )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1691:1: (lv_values_3_0= ruleValues )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1691:1: (lv_values_3_0= ruleValues )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1692:3: lv_values_3_0= ruleValues
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getValuesValuesParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValues_in_ruleAnnotation3731);
                    lv_values_3_0=ruleValues();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                      	        }
                             		set(
                             			current, 
                             			"values",
                              		lv_values_3_0, 
                              		"Values");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleAnnotation3743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleValues"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1720:1: entryRuleValues returns [EObject current=null] : iv_ruleValues= ruleValues EOF ;
    public final EObject entryRuleValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValues = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1721:2: (iv_ruleValues= ruleValues EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1722:2: iv_ruleValues= ruleValues EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuesRule()); 
            }
            pushFollow(FOLLOW_ruleValues_in_entryRuleValues3781);
            iv_ruleValues=ruleValues();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValues; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValues3791); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValues"


    // $ANTLR start "ruleValues"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1729:1: ruleValues returns [EObject current=null] : ( () ( ( ( '[' )=> (lv_value_1_0= ruleArray ) ) | ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* ) )* ) ;
    public final EObject ruleValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1732:28: ( ( () ( ( ( '[' )=> (lv_value_1_0= ruleArray ) ) | ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* ) )* ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1733:1: ( () ( ( ( '[' )=> (lv_value_1_0= ruleArray ) ) | ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* ) )* )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1733:1: ( () ( ( ( '[' )=> (lv_value_1_0= ruleArray ) ) | ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* ) )* )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1733:2: () ( ( ( '[' )=> (lv_value_1_0= ruleArray ) ) | ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* ) )*
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1733:2: ()
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1734:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getValuesAccess().getValuesAction_0(),
                          current);
                  
            }

            }

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1739:2: ( ( ( '[' )=> (lv_value_1_0= ruleArray ) ) | ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* ) )*
            loop27:
            do {
                int alt27=3;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1739:3: ( ( '[' )=> (lv_value_1_0= ruleArray ) )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1739:3: ( ( '[' )=> (lv_value_1_0= ruleArray ) )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1739:4: ( '[' )=> (lv_value_1_0= ruleArray )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1741:1: (lv_value_1_0= ruleArray )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1742:3: lv_value_1_0= ruleArray
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuesAccess().getValueArrayParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArray_in_ruleValues3854);
            	    lv_value_1_0=ruleArray();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getValuesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"value",
            	              		lv_value_1_0, 
            	              		"Array");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1759:6: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1759:6: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1759:7: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )*
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1759:7: ( (lv_value_2_0= ruleValue ) )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1760:1: (lv_value_2_0= ruleValue )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1760:1: (lv_value_2_0= ruleValue )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1761:3: lv_value_2_0= ruleValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuesAccess().getValueValueParserRuleCall_1_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValue_in_ruleValues3882);
            	    lv_value_2_0=ruleValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getValuesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"value",
            	              		lv_value_2_0, 
            	              		"Value");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1777:2: (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )*
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( (LA26_0==17) ) {
            	            alt26=1;
            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1777:4: otherlv_3= ',' ( (lv_value_4_0= ruleValue ) )
            	    	    {
            	    	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleValues3895); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_3, grammarAccess.getValuesAccess().getCommaKeyword_1_1_1_0());
            	    	          
            	    	    }
            	    	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1781:1: ( (lv_value_4_0= ruleValue ) )
            	    	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1782:1: (lv_value_4_0= ruleValue )
            	    	    {
            	    	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1782:1: (lv_value_4_0= ruleValue )
            	    	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1783:3: lv_value_4_0= ruleValue
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getValuesAccess().getValueValueParserRuleCall_1_1_1_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleValue_in_ruleValues3916);
            	    	    lv_value_4_0=ruleValue();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getValuesRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"value",
            	    	              		lv_value_4_0, 
            	    	              		"Value");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop26;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValues"


    // $ANTLR start "entryRuleArray"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1807:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1808:2: (iv_ruleArray= ruleArray EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1809:2: iv_ruleArray= ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray3957);
            iv_ruleArray=ruleArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArray; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray3967); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1816:1: ruleArray returns [EObject current=null] : ( ( ( '[' )=>otherlv_0= '[' ) ( (lv_values_1_0= ruleValues ) ) otherlv_2= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_values_1_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1819:28: ( ( ( ( '[' )=>otherlv_0= '[' ) ( (lv_values_1_0= ruleValues ) ) otherlv_2= ']' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1820:1: ( ( ( '[' )=>otherlv_0= '[' ) ( (lv_values_1_0= ruleValues ) ) otherlv_2= ']' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1820:1: ( ( ( '[' )=>otherlv_0= '[' ) ( (lv_values_1_0= ruleValues ) ) otherlv_2= ']' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1820:2: ( ( '[' )=>otherlv_0= '[' ) ( (lv_values_1_0= ruleValues ) ) otherlv_2= ']'
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1820:2: ( ( '[' )=>otherlv_0= '[' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1820:3: ( '[' )=>otherlv_0= '['
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleArray4012); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0());
                  
            }

            }

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1825:2: ( (lv_values_1_0= ruleValues ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1826:1: (lv_values_1_0= ruleValues )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1826:1: (lv_values_1_0= ruleValues )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1827:3: lv_values_1_0= ruleValues
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayAccess().getValuesValuesParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValues_in_ruleArray4034);
            lv_values_1_0=ruleValues();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayRule());
              	        }
                     		set(
                     			current, 
                     			"values",
                      		lv_values_1_0, 
                      		"Values");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleArray4046); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleValue"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1855:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1856:2: (iv_ruleValue= ruleValue EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1857:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue4082);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue4092); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1864:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | ( ( '[' )=>this_Array_1= ruleArray ) | this_IntValue_2= ruleIntValue | this_Null_3= ruleNull ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_Array_1 = null;

        EObject this_IntValue_2 = null;

        EObject this_Null_3 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1867:28: ( (this_StringValue_0= ruleStringValue | ( ( '[' )=>this_Array_1= ruleArray ) | this_IntValue_2= ruleIntValue | this_Null_3= ruleNull ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1868:1: (this_StringValue_0= ruleStringValue | ( ( '[' )=>this_Array_1= ruleArray ) | this_IntValue_2= ruleIntValue | this_Null_3= ruleNull )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1868:1: (this_StringValue_0= ruleStringValue | ( ( '[' )=>this_Array_1= ruleArray ) | this_IntValue_2= ruleIntValue | this_Null_3= ruleNull )
            int alt28=4;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( (LA28_0==40) && (synpred3_InternalAvdl())) {
                alt28=2;
            }
            else if ( (LA28_0==RULE_INT||LA28_0==43) ) {
                alt28=3;
            }
            else if ( (LA28_0==30) ) {
                alt28=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1869:5: this_StringValue_0= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue4139);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1878:6: ( ( '[' )=>this_Array_1= ruleArray )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1878:6: ( ( '[' )=>this_Array_1= ruleArray )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1878:7: ( '[' )=>this_Array_1= ruleArray
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getArrayParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArray_in_ruleValue4174);
                    this_Array_1=ruleArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Array_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1890:5: this_IntValue_2= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValue4202);
                    this_IntValue_2=ruleIntValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntValue_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1900:5: this_Null_3= ruleNull
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getNullParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNull_in_ruleValue4229);
                    this_Null_3=ruleNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Null_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleNull"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1916:1: entryRuleNull returns [EObject current=null] : iv_ruleNull= ruleNull EOF ;
    public final EObject entryRuleNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNull = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1917:2: (iv_ruleNull= ruleNull EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1918:2: iv_ruleNull= ruleNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullRule()); 
            }
            pushFollow(FOLLOW_ruleNull_in_entryRuleNull4264);
            iv_ruleNull=ruleNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNull; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNull4274); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNull"


    // $ANTLR start "ruleNull"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1925:1: ruleNull returns [EObject current=null] : ( (lv_val_0_0= 'null' ) ) ;
    public final EObject ruleNull() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;

         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1928:28: ( ( (lv_val_0_0= 'null' ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1929:1: ( (lv_val_0_0= 'null' ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1929:1: ( (lv_val_0_0= 'null' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1930:1: (lv_val_0_0= 'null' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1930:1: (lv_val_0_0= 'null' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1931:3: lv_val_0_0= 'null'
            {
            lv_val_0_0=(Token)match(input,30,FOLLOW_30_in_ruleNull4316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_val_0_0, grammarAccess.getNullAccess().getValNullKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNullRule());
              	        }
                     		setWithLastConsumed(current, "val", lv_val_0_0, "null");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNull"


    // $ANTLR start "entryRuleStringValue"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1952:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1953:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1954:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue4364);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue4374); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1961:1: ruleStringValue returns [EObject current=null] : ( (lv_val_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;

         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1964:28: ( ( (lv_val_0_0= RULE_STRING ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1965:1: ( (lv_val_0_0= RULE_STRING ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1965:1: ( (lv_val_0_0= RULE_STRING ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1966:1: (lv_val_0_0= RULE_STRING )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1966:1: (lv_val_0_0= RULE_STRING )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1967:3: lv_val_0_0= RULE_STRING
            {
            lv_val_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue4415); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_val_0_0, grammarAccess.getStringValueAccess().getValSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"val",
                      		lv_val_0_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleIntValue"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1991:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1992:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1993:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue4455);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue4465); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2000:1: ruleIntValue returns [EObject current=null] : ( ( (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt ) ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_1=null;
        AntlrDatatypeRuleToken lv_val_0_2 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2003:28: ( ( ( (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt ) ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2004:1: ( ( (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt ) ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2004:1: ( ( (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2005:1: ( (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2005:1: ( (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2006:1: (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2006:1: (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT) ) {
                alt29=1;
            }
            else if ( (LA29_0==43) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2007:3: lv_val_0_1= RULE_INT
                    {
                    lv_val_0_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue4508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_val_0_1, grammarAccess.getIntValueAccess().getValINTTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIntValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"val",
                              		lv_val_0_1, 
                              		"INT");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2022:8: lv_val_0_2= ruleNegativeInt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntValueAccess().getValNegativeIntParserRuleCall_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNegativeInt_in_ruleIntValue4532);
                    lv_val_0_2=ruleNegativeInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIntValueRule());
                      	        }
                             		set(
                             			current, 
                             			"val",
                              		lv_val_0_2, 
                              		"NegativeInt");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleEscapableId"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2048:1: entryRuleEscapableId returns [String current=null] : iv_ruleEscapableId= ruleEscapableId EOF ;
    public final String entryRuleEscapableId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEscapableId = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2049:2: (iv_ruleEscapableId= ruleEscapableId EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2050:2: iv_ruleEscapableId= ruleEscapableId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEscapableIdRule()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_entryRuleEscapableId4571);
            iv_ruleEscapableId=ruleEscapableId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEscapableId.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapableId4582); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEscapableId"


    // $ANTLR start "ruleEscapableId"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2057:1: ruleEscapableId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | (kw= '`' this_ReservedKeyWords_2= ruleReservedKeyWords kw= '`' ) ) ;
    public final AntlrDatatypeRuleToken ruleEscapableId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_ReservedKeyWords_2 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2060:28: ( (this_ID_0= RULE_ID | (kw= '`' this_ReservedKeyWords_2= ruleReservedKeyWords kw= '`' ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2061:1: (this_ID_0= RULE_ID | (kw= '`' this_ReservedKeyWords_2= ruleReservedKeyWords kw= '`' ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2061:1: (this_ID_0= RULE_ID | (kw= '`' this_ReservedKeyWords_2= ruleReservedKeyWords kw= '`' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            else if ( (LA30_0==42) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2061:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEscapableId4622); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getEscapableIdAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2069:6: (kw= '`' this_ReservedKeyWords_2= ruleReservedKeyWords kw= '`' )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2069:6: (kw= '`' this_ReservedKeyWords_2= ruleReservedKeyWords kw= '`' )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2070:2: kw= '`' this_ReservedKeyWords_2= ruleReservedKeyWords kw= '`'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleEscapableId4647); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEscapableIdAccess().getGraveAccentKeyword_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEscapableIdAccess().getReservedKeyWordsParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReservedKeyWords_in_ruleEscapableId4669);
                    this_ReservedKeyWords_2=ruleReservedKeyWords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ReservedKeyWords_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleEscapableId4687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEscapableIdAccess().getGraveAccentKeyword_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEscapableId"


    // $ANTLR start "entryRuleReservedKeyWords"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2100:1: entryRuleReservedKeyWords returns [String current=null] : iv_ruleReservedKeyWords= ruleReservedKeyWords EOF ;
    public final String entryRuleReservedKeyWords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReservedKeyWords = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2101:2: (iv_ruleReservedKeyWords= ruleReservedKeyWords EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2102:2: iv_ruleReservedKeyWords= ruleReservedKeyWords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReservedKeyWordsRule()); 
            }
            pushFollow(FOLLOW_ruleReservedKeyWords_in_entryRuleReservedKeyWords4729);
            iv_ruleReservedKeyWords=ruleReservedKeyWords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReservedKeyWords.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReservedKeyWords4740); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReservedKeyWords"


    // $ANTLR start "ruleReservedKeyWords"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2109:1: ruleReservedKeyWords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'record' | kw= 'fixed' | kw= 'enum' | kw= 'map' | kw= 'array' | kw= 'union' | kw= 'error' | kw= 'protocol' | kw= 'oneway' | kw= 'import' | kw= 'throws' ) ;
    public final AntlrDatatypeRuleToken ruleReservedKeyWords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2112:28: ( (kw= 'record' | kw= 'fixed' | kw= 'enum' | kw= 'map' | kw= 'array' | kw= 'union' | kw= 'error' | kw= 'protocol' | kw= 'oneway' | kw= 'import' | kw= 'throws' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2113:1: (kw= 'record' | kw= 'fixed' | kw= 'enum' | kw= 'map' | kw= 'array' | kw= 'union' | kw= 'error' | kw= 'protocol' | kw= 'oneway' | kw= 'import' | kw= 'throws' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2113:1: (kw= 'record' | kw= 'fixed' | kw= 'enum' | kw= 'map' | kw= 'array' | kw= 'union' | kw= 'error' | kw= 'protocol' | kw= 'oneway' | kw= 'import' | kw= 'throws' )
            int alt31=11;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt31=1;
                }
                break;
            case 37:
                {
                alt31=2;
                }
                break;
            case 38:
                {
                alt31=3;
                }
                break;
            case 29:
                {
                alt31=4;
                }
                break;
            case 26:
                {
                alt31=5;
                }
                break;
            case 25:
                {
                alt31=6;
                }
                break;
            case 23:
                {
                alt31=7;
                }
                break;
            case 13:
                {
                alt31=8;
                }
                break;
            case 20:
                {
                alt31=9;
                }
                break;
            case 11:
                {
                alt31=10;
                }
                break;
            case 19:
                {
                alt31=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2114:2: kw= 'record'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleReservedKeyWords4778); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReservedKeyWordsAccess().getRecordKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2121:2: kw= 'fixed'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleReservedKeyWords4797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReservedKeyWordsAccess().getFixedKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2128:2: kw= 'enum'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleReservedKeyWords4816); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReservedKeyWordsAccess().getEnumKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2135:2: kw= 'map'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleReservedKeyWords4835); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReservedKeyWordsAccess().getMapKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2142:2: kw= 'array'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleReservedKeyWords4854); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReservedKeyWordsAccess().getArrayKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2149:2: kw= 'union'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleReservedKeyWords4873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReservedKeyWordsAccess().getUnionKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2156:2: kw= 'error'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleReservedKeyWords4892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReservedKeyWordsAccess().getErrorKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2163:2: kw= 'protocol'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleReservedKeyWords4911); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReservedKeyWordsAccess().getProtocolKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2170:2: kw= 'oneway'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleReservedKeyWords4930); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReservedKeyWordsAccess().getOnewayKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2177:2: kw= 'import'
                    {
                    kw=(Token)match(input,11,FOLLOW_11_in_ruleReservedKeyWords4949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReservedKeyWordsAccess().getImportKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2184:2: kw= 'throws'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleReservedKeyWords4968); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReservedKeyWordsAccess().getThrowsKeyword_10()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReservedKeyWords"


    // $ANTLR start "entryRuleAN"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2197:1: entryRuleAN returns [String current=null] : iv_ruleAN= ruleAN EOF ;
    public final String entryRuleAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAN = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2198:2: (iv_ruleAN= ruleAN EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2199:2: iv_ruleAN= ruleAN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getANRule()); 
            }
            pushFollow(FOLLOW_ruleAN_in_entryRuleAN5009);
            iv_ruleAN=ruleAN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAN5020); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAN"


    // $ANTLR start "ruleAN"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2206:1: ruleAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2209:28: ( (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2210:1: (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2210:1: (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2210:6: this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAN5060); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getANAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2217:1: (kw= '-' this_ID_2= RULE_ID )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==43) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2218:2: kw= '-' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,43,FOLLOW_43_in_ruleAN5079); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getANAccess().getHyphenMinusKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAN5094); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getANAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAN"


    // $ANTLR start "entryRuleNegativeInt"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2238:1: entryRuleNegativeInt returns [String current=null] : iv_ruleNegativeInt= ruleNegativeInt EOF ;
    public final String entryRuleNegativeInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNegativeInt = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2239:2: (iv_ruleNegativeInt= ruleNegativeInt EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2240:2: iv_ruleNegativeInt= ruleNegativeInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegativeIntRule()); 
            }
            pushFollow(FOLLOW_ruleNegativeInt_in_entryRuleNegativeInt5142);
            iv_ruleNegativeInt=ruleNegativeInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegativeInt.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegativeInt5153); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegativeInt"


    // $ANTLR start "ruleNegativeInt"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2247:1: ruleNegativeInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleNegativeInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2250:28: ( (kw= '-' this_INT_1= RULE_INT ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2251:1: (kw= '-' this_INT_1= RULE_INT )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2251:1: (kw= '-' this_INT_1= RULE_INT )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2252:2: kw= '-' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,43,FOLLOW_43_in_ruleNegativeInt5191); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getNegativeIntAccess().getHyphenMinusKeyword_0()); 
                  
            }
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNegativeInt5206); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getNegativeIntAccess().getINTTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegativeInt"


    // $ANTLR start "ruleImportType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2272:1: ruleImportType returns [Enumerator current=null] : ( (enumLiteral_0= 'idl' ) | (enumLiteral_1= 'protocol' ) | (enumLiteral_2= 'schema' ) ) ;
    public final Enumerator ruleImportType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2274:28: ( ( (enumLiteral_0= 'idl' ) | (enumLiteral_1= 'protocol' ) | (enumLiteral_2= 'schema' ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2275:1: ( (enumLiteral_0= 'idl' ) | (enumLiteral_1= 'protocol' ) | (enumLiteral_2= 'schema' ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2275:1: ( (enumLiteral_0= 'idl' ) | (enumLiteral_1= 'protocol' ) | (enumLiteral_2= 'schema' ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt33=1;
                }
                break;
            case 13:
                {
                alt33=2;
                }
                break;
            case 45:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2275:2: (enumLiteral_0= 'idl' )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2275:2: (enumLiteral_0= 'idl' )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2275:4: enumLiteral_0= 'idl'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_44_in_ruleImportType5265); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getImportTypeAccess().getIDLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getImportTypeAccess().getIDLEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2281:6: (enumLiteral_1= 'protocol' )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2281:6: (enumLiteral_1= 'protocol' )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2281:8: enumLiteral_1= 'protocol'
                    {
                    enumLiteral_1=(Token)match(input,13,FOLLOW_13_in_ruleImportType5282); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getImportTypeAccess().getPROTOCOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getImportTypeAccess().getPROTOCOLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2287:6: (enumLiteral_2= 'schema' )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2287:6: (enumLiteral_2= 'schema' )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:2287:8: enumLiteral_2= 'schema'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_45_in_ruleImportType5299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getImportTypeAccess().getSCHEMAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getImportTypeAccess().getSCHEMAEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportType"

    // $ANTLR start synpred1_InternalAvdl
    public final void synpred1_InternalAvdl_fragment() throws RecognitionException {   
        // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1739:4: ( '[' )
        // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1739:6: '['
        {
        match(input,40,FOLLOW_40_in_synpred1_InternalAvdl3838); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalAvdl

    // $ANTLR start synpred3_InternalAvdl
    public final void synpred3_InternalAvdl_fragment() throws RecognitionException {   
        // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1878:7: ( '[' )
        // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvdl.g:1878:9: '['
        {
        match(input,40,FOLLOW_40_in_synpred3_InternalAvdl4156); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalAvdl

    // Delegated rules

    public final boolean synpred1_InternalAvdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalAvdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalAvdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalAvdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA27_eotS =
        "\12\uffff";
    static final String DFA27_eofS =
        "\1\1\11\uffff";
    static final String DFA27_minS =
        "\1\4\3\uffff\1\0\5\uffff";
    static final String DFA27_maxS =
        "\1\53\3\uffff\1\0\5\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\3\3\uffff\1\2\3\uffff\1\1";
    static final String DFA27_specialS =
        "\4\uffff\1\0\5\uffff}>";
    static final String[] DFA27_transitionS = {
            "\2\5\14\uffff\1\1\13\uffff\1\5\11\uffff\1\4\1\1\1\uffff\1\5",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "()* loopback of 1739:2: ( ( ( '[' )=> (lv_value_1_0= ruleArray ) ) | ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_4 = input.LA(1);

                         
                        int index27_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalAvdl()) ) {s = 9;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index27_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleAvdlFile_in_entryRuleAvdlFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvdlFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleAvdlFile131 = new BitSet(new long[]{0x0000008000002802L});
    public static final BitSet FOLLOW_ruleProtocol_in_ruleAvdlFile158 = new BitSet(new long[]{0x0000008000002802L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport242 = new BitSet(new long[]{0x0000300000002000L});
    public static final BitSet FOLLOW_ruleImportType_in_ruleImport263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport280 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImport297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_entryRuleProtocol333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocol343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleProtocol389 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_13_in_ruleProtocol402 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_ruleEscapableId_in_ruleProtocol423 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProtocol435 = new BitSet(new long[]{0x000004FFC1C08040L});
    public static final BitSet FOLLOW_ruleElement_in_ruleProtocol456 = new BitSet(new long[]{0x000004FFC1C08040L});
    public static final BitSet FOLLOW_15_in_ruleProtocol469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleElement562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRPCMessage_in_ruleElement589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRPCMessage_in_entryRuleRPCMessage624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRPCMessage634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnTypeLink_in_ruleRPCMessage680 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_ruleEscapableId_in_ruleRPCMessage701 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRPCMessage713 = new BitSet(new long[]{0x000004FFC1C40040L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleRPCMessage735 = new BitSet(new long[]{0x000004FFC1C60040L});
    public static final BitSet FOLLOW_17_in_ruleRPCMessage748 = new BitSet(new long[]{0x000004FFC1C00040L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleRPCMessage769 = new BitSet(new long[]{0x000004FFC1C60040L});
    public static final BitSet FOLLOW_18_in_ruleRPCMessage785 = new BitSet(new long[]{0x0000000000181000L});
    public static final BitSet FOLLOW_19_in_ruleRPCMessage798 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_ruleEscapableId_in_ruleRPCMessage821 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_20_in_ruleRPCMessage841 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRPCMessage867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_ruleArgument959 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_ruleEscapableId_in_ruleArgument980 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleArgument993 = new BitSet(new long[]{0x0000090040000030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArgument1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnTypeLink_in_entryRuleReturnTypeLink1052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnTypeLink1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidTypeLink_in_ruleReturnTypeLink1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_ruleReturnTypeLink1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidTypeLink_in_entryRuleVoidTypeLink1171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoidTypeLink1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleVoidTypeLink1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef1271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleTypeDef1327 = new BitSet(new long[]{0x000000E001800000L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeDef1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_ruleType1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_ruleType1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_ruleType1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleErrorType_in_ruleType1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleErrorType_in_entryRuleErrorType1558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleErrorType1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleErrorType1605 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_ruleEscapableId_in_ruleErrorType1626 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleErrorType1638 = new BitSet(new long[]{0x000004FFE7C08040L});
    public static final BitSet FOLLOW_ruleField_in_ruleErrorType1659 = new BitSet(new long[]{0x000004FFE7C08040L});
    public static final BitSet FOLLOW_15_in_ruleErrorType1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_entryRuleRecordType1708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordType1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleRecordType1755 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_ruleEscapableId_in_ruleRecordType1776 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRecordType1788 = new BitSet(new long[]{0x000004FFE7C08040L});
    public static final BitSet FOLLOW_ruleField_in_ruleRecordType1809 = new BitSet(new long[]{0x000004FFE7C08040L});
    public static final BitSet FOLLOW_15_in_ruleRecordType1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleField1914 = new BitSet(new long[]{0x000004FFE7C00040L});
    public static final BitSet FOLLOW_ruleFieldType_in_ruleField1936 = new BitSet(new long[]{0x0000048000000040L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleField1957 = new BitSet(new long[]{0x0000048000000040L});
    public static final BitSet FOLLOW_ruleEscapableId_in_ruleField1979 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_21_in_ruleField1992 = new BitSet(new long[]{0x0000090040000030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleField2013 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleField2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_entryRuleFieldType2063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldType2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldType_in_ruleFieldType2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionFieldType_in_ruleFieldType2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayFieldType_in_ruleFieldType2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapFieldType_in_ruleFieldType2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldType_in_entryRuleSimpleFieldType2236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFieldType2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_ruleSimpleFieldType2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionFieldType_in_entryRuleUnionFieldType2326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnionFieldType2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleUnionFieldType2373 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleUnionFieldType2385 = new BitSet(new long[]{0x000004FFC1C00040L});
    public static final BitSet FOLLOW_ruleTypeLink_in_ruleUnionFieldType2406 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleUnionFieldType2419 = new BitSet(new long[]{0x000004FFC1C00040L});
    public static final BitSet FOLLOW_ruleTypeLink_in_ruleUnionFieldType2440 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleUnionFieldType2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayFieldType_in_entryRuleArrayFieldType2490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayFieldType2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleArrayFieldType2537 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleArrayFieldType2549 = new BitSet(new long[]{0x000004FFC1C00040L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleArrayFieldType2570 = new BitSet(new long[]{0x000004FFC1C00040L});
    public static final BitSet FOLLOW_ruleTypeLink_in_ruleArrayFieldType2592 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleArrayFieldType2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapFieldType_in_entryRuleMapFieldType2640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapFieldType2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleMapFieldType2687 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMapFieldType2699 = new BitSet(new long[]{0x000004FFC1C00040L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleMapFieldType2720 = new BitSet(new long[]{0x000004FFC1C00040L});
    public static final BitSet FOLLOW_ruleTypeLink_in_ruleMapFieldType2742 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMapFieldType2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_entryRuleTypeLink2790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeLink2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimativeTypeLink_in_ruleTypeLink2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomTypeLink_in_ruleTypeLink2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimativeTypeLink_in_entryRulePrimativeTypeLink2909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimativeTypeLink2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePrimativeTypeLink2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePrimativeTypeLink2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePrimativeTypeLink3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulePrimativeTypeLink3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePrimativeTypeLink3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePrimativeTypeLink3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulePrimativeTypeLink3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomTypeLink_in_entryRuleCustomTypeLink3188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomTypeLink3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_ruleCustomTypeLink3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_entryRuleFixedType3280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFixedType3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleFixedType3327 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_ruleEscapableId_in_ruleFixedType3348 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFixedType3360 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFixedType3377 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFixedType3394 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFixedType3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType3442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEnumType3489 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_ruleEscapableId_in_ruleEnumType3510 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumType3522 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumType3539 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleEnumType3557 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumType3574 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleEnumType3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation3629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleAnnotation3676 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAN_in_ruleAnnotation3697 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleAnnotation3710 = new BitSet(new long[]{0x0000090040040030L});
    public static final BitSet FOLLOW_ruleValues_in_ruleAnnotation3731 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAnnotation3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_entryRuleValues3781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValues3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleValues3854 = new BitSet(new long[]{0x0000090040000032L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValues3882 = new BitSet(new long[]{0x0000090040020032L});
    public static final BitSet FOLLOW_17_in_ruleValues3895 = new BitSet(new long[]{0x0000090040000030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValues3916 = new BitSet(new long[]{0x0000090040020032L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray3957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleArray4012 = new BitSet(new long[]{0x00000B0040000030L});
    public static final BitSet FOLLOW_ruleValues_in_ruleArray4034 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleArray4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue4082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleValue4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValue4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_ruleValue4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_entryRuleNull4264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNull4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleNull4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue4364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue4455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegativeInt_in_ruleIntValue4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_entryRuleEscapableId4571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapableId4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEscapableId4622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEscapableId4647 = new BitSet(new long[]{0x0000006027982800L});
    public static final BitSet FOLLOW_ruleReservedKeyWords_in_ruleEscapableId4669 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleEscapableId4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedKeyWords_in_entryRuleReservedKeyWords4729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReservedKeyWords4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleReservedKeyWords4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleReservedKeyWords4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleReservedKeyWords4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleReservedKeyWords4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleReservedKeyWords4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleReservedKeyWords4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleReservedKeyWords4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleReservedKeyWords4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleReservedKeyWords4930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleReservedKeyWords4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleReservedKeyWords4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAN_in_entryRuleAN5009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAN5020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAN5060 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleAN5079 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAN5094 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleNegativeInt_in_entryRuleNegativeInt5142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegativeInt5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleNegativeInt5191 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNegativeInt5206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleImportType5265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImportType5282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleImportType5299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred1_InternalAvdl3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred3_InternalAvdl4156 = new BitSet(new long[]{0x0000000000000002L});

}