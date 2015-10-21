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
import avroclipse.services.AvroIDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAvroIDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'protocol'", "'{'", "'}'", "'('", "','", "')'", "'throws'", "'oneway'", "'='", "'void'", "'error'", "'record'", "'union'", "'array'", "'<'", "'>'", "'map'", "'int'", "'long'", "'string'", "'boolean'", "'float'", "'double'", "'null'", "'bytes'", "'fixed'", "'enum'", "'['", "']'", "'`'", "'@'", "'-'", "'true'", "'false'", "'idl'", "'schema'"
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
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAvroIDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAvroIDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAvroIDLParser.tokenNames; }
    public String getGrammarFileName() { return "../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g"; }



     	private AvroIDLGrammarAccess grammarAccess;
     	
        public InternalAvroIDLParser(TokenStream input, AvroIDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AvroIDLFile";	
       	}
       	
       	@Override
       	protected AvroIDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAvroIDLFile"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:68:1: entryRuleAvroIDLFile returns [EObject current=null] : iv_ruleAvroIDLFile= ruleAvroIDLFile EOF ;
    public final EObject entryRuleAvroIDLFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvroIDLFile = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:69:2: (iv_ruleAvroIDLFile= ruleAvroIDLFile EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:70:2: iv_ruleAvroIDLFile= ruleAvroIDLFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAvroIDLFileRule()); 
            }
            pushFollow(FOLLOW_ruleAvroIDLFile_in_entryRuleAvroIDLFile75);
            iv_ruleAvroIDLFile=ruleAvroIDLFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAvroIDLFile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvroIDLFile85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAvroIDLFile"


    // $ANTLR start "ruleAvroIDLFile"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:77:1: ruleAvroIDLFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_protocols_1_0= ruleProtocol ) )? ) ;
    public final EObject ruleAvroIDLFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_protocols_1_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:80:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_protocols_1_0= ruleProtocol ) )? ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_protocols_1_0= ruleProtocol ) )? )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_protocols_1_0= ruleProtocol ) )? )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:81:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_protocols_1_0= ruleProtocol ) )?
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:81:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:82:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:82:1: (lv_imports_0_0= ruleImport )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:83:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAvroIDLFileAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleAvroIDLFile131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAvroIDLFileRule());
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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:99:3: ( (lv_protocols_1_0= ruleProtocol ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13||LA2_0==43) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:100:1: (lv_protocols_1_0= ruleProtocol )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:100:1: (lv_protocols_1_0= ruleProtocol )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:101:3: lv_protocols_1_0= ruleProtocol
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAvroIDLFileAccess().getProtocolsProtocolParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleProtocol_in_ruleAvroIDLFile153);
                    lv_protocols_1_0=ruleProtocol();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAvroIDLFileRule());
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
    // $ANTLR end "ruleAvroIDLFile"


    // $ANTLR start "entryRuleImport"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:125:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:126:2: (iv_ruleImport= ruleImport EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:127:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport190);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport200); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:134:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_type_1_0= ruleImportType ) ) ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:137:28: ( (otherlv_0= 'import' ( (lv_type_1_0= ruleImportType ) ) ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:138:1: (otherlv_0= 'import' ( (lv_type_1_0= ruleImportType ) ) ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:138:1: (otherlv_0= 'import' ( (lv_type_1_0= ruleImportType ) ) ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:138:3: otherlv_0= 'import' ( (lv_type_1_0= ruleImportType ) ) ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:142:1: ( (lv_type_1_0= ruleImportType ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:143:1: (lv_type_1_0= ruleImportType )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:143:1: (lv_type_1_0= ruleImportType )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:144:3: lv_type_1_0= ruleImportType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getTypeImportTypeEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImportType_in_ruleImport258);
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

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:160:2: ( (lv_importURI_2_0= RULE_STRING ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:161:1: (lv_importURI_2_0= RULE_STRING )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:161:1: (lv_importURI_2_0= RULE_STRING )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:162:3: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport275); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_2_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getImportRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importURI",
                      		lv_importURI_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleImport292); if (state.failed) return current;
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:190:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:191:2: (iv_ruleProtocol= ruleProtocol EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:192:2: iv_ruleProtocol= ruleProtocol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtocolRule()); 
            }
            pushFollow(FOLLOW_ruleProtocol_in_entryRuleProtocol328);
            iv_ruleProtocol=ruleProtocol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtocol; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocol338); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:199:1: ruleProtocol returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'protocol' ( (lv_name_2_0= ruleEscapableId ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )* otherlv_5= '}' ) ;
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
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:202:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'protocol' ( (lv_name_2_0= ruleEscapableId ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )* otherlv_5= '}' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:203:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'protocol' ( (lv_name_2_0= ruleEscapableId ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )* otherlv_5= '}' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:203:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'protocol' ( (lv_name_2_0= ruleEscapableId ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )* otherlv_5= '}' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:203:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'protocol' ( (lv_name_2_0= ruleEscapableId ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )* otherlv_5= '}'
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:203:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==43) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:204:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:204:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:205:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProtocolAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleProtocol384);
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
            	    break loop3;
                }
            } while (true);

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleProtocol397); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getProtocolAccess().getProtocolKeyword_1());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:225:1: ( (lv_name_2_0= ruleEscapableId ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:226:1: (lv_name_2_0= ruleEscapableId )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:226:1: (lv_name_2_0= ruleEscapableId )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:227:3: lv_name_2_0= ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProtocolAccess().getNameEscapableIdParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEscapableId_in_ruleProtocol418);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleProtocol430); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:247:1: ( (lv_elements_4_0= ruleElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=22 && LA4_0<=24)||(LA4_0>=30 && LA4_0<=39)||(LA4_0>=42 && LA4_0<=43)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:248:1: (lv_elements_4_0= ruleElement )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:248:1: (lv_elements_4_0= ruleElement )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:249:3: lv_elements_4_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProtocolAccess().getElementsElementParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElement_in_ruleProtocol451);
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
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleProtocol464); if (state.failed) return current;
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:277:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:278:2: (iv_ruleElement= ruleElement EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:279:2: iv_ruleElement= ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement500);
            iv_ruleElement=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement510); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:286:1: ruleElement returns [EObject current=null] : (this_TypeDef_0= ruleTypeDef | this_RPCMessage_1= ruleRPCMessage ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDef_0 = null;

        EObject this_RPCMessage_1 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:289:28: ( (this_TypeDef_0= ruleTypeDef | this_RPCMessage_1= ruleRPCMessage ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:290:1: (this_TypeDef_0= ruleTypeDef | this_RPCMessage_1= ruleRPCMessage )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:290:1: (this_TypeDef_0= ruleTypeDef | this_RPCMessage_1= ruleRPCMessage )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=23 && LA5_0<=24)||(LA5_0>=38 && LA5_0<=39)||LA5_0==43) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID||LA5_0==22||(LA5_0>=30 && LA5_0<=37)||LA5_0==42) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:291:5: this_TypeDef_0= ruleTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getTypeDefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeDef_in_ruleElement557);
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
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:301:5: this_RPCMessage_1= ruleRPCMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getRPCMessageParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRPCMessage_in_ruleElement584);
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:317:1: entryRuleRPCMessage returns [EObject current=null] : iv_ruleRPCMessage= ruleRPCMessage EOF ;
    public final EObject entryRuleRPCMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRPCMessage = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:318:2: (iv_ruleRPCMessage= ruleRPCMessage EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:319:2: iv_ruleRPCMessage= ruleRPCMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRPCMessageRule()); 
            }
            pushFollow(FOLLOW_ruleRPCMessage_in_entryRuleRPCMessage619);
            iv_ruleRPCMessage=ruleRPCMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRPCMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRPCMessage629); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:326:1: ruleRPCMessage returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleReturnTypeLink ) ) ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )* otherlv_6= ')' (otherlv_7= 'throws' ( ( ruleEscapableId ) ) )? ( (lv_oneway_9_0= 'oneway' ) )? otherlv_10= ';' ) ;
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
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:329:28: ( ( ( (lv_returnType_0_0= ruleReturnTypeLink ) ) ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )* otherlv_6= ')' (otherlv_7= 'throws' ( ( ruleEscapableId ) ) )? ( (lv_oneway_9_0= 'oneway' ) )? otherlv_10= ';' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:330:1: ( ( (lv_returnType_0_0= ruleReturnTypeLink ) ) ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )* otherlv_6= ')' (otherlv_7= 'throws' ( ( ruleEscapableId ) ) )? ( (lv_oneway_9_0= 'oneway' ) )? otherlv_10= ';' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:330:1: ( ( (lv_returnType_0_0= ruleReturnTypeLink ) ) ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )* otherlv_6= ')' (otherlv_7= 'throws' ( ( ruleEscapableId ) ) )? ( (lv_oneway_9_0= 'oneway' ) )? otherlv_10= ';' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:330:2: ( (lv_returnType_0_0= ruleReturnTypeLink ) ) ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )* otherlv_6= ')' (otherlv_7= 'throws' ( ( ruleEscapableId ) ) )? ( (lv_oneway_9_0= 'oneway' ) )? otherlv_10= ';'
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:330:2: ( (lv_returnType_0_0= ruleReturnTypeLink ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:331:1: (lv_returnType_0_0= ruleReturnTypeLink )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:331:1: (lv_returnType_0_0= ruleReturnTypeLink )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:332:3: lv_returnType_0_0= ruleReturnTypeLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRPCMessageAccess().getReturnTypeReturnTypeLinkParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReturnTypeLink_in_ruleRPCMessage675);
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

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:348:2: ( (lv_name_1_0= ruleEscapableId ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:349:1: (lv_name_1_0= ruleEscapableId )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:349:1: (lv_name_1_0= ruleEscapableId )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:350:3: lv_name_1_0= ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRPCMessageAccess().getNameEscapableIdParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEscapableId_in_ruleRPCMessage696);
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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleRPCMessage708); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRPCMessageAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:370:1: ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=30 && LA7_0<=37)||LA7_0==42) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:370:2: ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )*
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:370:2: ( (lv_arguments_3_0= ruleArgument ) )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:371:1: (lv_arguments_3_0= ruleArgument )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:371:1: (lv_arguments_3_0= ruleArgument )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:372:3: lv_arguments_3_0= ruleArgument
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRPCMessageAccess().getArgumentsArgumentParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArgument_in_ruleRPCMessage730);
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

            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:388:2: (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==17) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:388:4: otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleRPCMessage743); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_4, grammarAccess.getRPCMessageAccess().getCommaKeyword_3_1_0());
            	    	          
            	    	    }
            	    	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:392:1: ( (lv_arguments_5_0= ruleArgument ) )
            	    	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:393:1: (lv_arguments_5_0= ruleArgument )
            	    	    {
            	    	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:393:1: (lv_arguments_5_0= ruleArgument )
            	    	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:394:3: lv_arguments_5_0= ruleArgument
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getRPCMessageAccess().getArgumentsArgumentParserRuleCall_3_1_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleArgument_in_ruleRPCMessage764);
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
            	    	    break loop6;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleRPCMessage780); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getRPCMessageAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:414:1: (otherlv_7= 'throws' ( ( ruleEscapableId ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:414:3: otherlv_7= 'throws' ( ( ruleEscapableId ) )
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleRPCMessage793); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getRPCMessageAccess().getThrowsKeyword_5_0());
                          
                    }
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:418:1: ( ( ruleEscapableId ) )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:419:1: ( ruleEscapableId )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:419:1: ( ruleEscapableId )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:420:3: ruleEscapableId
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRPCMessageRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRPCMessageAccess().getErrorErrorTypeCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEscapableId_in_ruleRPCMessage816);
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

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:433:4: ( (lv_oneway_9_0= 'oneway' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:434:1: (lv_oneway_9_0= 'oneway' )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:434:1: (lv_oneway_9_0= 'oneway' )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:435:3: lv_oneway_9_0= 'oneway'
                    {
                    lv_oneway_9_0=(Token)match(input,20,FOLLOW_20_in_ruleRPCMessage836); if (state.failed) return current;
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

            otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleRPCMessage862); if (state.failed) return current;
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:460:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:461:2: (iv_ruleArgument= ruleArgument EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:462:2: iv_ruleArgument= ruleArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentRule()); 
            }
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument898);
            iv_ruleArgument=ruleArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgument; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument908); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:469:1: ruleArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeLink ) ) ( (lv_name_1_0= ruleEscapableId ) ) (otherlv_2= '=' ( (lv_default_3_0= ruleValue ) ) )? ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_default_3_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:472:28: ( ( ( (lv_type_0_0= ruleTypeLink ) ) ( (lv_name_1_0= ruleEscapableId ) ) (otherlv_2= '=' ( (lv_default_3_0= ruleValue ) ) )? ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:473:1: ( ( (lv_type_0_0= ruleTypeLink ) ) ( (lv_name_1_0= ruleEscapableId ) ) (otherlv_2= '=' ( (lv_default_3_0= ruleValue ) ) )? )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:473:1: ( ( (lv_type_0_0= ruleTypeLink ) ) ( (lv_name_1_0= ruleEscapableId ) ) (otherlv_2= '=' ( (lv_default_3_0= ruleValue ) ) )? )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:473:2: ( (lv_type_0_0= ruleTypeLink ) ) ( (lv_name_1_0= ruleEscapableId ) ) (otherlv_2= '=' ( (lv_default_3_0= ruleValue ) ) )?
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:473:2: ( (lv_type_0_0= ruleTypeLink ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:474:1: (lv_type_0_0= ruleTypeLink )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:474:1: (lv_type_0_0= ruleTypeLink )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:475:3: lv_type_0_0= ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArgumentAccess().getTypeTypeLinkParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeLink_in_ruleArgument954);
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

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:491:2: ( (lv_name_1_0= ruleEscapableId ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:492:1: (lv_name_1_0= ruleEscapableId )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:492:1: (lv_name_1_0= ruleEscapableId )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:493:3: lv_name_1_0= ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArgumentAccess().getNameEscapableIdParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEscapableId_in_ruleArgument975);
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

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:509:2: (otherlv_2= '=' ( (lv_default_3_0= ruleValue ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:509:4: otherlv_2= '=' ( (lv_default_3_0= ruleValue ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleArgument988); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getArgumentAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:513:1: ( (lv_default_3_0= ruleValue ) )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:514:1: (lv_default_3_0= ruleValue )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:514:1: (lv_default_3_0= ruleValue )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:515:3: lv_default_3_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArgumentAccess().getDefaultValueParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleArgument1009);
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:539:1: entryRuleReturnTypeLink returns [EObject current=null] : iv_ruleReturnTypeLink= ruleReturnTypeLink EOF ;
    public final EObject entryRuleReturnTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnTypeLink = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:540:2: (iv_ruleReturnTypeLink= ruleReturnTypeLink EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:541:2: iv_ruleReturnTypeLink= ruleReturnTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleReturnTypeLink_in_entryRuleReturnTypeLink1047);
            iv_ruleReturnTypeLink=ruleReturnTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnTypeLink1057); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:548:1: ruleReturnTypeLink returns [EObject current=null] : (this_VoidTypeLink_0= ruleVoidTypeLink | this_TypeLink_1= ruleTypeLink ) ;
    public final EObject ruleReturnTypeLink() throws RecognitionException {
        EObject current = null;

        EObject this_VoidTypeLink_0 = null;

        EObject this_TypeLink_1 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:551:28: ( (this_VoidTypeLink_0= ruleVoidTypeLink | this_TypeLink_1= ruleTypeLink ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:552:1: (this_VoidTypeLink_0= ruleVoidTypeLink | this_TypeLink_1= ruleTypeLink )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:552:1: (this_VoidTypeLink_0= ruleVoidTypeLink | this_TypeLink_1= ruleTypeLink )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID||(LA11_0>=30 && LA11_0<=37)||LA11_0==42) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:553:5: this_VoidTypeLink_0= ruleVoidTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReturnTypeLinkAccess().getVoidTypeLinkParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVoidTypeLink_in_ruleReturnTypeLink1104);
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
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:563:5: this_TypeLink_1= ruleTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReturnTypeLinkAccess().getTypeLinkParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeLink_in_ruleReturnTypeLink1131);
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:579:1: entryRuleVoidTypeLink returns [EObject current=null] : iv_ruleVoidTypeLink= ruleVoidTypeLink EOF ;
    public final EObject entryRuleVoidTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidTypeLink = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:580:2: (iv_ruleVoidTypeLink= ruleVoidTypeLink EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:581:2: iv_ruleVoidTypeLink= ruleVoidTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVoidTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleVoidTypeLink_in_entryRuleVoidTypeLink1166);
            iv_ruleVoidTypeLink=ruleVoidTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVoidTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoidTypeLink1176); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:588:1: ruleVoidTypeLink returns [EObject current=null] : ( (lv_target_0_0= 'void' ) ) ;
    public final EObject ruleVoidTypeLink() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;

         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:591:28: ( ( (lv_target_0_0= 'void' ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:592:1: ( (lv_target_0_0= 'void' ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:592:1: ( (lv_target_0_0= 'void' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:593:1: (lv_target_0_0= 'void' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:593:1: (lv_target_0_0= 'void' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:594:3: lv_target_0_0= 'void'
            {
            lv_target_0_0=(Token)match(input,22,FOLLOW_22_in_ruleVoidTypeLink1218); if (state.failed) return current;
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:615:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:616:2: (iv_ruleTypeDef= ruleTypeDef EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:617:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef1266);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef1276); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:624:1: ruleTypeDef returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:627:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleType ) ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:628:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleType ) ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:628:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleType ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:628:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleType ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:628:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==43) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:629:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:629:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:630:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypeDefAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleTypeDef1322);
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
            	    break loop12;
                }
            } while (true);

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:646:3: ( (lv_type_1_0= ruleType ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:647:1: (lv_type_1_0= ruleType )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:647:1: (lv_type_1_0= ruleType )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:648:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDefAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleTypeDef1344);
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:672:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:673:2: (iv_ruleType= ruleType EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:674:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType1380);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1390); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:681:1: ruleType returns [EObject current=null] : (this_EnumType_0= ruleEnumType | this_FixedType_1= ruleFixedType | this_RecordType_2= ruleRecordType | this_ErrorType_3= ruleErrorType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_EnumType_0 = null;

        EObject this_FixedType_1 = null;

        EObject this_RecordType_2 = null;

        EObject this_ErrorType_3 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:684:28: ( (this_EnumType_0= ruleEnumType | this_FixedType_1= ruleFixedType | this_RecordType_2= ruleRecordType | this_ErrorType_3= ruleErrorType ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:685:1: (this_EnumType_0= ruleEnumType | this_FixedType_1= ruleFixedType | this_RecordType_2= ruleRecordType | this_ErrorType_3= ruleErrorType )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:685:1: (this_EnumType_0= ruleEnumType | this_FixedType_1= ruleFixedType | this_RecordType_2= ruleRecordType | this_ErrorType_3= ruleErrorType )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt13=1;
                }
                break;
            case 38:
                {
                alt13=2;
                }
                break;
            case 24:
                {
                alt13=3;
                }
                break;
            case 23:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:686:5: this_EnumType_0= ruleEnumType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumType_in_ruleType1437);
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
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:696:5: this_FixedType_1= ruleFixedType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getFixedTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFixedType_in_ruleType1464);
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
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:706:5: this_RecordType_2= ruleRecordType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getRecordTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRecordType_in_ruleType1491);
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
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:716:5: this_ErrorType_3= ruleErrorType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getErrorTypeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleErrorType_in_ruleType1518);
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:732:1: entryRuleErrorType returns [EObject current=null] : iv_ruleErrorType= ruleErrorType EOF ;
    public final EObject entryRuleErrorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorType = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:733:2: (iv_ruleErrorType= ruleErrorType EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:734:2: iv_ruleErrorType= ruleErrorType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getErrorTypeRule()); 
            }
            pushFollow(FOLLOW_ruleErrorType_in_entryRuleErrorType1553);
            iv_ruleErrorType=ruleErrorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleErrorType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleErrorType1563); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:741:1: ruleErrorType returns [EObject current=null] : (otherlv_0= 'error' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) ;
    public final EObject ruleErrorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:744:28: ( (otherlv_0= 'error' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:745:1: (otherlv_0= 'error' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:745:1: (otherlv_0= 'error' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:745:3: otherlv_0= 'error' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleErrorType1600); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getErrorTypeAccess().getErrorKeyword_0());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:749:1: ( (lv_name_1_0= ruleEscapableId ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:750:1: (lv_name_1_0= ruleEscapableId )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:750:1: (lv_name_1_0= ruleEscapableId )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:751:3: lv_name_1_0= ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getErrorTypeAccess().getNameEscapableIdParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEscapableId_in_ruleErrorType1621);
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleErrorType1633); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getErrorTypeAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:771:1: ( (lv_fields_3_0= ruleField ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=25 && LA14_0<=26)||(LA14_0>=29 && LA14_0<=37)||(LA14_0>=42 && LA14_0<=43)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:772:1: (lv_fields_3_0= ruleField )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:772:1: (lv_fields_3_0= ruleField )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:773:3: lv_fields_3_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getErrorTypeAccess().getFieldsFieldParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleField_in_ruleErrorType1654);
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
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleErrorType1667); if (state.failed) return current;
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:801:1: entryRuleRecordType returns [EObject current=null] : iv_ruleRecordType= ruleRecordType EOF ;
    public final EObject entryRuleRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordType = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:802:2: (iv_ruleRecordType= ruleRecordType EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:803:2: iv_ruleRecordType= ruleRecordType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordTypeRule()); 
            }
            pushFollow(FOLLOW_ruleRecordType_in_entryRuleRecordType1703);
            iv_ruleRecordType=ruleRecordType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordType1713); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:810:1: ruleRecordType returns [EObject current=null] : (otherlv_0= 'record' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) ;
    public final EObject ruleRecordType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:813:28: ( (otherlv_0= 'record' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:814:1: (otherlv_0= 'record' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:814:1: (otherlv_0= 'record' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:814:3: otherlv_0= 'record' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleRecordType1750); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRecordTypeAccess().getRecordKeyword_0());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:818:1: ( (lv_name_1_0= ruleEscapableId ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:819:1: (lv_name_1_0= ruleEscapableId )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:819:1: (lv_name_1_0= ruleEscapableId )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:820:3: lv_name_1_0= ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRecordTypeAccess().getNameEscapableIdParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEscapableId_in_ruleRecordType1771);
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleRecordType1783); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:840:1: ( (lv_fields_3_0= ruleField ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=25 && LA15_0<=26)||(LA15_0>=29 && LA15_0<=37)||(LA15_0>=42 && LA15_0<=43)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:841:1: (lv_fields_3_0= ruleField )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:841:1: (lv_fields_3_0= ruleField )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:842:3: lv_fields_3_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleField_in_ruleRecordType1804);
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
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleRecordType1817); if (state.failed) return current;
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:870:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:871:2: (iv_ruleField= ruleField EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:872:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField1853);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1863); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:879:1: ruleField returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleFieldType ) ) ( (lv_nameAnnotations_2_0= ruleAnnotation ) )* ( (lv_name_3_0= ruleEscapableId ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleValue ) ) )? otherlv_6= ';' ) ;
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
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:882:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleFieldType ) ) ( (lv_nameAnnotations_2_0= ruleAnnotation ) )* ( (lv_name_3_0= ruleEscapableId ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleValue ) ) )? otherlv_6= ';' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:883:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleFieldType ) ) ( (lv_nameAnnotations_2_0= ruleAnnotation ) )* ( (lv_name_3_0= ruleEscapableId ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleValue ) ) )? otherlv_6= ';' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:883:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleFieldType ) ) ( (lv_nameAnnotations_2_0= ruleAnnotation ) )* ( (lv_name_3_0= ruleEscapableId ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleValue ) ) )? otherlv_6= ';' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:883:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleFieldType ) ) ( (lv_nameAnnotations_2_0= ruleAnnotation ) )* ( (lv_name_3_0= ruleEscapableId ) ) (otherlv_4= '=' ( (lv_default_5_0= ruleValue ) ) )? otherlv_6= ';'
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:883:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==43) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:884:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:884:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:885:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFieldAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleField1909);
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
            	    break loop16;
                }
            } while (true);

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:901:3: ( (lv_type_1_0= ruleFieldType ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:902:1: (lv_type_1_0= ruleFieldType )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:902:1: (lv_type_1_0= ruleFieldType )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:903:3: lv_type_1_0= ruleFieldType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFieldType_in_ruleField1931);
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

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:919:2: ( (lv_nameAnnotations_2_0= ruleAnnotation ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==43) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:920:1: (lv_nameAnnotations_2_0= ruleAnnotation )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:920:1: (lv_nameAnnotations_2_0= ruleAnnotation )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:921:3: lv_nameAnnotations_2_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFieldAccess().getNameAnnotationsAnnotationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleField1952);
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
            	    break loop17;
                }
            } while (true);

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:937:3: ( (lv_name_3_0= ruleEscapableId ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:938:1: (lv_name_3_0= ruleEscapableId )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:938:1: (lv_name_3_0= ruleEscapableId )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:939:3: lv_name_3_0= ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldAccess().getNameEscapableIdParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEscapableId_in_ruleField1974);
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

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:955:2: (otherlv_4= '=' ( (lv_default_5_0= ruleValue ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:955:4: otherlv_4= '=' ( (lv_default_5_0= ruleValue ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleField1987); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:959:1: ( (lv_default_5_0= ruleValue ) )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:960:1: (lv_default_5_0= ruleValue )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:960:1: (lv_default_5_0= ruleValue )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:961:3: lv_default_5_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldAccess().getDefaultValueParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleField2008);
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

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleField2022); if (state.failed) return current;
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:989:1: entryRuleFieldType returns [EObject current=null] : iv_ruleFieldType= ruleFieldType EOF ;
    public final EObject entryRuleFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldType = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:990:2: (iv_ruleFieldType= ruleFieldType EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:991:2: iv_ruleFieldType= ruleFieldType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleFieldType_in_entryRuleFieldType2058);
            iv_ruleFieldType=ruleFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldType2068); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:998:1: ruleFieldType returns [EObject current=null] : (this_SimpleFieldType_0= ruleSimpleFieldType | this_UnionFieldType_1= ruleUnionFieldType | this_ArrayFieldType_2= ruleArrayFieldType | this_MapFieldType_3= ruleMapFieldType ) ;
    public final EObject ruleFieldType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleFieldType_0 = null;

        EObject this_UnionFieldType_1 = null;

        EObject this_ArrayFieldType_2 = null;

        EObject this_MapFieldType_3 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1001:28: ( (this_SimpleFieldType_0= ruleSimpleFieldType | this_UnionFieldType_1= ruleUnionFieldType | this_ArrayFieldType_2= ruleArrayFieldType | this_MapFieldType_3= ruleMapFieldType ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1002:1: (this_SimpleFieldType_0= ruleSimpleFieldType | this_UnionFieldType_1= ruleUnionFieldType | this_ArrayFieldType_2= ruleArrayFieldType | this_MapFieldType_3= ruleMapFieldType )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1002:1: (this_SimpleFieldType_0= ruleSimpleFieldType | this_UnionFieldType_1= ruleUnionFieldType | this_ArrayFieldType_2= ruleArrayFieldType | this_MapFieldType_3= ruleMapFieldType )
            int alt19=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
                {
                alt19=1;
                }
                break;
            case 25:
                {
                alt19=2;
                }
                break;
            case 26:
                {
                alt19=3;
                }
                break;
            case 29:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1003:5: this_SimpleFieldType_0= ruleSimpleFieldType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldTypeAccess().getSimpleFieldTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimpleFieldType_in_ruleFieldType2115);
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
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1013:5: this_UnionFieldType_1= ruleUnionFieldType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldTypeAccess().getUnionFieldTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnionFieldType_in_ruleFieldType2142);
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
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1023:5: this_ArrayFieldType_2= ruleArrayFieldType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldTypeAccess().getArrayFieldTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayFieldType_in_ruleFieldType2169);
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
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1033:5: this_MapFieldType_3= ruleMapFieldType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldTypeAccess().getMapFieldTypeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMapFieldType_in_ruleFieldType2196);
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1049:1: entryRuleSimpleFieldType returns [EObject current=null] : iv_ruleSimpleFieldType= ruleSimpleFieldType EOF ;
    public final EObject entryRuleSimpleFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleFieldType = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1050:2: (iv_ruleSimpleFieldType= ruleSimpleFieldType EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1051:2: iv_ruleSimpleFieldType= ruleSimpleFieldType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleFieldType_in_entryRuleSimpleFieldType2231);
            iv_ruleSimpleFieldType=ruleSimpleFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleFieldType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleFieldType2241); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1058:1: ruleSimpleFieldType returns [EObject current=null] : ( (lv_type_0_0= ruleTypeLink ) ) ;
    public final EObject ruleSimpleFieldType() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1061:28: ( ( (lv_type_0_0= ruleTypeLink ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1062:1: ( (lv_type_0_0= ruleTypeLink ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1062:1: ( (lv_type_0_0= ruleTypeLink ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1063:1: (lv_type_0_0= ruleTypeLink )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1063:1: (lv_type_0_0= ruleTypeLink )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1064:3: lv_type_0_0= ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSimpleFieldTypeAccess().getTypeTypeLinkParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeLink_in_ruleSimpleFieldType2286);
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1088:1: entryRuleUnionFieldType returns [EObject current=null] : iv_ruleUnionFieldType= ruleUnionFieldType EOF ;
    public final EObject entryRuleUnionFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionFieldType = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1089:2: (iv_ruleUnionFieldType= ruleUnionFieldType EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1090:2: iv_ruleUnionFieldType= ruleUnionFieldType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnionFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleUnionFieldType_in_entryRuleUnionFieldType2321);
            iv_ruleUnionFieldType=ruleUnionFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnionFieldType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnionFieldType2331); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1097:1: ruleUnionFieldType returns [EObject current=null] : (otherlv_0= 'union' otherlv_1= '{' ( (lv_types_2_0= ruleTypeLink ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleTypeLink ) ) )* otherlv_5= '}' ) ;
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
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1100:28: ( (otherlv_0= 'union' otherlv_1= '{' ( (lv_types_2_0= ruleTypeLink ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleTypeLink ) ) )* otherlv_5= '}' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1101:1: (otherlv_0= 'union' otherlv_1= '{' ( (lv_types_2_0= ruleTypeLink ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleTypeLink ) ) )* otherlv_5= '}' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1101:1: (otherlv_0= 'union' otherlv_1= '{' ( (lv_types_2_0= ruleTypeLink ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleTypeLink ) ) )* otherlv_5= '}' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1101:3: otherlv_0= 'union' otherlv_1= '{' ( (lv_types_2_0= ruleTypeLink ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleTypeLink ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleUnionFieldType2368); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUnionFieldTypeAccess().getUnionKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleUnionFieldType2380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnionFieldTypeAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1109:1: ( (lv_types_2_0= ruleTypeLink ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1110:1: (lv_types_2_0= ruleTypeLink )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1110:1: (lv_types_2_0= ruleTypeLink )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1111:3: lv_types_2_0= ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnionFieldTypeAccess().getTypesTypeLinkParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeLink_in_ruleUnionFieldType2401);
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

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1127:2: (otherlv_3= ',' ( (lv_types_4_0= ruleTypeLink ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==17) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1127:4: otherlv_3= ',' ( (lv_types_4_0= ruleTypeLink ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleUnionFieldType2414); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getUnionFieldTypeAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1131:1: ( (lv_types_4_0= ruleTypeLink ) )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1132:1: (lv_types_4_0= ruleTypeLink )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1132:1: (lv_types_4_0= ruleTypeLink )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1133:3: lv_types_4_0= ruleTypeLink
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUnionFieldTypeAccess().getTypesTypeLinkParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTypeLink_in_ruleUnionFieldType2435);
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
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleUnionFieldType2449); if (state.failed) return current;
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1161:1: entryRuleArrayFieldType returns [EObject current=null] : iv_ruleArrayFieldType= ruleArrayFieldType EOF ;
    public final EObject entryRuleArrayFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayFieldType = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1162:2: (iv_ruleArrayFieldType= ruleArrayFieldType EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1163:2: iv_ruleArrayFieldType= ruleArrayFieldType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleArrayFieldType_in_entryRuleArrayFieldType2485);
            iv_ruleArrayFieldType=ruleArrayFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayFieldType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayFieldType2495); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1170:1: ruleArrayFieldType returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '<' ( (lv_annotation_2_0= ruleAnnotation ) )? ( (lv_type_3_0= ruleTypeLink ) ) otherlv_4= '>' ) ;
    public final EObject ruleArrayFieldType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_annotation_2_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1173:28: ( (otherlv_0= 'array' otherlv_1= '<' ( (lv_annotation_2_0= ruleAnnotation ) )? ( (lv_type_3_0= ruleTypeLink ) ) otherlv_4= '>' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1174:1: (otherlv_0= 'array' otherlv_1= '<' ( (lv_annotation_2_0= ruleAnnotation ) )? ( (lv_type_3_0= ruleTypeLink ) ) otherlv_4= '>' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1174:1: (otherlv_0= 'array' otherlv_1= '<' ( (lv_annotation_2_0= ruleAnnotation ) )? ( (lv_type_3_0= ruleTypeLink ) ) otherlv_4= '>' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1174:3: otherlv_0= 'array' otherlv_1= '<' ( (lv_annotation_2_0= ruleAnnotation ) )? ( (lv_type_3_0= ruleTypeLink ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleArrayFieldType2532); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayFieldTypeAccess().getArrayKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleArrayFieldType2544); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayFieldTypeAccess().getLessThanSignKeyword_1());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1182:1: ( (lv_annotation_2_0= ruleAnnotation ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1183:1: (lv_annotation_2_0= ruleAnnotation )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1183:1: (lv_annotation_2_0= ruleAnnotation )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1184:3: lv_annotation_2_0= ruleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayFieldTypeAccess().getAnnotationAnnotationParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleArrayFieldType2565);
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

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1200:3: ( (lv_type_3_0= ruleTypeLink ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1201:1: (lv_type_3_0= ruleTypeLink )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1201:1: (lv_type_3_0= ruleTypeLink )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1202:3: lv_type_3_0= ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayFieldTypeAccess().getTypeTypeLinkParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeLink_in_ruleArrayFieldType2587);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleArrayFieldType2599); if (state.failed) return current;
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1230:1: entryRuleMapFieldType returns [EObject current=null] : iv_ruleMapFieldType= ruleMapFieldType EOF ;
    public final EObject entryRuleMapFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapFieldType = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1231:2: (iv_ruleMapFieldType= ruleMapFieldType EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1232:2: iv_ruleMapFieldType= ruleMapFieldType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleMapFieldType_in_entryRuleMapFieldType2635);
            iv_ruleMapFieldType=ruleMapFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapFieldType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapFieldType2645); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1239:1: ruleMapFieldType returns [EObject current=null] : (otherlv_0= 'map' otherlv_1= '<' ( (lv_annotation_2_0= ruleAnnotation ) )? ( (lv_type_3_0= ruleTypeLink ) ) otherlv_4= '>' ) ;
    public final EObject ruleMapFieldType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_annotation_2_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1242:28: ( (otherlv_0= 'map' otherlv_1= '<' ( (lv_annotation_2_0= ruleAnnotation ) )? ( (lv_type_3_0= ruleTypeLink ) ) otherlv_4= '>' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1243:1: (otherlv_0= 'map' otherlv_1= '<' ( (lv_annotation_2_0= ruleAnnotation ) )? ( (lv_type_3_0= ruleTypeLink ) ) otherlv_4= '>' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1243:1: (otherlv_0= 'map' otherlv_1= '<' ( (lv_annotation_2_0= ruleAnnotation ) )? ( (lv_type_3_0= ruleTypeLink ) ) otherlv_4= '>' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1243:3: otherlv_0= 'map' otherlv_1= '<' ( (lv_annotation_2_0= ruleAnnotation ) )? ( (lv_type_3_0= ruleTypeLink ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleMapFieldType2682); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMapFieldTypeAccess().getMapKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleMapFieldType2694); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMapFieldTypeAccess().getLessThanSignKeyword_1());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1251:1: ( (lv_annotation_2_0= ruleAnnotation ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1252:1: (lv_annotation_2_0= ruleAnnotation )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1252:1: (lv_annotation_2_0= ruleAnnotation )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1253:3: lv_annotation_2_0= ruleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMapFieldTypeAccess().getAnnotationAnnotationParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleMapFieldType2715);
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

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1269:3: ( (lv_type_3_0= ruleTypeLink ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1270:1: (lv_type_3_0= ruleTypeLink )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1270:1: (lv_type_3_0= ruleTypeLink )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1271:3: lv_type_3_0= ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapFieldTypeAccess().getTypeTypeLinkParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeLink_in_ruleMapFieldType2737);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleMapFieldType2749); if (state.failed) return current;
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1299:1: entryRuleTypeLink returns [EObject current=null] : iv_ruleTypeLink= ruleTypeLink EOF ;
    public final EObject entryRuleTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLink = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1300:2: (iv_ruleTypeLink= ruleTypeLink EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1301:2: iv_ruleTypeLink= ruleTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_entryRuleTypeLink2785);
            iv_ruleTypeLink=ruleTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeLink2795); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1308:1: ruleTypeLink returns [EObject current=null] : (this_PrimativeTypeLink_0= rulePrimativeTypeLink | this_CustomTypeLink_1= ruleCustomTypeLink ) ;
    public final EObject ruleTypeLink() throws RecognitionException {
        EObject current = null;

        EObject this_PrimativeTypeLink_0 = null;

        EObject this_CustomTypeLink_1 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1311:28: ( (this_PrimativeTypeLink_0= rulePrimativeTypeLink | this_CustomTypeLink_1= ruleCustomTypeLink ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1312:1: (this_PrimativeTypeLink_0= rulePrimativeTypeLink | this_CustomTypeLink_1= ruleCustomTypeLink )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1312:1: (this_PrimativeTypeLink_0= rulePrimativeTypeLink | this_CustomTypeLink_1= ruleCustomTypeLink )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=30 && LA23_0<=37)) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID||LA23_0==42) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1313:5: this_PrimativeTypeLink_0= rulePrimativeTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLinkAccess().getPrimativeTypeLinkParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimativeTypeLink_in_ruleTypeLink2842);
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
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1323:5: this_CustomTypeLink_1= ruleCustomTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLinkAccess().getCustomTypeLinkParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCustomTypeLink_in_ruleTypeLink2869);
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1339:1: entryRulePrimativeTypeLink returns [EObject current=null] : iv_rulePrimativeTypeLink= rulePrimativeTypeLink EOF ;
    public final EObject entryRulePrimativeTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimativeTypeLink = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1340:2: (iv_rulePrimativeTypeLink= rulePrimativeTypeLink EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1341:2: iv_rulePrimativeTypeLink= rulePrimativeTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimativeTypeLinkRule()); 
            }
            pushFollow(FOLLOW_rulePrimativeTypeLink_in_entryRulePrimativeTypeLink2904);
            iv_rulePrimativeTypeLink=rulePrimativeTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimativeTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimativeTypeLink2914); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1348:1: rulePrimativeTypeLink returns [EObject current=null] : ( ( (lv_target_0_1= 'int' | lv_target_0_2= 'long' | lv_target_0_3= 'string' | lv_target_0_4= 'boolean' | lv_target_0_5= 'float' | lv_target_0_6= 'double' | lv_target_0_7= 'null' | lv_target_0_8= 'bytes' ) ) ) ;
    public final EObject rulePrimativeTypeLink() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_1=null;
        Token lv_target_0_2=null;
        Token lv_target_0_3=null;
        Token lv_target_0_4=null;
        Token lv_target_0_5=null;
        Token lv_target_0_6=null;
        Token lv_target_0_7=null;
        Token lv_target_0_8=null;

         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1351:28: ( ( ( (lv_target_0_1= 'int' | lv_target_0_2= 'long' | lv_target_0_3= 'string' | lv_target_0_4= 'boolean' | lv_target_0_5= 'float' | lv_target_0_6= 'double' | lv_target_0_7= 'null' | lv_target_0_8= 'bytes' ) ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1352:1: ( ( (lv_target_0_1= 'int' | lv_target_0_2= 'long' | lv_target_0_3= 'string' | lv_target_0_4= 'boolean' | lv_target_0_5= 'float' | lv_target_0_6= 'double' | lv_target_0_7= 'null' | lv_target_0_8= 'bytes' ) ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1352:1: ( ( (lv_target_0_1= 'int' | lv_target_0_2= 'long' | lv_target_0_3= 'string' | lv_target_0_4= 'boolean' | lv_target_0_5= 'float' | lv_target_0_6= 'double' | lv_target_0_7= 'null' | lv_target_0_8= 'bytes' ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1353:1: ( (lv_target_0_1= 'int' | lv_target_0_2= 'long' | lv_target_0_3= 'string' | lv_target_0_4= 'boolean' | lv_target_0_5= 'float' | lv_target_0_6= 'double' | lv_target_0_7= 'null' | lv_target_0_8= 'bytes' ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1353:1: ( (lv_target_0_1= 'int' | lv_target_0_2= 'long' | lv_target_0_3= 'string' | lv_target_0_4= 'boolean' | lv_target_0_5= 'float' | lv_target_0_6= 'double' | lv_target_0_7= 'null' | lv_target_0_8= 'bytes' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1354:1: (lv_target_0_1= 'int' | lv_target_0_2= 'long' | lv_target_0_3= 'string' | lv_target_0_4= 'boolean' | lv_target_0_5= 'float' | lv_target_0_6= 'double' | lv_target_0_7= 'null' | lv_target_0_8= 'bytes' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1354:1: (lv_target_0_1= 'int' | lv_target_0_2= 'long' | lv_target_0_3= 'string' | lv_target_0_4= 'boolean' | lv_target_0_5= 'float' | lv_target_0_6= 'double' | lv_target_0_7= 'null' | lv_target_0_8= 'bytes' )
            int alt24=8;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt24=1;
                }
                break;
            case 31:
                {
                alt24=2;
                }
                break;
            case 32:
                {
                alt24=3;
                }
                break;
            case 33:
                {
                alt24=4;
                }
                break;
            case 34:
                {
                alt24=5;
                }
                break;
            case 35:
                {
                alt24=6;
                }
                break;
            case 36:
                {
                alt24=7;
                }
                break;
            case 37:
                {
                alt24=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1355:3: lv_target_0_1= 'int'
                    {
                    lv_target_0_1=(Token)match(input,30,FOLLOW_30_in_rulePrimativeTypeLink2958); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_target_0_1, grammarAccess.getPrimativeTypeLinkAccess().getTargetIntKeyword_0_0());
                          
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
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1367:8: lv_target_0_2= 'long'
                    {
                    lv_target_0_2=(Token)match(input,31,FOLLOW_31_in_rulePrimativeTypeLink2987); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_target_0_2, grammarAccess.getPrimativeTypeLinkAccess().getTargetLongKeyword_0_1());
                          
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
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1379:8: lv_target_0_3= 'string'
                    {
                    lv_target_0_3=(Token)match(input,32,FOLLOW_32_in_rulePrimativeTypeLink3016); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_target_0_3, grammarAccess.getPrimativeTypeLinkAccess().getTargetStringKeyword_0_2());
                          
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
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1391:8: lv_target_0_4= 'boolean'
                    {
                    lv_target_0_4=(Token)match(input,33,FOLLOW_33_in_rulePrimativeTypeLink3045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_target_0_4, grammarAccess.getPrimativeTypeLinkAccess().getTargetBooleanKeyword_0_3());
                          
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
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1403:8: lv_target_0_5= 'float'
                    {
                    lv_target_0_5=(Token)match(input,34,FOLLOW_34_in_rulePrimativeTypeLink3074); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_target_0_5, grammarAccess.getPrimativeTypeLinkAccess().getTargetFloatKeyword_0_4());
                          
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
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1415:8: lv_target_0_6= 'double'
                    {
                    lv_target_0_6=(Token)match(input,35,FOLLOW_35_in_rulePrimativeTypeLink3103); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_target_0_6, grammarAccess.getPrimativeTypeLinkAccess().getTargetDoubleKeyword_0_5());
                          
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
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1427:8: lv_target_0_7= 'null'
                    {
                    lv_target_0_7=(Token)match(input,36,FOLLOW_36_in_rulePrimativeTypeLink3132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_target_0_7, grammarAccess.getPrimativeTypeLinkAccess().getTargetNullKeyword_0_6());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimativeTypeLinkRule());
                      	        }
                             		setWithLastConsumed(current, "target", lv_target_0_7, null);
                      	    
                    }

                    }
                    break;
                case 8 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1439:8: lv_target_0_8= 'bytes'
                    {
                    lv_target_0_8=(Token)match(input,37,FOLLOW_37_in_rulePrimativeTypeLink3161); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_target_0_8, grammarAccess.getPrimativeTypeLinkAccess().getTargetBytesKeyword_0_7());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimativeTypeLinkRule());
                      	        }
                             		setWithLastConsumed(current, "target", lv_target_0_8, null);
                      	    
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1462:1: entryRuleCustomTypeLink returns [EObject current=null] : iv_ruleCustomTypeLink= ruleCustomTypeLink EOF ;
    public final EObject entryRuleCustomTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomTypeLink = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1463:2: (iv_ruleCustomTypeLink= ruleCustomTypeLink EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1464:2: iv_ruleCustomTypeLink= ruleCustomTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCustomTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleCustomTypeLink_in_entryRuleCustomTypeLink3212);
            iv_ruleCustomTypeLink=ruleCustomTypeLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCustomTypeLink; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomTypeLink3222); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1471:1: ruleCustomTypeLink returns [EObject current=null] : ( ( ruleEscapableId ) ) ;
    public final EObject ruleCustomTypeLink() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1474:28: ( ( ( ruleEscapableId ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1475:1: ( ( ruleEscapableId ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1475:1: ( ( ruleEscapableId ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1476:1: ( ruleEscapableId )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1476:1: ( ruleEscapableId )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1477:3: ruleEscapableId
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCustomTypeLinkRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCustomTypeLinkAccess().getTargetTypeCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEscapableId_in_ruleCustomTypeLink3269);
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1498:1: entryRuleFixedType returns [EObject current=null] : iv_ruleFixedType= ruleFixedType EOF ;
    public final EObject entryRuleFixedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFixedType = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1499:2: (iv_ruleFixedType= ruleFixedType EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1500:2: iv_ruleFixedType= ruleFixedType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFixedTypeRule()); 
            }
            pushFollow(FOLLOW_ruleFixedType_in_entryRuleFixedType3304);
            iv_ruleFixedType=ruleFixedType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFixedType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFixedType3314); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1507:1: ruleFixedType returns [EObject current=null] : (otherlv_0= 'fixed' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '(' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= ';' ) ;
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
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1510:28: ( (otherlv_0= 'fixed' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '(' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= ';' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1511:1: (otherlv_0= 'fixed' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '(' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= ';' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1511:1: (otherlv_0= 'fixed' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '(' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= ';' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1511:3: otherlv_0= 'fixed' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '(' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleFixedType3351); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFixedTypeAccess().getFixedKeyword_0());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1515:1: ( (lv_name_1_0= ruleEscapableId ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1516:1: (lv_name_1_0= ruleEscapableId )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1516:1: (lv_name_1_0= ruleEscapableId )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1517:3: lv_name_1_0= ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFixedTypeAccess().getNameEscapableIdParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEscapableId_in_ruleFixedType3372);
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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleFixedType3384); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFixedTypeAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1537:1: ( (lv_size_3_0= RULE_INT ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1538:1: (lv_size_3_0= RULE_INT )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1538:1: (lv_size_3_0= RULE_INT )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1539:3: lv_size_3_0= RULE_INT
            {
            lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFixedType3401); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleFixedType3418); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFixedTypeAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleFixedType3430); if (state.failed) return current;
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1571:1: entryRuleEnumType returns [EObject current=null] : iv_ruleEnumType= ruleEnumType EOF ;
    public final EObject entryRuleEnumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumType = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1572:2: (iv_ruleEnumType= ruleEnumType EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1573:2: iv_ruleEnumType= ruleEnumType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumTypeRule()); 
            }
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType3466);
            iv_ruleEnumType=ruleEnumType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType3476); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1580:1: ruleEnumType returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_literals_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )* otherlv_6= '}' ) ;
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
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1583:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_literals_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )* otherlv_6= '}' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1584:1: (otherlv_0= 'enum' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_literals_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )* otherlv_6= '}' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1584:1: (otherlv_0= 'enum' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_literals_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )* otherlv_6= '}' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1584:3: otherlv_0= 'enum' ( (lv_name_1_0= ruleEscapableId ) ) otherlv_2= '{' ( (lv_literals_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleEnumType3513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumTypeAccess().getEnumKeyword_0());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1588:1: ( (lv_name_1_0= ruleEscapableId ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1589:1: (lv_name_1_0= ruleEscapableId )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1589:1: (lv_name_1_0= ruleEscapableId )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1590:3: lv_name_1_0= ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumTypeAccess().getNameEscapableIdParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEscapableId_in_ruleEnumType3534);
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleEnumType3546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1610:1: ( (lv_literals_3_0= RULE_ID ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1611:1: (lv_literals_3_0= RULE_ID )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1611:1: (lv_literals_3_0= RULE_ID )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1612:3: lv_literals_3_0= RULE_ID
            {
            lv_literals_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumType3563); if (state.failed) return current;
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

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1628:2: (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==17) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1628:4: otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleEnumType3581); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getEnumTypeAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1632:1: ( (lv_literals_5_0= RULE_ID ) )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1633:1: (lv_literals_5_0= RULE_ID )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1633:1: (lv_literals_5_0= RULE_ID )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1634:3: lv_literals_5_0= RULE_ID
            	    {
            	    lv_literals_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumType3598); if (state.failed) return current;
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
            	    break loop25;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleEnumType3617); if (state.failed) return current;
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1662:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1663:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1664:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation3653);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation3663); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1671:1: ruleAnnotation returns [EObject current=null] : ( ( (lv_name_0_0= ruleAN ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleValues ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_values_2_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1674:28: ( ( ( (lv_name_0_0= ruleAN ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleValues ) ) otherlv_3= ')' )? ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1675:1: ( ( (lv_name_0_0= ruleAN ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleValues ) ) otherlv_3= ')' )? )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1675:1: ( ( (lv_name_0_0= ruleAN ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleValues ) ) otherlv_3= ')' )? )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1675:2: ( (lv_name_0_0= ruleAN ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleValues ) ) otherlv_3= ')' )?
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1675:2: ( (lv_name_0_0= ruleAN ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1676:1: (lv_name_0_0= ruleAN )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1676:1: (lv_name_0_0= ruleAN )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1677:3: lv_name_0_0= ruleAN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameANParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAN_in_ruleAnnotation3709);
            lv_name_0_0=ruleAN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"AN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1693:2: (otherlv_1= '(' ( (lv_values_2_0= ruleValues ) ) otherlv_3= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1693:4: otherlv_1= '(' ( (lv_values_2_0= ruleValues ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleAnnotation3722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1697:1: ( (lv_values_2_0= ruleValues ) )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1698:1: (lv_values_2_0= ruleValues )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1698:1: (lv_values_2_0= ruleValues )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1699:3: lv_values_2_0= ruleValues
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getValuesValuesParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValues_in_ruleAnnotation3743);
                    lv_values_2_0=ruleValues();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                      	        }
                             		set(
                             			current, 
                             			"values",
                              		lv_values_2_0, 
                              		"Values");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleAnnotation3755); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_1_2());
                          
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1727:1: entryRuleValues returns [EObject current=null] : iv_ruleValues= ruleValues EOF ;
    public final EObject entryRuleValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValues = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1728:2: (iv_ruleValues= ruleValues EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1729:2: iv_ruleValues= ruleValues EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuesRule()); 
            }
            pushFollow(FOLLOW_ruleValues_in_entryRuleValues3793);
            iv_ruleValues=ruleValues();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValues; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValues3803); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1736:1: ruleValues returns [EObject current=null] : ( () ( ( ( '[' )=> (lv_value_1_0= ruleArray ) ) | ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* ) )* ) ;
    public final EObject ruleValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1739:28: ( ( () ( ( ( '[' )=> (lv_value_1_0= ruleArray ) ) | ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* ) )* ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1740:1: ( () ( ( ( '[' )=> (lv_value_1_0= ruleArray ) ) | ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* ) )* )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1740:1: ( () ( ( ( '[' )=> (lv_value_1_0= ruleArray ) ) | ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* ) )* )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1740:2: () ( ( ( '[' )=> (lv_value_1_0= ruleArray ) ) | ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* ) )*
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1740:2: ()
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1741:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getValuesAccess().getValuesAction_0(),
                          current);
                  
            }

            }

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1746:2: ( ( ( '[' )=> (lv_value_1_0= ruleArray ) ) | ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* ) )*
            loop28:
            do {
                int alt28=3;
                alt28 = dfa28.predict(input);
                switch (alt28) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1746:3: ( ( '[' )=> (lv_value_1_0= ruleArray ) )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1746:3: ( ( '[' )=> (lv_value_1_0= ruleArray ) )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1746:4: ( '[' )=> (lv_value_1_0= ruleArray )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1748:1: (lv_value_1_0= ruleArray )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1749:3: lv_value_1_0= ruleArray
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuesAccess().getValueArrayParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArray_in_ruleValues3866);
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
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1766:6: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1766:6: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1766:7: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )*
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1766:7: ( (lv_value_2_0= ruleValue ) )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1767:1: (lv_value_2_0= ruleValue )
            	    {
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1767:1: (lv_value_2_0= ruleValue )
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1768:3: lv_value_2_0= ruleValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuesAccess().getValueValueParserRuleCall_1_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValue_in_ruleValues3894);
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

            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1784:2: (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )*
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==17) ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1784:4: otherlv_3= ',' ( (lv_value_4_0= ruleValue ) )
            	    	    {
            	    	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleValues3907); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_3, grammarAccess.getValuesAccess().getCommaKeyword_1_1_1_0());
            	    	          
            	    	    }
            	    	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1788:1: ( (lv_value_4_0= ruleValue ) )
            	    	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1789:1: (lv_value_4_0= ruleValue )
            	    	    {
            	    	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1789:1: (lv_value_4_0= ruleValue )
            	    	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1790:3: lv_value_4_0= ruleValue
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getValuesAccess().getValueValueParserRuleCall_1_1_1_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleValue_in_ruleValues3928);
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
            	    	    break loop27;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1814:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1815:2: (iv_ruleArray= ruleArray EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1816:2: iv_ruleArray= ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray3969);
            iv_ruleArray=ruleArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArray; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray3979); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1823:1: ruleArray returns [EObject current=null] : ( ( ( '[' )=>otherlv_0= '[' ) ( (lv_values_1_0= ruleValues ) ) otherlv_2= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_values_1_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1826:28: ( ( ( ( '[' )=>otherlv_0= '[' ) ( (lv_values_1_0= ruleValues ) ) otherlv_2= ']' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1827:1: ( ( ( '[' )=>otherlv_0= '[' ) ( (lv_values_1_0= ruleValues ) ) otherlv_2= ']' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1827:1: ( ( ( '[' )=>otherlv_0= '[' ) ( (lv_values_1_0= ruleValues ) ) otherlv_2= ']' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1827:2: ( ( '[' )=>otherlv_0= '[' ) ( (lv_values_1_0= ruleValues ) ) otherlv_2= ']'
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1827:2: ( ( '[' )=>otherlv_0= '[' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1827:3: ( '[' )=>otherlv_0= '['
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleArray4024); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0());
                  
            }

            }

            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1832:2: ( (lv_values_1_0= ruleValues ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1833:1: (lv_values_1_0= ruleValues )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1833:1: (lv_values_1_0= ruleValues )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1834:3: lv_values_1_0= ruleValues
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayAccess().getValuesValuesParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValues_in_ruleArray4046);
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

            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleArray4058); if (state.failed) return current;
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1862:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1863:2: (iv_ruleValue= ruleValue EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1864:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue4094);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue4104); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1871:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | ( ( '[' )=>this_Array_1= ruleArray ) | this_IntValue_2= ruleIntValue | this_BooleanValue_3= ruleBooleanValue | this_Null_4= ruleNull ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_Array_1 = null;

        EObject this_IntValue_2 = null;

        EObject this_BooleanValue_3 = null;

        EObject this_Null_4 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1874:28: ( (this_StringValue_0= ruleStringValue | ( ( '[' )=>this_Array_1= ruleArray ) | this_IntValue_2= ruleIntValue | this_BooleanValue_3= ruleBooleanValue | this_Null_4= ruleNull ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1875:1: (this_StringValue_0= ruleStringValue | ( ( '[' )=>this_Array_1= ruleArray ) | this_IntValue_2= ruleIntValue | this_BooleanValue_3= ruleBooleanValue | this_Null_4= ruleNull )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1875:1: (this_StringValue_0= ruleStringValue | ( ( '[' )=>this_Array_1= ruleArray ) | this_IntValue_2= ruleIntValue | this_BooleanValue_3= ruleBooleanValue | this_Null_4= ruleNull )
            int alt29=5;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            else if ( (LA29_0==40) && (synpred3_InternalAvroIDL())) {
                alt29=2;
            }
            else if ( (LA29_0==RULE_INT||LA29_0==44) ) {
                alt29=3;
            }
            else if ( ((LA29_0>=45 && LA29_0<=46)) ) {
                alt29=4;
            }
            else if ( (LA29_0==36) ) {
                alt29=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1876:5: this_StringValue_0= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue4151);
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
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1885:6: ( ( '[' )=>this_Array_1= ruleArray )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1885:6: ( ( '[' )=>this_Array_1= ruleArray )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1885:7: ( '[' )=>this_Array_1= ruleArray
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getArrayParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArray_in_ruleValue4186);
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
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1897:5: this_IntValue_2= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValue4214);
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
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1907:5: this_BooleanValue_3= ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleValue4241);
                    this_BooleanValue_3=ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanValue_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1917:5: this_Null_4= ruleNull
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getNullParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNull_in_ruleValue4268);
                    this_Null_4=ruleNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Null_4; 
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


    // $ANTLR start "entryRuleBooleanValue"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1933:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1934:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1935:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue4303);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue4313); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1942:1: ruleBooleanValue returns [EObject current=null] : ( (lv_val_0_0= ruleBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1945:28: ( ( (lv_val_0_0= ruleBoolean ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1946:1: ( (lv_val_0_0= ruleBoolean ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1946:1: ( (lv_val_0_0= ruleBoolean ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1947:1: (lv_val_0_0= ruleBoolean )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1947:1: (lv_val_0_0= ruleBoolean )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1948:3: lv_val_0_0= ruleBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBooleanValueAccess().getValBooleanParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBoolean_in_ruleBooleanValue4358);
            lv_val_0_0=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBooleanValueRule());
              	        }
                     		set(
                     			current, 
                     			"val",
                      		lv_val_0_0, 
                      		"Boolean");
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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleNull"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1972:1: entryRuleNull returns [EObject current=null] : iv_ruleNull= ruleNull EOF ;
    public final EObject entryRuleNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNull = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1973:2: (iv_ruleNull= ruleNull EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1974:2: iv_ruleNull= ruleNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullRule()); 
            }
            pushFollow(FOLLOW_ruleNull_in_entryRuleNull4393);
            iv_ruleNull=ruleNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNull; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNull4403); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1981:1: ruleNull returns [EObject current=null] : ( (lv_val_0_0= 'null' ) ) ;
    public final EObject ruleNull() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;

         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1984:28: ( ( (lv_val_0_0= 'null' ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1985:1: ( (lv_val_0_0= 'null' ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1985:1: ( (lv_val_0_0= 'null' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1986:1: (lv_val_0_0= 'null' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1986:1: (lv_val_0_0= 'null' )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1987:3: lv_val_0_0= 'null'
            {
            lv_val_0_0=(Token)match(input,36,FOLLOW_36_in_ruleNull4445); if (state.failed) return current;
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2008:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2009:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2010:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue4493);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue4503); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2017:1: ruleStringValue returns [EObject current=null] : ( (lv_val_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;

         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2020:28: ( ( (lv_val_0_0= RULE_STRING ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2021:1: ( (lv_val_0_0= RULE_STRING ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2021:1: ( (lv_val_0_0= RULE_STRING ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2022:1: (lv_val_0_0= RULE_STRING )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2022:1: (lv_val_0_0= RULE_STRING )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2023:3: lv_val_0_0= RULE_STRING
            {
            lv_val_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue4544); if (state.failed) return current;
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2047:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2048:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2049:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue4584);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue4594); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2056:1: ruleIntValue returns [EObject current=null] : ( ( (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt ) ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_1=null;
        AntlrDatatypeRuleToken lv_val_0_2 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2059:28: ( ( ( (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt ) ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2060:1: ( ( (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt ) ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2060:1: ( ( (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2061:1: ( (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2061:1: ( (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2062:1: (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2062:1: (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT) ) {
                alt30=1;
            }
            else if ( (LA30_0==44) ) {
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
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2063:3: lv_val_0_1= RULE_INT
                    {
                    lv_val_0_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue4637); if (state.failed) return current;
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
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2078:8: lv_val_0_2= ruleNegativeInt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntValueAccess().getValNegativeIntParserRuleCall_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNegativeInt_in_ruleIntValue4661);
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2104:1: entryRuleEscapableId returns [String current=null] : iv_ruleEscapableId= ruleEscapableId EOF ;
    public final String entryRuleEscapableId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEscapableId = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2105:2: (iv_ruleEscapableId= ruleEscapableId EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2106:2: iv_ruleEscapableId= ruleEscapableId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEscapableIdRule()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_entryRuleEscapableId4700);
            iv_ruleEscapableId=ruleEscapableId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEscapableId.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapableId4711); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2113:1: ruleEscapableId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | (kw= '`' this_ReservedKeyWords_2= ruleReservedKeyWords kw= '`' ) ) ;
    public final AntlrDatatypeRuleToken ruleEscapableId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_ReservedKeyWords_2 = null;


         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2116:28: ( (this_ID_0= RULE_ID | (kw= '`' this_ReservedKeyWords_2= ruleReservedKeyWords kw= '`' ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2117:1: (this_ID_0= RULE_ID | (kw= '`' this_ReservedKeyWords_2= ruleReservedKeyWords kw= '`' ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2117:1: (this_ID_0= RULE_ID | (kw= '`' this_ReservedKeyWords_2= ruleReservedKeyWords kw= '`' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            else if ( (LA31_0==42) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2117:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEscapableId4751); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getEscapableIdAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2125:6: (kw= '`' this_ReservedKeyWords_2= ruleReservedKeyWords kw= '`' )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2125:6: (kw= '`' this_ReservedKeyWords_2= ruleReservedKeyWords kw= '`' )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2126:2: kw= '`' this_ReservedKeyWords_2= ruleReservedKeyWords kw= '`'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleEscapableId4776); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEscapableIdAccess().getGraveAccentKeyword_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEscapableIdAccess().getReservedKeyWordsParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReservedKeyWords_in_ruleEscapableId4798);
                    this_ReservedKeyWords_2=ruleReservedKeyWords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ReservedKeyWords_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleEscapableId4816); if (state.failed) return current;
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2156:1: entryRuleReservedKeyWords returns [String current=null] : iv_ruleReservedKeyWords= ruleReservedKeyWords EOF ;
    public final String entryRuleReservedKeyWords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReservedKeyWords = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2157:2: (iv_ruleReservedKeyWords= ruleReservedKeyWords EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2158:2: iv_ruleReservedKeyWords= ruleReservedKeyWords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReservedKeyWordsRule()); 
            }
            pushFollow(FOLLOW_ruleReservedKeyWords_in_entryRuleReservedKeyWords4858);
            iv_ruleReservedKeyWords=ruleReservedKeyWords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReservedKeyWords.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReservedKeyWords4869); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2165:1: ruleReservedKeyWords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'record' | kw= 'fixed' | kw= 'enum' | kw= 'map' | kw= 'array' | kw= 'union' | kw= 'error' | kw= 'protocol' | kw= 'oneway' | kw= 'import' | kw= 'throws' ) ;
    public final AntlrDatatypeRuleToken ruleReservedKeyWords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2168:28: ( (kw= 'record' | kw= 'fixed' | kw= 'enum' | kw= 'map' | kw= 'array' | kw= 'union' | kw= 'error' | kw= 'protocol' | kw= 'oneway' | kw= 'import' | kw= 'throws' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2169:1: (kw= 'record' | kw= 'fixed' | kw= 'enum' | kw= 'map' | kw= 'array' | kw= 'union' | kw= 'error' | kw= 'protocol' | kw= 'oneway' | kw= 'import' | kw= 'throws' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2169:1: (kw= 'record' | kw= 'fixed' | kw= 'enum' | kw= 'map' | kw= 'array' | kw= 'union' | kw= 'error' | kw= 'protocol' | kw= 'oneway' | kw= 'import' | kw= 'throws' )
            int alt32=11;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt32=1;
                }
                break;
            case 38:
                {
                alt32=2;
                }
                break;
            case 39:
                {
                alt32=3;
                }
                break;
            case 29:
                {
                alt32=4;
                }
                break;
            case 26:
                {
                alt32=5;
                }
                break;
            case 25:
                {
                alt32=6;
                }
                break;
            case 23:
                {
                alt32=7;
                }
                break;
            case 13:
                {
                alt32=8;
                }
                break;
            case 20:
                {
                alt32=9;
                }
                break;
            case 11:
                {
                alt32=10;
                }
                break;
            case 19:
                {
                alt32=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2170:2: kw= 'record'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleReservedKeyWords4907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReservedKeyWordsAccess().getRecordKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2177:2: kw= 'fixed'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleReservedKeyWords4926); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReservedKeyWordsAccess().getFixedKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2184:2: kw= 'enum'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleReservedKeyWords4945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReservedKeyWordsAccess().getEnumKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2191:2: kw= 'map'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleReservedKeyWords4964); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReservedKeyWordsAccess().getMapKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2198:2: kw= 'array'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleReservedKeyWords4983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReservedKeyWordsAccess().getArrayKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2205:2: kw= 'union'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleReservedKeyWords5002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReservedKeyWordsAccess().getUnionKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2212:2: kw= 'error'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleReservedKeyWords5021); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReservedKeyWordsAccess().getErrorKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2219:2: kw= 'protocol'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleReservedKeyWords5040); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReservedKeyWordsAccess().getProtocolKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2226:2: kw= 'oneway'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleReservedKeyWords5059); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReservedKeyWordsAccess().getOnewayKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2233:2: kw= 'import'
                    {
                    kw=(Token)match(input,11,FOLLOW_11_in_ruleReservedKeyWords5078); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getReservedKeyWordsAccess().getImportKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2240:2: kw= 'throws'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleReservedKeyWords5097); if (state.failed) return current;
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2253:1: entryRuleAN returns [String current=null] : iv_ruleAN= ruleAN EOF ;
    public final String entryRuleAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAN = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2254:2: (iv_ruleAN= ruleAN EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2255:2: iv_ruleAN= ruleAN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getANRule()); 
            }
            pushFollow(FOLLOW_ruleAN_in_entryRuleAN5138);
            iv_ruleAN=ruleAN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAN5149); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2262:1: ruleAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@' this_ID_1= RULE_ID (kw= '-' this_ID_3= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2265:28: ( (kw= '@' this_ID_1= RULE_ID (kw= '-' this_ID_3= RULE_ID )* ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2266:1: (kw= '@' this_ID_1= RULE_ID (kw= '-' this_ID_3= RULE_ID )* )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2266:1: (kw= '@' this_ID_1= RULE_ID (kw= '-' this_ID_3= RULE_ID )* )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2267:2: kw= '@' this_ID_1= RULE_ID (kw= '-' this_ID_3= RULE_ID )*
            {
            kw=(Token)match(input,43,FOLLOW_43_in_ruleAN5187); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getANAccess().getCommercialAtKeyword_0()); 
                  
            }
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAN5202); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_1, grammarAccess.getANAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2279:1: (kw= '-' this_ID_3= RULE_ID )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==44) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2280:2: kw= '-' this_ID_3= RULE_ID
            	    {
            	    kw=(Token)match(input,44,FOLLOW_44_in_ruleAN5221); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getANAccess().getHyphenMinusKeyword_2_0()); 
            	          
            	    }
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAN5236); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_3, grammarAccess.getANAccess().getIDTerminalRuleCall_2_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2300:1: entryRuleNegativeInt returns [String current=null] : iv_ruleNegativeInt= ruleNegativeInt EOF ;
    public final String entryRuleNegativeInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNegativeInt = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2301:2: (iv_ruleNegativeInt= ruleNegativeInt EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2302:2: iv_ruleNegativeInt= ruleNegativeInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegativeIntRule()); 
            }
            pushFollow(FOLLOW_ruleNegativeInt_in_entryRuleNegativeInt5284);
            iv_ruleNegativeInt=ruleNegativeInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegativeInt.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegativeInt5295); if (state.failed) return current;

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
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2309:1: ruleNegativeInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleNegativeInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2312:28: ( (kw= '-' this_INT_1= RULE_INT ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2313:1: (kw= '-' this_INT_1= RULE_INT )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2313:1: (kw= '-' this_INT_1= RULE_INT )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2314:2: kw= '-' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,44,FOLLOW_44_in_ruleNegativeInt5333); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getNegativeIntAccess().getHyphenMinusKeyword_0()); 
                  
            }
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNegativeInt5348); if (state.failed) return current;
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


    // $ANTLR start "entryRuleBoolean"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2334:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2335:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2336:2: iv_ruleBoolean= ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean5394);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean5405); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2343:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2346:28: ( (kw= 'true' | kw= 'false' ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2347:1: (kw= 'true' | kw= 'false' )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2347:1: (kw= 'true' | kw= 'false' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            else if ( (LA34_0==46) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2348:2: kw= 'true'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleBoolean5443); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2355:2: kw= 'false'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleBoolean5462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                          
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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "ruleImportType"
    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2368:1: ruleImportType returns [Enumerator current=null] : ( (enumLiteral_0= 'idl' ) | (enumLiteral_1= 'protocol' ) | (enumLiteral_2= 'schema' ) ) ;
    public final Enumerator ruleImportType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2370:28: ( ( (enumLiteral_0= 'idl' ) | (enumLiteral_1= 'protocol' ) | (enumLiteral_2= 'schema' ) ) )
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2371:1: ( (enumLiteral_0= 'idl' ) | (enumLiteral_1= 'protocol' ) | (enumLiteral_2= 'schema' ) )
            {
            // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2371:1: ( (enumLiteral_0= 'idl' ) | (enumLiteral_1= 'protocol' ) | (enumLiteral_2= 'schema' ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt35=1;
                }
                break;
            case 13:
                {
                alt35=2;
                }
                break;
            case 48:
                {
                alt35=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2371:2: (enumLiteral_0= 'idl' )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2371:2: (enumLiteral_0= 'idl' )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2371:4: enumLiteral_0= 'idl'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_47_in_ruleImportType5516); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getImportTypeAccess().getIDLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getImportTypeAccess().getIDLEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2377:6: (enumLiteral_1= 'protocol' )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2377:6: (enumLiteral_1= 'protocol' )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2377:8: enumLiteral_1= 'protocol'
                    {
                    enumLiteral_1=(Token)match(input,13,FOLLOW_13_in_ruleImportType5533); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getImportTypeAccess().getPROTOCOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getImportTypeAccess().getPROTOCOLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2383:6: (enumLiteral_2= 'schema' )
                    {
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2383:6: (enumLiteral_2= 'schema' )
                    // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:2383:8: enumLiteral_2= 'schema'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_48_in_ruleImportType5550); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalAvroIDL
    public final void synpred1_InternalAvroIDL_fragment() throws RecognitionException {   
        // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1746:4: ( '[' )
        // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1746:6: '['
        {
        match(input,40,FOLLOW_40_in_synpred1_InternalAvroIDL3850); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalAvroIDL

    // $ANTLR start synpred3_InternalAvroIDL
    public final void synpred3_InternalAvroIDL_fragment() throws RecognitionException {   
        // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1885:7: ( '[' )
        // ../avroclipse/src-gen/avroclipse/parser/antlr/internal/InternalAvroIDL.g:1885:9: '['
        {
        match(input,40,FOLLOW_40_in_synpred3_InternalAvroIDL4168); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalAvroIDL

    // Delegated rules

    public final boolean synpred1_InternalAvroIDL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalAvroIDL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalAvroIDL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalAvroIDL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA28_eotS =
        "\14\uffff";
    static final String DFA28_eofS =
        "\1\1\13\uffff";
    static final String DFA28_minS =
        "\1\4\3\uffff\1\0\7\uffff";
    static final String DFA28_maxS =
        "\1\56\3\uffff\1\0\7\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\1\3\3\uffff\1\2\5\uffff\1\1";
    static final String DFA28_specialS =
        "\4\uffff\1\0\7\uffff}>";
    static final String[] DFA28_transitionS = {
            "\2\5\14\uffff\1\1\21\uffff\1\5\3\uffff\1\4\1\1\2\uffff\3\5",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "()* loopback of 1746:2: ( ( ( '[' )=> (lv_value_1_0= ruleArray ) ) | ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_4 = input.LA(1);

                         
                        int index28_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalAvroIDL()) ) {s = 11;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index28_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleAvroIDLFile_in_entryRuleAvroIDLFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvroIDLFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleAvroIDLFile131 = new BitSet(new long[]{0x0000080000002802L});
    public static final BitSet FOLLOW_ruleProtocol_in_ruleAvroIDLFile153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport237 = new BitSet(new long[]{0x0001800000002000L});
    public static final BitSet FOLLOW_ruleImportType_in_ruleImport258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport275 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImport292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_entryRuleProtocol328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocol338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleProtocol384 = new BitSet(new long[]{0x0000080000002000L});
    public static final BitSet FOLLOW_13_in_ruleProtocol397 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_ruleEscapableId_in_ruleProtocol418 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProtocol430 = new BitSet(new long[]{0x00000CFFC1C08040L});
    public static final BitSet FOLLOW_ruleElement_in_ruleProtocol451 = new BitSet(new long[]{0x00000CFFC1C08040L});
    public static final BitSet FOLLOW_15_in_ruleProtocol464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleElement557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRPCMessage_in_ruleElement584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRPCMessage_in_entryRuleRPCMessage619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRPCMessage629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnTypeLink_in_ruleRPCMessage675 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_ruleEscapableId_in_ruleRPCMessage696 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRPCMessage708 = new BitSet(new long[]{0x00000CFFC1C40040L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleRPCMessage730 = new BitSet(new long[]{0x00000CFFC1C60040L});
    public static final BitSet FOLLOW_17_in_ruleRPCMessage743 = new BitSet(new long[]{0x00000CFFC1C00040L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleRPCMessage764 = new BitSet(new long[]{0x00000CFFC1C60040L});
    public static final BitSet FOLLOW_18_in_ruleRPCMessage780 = new BitSet(new long[]{0x0000000000181000L});
    public static final BitSet FOLLOW_19_in_ruleRPCMessage793 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_ruleEscapableId_in_ruleRPCMessage816 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_20_in_ruleRPCMessage836 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRPCMessage862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_ruleArgument954 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_ruleEscapableId_in_ruleArgument975 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleArgument988 = new BitSet(new long[]{0x0000711000000030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArgument1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnTypeLink_in_entryRuleReturnTypeLink1047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnTypeLink1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidTypeLink_in_ruleReturnTypeLink1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_ruleReturnTypeLink1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidTypeLink_in_entryRuleVoidTypeLink1166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoidTypeLink1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleVoidTypeLink1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef1266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleTypeDef1322 = new BitSet(new long[]{0x000008C001800000L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeDef1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_ruleType1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_ruleType1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_ruleType1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleErrorType_in_ruleType1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleErrorType_in_entryRuleErrorType1553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleErrorType1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleErrorType1600 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_ruleEscapableId_in_ruleErrorType1621 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleErrorType1633 = new BitSet(new long[]{0x00000CFFE7C08040L});
    public static final BitSet FOLLOW_ruleField_in_ruleErrorType1654 = new BitSet(new long[]{0x00000CFFE7C08040L});
    public static final BitSet FOLLOW_15_in_ruleErrorType1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_entryRuleRecordType1703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordType1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleRecordType1750 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_ruleEscapableId_in_ruleRecordType1771 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRecordType1783 = new BitSet(new long[]{0x00000CFFE7C08040L});
    public static final BitSet FOLLOW_ruleField_in_ruleRecordType1804 = new BitSet(new long[]{0x00000CFFE7C08040L});
    public static final BitSet FOLLOW_15_in_ruleRecordType1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleField1909 = new BitSet(new long[]{0x00000CFFE7C00040L});
    public static final BitSet FOLLOW_ruleFieldType_in_ruleField1931 = new BitSet(new long[]{0x00000C0000000040L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleField1952 = new BitSet(new long[]{0x00000C0000000040L});
    public static final BitSet FOLLOW_ruleEscapableId_in_ruleField1974 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_21_in_ruleField1987 = new BitSet(new long[]{0x0000711000000030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleField2008 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleField2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_entryRuleFieldType2058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldType2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldType_in_ruleFieldType2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionFieldType_in_ruleFieldType2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayFieldType_in_ruleFieldType2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapFieldType_in_ruleFieldType2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldType_in_entryRuleSimpleFieldType2231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFieldType2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_ruleSimpleFieldType2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionFieldType_in_entryRuleUnionFieldType2321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnionFieldType2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleUnionFieldType2368 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleUnionFieldType2380 = new BitSet(new long[]{0x00000CFFC1C00040L});
    public static final BitSet FOLLOW_ruleTypeLink_in_ruleUnionFieldType2401 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleUnionFieldType2414 = new BitSet(new long[]{0x00000CFFC1C00040L});
    public static final BitSet FOLLOW_ruleTypeLink_in_ruleUnionFieldType2435 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleUnionFieldType2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayFieldType_in_entryRuleArrayFieldType2485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayFieldType2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleArrayFieldType2532 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleArrayFieldType2544 = new BitSet(new long[]{0x00000CFFC1C00040L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleArrayFieldType2565 = new BitSet(new long[]{0x00000CFFC1C00040L});
    public static final BitSet FOLLOW_ruleTypeLink_in_ruleArrayFieldType2587 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleArrayFieldType2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapFieldType_in_entryRuleMapFieldType2635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapFieldType2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleMapFieldType2682 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMapFieldType2694 = new BitSet(new long[]{0x00000CFFC1C00040L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleMapFieldType2715 = new BitSet(new long[]{0x00000CFFC1C00040L});
    public static final BitSet FOLLOW_ruleTypeLink_in_ruleMapFieldType2737 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMapFieldType2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_entryRuleTypeLink2785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeLink2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimativeTypeLink_in_ruleTypeLink2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomTypeLink_in_ruleTypeLink2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimativeTypeLink_in_entryRulePrimativeTypeLink2904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimativeTypeLink2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePrimativeTypeLink2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePrimativeTypeLink2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePrimativeTypeLink3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulePrimativeTypeLink3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePrimativeTypeLink3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePrimativeTypeLink3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulePrimativeTypeLink3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePrimativeTypeLink3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomTypeLink_in_entryRuleCustomTypeLink3212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomTypeLink3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_ruleCustomTypeLink3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_entryRuleFixedType3304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFixedType3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleFixedType3351 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_ruleEscapableId_in_ruleFixedType3372 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFixedType3384 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFixedType3401 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFixedType3418 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFixedType3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType3466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEnumType3513 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_ruleEscapableId_in_ruleEnumType3534 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumType3546 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumType3563 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleEnumType3581 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumType3598 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleEnumType3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation3653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAN_in_ruleAnnotation3709 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleAnnotation3722 = new BitSet(new long[]{0x0000711000040030L});
    public static final BitSet FOLLOW_ruleValues_in_ruleAnnotation3743 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAnnotation3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_entryRuleValues3793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValues3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleValues3866 = new BitSet(new long[]{0x0000711000000032L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValues3894 = new BitSet(new long[]{0x0000711000020032L});
    public static final BitSet FOLLOW_17_in_ruleValues3907 = new BitSet(new long[]{0x0000711000000030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValues3928 = new BitSet(new long[]{0x0000711000020032L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray3969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleArray4024 = new BitSet(new long[]{0x0000731000000030L});
    public static final BitSet FOLLOW_ruleValues_in_ruleArray4046 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleArray4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue4094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleValue4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValue4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleValue4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_ruleValue4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue4303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleBooleanValue4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_entryRuleNull4393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNull4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleNull4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue4493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue4584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegativeInt_in_ruleIntValue4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_entryRuleEscapableId4700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapableId4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEscapableId4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEscapableId4776 = new BitSet(new long[]{0x000000C027982800L});
    public static final BitSet FOLLOW_ruleReservedKeyWords_in_ruleEscapableId4798 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleEscapableId4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedKeyWords_in_entryRuleReservedKeyWords4858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReservedKeyWords4869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleReservedKeyWords4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleReservedKeyWords4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleReservedKeyWords4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleReservedKeyWords4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleReservedKeyWords4983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleReservedKeyWords5002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleReservedKeyWords5021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleReservedKeyWords5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleReservedKeyWords5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleReservedKeyWords5078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleReservedKeyWords5097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAN_in_entryRuleAN5138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAN5149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAN5187 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAN5202 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleAN5221 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAN5236 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleNegativeInt_in_entryRuleNegativeInt5284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegativeInt5295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleNegativeInt5333 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNegativeInt5348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean5394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleBoolean5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleBoolean5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleImportType5516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImportType5533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleImportType5550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred1_InternalAvroIDL3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred3_InternalAvroIDL4168 = new BitSet(new long[]{0x0000000000000002L});

}