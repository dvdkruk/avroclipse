package avroclipse.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import avroclipse.services.AvroIDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAvroIDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'long'", "'string'", "'boolean'", "'float'", "'double'", "'null'", "'bytes'", "'record'", "'fixed'", "'enum'", "'map'", "'array'", "'union'", "'error'", "'protocol'", "'oneway'", "'import'", "'throws'", "'true'", "'false'", "'idl'", "'schema'", "';'", "'{'", "'}'", "'('", "')'", "','", "'='", "'<'", "'>'", "'['", "']'", "'`'", "'@'", "'-'", "'void'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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
    public String getGrammarFileName() { return "../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g"; }


     
     	private AvroIDLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AvroIDLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleAvroIDLFile"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:61:1: entryRuleAvroIDLFile : ruleAvroIDLFile EOF ;
    public final void entryRuleAvroIDLFile() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:62:1: ( ruleAvroIDLFile EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:63:1: ruleAvroIDLFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvroIDLFileRule()); 
            }
            pushFollow(FOLLOW_ruleAvroIDLFile_in_entryRuleAvroIDLFile67);
            ruleAvroIDLFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvroIDLFileRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvroIDLFile74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAvroIDLFile"


    // $ANTLR start "ruleAvroIDLFile"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:70:1: ruleAvroIDLFile : ( ( rule__AvroIDLFile__Group__0 ) ) ;
    public final void ruleAvroIDLFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:74:2: ( ( ( rule__AvroIDLFile__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:75:1: ( ( rule__AvroIDLFile__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:75:1: ( ( rule__AvroIDLFile__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:76:1: ( rule__AvroIDLFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvroIDLFileAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:77:1: ( rule__AvroIDLFile__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:77:2: rule__AvroIDLFile__Group__0
            {
            pushFollow(FOLLOW_rule__AvroIDLFile__Group__0_in_ruleAvroIDLFile100);
            rule__AvroIDLFile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvroIDLFileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAvroIDLFile"


    // $ANTLR start "entryRuleImport"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:90:1: ( ruleImport EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:91:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport127);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport134); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:103:1: ( ( rule__Import__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:104:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:105:1: ( rule__Import__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:105:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport160);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleProtocol"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:117:1: entryRuleProtocol : ruleProtocol EOF ;
    public final void entryRuleProtocol() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:118:1: ( ruleProtocol EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:119:1: ruleProtocol EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolRule()); 
            }
            pushFollow(FOLLOW_ruleProtocol_in_entryRuleProtocol187);
            ruleProtocol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocol194); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:126:1: ruleProtocol : ( ( rule__Protocol__Group__0 ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:130:2: ( ( ( rule__Protocol__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:131:1: ( ( rule__Protocol__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:131:1: ( ( rule__Protocol__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:132:1: ( rule__Protocol__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:133:1: ( rule__Protocol__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:133:2: rule__Protocol__Group__0
            {
            pushFollow(FOLLOW_rule__Protocol__Group__0_in_ruleProtocol220);
            rule__Protocol__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleElement"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:145:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:146:1: ( ruleElement EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:147:1: ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement247);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement254); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:154:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:158:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:159:1: ( ( rule__Element__Alternatives ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:159:1: ( ( rule__Element__Alternatives ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:160:1: ( rule__Element__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getAlternatives()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:161:1: ( rule__Element__Alternatives )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:161:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement280);
            rule__Element__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleRPCMessage"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:173:1: entryRuleRPCMessage : ruleRPCMessage EOF ;
    public final void entryRuleRPCMessage() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:174:1: ( ruleRPCMessage EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:175:1: ruleRPCMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageRule()); 
            }
            pushFollow(FOLLOW_ruleRPCMessage_in_entryRuleRPCMessage307);
            ruleRPCMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRPCMessage314); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRPCMessage"


    // $ANTLR start "ruleRPCMessage"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:182:1: ruleRPCMessage : ( ( rule__RPCMessage__Group__0 ) ) ;
    public final void ruleRPCMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:186:2: ( ( ( rule__RPCMessage__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:187:1: ( ( rule__RPCMessage__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:187:1: ( ( rule__RPCMessage__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:188:1: ( rule__RPCMessage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:189:1: ( rule__RPCMessage__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:189:2: rule__RPCMessage__Group__0
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group__0_in_ruleRPCMessage340);
            rule__RPCMessage__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRPCMessage"


    // $ANTLR start "entryRuleArgument"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:201:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:202:1: ( ruleArgument EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:203:1: ruleArgument EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentRule()); 
            }
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument367);
            ruleArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument374); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:210:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:214:2: ( ( ( rule__Argument__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:215:1: ( ( rule__Argument__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:215:1: ( ( rule__Argument__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:216:1: ( rule__Argument__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:217:1: ( rule__Argument__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:217:2: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_rule__Argument__Group__0_in_ruleArgument400);
            rule__Argument__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleReturnTypeLink"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:229:1: entryRuleReturnTypeLink : ruleReturnTypeLink EOF ;
    public final void entryRuleReturnTypeLink() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:230:1: ( ruleReturnTypeLink EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:231:1: ruleReturnTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleReturnTypeLink_in_entryRuleReturnTypeLink427);
            ruleReturnTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnTypeLink434); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReturnTypeLink"


    // $ANTLR start "ruleReturnTypeLink"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:238:1: ruleReturnTypeLink : ( ( rule__ReturnTypeLink__Alternatives ) ) ;
    public final void ruleReturnTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:242:2: ( ( ( rule__ReturnTypeLink__Alternatives ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:243:1: ( ( rule__ReturnTypeLink__Alternatives ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:243:1: ( ( rule__ReturnTypeLink__Alternatives ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:244:1: ( rule__ReturnTypeLink__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnTypeLinkAccess().getAlternatives()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:245:1: ( rule__ReturnTypeLink__Alternatives )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:245:2: rule__ReturnTypeLink__Alternatives
            {
            pushFollow(FOLLOW_rule__ReturnTypeLink__Alternatives_in_ruleReturnTypeLink460);
            rule__ReturnTypeLink__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnTypeLinkAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturnTypeLink"


    // $ANTLR start "entryRuleVoidTypeLink"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:257:1: entryRuleVoidTypeLink : ruleVoidTypeLink EOF ;
    public final void entryRuleVoidTypeLink() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:258:1: ( ruleVoidTypeLink EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:259:1: ruleVoidTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoidTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleVoidTypeLink_in_entryRuleVoidTypeLink487);
            ruleVoidTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoidTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoidTypeLink494); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVoidTypeLink"


    // $ANTLR start "ruleVoidTypeLink"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:266:1: ruleVoidTypeLink : ( ( rule__VoidTypeLink__TargetAssignment ) ) ;
    public final void ruleVoidTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:270:2: ( ( ( rule__VoidTypeLink__TargetAssignment ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:271:1: ( ( rule__VoidTypeLink__TargetAssignment ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:271:1: ( ( rule__VoidTypeLink__TargetAssignment ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:272:1: ( rule__VoidTypeLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoidTypeLinkAccess().getTargetAssignment()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:273:1: ( rule__VoidTypeLink__TargetAssignment )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:273:2: rule__VoidTypeLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__VoidTypeLink__TargetAssignment_in_ruleVoidTypeLink520);
            rule__VoidTypeLink__TargetAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoidTypeLinkAccess().getTargetAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVoidTypeLink"


    // $ANTLR start "entryRuleTypeDef"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:285:1: entryRuleTypeDef : ruleTypeDef EOF ;
    public final void entryRuleTypeDef() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:286:1: ( ruleTypeDef EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:287:1: ruleTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef547);
            ruleTypeDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef554); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:294:1: ruleTypeDef : ( ( rule__TypeDef__Group__0 ) ) ;
    public final void ruleTypeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:298:2: ( ( ( rule__TypeDef__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:299:1: ( ( rule__TypeDef__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:299:1: ( ( rule__TypeDef__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:300:1: ( rule__TypeDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:301:1: ( rule__TypeDef__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:301:2: rule__TypeDef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDef__Group__0_in_ruleTypeDef580);
            rule__TypeDef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:313:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:314:1: ( ruleType EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:315:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType607);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType614); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:322:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:326:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:327:1: ( ( rule__Type__Alternatives ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:327:1: ( ( rule__Type__Alternatives ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:328:1: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:329:1: ( rule__Type__Alternatives )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:329:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType640);
            rule__Type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleErrorType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:341:1: entryRuleErrorType : ruleErrorType EOF ;
    public final void entryRuleErrorType() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:342:1: ( ruleErrorType EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:343:1: ruleErrorType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorTypeRule()); 
            }
            pushFollow(FOLLOW_ruleErrorType_in_entryRuleErrorType667);
            ruleErrorType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleErrorType674); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleErrorType"


    // $ANTLR start "ruleErrorType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:350:1: ruleErrorType : ( ( rule__ErrorType__Group__0 ) ) ;
    public final void ruleErrorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:354:2: ( ( ( rule__ErrorType__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:355:1: ( ( rule__ErrorType__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:355:1: ( ( rule__ErrorType__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:356:1: ( rule__ErrorType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorTypeAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:357:1: ( rule__ErrorType__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:357:2: rule__ErrorType__Group__0
            {
            pushFollow(FOLLOW_rule__ErrorType__Group__0_in_ruleErrorType700);
            rule__ErrorType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleErrorType"


    // $ANTLR start "entryRuleRecordType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:369:1: entryRuleRecordType : ruleRecordType EOF ;
    public final void entryRuleRecordType() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:370:1: ( ruleRecordType EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:371:1: ruleRecordType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeRule()); 
            }
            pushFollow(FOLLOW_ruleRecordType_in_entryRuleRecordType727);
            ruleRecordType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordType734); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecordType"


    // $ANTLR start "ruleRecordType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:378:1: ruleRecordType : ( ( rule__RecordType__Group__0 ) ) ;
    public final void ruleRecordType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:382:2: ( ( ( rule__RecordType__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:383:1: ( ( rule__RecordType__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:383:1: ( ( rule__RecordType__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:384:1: ( rule__RecordType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:385:1: ( rule__RecordType__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:385:2: rule__RecordType__Group__0
            {
            pushFollow(FOLLOW_rule__RecordType__Group__0_in_ruleRecordType760);
            rule__RecordType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecordType"


    // $ANTLR start "entryRuleField"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:397:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:398:1: ( ruleField EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:399:1: ruleField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField787);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField794); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:406:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:410:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:411:1: ( ( rule__Field__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:411:1: ( ( rule__Field__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:412:1: ( rule__Field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:413:1: ( rule__Field__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:413:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField820);
            rule__Field__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleFieldType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:425:1: entryRuleFieldType : ruleFieldType EOF ;
    public final void entryRuleFieldType() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:426:1: ( ruleFieldType EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:427:1: ruleFieldType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleFieldType_in_entryRuleFieldType847);
            ruleFieldType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldType854); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldType"


    // $ANTLR start "ruleFieldType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:434:1: ruleFieldType : ( ( rule__FieldType__Alternatives ) ) ;
    public final void ruleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:438:2: ( ( ( rule__FieldType__Alternatives ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:439:1: ( ( rule__FieldType__Alternatives ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:439:1: ( ( rule__FieldType__Alternatives ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:440:1: ( rule__FieldType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:441:1: ( rule__FieldType__Alternatives )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:441:2: rule__FieldType__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldType__Alternatives_in_ruleFieldType880);
            rule__FieldType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldType"


    // $ANTLR start "entryRuleSimpleFieldType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:453:1: entryRuleSimpleFieldType : ruleSimpleFieldType EOF ;
    public final void entryRuleSimpleFieldType() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:454:1: ( ruleSimpleFieldType EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:455:1: ruleSimpleFieldType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleFieldType_in_entryRuleSimpleFieldType907);
            ruleSimpleFieldType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleFieldTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleFieldType914); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleFieldType"


    // $ANTLR start "ruleSimpleFieldType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:462:1: ruleSimpleFieldType : ( ( rule__SimpleFieldType__TypeAssignment ) ) ;
    public final void ruleSimpleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:466:2: ( ( ( rule__SimpleFieldType__TypeAssignment ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:467:1: ( ( rule__SimpleFieldType__TypeAssignment ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:467:1: ( ( rule__SimpleFieldType__TypeAssignment ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:468:1: ( rule__SimpleFieldType__TypeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleFieldTypeAccess().getTypeAssignment()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:469:1: ( rule__SimpleFieldType__TypeAssignment )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:469:2: rule__SimpleFieldType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__SimpleFieldType__TypeAssignment_in_ruleSimpleFieldType940);
            rule__SimpleFieldType__TypeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleFieldTypeAccess().getTypeAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleFieldType"


    // $ANTLR start "entryRuleUnionFieldType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:481:1: entryRuleUnionFieldType : ruleUnionFieldType EOF ;
    public final void entryRuleUnionFieldType() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:482:1: ( ruleUnionFieldType EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:483:1: ruleUnionFieldType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleUnionFieldType_in_entryRuleUnionFieldType967);
            ruleUnionFieldType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionFieldTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnionFieldType974); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnionFieldType"


    // $ANTLR start "ruleUnionFieldType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:490:1: ruleUnionFieldType : ( ( rule__UnionFieldType__Group__0 ) ) ;
    public final void ruleUnionFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:494:2: ( ( ( rule__UnionFieldType__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:495:1: ( ( rule__UnionFieldType__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:495:1: ( ( rule__UnionFieldType__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:496:1: ( rule__UnionFieldType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:497:1: ( rule__UnionFieldType__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:497:2: rule__UnionFieldType__Group__0
            {
            pushFollow(FOLLOW_rule__UnionFieldType__Group__0_in_ruleUnionFieldType1000);
            rule__UnionFieldType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionFieldTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnionFieldType"


    // $ANTLR start "entryRuleArrayFieldType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:509:1: entryRuleArrayFieldType : ruleArrayFieldType EOF ;
    public final void entryRuleArrayFieldType() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:510:1: ( ruleArrayFieldType EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:511:1: ruleArrayFieldType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleArrayFieldType_in_entryRuleArrayFieldType1027);
            ruleArrayFieldType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayFieldTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayFieldType1034); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayFieldType"


    // $ANTLR start "ruleArrayFieldType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:518:1: ruleArrayFieldType : ( ( rule__ArrayFieldType__Group__0 ) ) ;
    public final void ruleArrayFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:522:2: ( ( ( rule__ArrayFieldType__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:523:1: ( ( rule__ArrayFieldType__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:523:1: ( ( rule__ArrayFieldType__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:524:1: ( rule__ArrayFieldType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayFieldTypeAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:525:1: ( rule__ArrayFieldType__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:525:2: rule__ArrayFieldType__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayFieldType__Group__0_in_ruleArrayFieldType1060);
            rule__ArrayFieldType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayFieldTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayFieldType"


    // $ANTLR start "entryRuleMapFieldType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:537:1: entryRuleMapFieldType : ruleMapFieldType EOF ;
    public final void entryRuleMapFieldType() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:538:1: ( ruleMapFieldType EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:539:1: ruleMapFieldType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleMapFieldType_in_entryRuleMapFieldType1087);
            ruleMapFieldType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapFieldTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapFieldType1094); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapFieldType"


    // $ANTLR start "ruleMapFieldType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:546:1: ruleMapFieldType : ( ( rule__MapFieldType__Group__0 ) ) ;
    public final void ruleMapFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:550:2: ( ( ( rule__MapFieldType__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:551:1: ( ( rule__MapFieldType__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:551:1: ( ( rule__MapFieldType__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:552:1: ( rule__MapFieldType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapFieldTypeAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:553:1: ( rule__MapFieldType__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:553:2: rule__MapFieldType__Group__0
            {
            pushFollow(FOLLOW_rule__MapFieldType__Group__0_in_ruleMapFieldType1120);
            rule__MapFieldType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapFieldTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapFieldType"


    // $ANTLR start "entryRuleTypeLink"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:565:1: entryRuleTypeLink : ruleTypeLink EOF ;
    public final void entryRuleTypeLink() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:566:1: ( ruleTypeLink EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:567:1: ruleTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_entryRuleTypeLink1147);
            ruleTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeLink1154); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeLink"


    // $ANTLR start "ruleTypeLink"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:574:1: ruleTypeLink : ( ( rule__TypeLink__Alternatives ) ) ;
    public final void ruleTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:578:2: ( ( ( rule__TypeLink__Alternatives ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:579:1: ( ( rule__TypeLink__Alternatives ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:579:1: ( ( rule__TypeLink__Alternatives ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:580:1: ( rule__TypeLink__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLinkAccess().getAlternatives()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:581:1: ( rule__TypeLink__Alternatives )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:581:2: rule__TypeLink__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeLink__Alternatives_in_ruleTypeLink1180);
            rule__TypeLink__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLinkAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeLink"


    // $ANTLR start "entryRulePrimativeTypeLink"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:593:1: entryRulePrimativeTypeLink : rulePrimativeTypeLink EOF ;
    public final void entryRulePrimativeTypeLink() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:594:1: ( rulePrimativeTypeLink EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:595:1: rulePrimativeTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimativeTypeLinkRule()); 
            }
            pushFollow(FOLLOW_rulePrimativeTypeLink_in_entryRulePrimativeTypeLink1207);
            rulePrimativeTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimativeTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimativeTypeLink1214); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimativeTypeLink"


    // $ANTLR start "rulePrimativeTypeLink"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:602:1: rulePrimativeTypeLink : ( ( rule__PrimativeTypeLink__TargetAssignment ) ) ;
    public final void rulePrimativeTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:606:2: ( ( ( rule__PrimativeTypeLink__TargetAssignment ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:607:1: ( ( rule__PrimativeTypeLink__TargetAssignment ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:607:1: ( ( rule__PrimativeTypeLink__TargetAssignment ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:608:1: ( rule__PrimativeTypeLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimativeTypeLinkAccess().getTargetAssignment()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:609:1: ( rule__PrimativeTypeLink__TargetAssignment )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:609:2: rule__PrimativeTypeLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__PrimativeTypeLink__TargetAssignment_in_rulePrimativeTypeLink1240);
            rule__PrimativeTypeLink__TargetAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimativeTypeLinkAccess().getTargetAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimativeTypeLink"


    // $ANTLR start "entryRuleCustomTypeLink"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:621:1: entryRuleCustomTypeLink : ruleCustomTypeLink EOF ;
    public final void entryRuleCustomTypeLink() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:622:1: ( ruleCustomTypeLink EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:623:1: ruleCustomTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleCustomTypeLink_in_entryRuleCustomTypeLink1267);
            ruleCustomTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomTypeLink1274); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomTypeLink"


    // $ANTLR start "ruleCustomTypeLink"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:630:1: ruleCustomTypeLink : ( ( rule__CustomTypeLink__TargetAssignment ) ) ;
    public final void ruleCustomTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:634:2: ( ( ( rule__CustomTypeLink__TargetAssignment ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:635:1: ( ( rule__CustomTypeLink__TargetAssignment ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:635:1: ( ( rule__CustomTypeLink__TargetAssignment ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:636:1: ( rule__CustomTypeLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeLinkAccess().getTargetAssignment()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:637:1: ( rule__CustomTypeLink__TargetAssignment )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:637:2: rule__CustomTypeLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__CustomTypeLink__TargetAssignment_in_ruleCustomTypeLink1300);
            rule__CustomTypeLink__TargetAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomTypeLinkAccess().getTargetAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomTypeLink"


    // $ANTLR start "entryRuleFixedType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:649:1: entryRuleFixedType : ruleFixedType EOF ;
    public final void entryRuleFixedType() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:650:1: ( ruleFixedType EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:651:1: ruleFixedType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixedTypeRule()); 
            }
            pushFollow(FOLLOW_ruleFixedType_in_entryRuleFixedType1327);
            ruleFixedType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixedTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFixedType1334); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFixedType"


    // $ANTLR start "ruleFixedType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:658:1: ruleFixedType : ( ( rule__FixedType__Group__0 ) ) ;
    public final void ruleFixedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:662:2: ( ( ( rule__FixedType__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:663:1: ( ( rule__FixedType__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:663:1: ( ( rule__FixedType__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:664:1: ( rule__FixedType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixedTypeAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:665:1: ( rule__FixedType__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:665:2: rule__FixedType__Group__0
            {
            pushFollow(FOLLOW_rule__FixedType__Group__0_in_ruleFixedType1360);
            rule__FixedType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixedTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFixedType"


    // $ANTLR start "entryRuleEnumType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:677:1: entryRuleEnumType : ruleEnumType EOF ;
    public final void entryRuleEnumType() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:678:1: ( ruleEnumType EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:679:1: ruleEnumType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeRule()); 
            }
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType1387);
            ruleEnumType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType1394); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumType"


    // $ANTLR start "ruleEnumType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:686:1: ruleEnumType : ( ( rule__EnumType__Group__0 ) ) ;
    public final void ruleEnumType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:690:2: ( ( ( rule__EnumType__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:691:1: ( ( rule__EnumType__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:691:1: ( ( rule__EnumType__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:692:1: ( rule__EnumType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:693:1: ( rule__EnumType__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:693:2: rule__EnumType__Group__0
            {
            pushFollow(FOLLOW_rule__EnumType__Group__0_in_ruleEnumType1420);
            rule__EnumType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumType"


    // $ANTLR start "entryRuleAnnotation"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:705:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:706:1: ( ruleAnnotation EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:707:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation1447);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation1454); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:714:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:718:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:719:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:719:1: ( ( rule__Annotation__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:720:1: ( rule__Annotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:721:1: ( rule__Annotation__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:721:2: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation1480);
            rule__Annotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleValues"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:733:1: entryRuleValues : ruleValues EOF ;
    public final void entryRuleValues() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:734:1: ( ruleValues EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:735:1: ruleValues EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesRule()); 
            }
            pushFollow(FOLLOW_ruleValues_in_entryRuleValues1507);
            ruleValues();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValues1514); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValues"


    // $ANTLR start "ruleValues"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:742:1: ruleValues : ( ( rule__Values__Group__0 ) ) ;
    public final void ruleValues() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:746:2: ( ( ( rule__Values__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:747:1: ( ( rule__Values__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:747:1: ( ( rule__Values__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:748:1: ( rule__Values__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:749:1: ( rule__Values__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:749:2: rule__Values__Group__0
            {
            pushFollow(FOLLOW_rule__Values__Group__0_in_ruleValues1540);
            rule__Values__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValues"


    // $ANTLR start "entryRuleArray"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:761:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:762:1: ( ruleArray EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:763:1: ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray1567);
            ruleArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray1574); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:770:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:774:2: ( ( ( rule__Array__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:775:1: ( ( rule__Array__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:775:1: ( ( rule__Array__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:776:1: ( rule__Array__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:777:1: ( rule__Array__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:777:2: rule__Array__Group__0
            {
            pushFollow(FOLLOW_rule__Array__Group__0_in_ruleArray1600);
            rule__Array__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleValue"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:789:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:790:1: ( ruleValue EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:791:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1627);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1634); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:798:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:802:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:803:1: ( ( rule__Value__Alternatives ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:803:1: ( ( rule__Value__Alternatives ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:804:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:805:1: ( rule__Value__Alternatives )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:805:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue1660);
            rule__Value__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleBooleanValue"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:817:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:818:1: ( ruleBooleanValue EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:819:1: ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1687);
            ruleBooleanValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue1694); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:826:1: ruleBooleanValue : ( ( rule__BooleanValue__ValAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:830:2: ( ( ( rule__BooleanValue__ValAssignment ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:831:1: ( ( rule__BooleanValue__ValAssignment ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:831:1: ( ( rule__BooleanValue__ValAssignment ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:832:1: ( rule__BooleanValue__ValAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValAssignment()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:833:1: ( rule__BooleanValue__ValAssignment )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:833:2: rule__BooleanValue__ValAssignment
            {
            pushFollow(FOLLOW_rule__BooleanValue__ValAssignment_in_ruleBooleanValue1720);
            rule__BooleanValue__ValAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getValAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleNull"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:845:1: entryRuleNull : ruleNull EOF ;
    public final void entryRuleNull() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:846:1: ( ruleNull EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:847:1: ruleNull EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullRule()); 
            }
            pushFollow(FOLLOW_ruleNull_in_entryRuleNull1747);
            ruleNull();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNull1754); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNull"


    // $ANTLR start "ruleNull"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:854:1: ruleNull : ( ( rule__Null__ValAssignment ) ) ;
    public final void ruleNull() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:858:2: ( ( ( rule__Null__ValAssignment ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:859:1: ( ( rule__Null__ValAssignment ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:859:1: ( ( rule__Null__ValAssignment ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:860:1: ( rule__Null__ValAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAccess().getValAssignment()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:861:1: ( rule__Null__ValAssignment )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:861:2: rule__Null__ValAssignment
            {
            pushFollow(FOLLOW_rule__Null__ValAssignment_in_ruleNull1780);
            rule__Null__ValAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullAccess().getValAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNull"


    // $ANTLR start "entryRuleStringValue"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:873:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:874:1: ( ruleStringValue EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:875:1: ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1807);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1814); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:882:1: ruleStringValue : ( ( rule__StringValue__ValAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:886:2: ( ( ( rule__StringValue__ValAssignment ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:887:1: ( ( rule__StringValue__ValAssignment ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:887:1: ( ( rule__StringValue__ValAssignment ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:888:1: ( rule__StringValue__ValAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValAssignment()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:889:1: ( rule__StringValue__ValAssignment )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:889:2: rule__StringValue__ValAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValAssignment_in_ruleStringValue1840);
            rule__StringValue__ValAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getValAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleIntValue"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:901:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:902:1: ( ruleIntValue EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:903:1: ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue1867);
            ruleIntValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue1874); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:910:1: ruleIntValue : ( ( rule__IntValue__ValAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:914:2: ( ( ( rule__IntValue__ValAssignment ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:915:1: ( ( rule__IntValue__ValAssignment ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:915:1: ( ( rule__IntValue__ValAssignment ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:916:1: ( rule__IntValue__ValAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValAssignment()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:917:1: ( rule__IntValue__ValAssignment )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:917:2: rule__IntValue__ValAssignment
            {
            pushFollow(FOLLOW_rule__IntValue__ValAssignment_in_ruleIntValue1900);
            rule__IntValue__ValAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueAccess().getValAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleEscapableId"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:929:1: entryRuleEscapableId : ruleEscapableId EOF ;
    public final void entryRuleEscapableId() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:930:1: ( ruleEscapableId EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:931:1: ruleEscapableId EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEscapableIdRule()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_entryRuleEscapableId1927);
            ruleEscapableId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEscapableIdRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapableId1934); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEscapableId"


    // $ANTLR start "ruleEscapableId"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:938:1: ruleEscapableId : ( ( rule__EscapableId__Alternatives ) ) ;
    public final void ruleEscapableId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:942:2: ( ( ( rule__EscapableId__Alternatives ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:943:1: ( ( rule__EscapableId__Alternatives ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:943:1: ( ( rule__EscapableId__Alternatives ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:944:1: ( rule__EscapableId__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEscapableIdAccess().getAlternatives()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:945:1: ( rule__EscapableId__Alternatives )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:945:2: rule__EscapableId__Alternatives
            {
            pushFollow(FOLLOW_rule__EscapableId__Alternatives_in_ruleEscapableId1960);
            rule__EscapableId__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEscapableIdAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEscapableId"


    // $ANTLR start "entryRuleReservedKeyWords"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:957:1: entryRuleReservedKeyWords : ruleReservedKeyWords EOF ;
    public final void entryRuleReservedKeyWords() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:958:1: ( ruleReservedKeyWords EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:959:1: ruleReservedKeyWords EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReservedKeyWordsRule()); 
            }
            pushFollow(FOLLOW_ruleReservedKeyWords_in_entryRuleReservedKeyWords1987);
            ruleReservedKeyWords();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReservedKeyWordsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReservedKeyWords1994); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReservedKeyWords"


    // $ANTLR start "ruleReservedKeyWords"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:966:1: ruleReservedKeyWords : ( ( rule__ReservedKeyWords__Alternatives ) ) ;
    public final void ruleReservedKeyWords() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:970:2: ( ( ( rule__ReservedKeyWords__Alternatives ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:971:1: ( ( rule__ReservedKeyWords__Alternatives ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:971:1: ( ( rule__ReservedKeyWords__Alternatives ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:972:1: ( rule__ReservedKeyWords__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReservedKeyWordsAccess().getAlternatives()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:973:1: ( rule__ReservedKeyWords__Alternatives )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:973:2: rule__ReservedKeyWords__Alternatives
            {
            pushFollow(FOLLOW_rule__ReservedKeyWords__Alternatives_in_ruleReservedKeyWords2020);
            rule__ReservedKeyWords__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReservedKeyWordsAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReservedKeyWords"


    // $ANTLR start "entryRuleAN"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:985:1: entryRuleAN : ruleAN EOF ;
    public final void entryRuleAN() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:986:1: ( ruleAN EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:987:1: ruleAN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANRule()); 
            }
            pushFollow(FOLLOW_ruleAN_in_entryRuleAN2047);
            ruleAN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getANRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAN2054); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAN"


    // $ANTLR start "ruleAN"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:994:1: ruleAN : ( ( rule__AN__Group__0 ) ) ;
    public final void ruleAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:998:2: ( ( ( rule__AN__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:999:1: ( ( rule__AN__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:999:1: ( ( rule__AN__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1000:1: ( rule__AN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1001:1: ( rule__AN__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1001:2: rule__AN__Group__0
            {
            pushFollow(FOLLOW_rule__AN__Group__0_in_ruleAN2080);
            rule__AN__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getANAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAN"


    // $ANTLR start "entryRuleNegativeInt"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1013:1: entryRuleNegativeInt : ruleNegativeInt EOF ;
    public final void entryRuleNegativeInt() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1014:1: ( ruleNegativeInt EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1015:1: ruleNegativeInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeIntRule()); 
            }
            pushFollow(FOLLOW_ruleNegativeInt_in_entryRuleNegativeInt2107);
            ruleNegativeInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeIntRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegativeInt2114); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegativeInt"


    // $ANTLR start "ruleNegativeInt"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1022:1: ruleNegativeInt : ( ( rule__NegativeInt__Group__0 ) ) ;
    public final void ruleNegativeInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1026:2: ( ( ( rule__NegativeInt__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1027:1: ( ( rule__NegativeInt__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1027:1: ( ( rule__NegativeInt__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1028:1: ( rule__NegativeInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeIntAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1029:1: ( rule__NegativeInt__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1029:2: rule__NegativeInt__Group__0
            {
            pushFollow(FOLLOW_rule__NegativeInt__Group__0_in_ruleNegativeInt2140);
            rule__NegativeInt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeIntAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegativeInt"


    // $ANTLR start "entryRuleBoolean"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1041:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1042:1: ( ruleBoolean EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1043:1: ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean2167);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean2174); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1050:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1054:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1055:1: ( ( rule__Boolean__Alternatives ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1055:1: ( ( rule__Boolean__Alternatives ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1056:1: ( rule__Boolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAccess().getAlternatives()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1057:1: ( rule__Boolean__Alternatives )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1057:2: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean2200);
            rule__Boolean__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "ruleImportType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1070:1: ruleImportType : ( ( rule__ImportType__Alternatives ) ) ;
    public final void ruleImportType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1074:1: ( ( ( rule__ImportType__Alternatives ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1075:1: ( ( rule__ImportType__Alternatives ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1075:1: ( ( rule__ImportType__Alternatives ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1076:1: ( rule__ImportType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportTypeAccess().getAlternatives()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1077:1: ( rule__ImportType__Alternatives )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1077:2: rule__ImportType__Alternatives
            {
            pushFollow(FOLLOW_rule__ImportType__Alternatives_in_ruleImportType2237);
            rule__ImportType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportType"


    // $ANTLR start "rule__Element__Alternatives"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1088:1: rule__Element__Alternatives : ( ( ruleTypeDef ) | ( ruleRPCMessage ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1092:1: ( ( ruleTypeDef ) | ( ruleRPCMessage ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=19 && LA1_0<=21)||LA1_0==25||LA1_0==46) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID||(LA1_0>=11 && LA1_0<=18)||LA1_0==45||LA1_0==48) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1093:1: ( ruleTypeDef )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1093:1: ( ruleTypeDef )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1094:1: ruleTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getTypeDefParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleTypeDef_in_rule__Element__Alternatives2272);
                    ruleTypeDef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getTypeDefParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1099:6: ( ruleRPCMessage )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1099:6: ( ruleRPCMessage )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1100:1: ruleRPCMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getRPCMessageParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleRPCMessage_in_rule__Element__Alternatives2289);
                    ruleRPCMessage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getRPCMessageParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__ReturnTypeLink__Alternatives"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1110:1: rule__ReturnTypeLink__Alternatives : ( ( ruleVoidTypeLink ) | ( ruleTypeLink ) );
    public final void rule__ReturnTypeLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1114:1: ( ( ruleVoidTypeLink ) | ( ruleTypeLink ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==48) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID||(LA2_0>=11 && LA2_0<=18)||LA2_0==45) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1115:1: ( ruleVoidTypeLink )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1115:1: ( ruleVoidTypeLink )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1116:1: ruleVoidTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReturnTypeLinkAccess().getVoidTypeLinkParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleVoidTypeLink_in_rule__ReturnTypeLink__Alternatives2321);
                    ruleVoidTypeLink();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReturnTypeLinkAccess().getVoidTypeLinkParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1121:6: ( ruleTypeLink )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1121:6: ( ruleTypeLink )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1122:1: ruleTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReturnTypeLinkAccess().getTypeLinkParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleTypeLink_in_rule__ReturnTypeLink__Alternatives2338);
                    ruleTypeLink();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReturnTypeLinkAccess().getTypeLinkParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnTypeLink__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1132:1: rule__Type__Alternatives : ( ( ruleEnumType ) | ( ruleFixedType ) | ( ruleRecordType ) | ( ruleErrorType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1136:1: ( ( ruleEnumType ) | ( ruleFixedType ) | ( ruleRecordType ) | ( ruleErrorType ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case 25:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1137:1: ( ruleEnumType )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1137:1: ( ruleEnumType )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1138:1: ruleEnumType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEnumType_in_rule__Type__Alternatives2370);
                    ruleEnumType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1143:6: ( ruleFixedType )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1143:6: ( ruleFixedType )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1144:1: ruleFixedType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getFixedTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleFixedType_in_rule__Type__Alternatives2387);
                    ruleFixedType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getFixedTypeParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1149:6: ( ruleRecordType )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1149:6: ( ruleRecordType )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1150:1: ruleRecordType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getRecordTypeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleRecordType_in_rule__Type__Alternatives2404);
                    ruleRecordType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getRecordTypeParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1155:6: ( ruleErrorType )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1155:6: ( ruleErrorType )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1156:1: ruleErrorType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getErrorTypeParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleErrorType_in_rule__Type__Alternatives2421);
                    ruleErrorType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getErrorTypeParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__FieldType__Alternatives"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1166:1: rule__FieldType__Alternatives : ( ( ruleSimpleFieldType ) | ( ruleUnionFieldType ) | ( ruleArrayFieldType ) | ( ruleMapFieldType ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1170:1: ( ( ruleSimpleFieldType ) | ( ruleUnionFieldType ) | ( ruleArrayFieldType ) | ( ruleMapFieldType ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 45:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            case 22:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1171:1: ( ruleSimpleFieldType )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1171:1: ( ruleSimpleFieldType )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1172:1: ruleSimpleFieldType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldTypeAccess().getSimpleFieldTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSimpleFieldType_in_rule__FieldType__Alternatives2453);
                    ruleSimpleFieldType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldTypeAccess().getSimpleFieldTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1177:6: ( ruleUnionFieldType )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1177:6: ( ruleUnionFieldType )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1178:1: ruleUnionFieldType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldTypeAccess().getUnionFieldTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleUnionFieldType_in_rule__FieldType__Alternatives2470);
                    ruleUnionFieldType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldTypeAccess().getUnionFieldTypeParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1183:6: ( ruleArrayFieldType )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1183:6: ( ruleArrayFieldType )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1184:1: ruleArrayFieldType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldTypeAccess().getArrayFieldTypeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleArrayFieldType_in_rule__FieldType__Alternatives2487);
                    ruleArrayFieldType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldTypeAccess().getArrayFieldTypeParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1189:6: ( ruleMapFieldType )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1189:6: ( ruleMapFieldType )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1190:1: ruleMapFieldType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldTypeAccess().getMapFieldTypeParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleMapFieldType_in_rule__FieldType__Alternatives2504);
                    ruleMapFieldType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldTypeAccess().getMapFieldTypeParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldType__Alternatives"


    // $ANTLR start "rule__TypeLink__Alternatives"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1200:1: rule__TypeLink__Alternatives : ( ( rulePrimativeTypeLink ) | ( ruleCustomTypeLink ) );
    public final void rule__TypeLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1204:1: ( ( rulePrimativeTypeLink ) | ( ruleCustomTypeLink ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=11 && LA5_0<=18)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID||LA5_0==45) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1205:1: ( rulePrimativeTypeLink )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1205:1: ( rulePrimativeTypeLink )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1206:1: rulePrimativeTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLinkAccess().getPrimativeTypeLinkParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePrimativeTypeLink_in_rule__TypeLink__Alternatives2536);
                    rulePrimativeTypeLink();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeLinkAccess().getPrimativeTypeLinkParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1211:6: ( ruleCustomTypeLink )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1211:6: ( ruleCustomTypeLink )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1212:1: ruleCustomTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLinkAccess().getCustomTypeLinkParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCustomTypeLink_in_rule__TypeLink__Alternatives2553);
                    ruleCustomTypeLink();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeLinkAccess().getCustomTypeLinkParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLink__Alternatives"


    // $ANTLR start "rule__PrimativeTypeLink__TargetAlternatives_0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1222:1: rule__PrimativeTypeLink__TargetAlternatives_0 : ( ( 'int' ) | ( 'long' ) | ( 'string' ) | ( 'boolean' ) | ( 'float' ) | ( 'double' ) | ( 'null' ) | ( 'bytes' ) );
    public final void rule__PrimativeTypeLink__TargetAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1226:1: ( ( 'int' ) | ( 'long' ) | ( 'string' ) | ( 'boolean' ) | ( 'float' ) | ( 'double' ) | ( 'null' ) | ( 'bytes' ) )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            case 15:
                {
                alt6=5;
                }
                break;
            case 16:
                {
                alt6=6;
                }
                break;
            case 17:
                {
                alt6=7;
                }
                break;
            case 18:
                {
                alt6=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1227:1: ( 'int' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1227:1: ( 'int' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1228:1: 'int'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimativeTypeLinkAccess().getTargetIntKeyword_0_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__PrimativeTypeLink__TargetAlternatives_02586); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimativeTypeLinkAccess().getTargetIntKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1235:6: ( 'long' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1235:6: ( 'long' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1236:1: 'long'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimativeTypeLinkAccess().getTargetLongKeyword_0_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__PrimativeTypeLink__TargetAlternatives_02606); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimativeTypeLinkAccess().getTargetLongKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1243:6: ( 'string' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1243:6: ( 'string' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1244:1: 'string'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimativeTypeLinkAccess().getTargetStringKeyword_0_2()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__PrimativeTypeLink__TargetAlternatives_02626); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimativeTypeLinkAccess().getTargetStringKeyword_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1251:6: ( 'boolean' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1251:6: ( 'boolean' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1252:1: 'boolean'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimativeTypeLinkAccess().getTargetBooleanKeyword_0_3()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__PrimativeTypeLink__TargetAlternatives_02646); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimativeTypeLinkAccess().getTargetBooleanKeyword_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1259:6: ( 'float' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1259:6: ( 'float' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1260:1: 'float'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimativeTypeLinkAccess().getTargetFloatKeyword_0_4()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__PrimativeTypeLink__TargetAlternatives_02666); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimativeTypeLinkAccess().getTargetFloatKeyword_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1267:6: ( 'double' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1267:6: ( 'double' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1268:1: 'double'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimativeTypeLinkAccess().getTargetDoubleKeyword_0_5()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__PrimativeTypeLink__TargetAlternatives_02686); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimativeTypeLinkAccess().getTargetDoubleKeyword_0_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1275:6: ( 'null' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1275:6: ( 'null' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1276:1: 'null'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimativeTypeLinkAccess().getTargetNullKeyword_0_6()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__PrimativeTypeLink__TargetAlternatives_02706); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimativeTypeLinkAccess().getTargetNullKeyword_0_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1283:6: ( 'bytes' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1283:6: ( 'bytes' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1284:1: 'bytes'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimativeTypeLinkAccess().getTargetBytesKeyword_0_7()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__PrimativeTypeLink__TargetAlternatives_02726); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimativeTypeLinkAccess().getTargetBytesKeyword_0_7()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimativeTypeLink__TargetAlternatives_0"


    // $ANTLR start "rule__Values__Alternatives_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1296:1: rule__Values__Alternatives_1 : ( ( ( rule__Values__ValueAssignment_1_0 ) ) | ( ( rule__Values__Group_1_1__0 ) ) );
    public final void rule__Values__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1300:1: ( ( ( rule__Values__ValueAssignment_1_0 ) ) | ( ( rule__Values__Group_1_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==43) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred17_InternalAvroIDL()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_INT||LA7_0==RULE_STRING||LA7_0==17||(LA7_0>=30 && LA7_0<=31)||LA7_0==47) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1301:1: ( ( rule__Values__ValueAssignment_1_0 ) )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1301:1: ( ( rule__Values__ValueAssignment_1_0 ) )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1302:1: ( rule__Values__ValueAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuesAccess().getValueAssignment_1_0()); 
                    }
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1303:1: ( rule__Values__ValueAssignment_1_0 )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1303:2: rule__Values__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Values__ValueAssignment_1_0_in_rule__Values__Alternatives_12760);
                    rule__Values__ValueAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValuesAccess().getValueAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1307:6: ( ( rule__Values__Group_1_1__0 ) )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1307:6: ( ( rule__Values__Group_1_1__0 ) )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1308:1: ( rule__Values__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuesAccess().getGroup_1_1()); 
                    }
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1309:1: ( rule__Values__Group_1_1__0 )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1309:2: rule__Values__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Values__Group_1_1__0_in_rule__Values__Alternatives_12778);
                    rule__Values__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValuesAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Alternatives_1"


    // $ANTLR start "rule__Value__Alternatives"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1318:1: rule__Value__Alternatives : ( ( ruleStringValue ) | ( ( ruleArray ) ) | ( ruleIntValue ) | ( ruleBooleanValue ) | ( ruleNull ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1322:1: ( ( ruleStringValue ) | ( ( ruleArray ) ) | ( ruleIntValue ) | ( ruleBooleanValue ) | ( ruleNull ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt8=1;
                }
                break;
            case 43:
                {
                alt8=2;
                }
                break;
            case RULE_INT:
            case 47:
                {
                alt8=3;
                }
                break;
            case 30:
            case 31:
                {
                alt8=4;
                }
                break;
            case 17:
                {
                alt8=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1323:1: ( ruleStringValue )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1323:1: ( ruleStringValue )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1324:1: ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_rule__Value__Alternatives2811);
                    ruleStringValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1329:6: ( ( ruleArray ) )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1329:6: ( ( ruleArray ) )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1330:1: ( ruleArray )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getArrayParserRuleCall_1()); 
                    }
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1331:1: ( ruleArray )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1331:3: ruleArray
                    {
                    pushFollow(FOLLOW_ruleArray_in_rule__Value__Alternatives2829);
                    ruleArray();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getArrayParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1335:6: ( ruleIntValue )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1335:6: ( ruleIntValue )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1336:1: ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getIntValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_rule__Value__Alternatives2847);
                    ruleIntValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getIntValueParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1341:6: ( ruleBooleanValue )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1341:6: ( ruleBooleanValue )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1342:1: ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__Value__Alternatives2864);
                    ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1347:6: ( ruleNull )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1347:6: ( ruleNull )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1348:1: ruleNull
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getNullParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleNull_in_rule__Value__Alternatives2881);
                    ruleNull();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getNullParserRuleCall_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__IntValue__ValAlternatives_0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1358:1: rule__IntValue__ValAlternatives_0 : ( ( RULE_INT ) | ( ruleNegativeInt ) );
    public final void rule__IntValue__ValAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1362:1: ( ( RULE_INT ) | ( ruleNegativeInt ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==47) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1363:1: ( RULE_INT )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1363:1: ( RULE_INT )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1364:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIntValueAccess().getValINTTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntValue__ValAlternatives_02913); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIntValueAccess().getValINTTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1369:6: ( ruleNegativeInt )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1369:6: ( ruleNegativeInt )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1370:1: ruleNegativeInt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIntValueAccess().getValNegativeIntParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleNegativeInt_in_rule__IntValue__ValAlternatives_02930);
                    ruleNegativeInt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIntValueAccess().getValNegativeIntParserRuleCall_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__ValAlternatives_0"


    // $ANTLR start "rule__EscapableId__Alternatives"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1380:1: rule__EscapableId__Alternatives : ( ( RULE_ID ) | ( ( rule__EscapableId__Group_1__0 ) ) );
    public final void rule__EscapableId__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1384:1: ( ( RULE_ID ) | ( ( rule__EscapableId__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==45) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1385:1: ( RULE_ID )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1385:1: ( RULE_ID )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1386:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEscapableIdAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EscapableId__Alternatives2962); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEscapableIdAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1391:6: ( ( rule__EscapableId__Group_1__0 ) )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1391:6: ( ( rule__EscapableId__Group_1__0 ) )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1392:1: ( rule__EscapableId__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEscapableIdAccess().getGroup_1()); 
                    }
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1393:1: ( rule__EscapableId__Group_1__0 )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1393:2: rule__EscapableId__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EscapableId__Group_1__0_in_rule__EscapableId__Alternatives2979);
                    rule__EscapableId__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEscapableIdAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapableId__Alternatives"


    // $ANTLR start "rule__ReservedKeyWords__Alternatives"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1402:1: rule__ReservedKeyWords__Alternatives : ( ( 'record' ) | ( 'fixed' ) | ( 'enum' ) | ( 'map' ) | ( 'array' ) | ( 'union' ) | ( 'error' ) | ( 'protocol' ) | ( 'oneway' ) | ( 'import' ) | ( 'throws' ) );
    public final void rule__ReservedKeyWords__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1406:1: ( ( 'record' ) | ( 'fixed' ) | ( 'enum' ) | ( 'map' ) | ( 'array' ) | ( 'union' ) | ( 'error' ) | ( 'protocol' ) | ( 'oneway' ) | ( 'import' ) | ( 'throws' ) )
            int alt11=11;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt11=1;
                }
                break;
            case 20:
                {
                alt11=2;
                }
                break;
            case 21:
                {
                alt11=3;
                }
                break;
            case 22:
                {
                alt11=4;
                }
                break;
            case 23:
                {
                alt11=5;
                }
                break;
            case 24:
                {
                alt11=6;
                }
                break;
            case 25:
                {
                alt11=7;
                }
                break;
            case 26:
                {
                alt11=8;
                }
                break;
            case 27:
                {
                alt11=9;
                }
                break;
            case 28:
                {
                alt11=10;
                }
                break;
            case 29:
                {
                alt11=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1407:1: ( 'record' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1407:1: ( 'record' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1408:1: 'record'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getRecordKeyword_0()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__ReservedKeyWords__Alternatives3013); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReservedKeyWordsAccess().getRecordKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1415:6: ( 'fixed' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1415:6: ( 'fixed' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1416:1: 'fixed'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getFixedKeyword_1()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__ReservedKeyWords__Alternatives3033); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReservedKeyWordsAccess().getFixedKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1423:6: ( 'enum' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1423:6: ( 'enum' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1424:1: 'enum'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getEnumKeyword_2()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__ReservedKeyWords__Alternatives3053); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReservedKeyWordsAccess().getEnumKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1431:6: ( 'map' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1431:6: ( 'map' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1432:1: 'map'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getMapKeyword_3()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__ReservedKeyWords__Alternatives3073); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReservedKeyWordsAccess().getMapKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1439:6: ( 'array' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1439:6: ( 'array' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1440:1: 'array'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getArrayKeyword_4()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__ReservedKeyWords__Alternatives3093); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReservedKeyWordsAccess().getArrayKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1447:6: ( 'union' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1447:6: ( 'union' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1448:1: 'union'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getUnionKeyword_5()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__ReservedKeyWords__Alternatives3113); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReservedKeyWordsAccess().getUnionKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1455:6: ( 'error' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1455:6: ( 'error' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1456:1: 'error'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getErrorKeyword_6()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__ReservedKeyWords__Alternatives3133); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReservedKeyWordsAccess().getErrorKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1463:6: ( 'protocol' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1463:6: ( 'protocol' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1464:1: 'protocol'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getProtocolKeyword_7()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__ReservedKeyWords__Alternatives3153); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReservedKeyWordsAccess().getProtocolKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1471:6: ( 'oneway' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1471:6: ( 'oneway' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1472:1: 'oneway'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getOnewayKeyword_8()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__ReservedKeyWords__Alternatives3173); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReservedKeyWordsAccess().getOnewayKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1479:6: ( 'import' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1479:6: ( 'import' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1480:1: 'import'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getImportKeyword_9()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__ReservedKeyWords__Alternatives3193); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReservedKeyWordsAccess().getImportKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1487:6: ( 'throws' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1487:6: ( 'throws' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1488:1: 'throws'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getThrowsKeyword_10()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__ReservedKeyWords__Alternatives3213); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReservedKeyWordsAccess().getThrowsKeyword_10()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservedKeyWords__Alternatives"


    // $ANTLR start "rule__Boolean__Alternatives"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1500:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1504:1: ( ( 'true' ) | ( 'false' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==31) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1505:1: ( 'true' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1505:1: ( 'true' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1506:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,30,FOLLOW_30_in_rule__Boolean__Alternatives3248); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1513:6: ( 'false' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1513:6: ( 'false' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1514:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,31,FOLLOW_31_in_rule__Boolean__Alternatives3268); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__ImportType__Alternatives"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1526:1: rule__ImportType__Alternatives : ( ( ( 'idl' ) ) | ( ( 'protocol' ) ) | ( ( 'schema' ) ) );
    public final void rule__ImportType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1530:1: ( ( ( 'idl' ) ) | ( ( 'protocol' ) ) | ( ( 'schema' ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt13=1;
                }
                break;
            case 26:
                {
                alt13=2;
                }
                break;
            case 33:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1531:1: ( ( 'idl' ) )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1531:1: ( ( 'idl' ) )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1532:1: ( 'idl' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportTypeAccess().getIDLEnumLiteralDeclaration_0()); 
                    }
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1533:1: ( 'idl' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1533:3: 'idl'
                    {
                    match(input,32,FOLLOW_32_in_rule__ImportType__Alternatives3303); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImportTypeAccess().getIDLEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1538:6: ( ( 'protocol' ) )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1538:6: ( ( 'protocol' ) )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1539:1: ( 'protocol' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportTypeAccess().getPROTOCOLEnumLiteralDeclaration_1()); 
                    }
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1540:1: ( 'protocol' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1540:3: 'protocol'
                    {
                    match(input,26,FOLLOW_26_in_rule__ImportType__Alternatives3324); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImportTypeAccess().getPROTOCOLEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1545:6: ( ( 'schema' ) )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1545:6: ( ( 'schema' ) )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1546:1: ( 'schema' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportTypeAccess().getSCHEMAEnumLiteralDeclaration_2()); 
                    }
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1547:1: ( 'schema' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1547:3: 'schema'
                    {
                    match(input,33,FOLLOW_33_in_rule__ImportType__Alternatives3345); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImportTypeAccess().getSCHEMAEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportType__Alternatives"


    // $ANTLR start "rule__AvroIDLFile__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1559:1: rule__AvroIDLFile__Group__0 : rule__AvroIDLFile__Group__0__Impl rule__AvroIDLFile__Group__1 ;
    public final void rule__AvroIDLFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1563:1: ( rule__AvroIDLFile__Group__0__Impl rule__AvroIDLFile__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1564:2: rule__AvroIDLFile__Group__0__Impl rule__AvroIDLFile__Group__1
            {
            pushFollow(FOLLOW_rule__AvroIDLFile__Group__0__Impl_in_rule__AvroIDLFile__Group__03378);
            rule__AvroIDLFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AvroIDLFile__Group__1_in_rule__AvroIDLFile__Group__03381);
            rule__AvroIDLFile__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvroIDLFile__Group__0"


    // $ANTLR start "rule__AvroIDLFile__Group__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1571:1: rule__AvroIDLFile__Group__0__Impl : ( ( rule__AvroIDLFile__ImportsAssignment_0 )* ) ;
    public final void rule__AvroIDLFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1575:1: ( ( ( rule__AvroIDLFile__ImportsAssignment_0 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1576:1: ( ( rule__AvroIDLFile__ImportsAssignment_0 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1576:1: ( ( rule__AvroIDLFile__ImportsAssignment_0 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1577:1: ( rule__AvroIDLFile__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvroIDLFileAccess().getImportsAssignment_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1578:1: ( rule__AvroIDLFile__ImportsAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1578:2: rule__AvroIDLFile__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__AvroIDLFile__ImportsAssignment_0_in_rule__AvroIDLFile__Group__0__Impl3408);
            	    rule__AvroIDLFile__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvroIDLFileAccess().getImportsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvroIDLFile__Group__0__Impl"


    // $ANTLR start "rule__AvroIDLFile__Group__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1588:1: rule__AvroIDLFile__Group__1 : rule__AvroIDLFile__Group__1__Impl ;
    public final void rule__AvroIDLFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1592:1: ( rule__AvroIDLFile__Group__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1593:2: rule__AvroIDLFile__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AvroIDLFile__Group__1__Impl_in_rule__AvroIDLFile__Group__13439);
            rule__AvroIDLFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvroIDLFile__Group__1"


    // $ANTLR start "rule__AvroIDLFile__Group__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1599:1: rule__AvroIDLFile__Group__1__Impl : ( ( rule__AvroIDLFile__ProtocolsAssignment_1 )? ) ;
    public final void rule__AvroIDLFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1603:1: ( ( ( rule__AvroIDLFile__ProtocolsAssignment_1 )? ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1604:1: ( ( rule__AvroIDLFile__ProtocolsAssignment_1 )? )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1604:1: ( ( rule__AvroIDLFile__ProtocolsAssignment_1 )? )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1605:1: ( rule__AvroIDLFile__ProtocolsAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvroIDLFileAccess().getProtocolsAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1606:1: ( rule__AvroIDLFile__ProtocolsAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26||LA15_0==46) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1606:2: rule__AvroIDLFile__ProtocolsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__AvroIDLFile__ProtocolsAssignment_1_in_rule__AvroIDLFile__Group__1__Impl3466);
                    rule__AvroIDLFile__ProtocolsAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvroIDLFileAccess().getProtocolsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvroIDLFile__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1620:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1624:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1625:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03501);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03504);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1632:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1636:1: ( ( 'import' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1637:1: ( 'import' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1637:1: ( 'import' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1638:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Import__Group__0__Impl3532); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1651:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1655:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1656:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13563);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__2_in_rule__Import__Group__13566);
            rule__Import__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1663:1: rule__Import__Group__1__Impl : ( ( rule__Import__TypeAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1667:1: ( ( ( rule__Import__TypeAssignment_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1668:1: ( ( rule__Import__TypeAssignment_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1668:1: ( ( rule__Import__TypeAssignment_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1669:1: ( rule__Import__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getTypeAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1670:1: ( rule__Import__TypeAssignment_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1670:2: rule__Import__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__TypeAssignment_1_in_rule__Import__Group__1__Impl3593);
            rule__Import__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1680:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1684:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1685:2: rule__Import__Group__2__Impl rule__Import__Group__3
            {
            pushFollow(FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__23623);
            rule__Import__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__3_in_rule__Import__Group__23626);
            rule__Import__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1692:1: rule__Import__Group__2__Impl : ( ( rule__Import__ImportURIAssignment_2 ) ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1696:1: ( ( ( rule__Import__ImportURIAssignment_2 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1697:1: ( ( rule__Import__ImportURIAssignment_2 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1697:1: ( ( rule__Import__ImportURIAssignment_2 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1698:1: ( rule__Import__ImportURIAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURIAssignment_2()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1699:1: ( rule__Import__ImportURIAssignment_2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1699:2: rule__Import__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_2_in_rule__Import__Group__2__Impl3653);
            rule__Import__ImportURIAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportURIAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__3"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1709:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1713:1: ( rule__Import__Group__3__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1714:2: rule__Import__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__3__Impl_in_rule__Import__Group__33683);
            rule__Import__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__3"


    // $ANTLR start "rule__Import__Group__3__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1720:1: rule__Import__Group__3__Impl : ( ';' ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1724:1: ( ( ';' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1725:1: ( ';' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1725:1: ( ';' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1726:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getSemicolonKeyword_3()); 
            }
            match(input,34,FOLLOW_34_in_rule__Import__Group__3__Impl3711); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__3__Impl"


    // $ANTLR start "rule__Protocol__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1747:1: rule__Protocol__Group__0 : rule__Protocol__Group__0__Impl rule__Protocol__Group__1 ;
    public final void rule__Protocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1751:1: ( rule__Protocol__Group__0__Impl rule__Protocol__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1752:2: rule__Protocol__Group__0__Impl rule__Protocol__Group__1
            {
            pushFollow(FOLLOW_rule__Protocol__Group__0__Impl_in_rule__Protocol__Group__03750);
            rule__Protocol__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Protocol__Group__1_in_rule__Protocol__Group__03753);
            rule__Protocol__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0"


    // $ANTLR start "rule__Protocol__Group__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1759:1: rule__Protocol__Group__0__Impl : ( ( rule__Protocol__AnnotationsAssignment_0 )* ) ;
    public final void rule__Protocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1763:1: ( ( ( rule__Protocol__AnnotationsAssignment_0 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1764:1: ( ( rule__Protocol__AnnotationsAssignment_0 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1764:1: ( ( rule__Protocol__AnnotationsAssignment_0 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1765:1: ( rule__Protocol__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getAnnotationsAssignment_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1766:1: ( rule__Protocol__AnnotationsAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==46) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1766:2: rule__Protocol__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Protocol__AnnotationsAssignment_0_in_rule__Protocol__Group__0__Impl3780);
            	    rule__Protocol__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolAccess().getAnnotationsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0__Impl"


    // $ANTLR start "rule__Protocol__Group__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1776:1: rule__Protocol__Group__1 : rule__Protocol__Group__1__Impl rule__Protocol__Group__2 ;
    public final void rule__Protocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1780:1: ( rule__Protocol__Group__1__Impl rule__Protocol__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1781:2: rule__Protocol__Group__1__Impl rule__Protocol__Group__2
            {
            pushFollow(FOLLOW_rule__Protocol__Group__1__Impl_in_rule__Protocol__Group__13811);
            rule__Protocol__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Protocol__Group__2_in_rule__Protocol__Group__13814);
            rule__Protocol__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__1"


    // $ANTLR start "rule__Protocol__Group__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1788:1: rule__Protocol__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__Protocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1792:1: ( ( 'protocol' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1793:1: ( 'protocol' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1793:1: ( 'protocol' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1794:1: 'protocol'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getProtocolKeyword_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__Protocol__Group__1__Impl3842); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolAccess().getProtocolKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__1__Impl"


    // $ANTLR start "rule__Protocol__Group__2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1807:1: rule__Protocol__Group__2 : rule__Protocol__Group__2__Impl rule__Protocol__Group__3 ;
    public final void rule__Protocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1811:1: ( rule__Protocol__Group__2__Impl rule__Protocol__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1812:2: rule__Protocol__Group__2__Impl rule__Protocol__Group__3
            {
            pushFollow(FOLLOW_rule__Protocol__Group__2__Impl_in_rule__Protocol__Group__23873);
            rule__Protocol__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Protocol__Group__3_in_rule__Protocol__Group__23876);
            rule__Protocol__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__2"


    // $ANTLR start "rule__Protocol__Group__2__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1819:1: rule__Protocol__Group__2__Impl : ( ( rule__Protocol__NameAssignment_2 ) ) ;
    public final void rule__Protocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1823:1: ( ( ( rule__Protocol__NameAssignment_2 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1824:1: ( ( rule__Protocol__NameAssignment_2 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1824:1: ( ( rule__Protocol__NameAssignment_2 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1825:1: ( rule__Protocol__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getNameAssignment_2()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1826:1: ( rule__Protocol__NameAssignment_2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1826:2: rule__Protocol__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Protocol__NameAssignment_2_in_rule__Protocol__Group__2__Impl3903);
            rule__Protocol__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__2__Impl"


    // $ANTLR start "rule__Protocol__Group__3"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1836:1: rule__Protocol__Group__3 : rule__Protocol__Group__3__Impl rule__Protocol__Group__4 ;
    public final void rule__Protocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1840:1: ( rule__Protocol__Group__3__Impl rule__Protocol__Group__4 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1841:2: rule__Protocol__Group__3__Impl rule__Protocol__Group__4
            {
            pushFollow(FOLLOW_rule__Protocol__Group__3__Impl_in_rule__Protocol__Group__33933);
            rule__Protocol__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Protocol__Group__4_in_rule__Protocol__Group__33936);
            rule__Protocol__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__3"


    // $ANTLR start "rule__Protocol__Group__3__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1848:1: rule__Protocol__Group__3__Impl : ( '{' ) ;
    public final void rule__Protocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1852:1: ( ( '{' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1853:1: ( '{' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1853:1: ( '{' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1854:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,35,FOLLOW_35_in_rule__Protocol__Group__3__Impl3964); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__3__Impl"


    // $ANTLR start "rule__Protocol__Group__4"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1867:1: rule__Protocol__Group__4 : rule__Protocol__Group__4__Impl rule__Protocol__Group__5 ;
    public final void rule__Protocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1871:1: ( rule__Protocol__Group__4__Impl rule__Protocol__Group__5 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1872:2: rule__Protocol__Group__4__Impl rule__Protocol__Group__5
            {
            pushFollow(FOLLOW_rule__Protocol__Group__4__Impl_in_rule__Protocol__Group__43995);
            rule__Protocol__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Protocol__Group__5_in_rule__Protocol__Group__43998);
            rule__Protocol__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__4"


    // $ANTLR start "rule__Protocol__Group__4__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1879:1: rule__Protocol__Group__4__Impl : ( ( rule__Protocol__ElementsAssignment_4 )* ) ;
    public final void rule__Protocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1883:1: ( ( ( rule__Protocol__ElementsAssignment_4 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1884:1: ( ( rule__Protocol__ElementsAssignment_4 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1884:1: ( ( rule__Protocol__ElementsAssignment_4 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1885:1: ( rule__Protocol__ElementsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getElementsAssignment_4()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1886:1: ( rule__Protocol__ElementsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||(LA17_0>=11 && LA17_0<=21)||LA17_0==25||(LA17_0>=45 && LA17_0<=46)||LA17_0==48) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1886:2: rule__Protocol__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Protocol__ElementsAssignment_4_in_rule__Protocol__Group__4__Impl4025);
            	    rule__Protocol__ElementsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolAccess().getElementsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__4__Impl"


    // $ANTLR start "rule__Protocol__Group__5"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1896:1: rule__Protocol__Group__5 : rule__Protocol__Group__5__Impl ;
    public final void rule__Protocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1900:1: ( rule__Protocol__Group__5__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1901:2: rule__Protocol__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Protocol__Group__5__Impl_in_rule__Protocol__Group__54056);
            rule__Protocol__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__5"


    // $ANTLR start "rule__Protocol__Group__5__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1907:1: rule__Protocol__Group__5__Impl : ( '}' ) ;
    public final void rule__Protocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1911:1: ( ( '}' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1912:1: ( '}' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1912:1: ( '}' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1913:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,36,FOLLOW_36_in_rule__Protocol__Group__5__Impl4084); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__5__Impl"


    // $ANTLR start "rule__RPCMessage__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1938:1: rule__RPCMessage__Group__0 : rule__RPCMessage__Group__0__Impl rule__RPCMessage__Group__1 ;
    public final void rule__RPCMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1942:1: ( rule__RPCMessage__Group__0__Impl rule__RPCMessage__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1943:2: rule__RPCMessage__Group__0__Impl rule__RPCMessage__Group__1
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group__0__Impl_in_rule__RPCMessage__Group__04127);
            rule__RPCMessage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RPCMessage__Group__1_in_rule__RPCMessage__Group__04130);
            rule__RPCMessage__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group__0"


    // $ANTLR start "rule__RPCMessage__Group__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1950:1: rule__RPCMessage__Group__0__Impl : ( ( rule__RPCMessage__ReturnTypeAssignment_0 ) ) ;
    public final void rule__RPCMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1954:1: ( ( ( rule__RPCMessage__ReturnTypeAssignment_0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1955:1: ( ( rule__RPCMessage__ReturnTypeAssignment_0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1955:1: ( ( rule__RPCMessage__ReturnTypeAssignment_0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1956:1: ( rule__RPCMessage__ReturnTypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getReturnTypeAssignment_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1957:1: ( rule__RPCMessage__ReturnTypeAssignment_0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1957:2: rule__RPCMessage__ReturnTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__RPCMessage__ReturnTypeAssignment_0_in_rule__RPCMessage__Group__0__Impl4157);
            rule__RPCMessage__ReturnTypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getReturnTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group__0__Impl"


    // $ANTLR start "rule__RPCMessage__Group__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1967:1: rule__RPCMessage__Group__1 : rule__RPCMessage__Group__1__Impl rule__RPCMessage__Group__2 ;
    public final void rule__RPCMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1971:1: ( rule__RPCMessage__Group__1__Impl rule__RPCMessage__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1972:2: rule__RPCMessage__Group__1__Impl rule__RPCMessage__Group__2
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group__1__Impl_in_rule__RPCMessage__Group__14187);
            rule__RPCMessage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RPCMessage__Group__2_in_rule__RPCMessage__Group__14190);
            rule__RPCMessage__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group__1"


    // $ANTLR start "rule__RPCMessage__Group__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1979:1: rule__RPCMessage__Group__1__Impl : ( ( rule__RPCMessage__NameAssignment_1 ) ) ;
    public final void rule__RPCMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1983:1: ( ( ( rule__RPCMessage__NameAssignment_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1984:1: ( ( rule__RPCMessage__NameAssignment_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1984:1: ( ( rule__RPCMessage__NameAssignment_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1985:1: ( rule__RPCMessage__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getNameAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1986:1: ( rule__RPCMessage__NameAssignment_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1986:2: rule__RPCMessage__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RPCMessage__NameAssignment_1_in_rule__RPCMessage__Group__1__Impl4217);
            rule__RPCMessage__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group__1__Impl"


    // $ANTLR start "rule__RPCMessage__Group__2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1996:1: rule__RPCMessage__Group__2 : rule__RPCMessage__Group__2__Impl rule__RPCMessage__Group__3 ;
    public final void rule__RPCMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2000:1: ( rule__RPCMessage__Group__2__Impl rule__RPCMessage__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2001:2: rule__RPCMessage__Group__2__Impl rule__RPCMessage__Group__3
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group__2__Impl_in_rule__RPCMessage__Group__24247);
            rule__RPCMessage__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RPCMessage__Group__3_in_rule__RPCMessage__Group__24250);
            rule__RPCMessage__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group__2"


    // $ANTLR start "rule__RPCMessage__Group__2__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2008:1: rule__RPCMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__RPCMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2012:1: ( ( '(' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2013:1: ( '(' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2013:1: ( '(' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2014:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__RPCMessage__Group__2__Impl4278); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group__2__Impl"


    // $ANTLR start "rule__RPCMessage__Group__3"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2027:1: rule__RPCMessage__Group__3 : rule__RPCMessage__Group__3__Impl rule__RPCMessage__Group__4 ;
    public final void rule__RPCMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2031:1: ( rule__RPCMessage__Group__3__Impl rule__RPCMessage__Group__4 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2032:2: rule__RPCMessage__Group__3__Impl rule__RPCMessage__Group__4
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group__3__Impl_in_rule__RPCMessage__Group__34309);
            rule__RPCMessage__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RPCMessage__Group__4_in_rule__RPCMessage__Group__34312);
            rule__RPCMessage__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group__3"


    // $ANTLR start "rule__RPCMessage__Group__3__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2039:1: rule__RPCMessage__Group__3__Impl : ( ( rule__RPCMessage__Group_3__0 )* ) ;
    public final void rule__RPCMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2043:1: ( ( ( rule__RPCMessage__Group_3__0 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2044:1: ( ( rule__RPCMessage__Group_3__0 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2044:1: ( ( rule__RPCMessage__Group_3__0 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2045:1: ( rule__RPCMessage__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getGroup_3()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2046:1: ( rule__RPCMessage__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=11 && LA18_0<=18)||LA18_0==45) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2046:2: rule__RPCMessage__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__RPCMessage__Group_3__0_in_rule__RPCMessage__Group__3__Impl4339);
            	    rule__RPCMessage__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group__3__Impl"


    // $ANTLR start "rule__RPCMessage__Group__4"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2056:1: rule__RPCMessage__Group__4 : rule__RPCMessage__Group__4__Impl rule__RPCMessage__Group__5 ;
    public final void rule__RPCMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2060:1: ( rule__RPCMessage__Group__4__Impl rule__RPCMessage__Group__5 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2061:2: rule__RPCMessage__Group__4__Impl rule__RPCMessage__Group__5
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group__4__Impl_in_rule__RPCMessage__Group__44370);
            rule__RPCMessage__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RPCMessage__Group__5_in_rule__RPCMessage__Group__44373);
            rule__RPCMessage__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group__4"


    // $ANTLR start "rule__RPCMessage__Group__4__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2068:1: rule__RPCMessage__Group__4__Impl : ( ')' ) ;
    public final void rule__RPCMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2072:1: ( ( ')' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2073:1: ( ')' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2073:1: ( ')' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2074:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,38,FOLLOW_38_in_rule__RPCMessage__Group__4__Impl4401); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group__4__Impl"


    // $ANTLR start "rule__RPCMessage__Group__5"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2087:1: rule__RPCMessage__Group__5 : rule__RPCMessage__Group__5__Impl rule__RPCMessage__Group__6 ;
    public final void rule__RPCMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2091:1: ( rule__RPCMessage__Group__5__Impl rule__RPCMessage__Group__6 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2092:2: rule__RPCMessage__Group__5__Impl rule__RPCMessage__Group__6
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group__5__Impl_in_rule__RPCMessage__Group__54432);
            rule__RPCMessage__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RPCMessage__Group__6_in_rule__RPCMessage__Group__54435);
            rule__RPCMessage__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group__5"


    // $ANTLR start "rule__RPCMessage__Group__5__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2099:1: rule__RPCMessage__Group__5__Impl : ( ( rule__RPCMessage__Group_5__0 )? ) ;
    public final void rule__RPCMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2103:1: ( ( ( rule__RPCMessage__Group_5__0 )? ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2104:1: ( ( rule__RPCMessage__Group_5__0 )? )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2104:1: ( ( rule__RPCMessage__Group_5__0 )? )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2105:1: ( rule__RPCMessage__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getGroup_5()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2106:1: ( rule__RPCMessage__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2106:2: rule__RPCMessage__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__RPCMessage__Group_5__0_in_rule__RPCMessage__Group__5__Impl4462);
                    rule__RPCMessage__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group__5__Impl"


    // $ANTLR start "rule__RPCMessage__Group__6"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2116:1: rule__RPCMessage__Group__6 : rule__RPCMessage__Group__6__Impl rule__RPCMessage__Group__7 ;
    public final void rule__RPCMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2120:1: ( rule__RPCMessage__Group__6__Impl rule__RPCMessage__Group__7 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2121:2: rule__RPCMessage__Group__6__Impl rule__RPCMessage__Group__7
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group__6__Impl_in_rule__RPCMessage__Group__64493);
            rule__RPCMessage__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RPCMessage__Group__7_in_rule__RPCMessage__Group__64496);
            rule__RPCMessage__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group__6"


    // $ANTLR start "rule__RPCMessage__Group__6__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2128:1: rule__RPCMessage__Group__6__Impl : ( ( rule__RPCMessage__OnewayAssignment_6 )? ) ;
    public final void rule__RPCMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2132:1: ( ( ( rule__RPCMessage__OnewayAssignment_6 )? ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2133:1: ( ( rule__RPCMessage__OnewayAssignment_6 )? )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2133:1: ( ( rule__RPCMessage__OnewayAssignment_6 )? )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2134:1: ( rule__RPCMessage__OnewayAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getOnewayAssignment_6()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2135:1: ( rule__RPCMessage__OnewayAssignment_6 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2135:2: rule__RPCMessage__OnewayAssignment_6
                    {
                    pushFollow(FOLLOW_rule__RPCMessage__OnewayAssignment_6_in_rule__RPCMessage__Group__6__Impl4523);
                    rule__RPCMessage__OnewayAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getOnewayAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group__6__Impl"


    // $ANTLR start "rule__RPCMessage__Group__7"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2145:1: rule__RPCMessage__Group__7 : rule__RPCMessage__Group__7__Impl ;
    public final void rule__RPCMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2149:1: ( rule__RPCMessage__Group__7__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2150:2: rule__RPCMessage__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group__7__Impl_in_rule__RPCMessage__Group__74554);
            rule__RPCMessage__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group__7"


    // $ANTLR start "rule__RPCMessage__Group__7__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2156:1: rule__RPCMessage__Group__7__Impl : ( ';' ) ;
    public final void rule__RPCMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2160:1: ( ( ';' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2161:1: ( ';' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2161:1: ( ';' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2162:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getSemicolonKeyword_7()); 
            }
            match(input,34,FOLLOW_34_in_rule__RPCMessage__Group__7__Impl4582); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getSemicolonKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group__7__Impl"


    // $ANTLR start "rule__RPCMessage__Group_3__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2191:1: rule__RPCMessage__Group_3__0 : rule__RPCMessage__Group_3__0__Impl rule__RPCMessage__Group_3__1 ;
    public final void rule__RPCMessage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2195:1: ( rule__RPCMessage__Group_3__0__Impl rule__RPCMessage__Group_3__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2196:2: rule__RPCMessage__Group_3__0__Impl rule__RPCMessage__Group_3__1
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group_3__0__Impl_in_rule__RPCMessage__Group_3__04629);
            rule__RPCMessage__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RPCMessage__Group_3__1_in_rule__RPCMessage__Group_3__04632);
            rule__RPCMessage__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group_3__0"


    // $ANTLR start "rule__RPCMessage__Group_3__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2203:1: rule__RPCMessage__Group_3__0__Impl : ( ( rule__RPCMessage__ArgumentsAssignment_3_0 ) ) ;
    public final void rule__RPCMessage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2207:1: ( ( ( rule__RPCMessage__ArgumentsAssignment_3_0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2208:1: ( ( rule__RPCMessage__ArgumentsAssignment_3_0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2208:1: ( ( rule__RPCMessage__ArgumentsAssignment_3_0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2209:1: ( rule__RPCMessage__ArgumentsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getArgumentsAssignment_3_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2210:1: ( rule__RPCMessage__ArgumentsAssignment_3_0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2210:2: rule__RPCMessage__ArgumentsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__RPCMessage__ArgumentsAssignment_3_0_in_rule__RPCMessage__Group_3__0__Impl4659);
            rule__RPCMessage__ArgumentsAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getArgumentsAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group_3__0__Impl"


    // $ANTLR start "rule__RPCMessage__Group_3__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2220:1: rule__RPCMessage__Group_3__1 : rule__RPCMessage__Group_3__1__Impl ;
    public final void rule__RPCMessage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2224:1: ( rule__RPCMessage__Group_3__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2225:2: rule__RPCMessage__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group_3__1__Impl_in_rule__RPCMessage__Group_3__14689);
            rule__RPCMessage__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group_3__1"


    // $ANTLR start "rule__RPCMessage__Group_3__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2231:1: rule__RPCMessage__Group_3__1__Impl : ( ( rule__RPCMessage__Group_3_1__0 )* ) ;
    public final void rule__RPCMessage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2235:1: ( ( ( rule__RPCMessage__Group_3_1__0 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2236:1: ( ( rule__RPCMessage__Group_3_1__0 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2236:1: ( ( rule__RPCMessage__Group_3_1__0 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2237:1: ( rule__RPCMessage__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getGroup_3_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2238:1: ( rule__RPCMessage__Group_3_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==39) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2238:2: rule__RPCMessage__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RPCMessage__Group_3_1__0_in_rule__RPCMessage__Group_3__1__Impl4716);
            	    rule__RPCMessage__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group_3__1__Impl"


    // $ANTLR start "rule__RPCMessage__Group_3_1__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2252:1: rule__RPCMessage__Group_3_1__0 : rule__RPCMessage__Group_3_1__0__Impl rule__RPCMessage__Group_3_1__1 ;
    public final void rule__RPCMessage__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2256:1: ( rule__RPCMessage__Group_3_1__0__Impl rule__RPCMessage__Group_3_1__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2257:2: rule__RPCMessage__Group_3_1__0__Impl rule__RPCMessage__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group_3_1__0__Impl_in_rule__RPCMessage__Group_3_1__04751);
            rule__RPCMessage__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RPCMessage__Group_3_1__1_in_rule__RPCMessage__Group_3_1__04754);
            rule__RPCMessage__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group_3_1__0"


    // $ANTLR start "rule__RPCMessage__Group_3_1__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2264:1: rule__RPCMessage__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__RPCMessage__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2268:1: ( ( ',' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2269:1: ( ',' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2269:1: ( ',' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2270:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__RPCMessage__Group_3_1__0__Impl4782); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getCommaKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group_3_1__0__Impl"


    // $ANTLR start "rule__RPCMessage__Group_3_1__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2283:1: rule__RPCMessage__Group_3_1__1 : rule__RPCMessage__Group_3_1__1__Impl ;
    public final void rule__RPCMessage__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2287:1: ( rule__RPCMessage__Group_3_1__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2288:2: rule__RPCMessage__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group_3_1__1__Impl_in_rule__RPCMessage__Group_3_1__14813);
            rule__RPCMessage__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group_3_1__1"


    // $ANTLR start "rule__RPCMessage__Group_3_1__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2294:1: rule__RPCMessage__Group_3_1__1__Impl : ( ( rule__RPCMessage__ArgumentsAssignment_3_1_1 ) ) ;
    public final void rule__RPCMessage__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2298:1: ( ( ( rule__RPCMessage__ArgumentsAssignment_3_1_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2299:1: ( ( rule__RPCMessage__ArgumentsAssignment_3_1_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2299:1: ( ( rule__RPCMessage__ArgumentsAssignment_3_1_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2300:1: ( rule__RPCMessage__ArgumentsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getArgumentsAssignment_3_1_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2301:1: ( rule__RPCMessage__ArgumentsAssignment_3_1_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2301:2: rule__RPCMessage__ArgumentsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__RPCMessage__ArgumentsAssignment_3_1_1_in_rule__RPCMessage__Group_3_1__1__Impl4840);
            rule__RPCMessage__ArgumentsAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getArgumentsAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group_3_1__1__Impl"


    // $ANTLR start "rule__RPCMessage__Group_5__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2315:1: rule__RPCMessage__Group_5__0 : rule__RPCMessage__Group_5__0__Impl rule__RPCMessage__Group_5__1 ;
    public final void rule__RPCMessage__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2319:1: ( rule__RPCMessage__Group_5__0__Impl rule__RPCMessage__Group_5__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2320:2: rule__RPCMessage__Group_5__0__Impl rule__RPCMessage__Group_5__1
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group_5__0__Impl_in_rule__RPCMessage__Group_5__04874);
            rule__RPCMessage__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RPCMessage__Group_5__1_in_rule__RPCMessage__Group_5__04877);
            rule__RPCMessage__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group_5__0"


    // $ANTLR start "rule__RPCMessage__Group_5__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2327:1: rule__RPCMessage__Group_5__0__Impl : ( 'throws' ) ;
    public final void rule__RPCMessage__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2331:1: ( ( 'throws' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2332:1: ( 'throws' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2332:1: ( 'throws' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2333:1: 'throws'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getThrowsKeyword_5_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__RPCMessage__Group_5__0__Impl4905); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getThrowsKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group_5__0__Impl"


    // $ANTLR start "rule__RPCMessage__Group_5__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2346:1: rule__RPCMessage__Group_5__1 : rule__RPCMessage__Group_5__1__Impl ;
    public final void rule__RPCMessage__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2350:1: ( rule__RPCMessage__Group_5__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2351:2: rule__RPCMessage__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group_5__1__Impl_in_rule__RPCMessage__Group_5__14936);
            rule__RPCMessage__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group_5__1"


    // $ANTLR start "rule__RPCMessage__Group_5__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2357:1: rule__RPCMessage__Group_5__1__Impl : ( ( rule__RPCMessage__ErrorAssignment_5_1 ) ) ;
    public final void rule__RPCMessage__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2361:1: ( ( ( rule__RPCMessage__ErrorAssignment_5_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2362:1: ( ( rule__RPCMessage__ErrorAssignment_5_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2362:1: ( ( rule__RPCMessage__ErrorAssignment_5_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2363:1: ( rule__RPCMessage__ErrorAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getErrorAssignment_5_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2364:1: ( rule__RPCMessage__ErrorAssignment_5_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2364:2: rule__RPCMessage__ErrorAssignment_5_1
            {
            pushFollow(FOLLOW_rule__RPCMessage__ErrorAssignment_5_1_in_rule__RPCMessage__Group_5__1__Impl4963);
            rule__RPCMessage__ErrorAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getErrorAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__Group_5__1__Impl"


    // $ANTLR start "rule__Argument__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2378:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2382:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2383:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__04997);
            rule__Argument__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__05000);
            rule__Argument__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__0"


    // $ANTLR start "rule__Argument__Group__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2390:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__TypeAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2394:1: ( ( ( rule__Argument__TypeAssignment_0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2395:1: ( ( rule__Argument__TypeAssignment_0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2395:1: ( ( rule__Argument__TypeAssignment_0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2396:1: ( rule__Argument__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2397:1: ( rule__Argument__TypeAssignment_0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2397:2: rule__Argument__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Argument__TypeAssignment_0_in_rule__Argument__Group__0__Impl5027);
            rule__Argument__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__0__Impl"


    // $ANTLR start "rule__Argument__Group__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2407:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl rule__Argument__Group__2 ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2411:1: ( rule__Argument__Group__1__Impl rule__Argument__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2412:2: rule__Argument__Group__1__Impl rule__Argument__Group__2
            {
            pushFollow(FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__15057);
            rule__Argument__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Argument__Group__2_in_rule__Argument__Group__15060);
            rule__Argument__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__1"


    // $ANTLR start "rule__Argument__Group__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2419:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__NameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2423:1: ( ( ( rule__Argument__NameAssignment_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2424:1: ( ( rule__Argument__NameAssignment_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2424:1: ( ( rule__Argument__NameAssignment_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2425:1: ( rule__Argument__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2426:1: ( rule__Argument__NameAssignment_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2426:2: rule__Argument__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Argument__NameAssignment_1_in_rule__Argument__Group__1__Impl5087);
            rule__Argument__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__1__Impl"


    // $ANTLR start "rule__Argument__Group__2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2436:1: rule__Argument__Group__2 : rule__Argument__Group__2__Impl ;
    public final void rule__Argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2440:1: ( rule__Argument__Group__2__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2441:2: rule__Argument__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group__2__Impl_in_rule__Argument__Group__25117);
            rule__Argument__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__2"


    // $ANTLR start "rule__Argument__Group__2__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2447:1: rule__Argument__Group__2__Impl : ( ( rule__Argument__Group_2__0 )? ) ;
    public final void rule__Argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2451:1: ( ( ( rule__Argument__Group_2__0 )? ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2452:1: ( ( rule__Argument__Group_2__0 )? )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2452:1: ( ( rule__Argument__Group_2__0 )? )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2453:1: ( rule__Argument__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getGroup_2()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2454:1: ( rule__Argument__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2454:2: rule__Argument__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_2__0_in_rule__Argument__Group__2__Impl5144);
                    rule__Argument__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__2__Impl"


    // $ANTLR start "rule__Argument__Group_2__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2470:1: rule__Argument__Group_2__0 : rule__Argument__Group_2__0__Impl rule__Argument__Group_2__1 ;
    public final void rule__Argument__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2474:1: ( rule__Argument__Group_2__0__Impl rule__Argument__Group_2__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2475:2: rule__Argument__Group_2__0__Impl rule__Argument__Group_2__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_2__0__Impl_in_rule__Argument__Group_2__05181);
            rule__Argument__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Argument__Group_2__1_in_rule__Argument__Group_2__05184);
            rule__Argument__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_2__0"


    // $ANTLR start "rule__Argument__Group_2__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2482:1: rule__Argument__Group_2__0__Impl : ( '=' ) ;
    public final void rule__Argument__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2486:1: ( ( '=' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2487:1: ( '=' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2487:1: ( '=' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2488:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getEqualsSignKeyword_2_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__Argument__Group_2__0__Impl5212); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentAccess().getEqualsSignKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_2__0__Impl"


    // $ANTLR start "rule__Argument__Group_2__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2501:1: rule__Argument__Group_2__1 : rule__Argument__Group_2__1__Impl ;
    public final void rule__Argument__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2505:1: ( rule__Argument__Group_2__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2506:2: rule__Argument__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_2__1__Impl_in_rule__Argument__Group_2__15243);
            rule__Argument__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_2__1"


    // $ANTLR start "rule__Argument__Group_2__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2512:1: rule__Argument__Group_2__1__Impl : ( ( rule__Argument__DefaultAssignment_2_1 ) ) ;
    public final void rule__Argument__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2516:1: ( ( ( rule__Argument__DefaultAssignment_2_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2517:1: ( ( rule__Argument__DefaultAssignment_2_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2517:1: ( ( rule__Argument__DefaultAssignment_2_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2518:1: ( rule__Argument__DefaultAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getDefaultAssignment_2_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2519:1: ( rule__Argument__DefaultAssignment_2_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2519:2: rule__Argument__DefaultAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Argument__DefaultAssignment_2_1_in_rule__Argument__Group_2__1__Impl5270);
            rule__Argument__DefaultAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentAccess().getDefaultAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_2__1__Impl"


    // $ANTLR start "rule__TypeDef__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2533:1: rule__TypeDef__Group__0 : rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1 ;
    public final void rule__TypeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2537:1: ( rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2538:2: rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDef__Group__0__Impl_in_rule__TypeDef__Group__05304);
            rule__TypeDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypeDef__Group__1_in_rule__TypeDef__Group__05307);
            rule__TypeDef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__0"


    // $ANTLR start "rule__TypeDef__Group__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2545:1: rule__TypeDef__Group__0__Impl : ( ( rule__TypeDef__AnnotationsAssignment_0 )* ) ;
    public final void rule__TypeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2549:1: ( ( ( rule__TypeDef__AnnotationsAssignment_0 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2550:1: ( ( rule__TypeDef__AnnotationsAssignment_0 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2550:1: ( ( rule__TypeDef__AnnotationsAssignment_0 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2551:1: ( rule__TypeDef__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefAccess().getAnnotationsAssignment_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2552:1: ( rule__TypeDef__AnnotationsAssignment_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==46) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2552:2: rule__TypeDef__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__TypeDef__AnnotationsAssignment_0_in_rule__TypeDef__Group__0__Impl5334);
            	    rule__TypeDef__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefAccess().getAnnotationsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__0__Impl"


    // $ANTLR start "rule__TypeDef__Group__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2562:1: rule__TypeDef__Group__1 : rule__TypeDef__Group__1__Impl ;
    public final void rule__TypeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2566:1: ( rule__TypeDef__Group__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2567:2: rule__TypeDef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDef__Group__1__Impl_in_rule__TypeDef__Group__15365);
            rule__TypeDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__1"


    // $ANTLR start "rule__TypeDef__Group__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2573:1: rule__TypeDef__Group__1__Impl : ( ( rule__TypeDef__TypeAssignment_1 ) ) ;
    public final void rule__TypeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2577:1: ( ( ( rule__TypeDef__TypeAssignment_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2578:1: ( ( rule__TypeDef__TypeAssignment_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2578:1: ( ( rule__TypeDef__TypeAssignment_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2579:1: ( rule__TypeDef__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefAccess().getTypeAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2580:1: ( rule__TypeDef__TypeAssignment_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2580:2: rule__TypeDef__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeDef__TypeAssignment_1_in_rule__TypeDef__Group__1__Impl5392);
            rule__TypeDef__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__1__Impl"


    // $ANTLR start "rule__ErrorType__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2594:1: rule__ErrorType__Group__0 : rule__ErrorType__Group__0__Impl rule__ErrorType__Group__1 ;
    public final void rule__ErrorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2598:1: ( rule__ErrorType__Group__0__Impl rule__ErrorType__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2599:2: rule__ErrorType__Group__0__Impl rule__ErrorType__Group__1
            {
            pushFollow(FOLLOW_rule__ErrorType__Group__0__Impl_in_rule__ErrorType__Group__05426);
            rule__ErrorType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ErrorType__Group__1_in_rule__ErrorType__Group__05429);
            rule__ErrorType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorType__Group__0"


    // $ANTLR start "rule__ErrorType__Group__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2606:1: rule__ErrorType__Group__0__Impl : ( 'error' ) ;
    public final void rule__ErrorType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2610:1: ( ( 'error' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2611:1: ( 'error' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2611:1: ( 'error' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2612:1: 'error'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorTypeAccess().getErrorKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__ErrorType__Group__0__Impl5457); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorTypeAccess().getErrorKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorType__Group__0__Impl"


    // $ANTLR start "rule__ErrorType__Group__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2625:1: rule__ErrorType__Group__1 : rule__ErrorType__Group__1__Impl rule__ErrorType__Group__2 ;
    public final void rule__ErrorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2629:1: ( rule__ErrorType__Group__1__Impl rule__ErrorType__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2630:2: rule__ErrorType__Group__1__Impl rule__ErrorType__Group__2
            {
            pushFollow(FOLLOW_rule__ErrorType__Group__1__Impl_in_rule__ErrorType__Group__15488);
            rule__ErrorType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ErrorType__Group__2_in_rule__ErrorType__Group__15491);
            rule__ErrorType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorType__Group__1"


    // $ANTLR start "rule__ErrorType__Group__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2637:1: rule__ErrorType__Group__1__Impl : ( ( rule__ErrorType__NameAssignment_1 ) ) ;
    public final void rule__ErrorType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2641:1: ( ( ( rule__ErrorType__NameAssignment_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2642:1: ( ( rule__ErrorType__NameAssignment_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2642:1: ( ( rule__ErrorType__NameAssignment_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2643:1: ( rule__ErrorType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorTypeAccess().getNameAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2644:1: ( rule__ErrorType__NameAssignment_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2644:2: rule__ErrorType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ErrorType__NameAssignment_1_in_rule__ErrorType__Group__1__Impl5518);
            rule__ErrorType__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorTypeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorType__Group__1__Impl"


    // $ANTLR start "rule__ErrorType__Group__2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2654:1: rule__ErrorType__Group__2 : rule__ErrorType__Group__2__Impl rule__ErrorType__Group__3 ;
    public final void rule__ErrorType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2658:1: ( rule__ErrorType__Group__2__Impl rule__ErrorType__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2659:2: rule__ErrorType__Group__2__Impl rule__ErrorType__Group__3
            {
            pushFollow(FOLLOW_rule__ErrorType__Group__2__Impl_in_rule__ErrorType__Group__25548);
            rule__ErrorType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ErrorType__Group__3_in_rule__ErrorType__Group__25551);
            rule__ErrorType__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorType__Group__2"


    // $ANTLR start "rule__ErrorType__Group__2__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2666:1: rule__ErrorType__Group__2__Impl : ( '{' ) ;
    public final void rule__ErrorType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2670:1: ( ( '{' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2671:1: ( '{' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2671:1: ( '{' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2672:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorTypeAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__ErrorType__Group__2__Impl5579); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorTypeAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorType__Group__2__Impl"


    // $ANTLR start "rule__ErrorType__Group__3"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2685:1: rule__ErrorType__Group__3 : rule__ErrorType__Group__3__Impl rule__ErrorType__Group__4 ;
    public final void rule__ErrorType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2689:1: ( rule__ErrorType__Group__3__Impl rule__ErrorType__Group__4 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2690:2: rule__ErrorType__Group__3__Impl rule__ErrorType__Group__4
            {
            pushFollow(FOLLOW_rule__ErrorType__Group__3__Impl_in_rule__ErrorType__Group__35610);
            rule__ErrorType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ErrorType__Group__4_in_rule__ErrorType__Group__35613);
            rule__ErrorType__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorType__Group__3"


    // $ANTLR start "rule__ErrorType__Group__3__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2697:1: rule__ErrorType__Group__3__Impl : ( ( rule__ErrorType__FieldsAssignment_3 )* ) ;
    public final void rule__ErrorType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2701:1: ( ( ( rule__ErrorType__FieldsAssignment_3 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2702:1: ( ( rule__ErrorType__FieldsAssignment_3 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2702:1: ( ( rule__ErrorType__FieldsAssignment_3 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2703:1: ( rule__ErrorType__FieldsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorTypeAccess().getFieldsAssignment_3()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2704:1: ( rule__ErrorType__FieldsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||(LA24_0>=11 && LA24_0<=18)||(LA24_0>=22 && LA24_0<=24)||(LA24_0>=45 && LA24_0<=46)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2704:2: rule__ErrorType__FieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ErrorType__FieldsAssignment_3_in_rule__ErrorType__Group__3__Impl5640);
            	    rule__ErrorType__FieldsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorTypeAccess().getFieldsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorType__Group__3__Impl"


    // $ANTLR start "rule__ErrorType__Group__4"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2714:1: rule__ErrorType__Group__4 : rule__ErrorType__Group__4__Impl ;
    public final void rule__ErrorType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2718:1: ( rule__ErrorType__Group__4__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2719:2: rule__ErrorType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ErrorType__Group__4__Impl_in_rule__ErrorType__Group__45671);
            rule__ErrorType__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorType__Group__4"


    // $ANTLR start "rule__ErrorType__Group__4__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2725:1: rule__ErrorType__Group__4__Impl : ( '}' ) ;
    public final void rule__ErrorType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2729:1: ( ( '}' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2730:1: ( '}' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2730:1: ( '}' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2731:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorTypeAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,36,FOLLOW_36_in_rule__ErrorType__Group__4__Impl5699); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorTypeAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorType__Group__4__Impl"


    // $ANTLR start "rule__RecordType__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2754:1: rule__RecordType__Group__0 : rule__RecordType__Group__0__Impl rule__RecordType__Group__1 ;
    public final void rule__RecordType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2758:1: ( rule__RecordType__Group__0__Impl rule__RecordType__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2759:2: rule__RecordType__Group__0__Impl rule__RecordType__Group__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group__0__Impl_in_rule__RecordType__Group__05740);
            rule__RecordType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__1_in_rule__RecordType__Group__05743);
            rule__RecordType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__0"


    // $ANTLR start "rule__RecordType__Group__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2766:1: rule__RecordType__Group__0__Impl : ( 'record' ) ;
    public final void rule__RecordType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2770:1: ( ( 'record' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2771:1: ( 'record' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2771:1: ( 'record' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2772:1: 'record'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getRecordKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__RecordType__Group__0__Impl5771); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getRecordKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__0__Impl"


    // $ANTLR start "rule__RecordType__Group__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2785:1: rule__RecordType__Group__1 : rule__RecordType__Group__1__Impl rule__RecordType__Group__2 ;
    public final void rule__RecordType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2789:1: ( rule__RecordType__Group__1__Impl rule__RecordType__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2790:2: rule__RecordType__Group__1__Impl rule__RecordType__Group__2
            {
            pushFollow(FOLLOW_rule__RecordType__Group__1__Impl_in_rule__RecordType__Group__15802);
            rule__RecordType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__2_in_rule__RecordType__Group__15805);
            rule__RecordType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__1"


    // $ANTLR start "rule__RecordType__Group__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2797:1: rule__RecordType__Group__1__Impl : ( ( rule__RecordType__NameAssignment_1 ) ) ;
    public final void rule__RecordType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2801:1: ( ( ( rule__RecordType__NameAssignment_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2802:1: ( ( rule__RecordType__NameAssignment_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2802:1: ( ( rule__RecordType__NameAssignment_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2803:1: ( rule__RecordType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getNameAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2804:1: ( rule__RecordType__NameAssignment_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2804:2: rule__RecordType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RecordType__NameAssignment_1_in_rule__RecordType__Group__1__Impl5832);
            rule__RecordType__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__1__Impl"


    // $ANTLR start "rule__RecordType__Group__2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2814:1: rule__RecordType__Group__2 : rule__RecordType__Group__2__Impl rule__RecordType__Group__3 ;
    public final void rule__RecordType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2818:1: ( rule__RecordType__Group__2__Impl rule__RecordType__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2819:2: rule__RecordType__Group__2__Impl rule__RecordType__Group__3
            {
            pushFollow(FOLLOW_rule__RecordType__Group__2__Impl_in_rule__RecordType__Group__25862);
            rule__RecordType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__3_in_rule__RecordType__Group__25865);
            rule__RecordType__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__2"


    // $ANTLR start "rule__RecordType__Group__2__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2826:1: rule__RecordType__Group__2__Impl : ( '{' ) ;
    public final void rule__RecordType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2830:1: ( ( '{' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2831:1: ( '{' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2831:1: ( '{' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2832:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__RecordType__Group__2__Impl5893); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__2__Impl"


    // $ANTLR start "rule__RecordType__Group__3"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2845:1: rule__RecordType__Group__3 : rule__RecordType__Group__3__Impl rule__RecordType__Group__4 ;
    public final void rule__RecordType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2849:1: ( rule__RecordType__Group__3__Impl rule__RecordType__Group__4 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2850:2: rule__RecordType__Group__3__Impl rule__RecordType__Group__4
            {
            pushFollow(FOLLOW_rule__RecordType__Group__3__Impl_in_rule__RecordType__Group__35924);
            rule__RecordType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__4_in_rule__RecordType__Group__35927);
            rule__RecordType__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__3"


    // $ANTLR start "rule__RecordType__Group__3__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2857:1: rule__RecordType__Group__3__Impl : ( ( rule__RecordType__FieldsAssignment_3 )* ) ;
    public final void rule__RecordType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2861:1: ( ( ( rule__RecordType__FieldsAssignment_3 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2862:1: ( ( rule__RecordType__FieldsAssignment_3 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2862:1: ( ( rule__RecordType__FieldsAssignment_3 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2863:1: ( rule__RecordType__FieldsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getFieldsAssignment_3()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2864:1: ( rule__RecordType__FieldsAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||(LA25_0>=11 && LA25_0<=18)||(LA25_0>=22 && LA25_0<=24)||(LA25_0>=45 && LA25_0<=46)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2864:2: rule__RecordType__FieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__RecordType__FieldsAssignment_3_in_rule__RecordType__Group__3__Impl5954);
            	    rule__RecordType__FieldsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getFieldsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__3__Impl"


    // $ANTLR start "rule__RecordType__Group__4"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2874:1: rule__RecordType__Group__4 : rule__RecordType__Group__4__Impl ;
    public final void rule__RecordType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2878:1: ( rule__RecordType__Group__4__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2879:2: rule__RecordType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group__4__Impl_in_rule__RecordType__Group__45985);
            rule__RecordType__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__4"


    // $ANTLR start "rule__RecordType__Group__4__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2885:1: rule__RecordType__Group__4__Impl : ( '}' ) ;
    public final void rule__RecordType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2889:1: ( ( '}' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2890:1: ( '}' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2890:1: ( '}' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2891:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,36,FOLLOW_36_in_rule__RecordType__Group__4__Impl6013); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2914:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2918:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2919:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__06054);
            rule__Field__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__06057);
            rule__Field__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2926:1: rule__Field__Group__0__Impl : ( ( rule__Field__AnnotationsAssignment_0 )* ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2930:1: ( ( ( rule__Field__AnnotationsAssignment_0 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2931:1: ( ( rule__Field__AnnotationsAssignment_0 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2931:1: ( ( rule__Field__AnnotationsAssignment_0 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2932:1: ( rule__Field__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getAnnotationsAssignment_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2933:1: ( rule__Field__AnnotationsAssignment_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==46) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2933:2: rule__Field__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Field__AnnotationsAssignment_0_in_rule__Field__Group__0__Impl6084);
            	    rule__Field__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getAnnotationsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2943:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2947:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2948:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__16115);
            rule__Field__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__16118);
            rule__Field__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2955:1: rule__Field__Group__1__Impl : ( ( rule__Field__TypeAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2959:1: ( ( ( rule__Field__TypeAssignment_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2960:1: ( ( rule__Field__TypeAssignment_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2960:1: ( ( rule__Field__TypeAssignment_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2961:1: ( rule__Field__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2962:1: ( rule__Field__TypeAssignment_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2962:2: rule__Field__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__TypeAssignment_1_in_rule__Field__Group__1__Impl6145);
            rule__Field__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2972:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2976:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2977:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__26175);
            rule__Field__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__26178);
            rule__Field__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2984:1: rule__Field__Group__2__Impl : ( ( rule__Field__NameAnnotationsAssignment_2 )* ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2988:1: ( ( ( rule__Field__NameAnnotationsAssignment_2 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2989:1: ( ( rule__Field__NameAnnotationsAssignment_2 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2989:1: ( ( rule__Field__NameAnnotationsAssignment_2 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2990:1: ( rule__Field__NameAnnotationsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAnnotationsAssignment_2()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2991:1: ( rule__Field__NameAnnotationsAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==46) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:2991:2: rule__Field__NameAnnotationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Field__NameAnnotationsAssignment_2_in_rule__Field__Group__2__Impl6205);
            	    rule__Field__NameAnnotationsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameAnnotationsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3001:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3005:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3006:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__36236);
            rule__Field__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__36239);
            rule__Field__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3013:1: rule__Field__Group__3__Impl : ( ( rule__Field__NameAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3017:1: ( ( ( rule__Field__NameAssignment_3 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3018:1: ( ( rule__Field__NameAssignment_3 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3018:1: ( ( rule__Field__NameAssignment_3 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3019:1: ( rule__Field__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAssignment_3()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3020:1: ( rule__Field__NameAssignment_3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3020:2: rule__Field__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_3_in_rule__Field__Group__3__Impl6266);
            rule__Field__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3030:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3034:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3035:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__46296);
            rule__Field__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__5_in_rule__Field__Group__46299);
            rule__Field__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3042:1: rule__Field__Group__4__Impl : ( ( rule__Field__Group_4__0 )? ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3046:1: ( ( ( rule__Field__Group_4__0 )? ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3047:1: ( ( rule__Field__Group_4__0 )? )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3047:1: ( ( rule__Field__Group_4__0 )? )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3048:1: ( rule__Field__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup_4()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3049:1: ( rule__Field__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3049:2: rule__Field__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Field__Group_4__0_in_rule__Field__Group__4__Impl6326);
                    rule__Field__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__5"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3059:1: rule__Field__Group__5 : rule__Field__Group__5__Impl ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3063:1: ( rule__Field__Group__5__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3064:2: rule__Field__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__56357);
            rule__Field__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__5"


    // $ANTLR start "rule__Field__Group__5__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3070:1: rule__Field__Group__5__Impl : ( ';' ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3074:1: ( ( ';' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3075:1: ( ';' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3075:1: ( ';' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3076:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getSemicolonKeyword_5()); 
            }
            match(input,34,FOLLOW_34_in_rule__Field__Group__5__Impl6385); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__5__Impl"


    // $ANTLR start "rule__Field__Group_4__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3101:1: rule__Field__Group_4__0 : rule__Field__Group_4__0__Impl rule__Field__Group_4__1 ;
    public final void rule__Field__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3105:1: ( rule__Field__Group_4__0__Impl rule__Field__Group_4__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3106:2: rule__Field__Group_4__0__Impl rule__Field__Group_4__1
            {
            pushFollow(FOLLOW_rule__Field__Group_4__0__Impl_in_rule__Field__Group_4__06428);
            rule__Field__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group_4__1_in_rule__Field__Group_4__06431);
            rule__Field__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_4__0"


    // $ANTLR start "rule__Field__Group_4__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3113:1: rule__Field__Group_4__0__Impl : ( '=' ) ;
    public final void rule__Field__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3117:1: ( ( '=' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3118:1: ( '=' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3118:1: ( '=' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3119:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__Field__Group_4__0__Impl6459); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getEqualsSignKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_4__0__Impl"


    // $ANTLR start "rule__Field__Group_4__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3132:1: rule__Field__Group_4__1 : rule__Field__Group_4__1__Impl ;
    public final void rule__Field__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3136:1: ( rule__Field__Group_4__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3137:2: rule__Field__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_4__1__Impl_in_rule__Field__Group_4__16490);
            rule__Field__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_4__1"


    // $ANTLR start "rule__Field__Group_4__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3143:1: rule__Field__Group_4__1__Impl : ( ( rule__Field__DefaultAssignment_4_1 ) ) ;
    public final void rule__Field__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3147:1: ( ( ( rule__Field__DefaultAssignment_4_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3148:1: ( ( rule__Field__DefaultAssignment_4_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3148:1: ( ( rule__Field__DefaultAssignment_4_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3149:1: ( rule__Field__DefaultAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getDefaultAssignment_4_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3150:1: ( rule__Field__DefaultAssignment_4_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3150:2: rule__Field__DefaultAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Field__DefaultAssignment_4_1_in_rule__Field__Group_4__1__Impl6517);
            rule__Field__DefaultAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getDefaultAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_4__1__Impl"


    // $ANTLR start "rule__UnionFieldType__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3164:1: rule__UnionFieldType__Group__0 : rule__UnionFieldType__Group__0__Impl rule__UnionFieldType__Group__1 ;
    public final void rule__UnionFieldType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3168:1: ( rule__UnionFieldType__Group__0__Impl rule__UnionFieldType__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3169:2: rule__UnionFieldType__Group__0__Impl rule__UnionFieldType__Group__1
            {
            pushFollow(FOLLOW_rule__UnionFieldType__Group__0__Impl_in_rule__UnionFieldType__Group__06551);
            rule__UnionFieldType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnionFieldType__Group__1_in_rule__UnionFieldType__Group__06554);
            rule__UnionFieldType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionFieldType__Group__0"


    // $ANTLR start "rule__UnionFieldType__Group__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3176:1: rule__UnionFieldType__Group__0__Impl : ( 'union' ) ;
    public final void rule__UnionFieldType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3180:1: ( ( 'union' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3181:1: ( 'union' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3181:1: ( 'union' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3182:1: 'union'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeAccess().getUnionKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__UnionFieldType__Group__0__Impl6582); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionFieldTypeAccess().getUnionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionFieldType__Group__0__Impl"


    // $ANTLR start "rule__UnionFieldType__Group__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3195:1: rule__UnionFieldType__Group__1 : rule__UnionFieldType__Group__1__Impl rule__UnionFieldType__Group__2 ;
    public final void rule__UnionFieldType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3199:1: ( rule__UnionFieldType__Group__1__Impl rule__UnionFieldType__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3200:2: rule__UnionFieldType__Group__1__Impl rule__UnionFieldType__Group__2
            {
            pushFollow(FOLLOW_rule__UnionFieldType__Group__1__Impl_in_rule__UnionFieldType__Group__16613);
            rule__UnionFieldType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnionFieldType__Group__2_in_rule__UnionFieldType__Group__16616);
            rule__UnionFieldType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionFieldType__Group__1"


    // $ANTLR start "rule__UnionFieldType__Group__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3207:1: rule__UnionFieldType__Group__1__Impl : ( '{' ) ;
    public final void rule__UnionFieldType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3211:1: ( ( '{' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3212:1: ( '{' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3212:1: ( '{' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3213:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__UnionFieldType__Group__1__Impl6644); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionFieldTypeAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionFieldType__Group__1__Impl"


    // $ANTLR start "rule__UnionFieldType__Group__2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3226:1: rule__UnionFieldType__Group__2 : rule__UnionFieldType__Group__2__Impl rule__UnionFieldType__Group__3 ;
    public final void rule__UnionFieldType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3230:1: ( rule__UnionFieldType__Group__2__Impl rule__UnionFieldType__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3231:2: rule__UnionFieldType__Group__2__Impl rule__UnionFieldType__Group__3
            {
            pushFollow(FOLLOW_rule__UnionFieldType__Group__2__Impl_in_rule__UnionFieldType__Group__26675);
            rule__UnionFieldType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnionFieldType__Group__3_in_rule__UnionFieldType__Group__26678);
            rule__UnionFieldType__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionFieldType__Group__2"


    // $ANTLR start "rule__UnionFieldType__Group__2__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3238:1: rule__UnionFieldType__Group__2__Impl : ( ( rule__UnionFieldType__TypesAssignment_2 ) ) ;
    public final void rule__UnionFieldType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3242:1: ( ( ( rule__UnionFieldType__TypesAssignment_2 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3243:1: ( ( rule__UnionFieldType__TypesAssignment_2 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3243:1: ( ( rule__UnionFieldType__TypesAssignment_2 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3244:1: ( rule__UnionFieldType__TypesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeAccess().getTypesAssignment_2()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3245:1: ( rule__UnionFieldType__TypesAssignment_2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3245:2: rule__UnionFieldType__TypesAssignment_2
            {
            pushFollow(FOLLOW_rule__UnionFieldType__TypesAssignment_2_in_rule__UnionFieldType__Group__2__Impl6705);
            rule__UnionFieldType__TypesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionFieldTypeAccess().getTypesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionFieldType__Group__2__Impl"


    // $ANTLR start "rule__UnionFieldType__Group__3"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3255:1: rule__UnionFieldType__Group__3 : rule__UnionFieldType__Group__3__Impl rule__UnionFieldType__Group__4 ;
    public final void rule__UnionFieldType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3259:1: ( rule__UnionFieldType__Group__3__Impl rule__UnionFieldType__Group__4 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3260:2: rule__UnionFieldType__Group__3__Impl rule__UnionFieldType__Group__4
            {
            pushFollow(FOLLOW_rule__UnionFieldType__Group__3__Impl_in_rule__UnionFieldType__Group__36735);
            rule__UnionFieldType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnionFieldType__Group__4_in_rule__UnionFieldType__Group__36738);
            rule__UnionFieldType__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionFieldType__Group__3"


    // $ANTLR start "rule__UnionFieldType__Group__3__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3267:1: rule__UnionFieldType__Group__3__Impl : ( ( rule__UnionFieldType__Group_3__0 )* ) ;
    public final void rule__UnionFieldType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3271:1: ( ( ( rule__UnionFieldType__Group_3__0 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3272:1: ( ( rule__UnionFieldType__Group_3__0 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3272:1: ( ( rule__UnionFieldType__Group_3__0 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3273:1: ( rule__UnionFieldType__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeAccess().getGroup_3()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3274:1: ( rule__UnionFieldType__Group_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==39) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3274:2: rule__UnionFieldType__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__UnionFieldType__Group_3__0_in_rule__UnionFieldType__Group__3__Impl6765);
            	    rule__UnionFieldType__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionFieldTypeAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionFieldType__Group__3__Impl"


    // $ANTLR start "rule__UnionFieldType__Group__4"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3284:1: rule__UnionFieldType__Group__4 : rule__UnionFieldType__Group__4__Impl ;
    public final void rule__UnionFieldType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3288:1: ( rule__UnionFieldType__Group__4__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3289:2: rule__UnionFieldType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__UnionFieldType__Group__4__Impl_in_rule__UnionFieldType__Group__46796);
            rule__UnionFieldType__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionFieldType__Group__4"


    // $ANTLR start "rule__UnionFieldType__Group__4__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3295:1: rule__UnionFieldType__Group__4__Impl : ( '}' ) ;
    public final void rule__UnionFieldType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3299:1: ( ( '}' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3300:1: ( '}' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3300:1: ( '}' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3301:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,36,FOLLOW_36_in_rule__UnionFieldType__Group__4__Impl6824); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionFieldTypeAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionFieldType__Group__4__Impl"


    // $ANTLR start "rule__UnionFieldType__Group_3__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3324:1: rule__UnionFieldType__Group_3__0 : rule__UnionFieldType__Group_3__0__Impl rule__UnionFieldType__Group_3__1 ;
    public final void rule__UnionFieldType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3328:1: ( rule__UnionFieldType__Group_3__0__Impl rule__UnionFieldType__Group_3__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3329:2: rule__UnionFieldType__Group_3__0__Impl rule__UnionFieldType__Group_3__1
            {
            pushFollow(FOLLOW_rule__UnionFieldType__Group_3__0__Impl_in_rule__UnionFieldType__Group_3__06865);
            rule__UnionFieldType__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnionFieldType__Group_3__1_in_rule__UnionFieldType__Group_3__06868);
            rule__UnionFieldType__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionFieldType__Group_3__0"


    // $ANTLR start "rule__UnionFieldType__Group_3__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3336:1: rule__UnionFieldType__Group_3__0__Impl : ( ',' ) ;
    public final void rule__UnionFieldType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3340:1: ( ( ',' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3341:1: ( ',' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3341:1: ( ',' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3342:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeAccess().getCommaKeyword_3_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__UnionFieldType__Group_3__0__Impl6896); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionFieldTypeAccess().getCommaKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionFieldType__Group_3__0__Impl"


    // $ANTLR start "rule__UnionFieldType__Group_3__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3355:1: rule__UnionFieldType__Group_3__1 : rule__UnionFieldType__Group_3__1__Impl ;
    public final void rule__UnionFieldType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3359:1: ( rule__UnionFieldType__Group_3__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3360:2: rule__UnionFieldType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__UnionFieldType__Group_3__1__Impl_in_rule__UnionFieldType__Group_3__16927);
            rule__UnionFieldType__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionFieldType__Group_3__1"


    // $ANTLR start "rule__UnionFieldType__Group_3__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3366:1: rule__UnionFieldType__Group_3__1__Impl : ( ( rule__UnionFieldType__TypesAssignment_3_1 ) ) ;
    public final void rule__UnionFieldType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3370:1: ( ( ( rule__UnionFieldType__TypesAssignment_3_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3371:1: ( ( rule__UnionFieldType__TypesAssignment_3_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3371:1: ( ( rule__UnionFieldType__TypesAssignment_3_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3372:1: ( rule__UnionFieldType__TypesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeAccess().getTypesAssignment_3_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3373:1: ( rule__UnionFieldType__TypesAssignment_3_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3373:2: rule__UnionFieldType__TypesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__UnionFieldType__TypesAssignment_3_1_in_rule__UnionFieldType__Group_3__1__Impl6954);
            rule__UnionFieldType__TypesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionFieldTypeAccess().getTypesAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionFieldType__Group_3__1__Impl"


    // $ANTLR start "rule__ArrayFieldType__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3387:1: rule__ArrayFieldType__Group__0 : rule__ArrayFieldType__Group__0__Impl rule__ArrayFieldType__Group__1 ;
    public final void rule__ArrayFieldType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3391:1: ( rule__ArrayFieldType__Group__0__Impl rule__ArrayFieldType__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3392:2: rule__ArrayFieldType__Group__0__Impl rule__ArrayFieldType__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayFieldType__Group__0__Impl_in_rule__ArrayFieldType__Group__06988);
            rule__ArrayFieldType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayFieldType__Group__1_in_rule__ArrayFieldType__Group__06991);
            rule__ArrayFieldType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayFieldType__Group__0"


    // $ANTLR start "rule__ArrayFieldType__Group__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3399:1: rule__ArrayFieldType__Group__0__Impl : ( 'array' ) ;
    public final void rule__ArrayFieldType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3403:1: ( ( 'array' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3404:1: ( 'array' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3404:1: ( 'array' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3405:1: 'array'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayFieldTypeAccess().getArrayKeyword_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__ArrayFieldType__Group__0__Impl7019); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayFieldTypeAccess().getArrayKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayFieldType__Group__0__Impl"


    // $ANTLR start "rule__ArrayFieldType__Group__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3418:1: rule__ArrayFieldType__Group__1 : rule__ArrayFieldType__Group__1__Impl rule__ArrayFieldType__Group__2 ;
    public final void rule__ArrayFieldType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3422:1: ( rule__ArrayFieldType__Group__1__Impl rule__ArrayFieldType__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3423:2: rule__ArrayFieldType__Group__1__Impl rule__ArrayFieldType__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayFieldType__Group__1__Impl_in_rule__ArrayFieldType__Group__17050);
            rule__ArrayFieldType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayFieldType__Group__2_in_rule__ArrayFieldType__Group__17053);
            rule__ArrayFieldType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayFieldType__Group__1"


    // $ANTLR start "rule__ArrayFieldType__Group__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3430:1: rule__ArrayFieldType__Group__1__Impl : ( '<' ) ;
    public final void rule__ArrayFieldType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3434:1: ( ( '<' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3435:1: ( '<' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3435:1: ( '<' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3436:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayFieldTypeAccess().getLessThanSignKeyword_1()); 
            }
            match(input,41,FOLLOW_41_in_rule__ArrayFieldType__Group__1__Impl7081); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayFieldTypeAccess().getLessThanSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayFieldType__Group__1__Impl"


    // $ANTLR start "rule__ArrayFieldType__Group__2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3449:1: rule__ArrayFieldType__Group__2 : rule__ArrayFieldType__Group__2__Impl rule__ArrayFieldType__Group__3 ;
    public final void rule__ArrayFieldType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3453:1: ( rule__ArrayFieldType__Group__2__Impl rule__ArrayFieldType__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3454:2: rule__ArrayFieldType__Group__2__Impl rule__ArrayFieldType__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayFieldType__Group__2__Impl_in_rule__ArrayFieldType__Group__27112);
            rule__ArrayFieldType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayFieldType__Group__3_in_rule__ArrayFieldType__Group__27115);
            rule__ArrayFieldType__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayFieldType__Group__2"


    // $ANTLR start "rule__ArrayFieldType__Group__2__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3461:1: rule__ArrayFieldType__Group__2__Impl : ( ( rule__ArrayFieldType__AnnotationAssignment_2 )? ) ;
    public final void rule__ArrayFieldType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3465:1: ( ( ( rule__ArrayFieldType__AnnotationAssignment_2 )? ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3466:1: ( ( rule__ArrayFieldType__AnnotationAssignment_2 )? )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3466:1: ( ( rule__ArrayFieldType__AnnotationAssignment_2 )? )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3467:1: ( rule__ArrayFieldType__AnnotationAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayFieldTypeAccess().getAnnotationAssignment_2()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3468:1: ( rule__ArrayFieldType__AnnotationAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==46) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3468:2: rule__ArrayFieldType__AnnotationAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ArrayFieldType__AnnotationAssignment_2_in_rule__ArrayFieldType__Group__2__Impl7142);
                    rule__ArrayFieldType__AnnotationAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayFieldTypeAccess().getAnnotationAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayFieldType__Group__2__Impl"


    // $ANTLR start "rule__ArrayFieldType__Group__3"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3478:1: rule__ArrayFieldType__Group__3 : rule__ArrayFieldType__Group__3__Impl rule__ArrayFieldType__Group__4 ;
    public final void rule__ArrayFieldType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3482:1: ( rule__ArrayFieldType__Group__3__Impl rule__ArrayFieldType__Group__4 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3483:2: rule__ArrayFieldType__Group__3__Impl rule__ArrayFieldType__Group__4
            {
            pushFollow(FOLLOW_rule__ArrayFieldType__Group__3__Impl_in_rule__ArrayFieldType__Group__37173);
            rule__ArrayFieldType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayFieldType__Group__4_in_rule__ArrayFieldType__Group__37176);
            rule__ArrayFieldType__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayFieldType__Group__3"


    // $ANTLR start "rule__ArrayFieldType__Group__3__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3490:1: rule__ArrayFieldType__Group__3__Impl : ( ( rule__ArrayFieldType__TypeAssignment_3 ) ) ;
    public final void rule__ArrayFieldType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3494:1: ( ( ( rule__ArrayFieldType__TypeAssignment_3 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3495:1: ( ( rule__ArrayFieldType__TypeAssignment_3 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3495:1: ( ( rule__ArrayFieldType__TypeAssignment_3 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3496:1: ( rule__ArrayFieldType__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayFieldTypeAccess().getTypeAssignment_3()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3497:1: ( rule__ArrayFieldType__TypeAssignment_3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3497:2: rule__ArrayFieldType__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__ArrayFieldType__TypeAssignment_3_in_rule__ArrayFieldType__Group__3__Impl7203);
            rule__ArrayFieldType__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayFieldTypeAccess().getTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayFieldType__Group__3__Impl"


    // $ANTLR start "rule__ArrayFieldType__Group__4"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3507:1: rule__ArrayFieldType__Group__4 : rule__ArrayFieldType__Group__4__Impl ;
    public final void rule__ArrayFieldType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3511:1: ( rule__ArrayFieldType__Group__4__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3512:2: rule__ArrayFieldType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ArrayFieldType__Group__4__Impl_in_rule__ArrayFieldType__Group__47233);
            rule__ArrayFieldType__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayFieldType__Group__4"


    // $ANTLR start "rule__ArrayFieldType__Group__4__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3518:1: rule__ArrayFieldType__Group__4__Impl : ( '>' ) ;
    public final void rule__ArrayFieldType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3522:1: ( ( '>' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3523:1: ( '>' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3523:1: ( '>' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3524:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayFieldTypeAccess().getGreaterThanSignKeyword_4()); 
            }
            match(input,42,FOLLOW_42_in_rule__ArrayFieldType__Group__4__Impl7261); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayFieldTypeAccess().getGreaterThanSignKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayFieldType__Group__4__Impl"


    // $ANTLR start "rule__MapFieldType__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3547:1: rule__MapFieldType__Group__0 : rule__MapFieldType__Group__0__Impl rule__MapFieldType__Group__1 ;
    public final void rule__MapFieldType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3551:1: ( rule__MapFieldType__Group__0__Impl rule__MapFieldType__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3552:2: rule__MapFieldType__Group__0__Impl rule__MapFieldType__Group__1
            {
            pushFollow(FOLLOW_rule__MapFieldType__Group__0__Impl_in_rule__MapFieldType__Group__07302);
            rule__MapFieldType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MapFieldType__Group__1_in_rule__MapFieldType__Group__07305);
            rule__MapFieldType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapFieldType__Group__0"


    // $ANTLR start "rule__MapFieldType__Group__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3559:1: rule__MapFieldType__Group__0__Impl : ( 'map' ) ;
    public final void rule__MapFieldType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3563:1: ( ( 'map' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3564:1: ( 'map' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3564:1: ( 'map' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3565:1: 'map'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapFieldTypeAccess().getMapKeyword_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__MapFieldType__Group__0__Impl7333); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapFieldTypeAccess().getMapKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapFieldType__Group__0__Impl"


    // $ANTLR start "rule__MapFieldType__Group__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3578:1: rule__MapFieldType__Group__1 : rule__MapFieldType__Group__1__Impl rule__MapFieldType__Group__2 ;
    public final void rule__MapFieldType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3582:1: ( rule__MapFieldType__Group__1__Impl rule__MapFieldType__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3583:2: rule__MapFieldType__Group__1__Impl rule__MapFieldType__Group__2
            {
            pushFollow(FOLLOW_rule__MapFieldType__Group__1__Impl_in_rule__MapFieldType__Group__17364);
            rule__MapFieldType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MapFieldType__Group__2_in_rule__MapFieldType__Group__17367);
            rule__MapFieldType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapFieldType__Group__1"


    // $ANTLR start "rule__MapFieldType__Group__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3590:1: rule__MapFieldType__Group__1__Impl : ( '<' ) ;
    public final void rule__MapFieldType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3594:1: ( ( '<' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3595:1: ( '<' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3595:1: ( '<' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3596:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapFieldTypeAccess().getLessThanSignKeyword_1()); 
            }
            match(input,41,FOLLOW_41_in_rule__MapFieldType__Group__1__Impl7395); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapFieldTypeAccess().getLessThanSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapFieldType__Group__1__Impl"


    // $ANTLR start "rule__MapFieldType__Group__2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3609:1: rule__MapFieldType__Group__2 : rule__MapFieldType__Group__2__Impl rule__MapFieldType__Group__3 ;
    public final void rule__MapFieldType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3613:1: ( rule__MapFieldType__Group__2__Impl rule__MapFieldType__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3614:2: rule__MapFieldType__Group__2__Impl rule__MapFieldType__Group__3
            {
            pushFollow(FOLLOW_rule__MapFieldType__Group__2__Impl_in_rule__MapFieldType__Group__27426);
            rule__MapFieldType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MapFieldType__Group__3_in_rule__MapFieldType__Group__27429);
            rule__MapFieldType__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapFieldType__Group__2"


    // $ANTLR start "rule__MapFieldType__Group__2__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3621:1: rule__MapFieldType__Group__2__Impl : ( ( rule__MapFieldType__AnnotationAssignment_2 )? ) ;
    public final void rule__MapFieldType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3625:1: ( ( ( rule__MapFieldType__AnnotationAssignment_2 )? ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3626:1: ( ( rule__MapFieldType__AnnotationAssignment_2 )? )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3626:1: ( ( rule__MapFieldType__AnnotationAssignment_2 )? )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3627:1: ( rule__MapFieldType__AnnotationAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapFieldTypeAccess().getAnnotationAssignment_2()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3628:1: ( rule__MapFieldType__AnnotationAssignment_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3628:2: rule__MapFieldType__AnnotationAssignment_2
                    {
                    pushFollow(FOLLOW_rule__MapFieldType__AnnotationAssignment_2_in_rule__MapFieldType__Group__2__Impl7456);
                    rule__MapFieldType__AnnotationAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapFieldTypeAccess().getAnnotationAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapFieldType__Group__2__Impl"


    // $ANTLR start "rule__MapFieldType__Group__3"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3638:1: rule__MapFieldType__Group__3 : rule__MapFieldType__Group__3__Impl rule__MapFieldType__Group__4 ;
    public final void rule__MapFieldType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3642:1: ( rule__MapFieldType__Group__3__Impl rule__MapFieldType__Group__4 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3643:2: rule__MapFieldType__Group__3__Impl rule__MapFieldType__Group__4
            {
            pushFollow(FOLLOW_rule__MapFieldType__Group__3__Impl_in_rule__MapFieldType__Group__37487);
            rule__MapFieldType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MapFieldType__Group__4_in_rule__MapFieldType__Group__37490);
            rule__MapFieldType__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapFieldType__Group__3"


    // $ANTLR start "rule__MapFieldType__Group__3__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3650:1: rule__MapFieldType__Group__3__Impl : ( ( rule__MapFieldType__TypeAssignment_3 ) ) ;
    public final void rule__MapFieldType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3654:1: ( ( ( rule__MapFieldType__TypeAssignment_3 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3655:1: ( ( rule__MapFieldType__TypeAssignment_3 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3655:1: ( ( rule__MapFieldType__TypeAssignment_3 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3656:1: ( rule__MapFieldType__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapFieldTypeAccess().getTypeAssignment_3()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3657:1: ( rule__MapFieldType__TypeAssignment_3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3657:2: rule__MapFieldType__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__MapFieldType__TypeAssignment_3_in_rule__MapFieldType__Group__3__Impl7517);
            rule__MapFieldType__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapFieldTypeAccess().getTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapFieldType__Group__3__Impl"


    // $ANTLR start "rule__MapFieldType__Group__4"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3667:1: rule__MapFieldType__Group__4 : rule__MapFieldType__Group__4__Impl ;
    public final void rule__MapFieldType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3671:1: ( rule__MapFieldType__Group__4__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3672:2: rule__MapFieldType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MapFieldType__Group__4__Impl_in_rule__MapFieldType__Group__47547);
            rule__MapFieldType__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapFieldType__Group__4"


    // $ANTLR start "rule__MapFieldType__Group__4__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3678:1: rule__MapFieldType__Group__4__Impl : ( '>' ) ;
    public final void rule__MapFieldType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3682:1: ( ( '>' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3683:1: ( '>' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3683:1: ( '>' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3684:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapFieldTypeAccess().getGreaterThanSignKeyword_4()); 
            }
            match(input,42,FOLLOW_42_in_rule__MapFieldType__Group__4__Impl7575); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapFieldTypeAccess().getGreaterThanSignKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapFieldType__Group__4__Impl"


    // $ANTLR start "rule__FixedType__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3707:1: rule__FixedType__Group__0 : rule__FixedType__Group__0__Impl rule__FixedType__Group__1 ;
    public final void rule__FixedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3711:1: ( rule__FixedType__Group__0__Impl rule__FixedType__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3712:2: rule__FixedType__Group__0__Impl rule__FixedType__Group__1
            {
            pushFollow(FOLLOW_rule__FixedType__Group__0__Impl_in_rule__FixedType__Group__07616);
            rule__FixedType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FixedType__Group__1_in_rule__FixedType__Group__07619);
            rule__FixedType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__0"


    // $ANTLR start "rule__FixedType__Group__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3719:1: rule__FixedType__Group__0__Impl : ( 'fixed' ) ;
    public final void rule__FixedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3723:1: ( ( 'fixed' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3724:1: ( 'fixed' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3724:1: ( 'fixed' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3725:1: 'fixed'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixedTypeAccess().getFixedKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__FixedType__Group__0__Impl7647); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixedTypeAccess().getFixedKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__0__Impl"


    // $ANTLR start "rule__FixedType__Group__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3738:1: rule__FixedType__Group__1 : rule__FixedType__Group__1__Impl rule__FixedType__Group__2 ;
    public final void rule__FixedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3742:1: ( rule__FixedType__Group__1__Impl rule__FixedType__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3743:2: rule__FixedType__Group__1__Impl rule__FixedType__Group__2
            {
            pushFollow(FOLLOW_rule__FixedType__Group__1__Impl_in_rule__FixedType__Group__17678);
            rule__FixedType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FixedType__Group__2_in_rule__FixedType__Group__17681);
            rule__FixedType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__1"


    // $ANTLR start "rule__FixedType__Group__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3750:1: rule__FixedType__Group__1__Impl : ( ( rule__FixedType__NameAssignment_1 ) ) ;
    public final void rule__FixedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3754:1: ( ( ( rule__FixedType__NameAssignment_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3755:1: ( ( rule__FixedType__NameAssignment_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3755:1: ( ( rule__FixedType__NameAssignment_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3756:1: ( rule__FixedType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixedTypeAccess().getNameAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3757:1: ( rule__FixedType__NameAssignment_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3757:2: rule__FixedType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FixedType__NameAssignment_1_in_rule__FixedType__Group__1__Impl7708);
            rule__FixedType__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixedTypeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__1__Impl"


    // $ANTLR start "rule__FixedType__Group__2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3767:1: rule__FixedType__Group__2 : rule__FixedType__Group__2__Impl rule__FixedType__Group__3 ;
    public final void rule__FixedType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3771:1: ( rule__FixedType__Group__2__Impl rule__FixedType__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3772:2: rule__FixedType__Group__2__Impl rule__FixedType__Group__3
            {
            pushFollow(FOLLOW_rule__FixedType__Group__2__Impl_in_rule__FixedType__Group__27738);
            rule__FixedType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FixedType__Group__3_in_rule__FixedType__Group__27741);
            rule__FixedType__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__2"


    // $ANTLR start "rule__FixedType__Group__2__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3779:1: rule__FixedType__Group__2__Impl : ( '(' ) ;
    public final void rule__FixedType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3783:1: ( ( '(' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3784:1: ( '(' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3784:1: ( '(' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3785:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixedTypeAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__FixedType__Group__2__Impl7769); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixedTypeAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__2__Impl"


    // $ANTLR start "rule__FixedType__Group__3"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3798:1: rule__FixedType__Group__3 : rule__FixedType__Group__3__Impl rule__FixedType__Group__4 ;
    public final void rule__FixedType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3802:1: ( rule__FixedType__Group__3__Impl rule__FixedType__Group__4 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3803:2: rule__FixedType__Group__3__Impl rule__FixedType__Group__4
            {
            pushFollow(FOLLOW_rule__FixedType__Group__3__Impl_in_rule__FixedType__Group__37800);
            rule__FixedType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FixedType__Group__4_in_rule__FixedType__Group__37803);
            rule__FixedType__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__3"


    // $ANTLR start "rule__FixedType__Group__3__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3810:1: rule__FixedType__Group__3__Impl : ( ( rule__FixedType__SizeAssignment_3 ) ) ;
    public final void rule__FixedType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3814:1: ( ( ( rule__FixedType__SizeAssignment_3 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3815:1: ( ( rule__FixedType__SizeAssignment_3 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3815:1: ( ( rule__FixedType__SizeAssignment_3 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3816:1: ( rule__FixedType__SizeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixedTypeAccess().getSizeAssignment_3()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3817:1: ( rule__FixedType__SizeAssignment_3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3817:2: rule__FixedType__SizeAssignment_3
            {
            pushFollow(FOLLOW_rule__FixedType__SizeAssignment_3_in_rule__FixedType__Group__3__Impl7830);
            rule__FixedType__SizeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixedTypeAccess().getSizeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__3__Impl"


    // $ANTLR start "rule__FixedType__Group__4"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3827:1: rule__FixedType__Group__4 : rule__FixedType__Group__4__Impl rule__FixedType__Group__5 ;
    public final void rule__FixedType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3831:1: ( rule__FixedType__Group__4__Impl rule__FixedType__Group__5 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3832:2: rule__FixedType__Group__4__Impl rule__FixedType__Group__5
            {
            pushFollow(FOLLOW_rule__FixedType__Group__4__Impl_in_rule__FixedType__Group__47860);
            rule__FixedType__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FixedType__Group__5_in_rule__FixedType__Group__47863);
            rule__FixedType__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__4"


    // $ANTLR start "rule__FixedType__Group__4__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3839:1: rule__FixedType__Group__4__Impl : ( ')' ) ;
    public final void rule__FixedType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3843:1: ( ( ')' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3844:1: ( ')' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3844:1: ( ')' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3845:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixedTypeAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,38,FOLLOW_38_in_rule__FixedType__Group__4__Impl7891); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixedTypeAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__4__Impl"


    // $ANTLR start "rule__FixedType__Group__5"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3858:1: rule__FixedType__Group__5 : rule__FixedType__Group__5__Impl ;
    public final void rule__FixedType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3862:1: ( rule__FixedType__Group__5__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3863:2: rule__FixedType__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__FixedType__Group__5__Impl_in_rule__FixedType__Group__57922);
            rule__FixedType__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__5"


    // $ANTLR start "rule__FixedType__Group__5__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3869:1: rule__FixedType__Group__5__Impl : ( ';' ) ;
    public final void rule__FixedType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3873:1: ( ( ';' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3874:1: ( ';' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3874:1: ( ';' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3875:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixedTypeAccess().getSemicolonKeyword_5()); 
            }
            match(input,34,FOLLOW_34_in_rule__FixedType__Group__5__Impl7950); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixedTypeAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__5__Impl"


    // $ANTLR start "rule__EnumType__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3900:1: rule__EnumType__Group__0 : rule__EnumType__Group__0__Impl rule__EnumType__Group__1 ;
    public final void rule__EnumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3904:1: ( rule__EnumType__Group__0__Impl rule__EnumType__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3905:2: rule__EnumType__Group__0__Impl rule__EnumType__Group__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group__0__Impl_in_rule__EnumType__Group__07993);
            rule__EnumType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumType__Group__1_in_rule__EnumType__Group__07996);
            rule__EnumType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__0"


    // $ANTLR start "rule__EnumType__Group__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3912:1: rule__EnumType__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3916:1: ( ( 'enum' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3917:1: ( 'enum' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3917:1: ( 'enum' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3918:1: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getEnumKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__EnumType__Group__0__Impl8024); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumTypeAccess().getEnumKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__0__Impl"


    // $ANTLR start "rule__EnumType__Group__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3931:1: rule__EnumType__Group__1 : rule__EnumType__Group__1__Impl rule__EnumType__Group__2 ;
    public final void rule__EnumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3935:1: ( rule__EnumType__Group__1__Impl rule__EnumType__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3936:2: rule__EnumType__Group__1__Impl rule__EnumType__Group__2
            {
            pushFollow(FOLLOW_rule__EnumType__Group__1__Impl_in_rule__EnumType__Group__18055);
            rule__EnumType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumType__Group__2_in_rule__EnumType__Group__18058);
            rule__EnumType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__1"


    // $ANTLR start "rule__EnumType__Group__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3943:1: rule__EnumType__Group__1__Impl : ( ( rule__EnumType__NameAssignment_1 ) ) ;
    public final void rule__EnumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3947:1: ( ( ( rule__EnumType__NameAssignment_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3948:1: ( ( rule__EnumType__NameAssignment_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3948:1: ( ( rule__EnumType__NameAssignment_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3949:1: ( rule__EnumType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getNameAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3950:1: ( rule__EnumType__NameAssignment_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3950:2: rule__EnumType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumType__NameAssignment_1_in_rule__EnumType__Group__1__Impl8085);
            rule__EnumType__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumTypeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__1__Impl"


    // $ANTLR start "rule__EnumType__Group__2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3960:1: rule__EnumType__Group__2 : rule__EnumType__Group__2__Impl rule__EnumType__Group__3 ;
    public final void rule__EnumType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3964:1: ( rule__EnumType__Group__2__Impl rule__EnumType__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3965:2: rule__EnumType__Group__2__Impl rule__EnumType__Group__3
            {
            pushFollow(FOLLOW_rule__EnumType__Group__2__Impl_in_rule__EnumType__Group__28115);
            rule__EnumType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumType__Group__3_in_rule__EnumType__Group__28118);
            rule__EnumType__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__2"


    // $ANTLR start "rule__EnumType__Group__2__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3972:1: rule__EnumType__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3976:1: ( ( '{' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3977:1: ( '{' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3977:1: ( '{' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3978:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__EnumType__Group__2__Impl8146); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__2__Impl"


    // $ANTLR start "rule__EnumType__Group__3"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3991:1: rule__EnumType__Group__3 : rule__EnumType__Group__3__Impl rule__EnumType__Group__4 ;
    public final void rule__EnumType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3995:1: ( rule__EnumType__Group__3__Impl rule__EnumType__Group__4 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:3996:2: rule__EnumType__Group__3__Impl rule__EnumType__Group__4
            {
            pushFollow(FOLLOW_rule__EnumType__Group__3__Impl_in_rule__EnumType__Group__38177);
            rule__EnumType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumType__Group__4_in_rule__EnumType__Group__38180);
            rule__EnumType__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__3"


    // $ANTLR start "rule__EnumType__Group__3__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4003:1: rule__EnumType__Group__3__Impl : ( ( rule__EnumType__LiteralsAssignment_3 ) ) ;
    public final void rule__EnumType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4007:1: ( ( ( rule__EnumType__LiteralsAssignment_3 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4008:1: ( ( rule__EnumType__LiteralsAssignment_3 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4008:1: ( ( rule__EnumType__LiteralsAssignment_3 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4009:1: ( rule__EnumType__LiteralsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getLiteralsAssignment_3()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4010:1: ( rule__EnumType__LiteralsAssignment_3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4010:2: rule__EnumType__LiteralsAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumType__LiteralsAssignment_3_in_rule__EnumType__Group__3__Impl8207);
            rule__EnumType__LiteralsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumTypeAccess().getLiteralsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__3__Impl"


    // $ANTLR start "rule__EnumType__Group__4"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4020:1: rule__EnumType__Group__4 : rule__EnumType__Group__4__Impl rule__EnumType__Group__5 ;
    public final void rule__EnumType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4024:1: ( rule__EnumType__Group__4__Impl rule__EnumType__Group__5 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4025:2: rule__EnumType__Group__4__Impl rule__EnumType__Group__5
            {
            pushFollow(FOLLOW_rule__EnumType__Group__4__Impl_in_rule__EnumType__Group__48237);
            rule__EnumType__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumType__Group__5_in_rule__EnumType__Group__48240);
            rule__EnumType__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__4"


    // $ANTLR start "rule__EnumType__Group__4__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4032:1: rule__EnumType__Group__4__Impl : ( ( rule__EnumType__Group_4__0 )* ) ;
    public final void rule__EnumType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4036:1: ( ( ( rule__EnumType__Group_4__0 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4037:1: ( ( rule__EnumType__Group_4__0 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4037:1: ( ( rule__EnumType__Group_4__0 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4038:1: ( rule__EnumType__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getGroup_4()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4039:1: ( rule__EnumType__Group_4__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==39) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4039:2: rule__EnumType__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumType__Group_4__0_in_rule__EnumType__Group__4__Impl8267);
            	    rule__EnumType__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumTypeAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__4__Impl"


    // $ANTLR start "rule__EnumType__Group__5"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4049:1: rule__EnumType__Group__5 : rule__EnumType__Group__5__Impl ;
    public final void rule__EnumType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4053:1: ( rule__EnumType__Group__5__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4054:2: rule__EnumType__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group__5__Impl_in_rule__EnumType__Group__58298);
            rule__EnumType__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__5"


    // $ANTLR start "rule__EnumType__Group__5__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4060:1: rule__EnumType__Group__5__Impl : ( '}' ) ;
    public final void rule__EnumType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4064:1: ( ( '}' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4065:1: ( '}' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4065:1: ( '}' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4066:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,36,FOLLOW_36_in_rule__EnumType__Group__5__Impl8326); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__5__Impl"


    // $ANTLR start "rule__EnumType__Group_4__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4091:1: rule__EnumType__Group_4__0 : rule__EnumType__Group_4__0__Impl rule__EnumType__Group_4__1 ;
    public final void rule__EnumType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4095:1: ( rule__EnumType__Group_4__0__Impl rule__EnumType__Group_4__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4096:2: rule__EnumType__Group_4__0__Impl rule__EnumType__Group_4__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group_4__0__Impl_in_rule__EnumType__Group_4__08369);
            rule__EnumType__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumType__Group_4__1_in_rule__EnumType__Group_4__08372);
            rule__EnumType__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_4__0"


    // $ANTLR start "rule__EnumType__Group_4__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4103:1: rule__EnumType__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EnumType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4107:1: ( ( ',' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4108:1: ( ',' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4108:1: ( ',' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4109:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getCommaKeyword_4_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__EnumType__Group_4__0__Impl8400); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumTypeAccess().getCommaKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_4__0__Impl"


    // $ANTLR start "rule__EnumType__Group_4__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4122:1: rule__EnumType__Group_4__1 : rule__EnumType__Group_4__1__Impl ;
    public final void rule__EnumType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4126:1: ( rule__EnumType__Group_4__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4127:2: rule__EnumType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group_4__1__Impl_in_rule__EnumType__Group_4__18431);
            rule__EnumType__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_4__1"


    // $ANTLR start "rule__EnumType__Group_4__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4133:1: rule__EnumType__Group_4__1__Impl : ( ( rule__EnumType__LiteralsAssignment_4_1 ) ) ;
    public final void rule__EnumType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4137:1: ( ( ( rule__EnumType__LiteralsAssignment_4_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4138:1: ( ( rule__EnumType__LiteralsAssignment_4_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4138:1: ( ( rule__EnumType__LiteralsAssignment_4_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4139:1: ( rule__EnumType__LiteralsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getLiteralsAssignment_4_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4140:1: ( rule__EnumType__LiteralsAssignment_4_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4140:2: rule__EnumType__LiteralsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__EnumType__LiteralsAssignment_4_1_in_rule__EnumType__Group_4__1__Impl8458);
            rule__EnumType__LiteralsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumTypeAccess().getLiteralsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_4__1__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4154:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4158:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4159:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__08492);
            rule__Annotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__08495);
            rule__Annotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4166:1: rule__Annotation__Group__0__Impl : ( ( rule__Annotation__NameAssignment_0 ) ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4170:1: ( ( ( rule__Annotation__NameAssignment_0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4171:1: ( ( rule__Annotation__NameAssignment_0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4171:1: ( ( rule__Annotation__NameAssignment_0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4172:1: ( rule__Annotation__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameAssignment_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4173:1: ( rule__Annotation__NameAssignment_0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4173:2: rule__Annotation__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Annotation__NameAssignment_0_in_rule__Annotation__Group__0__Impl8522);
            rule__Annotation__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0__Impl"


    // $ANTLR start "rule__Annotation__Group__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4183:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4187:1: ( rule__Annotation__Group__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4188:2: rule__Annotation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__18552);
            rule__Annotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4194:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__Group_1__0 )? ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4198:1: ( ( ( rule__Annotation__Group_1__0 )? ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4199:1: ( ( rule__Annotation__Group_1__0 )? )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4199:1: ( ( rule__Annotation__Group_1__0 )? )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4200:1: ( rule__Annotation__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4201:1: ( rule__Annotation__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4201:2: rule__Annotation__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Annotation__Group_1__0_in_rule__Annotation__Group__1__Impl8579);
                    rule__Annotation__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1__Impl"


    // $ANTLR start "rule__Annotation__Group_1__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4215:1: rule__Annotation__Group_1__0 : rule__Annotation__Group_1__0__Impl rule__Annotation__Group_1__1 ;
    public final void rule__Annotation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4219:1: ( rule__Annotation__Group_1__0__Impl rule__Annotation__Group_1__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4220:2: rule__Annotation__Group_1__0__Impl rule__Annotation__Group_1__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_1__0__Impl_in_rule__Annotation__Group_1__08614);
            rule__Annotation__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_1__1_in_rule__Annotation__Group_1__08617);
            rule__Annotation__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_1__0"


    // $ANTLR start "rule__Annotation__Group_1__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4227:1: rule__Annotation__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Annotation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4231:1: ( ( '(' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4232:1: ( '(' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4232:1: ( '(' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4233:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Annotation__Group_1__0__Impl8645); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_1__0__Impl"


    // $ANTLR start "rule__Annotation__Group_1__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4246:1: rule__Annotation__Group_1__1 : rule__Annotation__Group_1__1__Impl rule__Annotation__Group_1__2 ;
    public final void rule__Annotation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4250:1: ( rule__Annotation__Group_1__1__Impl rule__Annotation__Group_1__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4251:2: rule__Annotation__Group_1__1__Impl rule__Annotation__Group_1__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group_1__1__Impl_in_rule__Annotation__Group_1__18676);
            rule__Annotation__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_1__2_in_rule__Annotation__Group_1__18679);
            rule__Annotation__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_1__1"


    // $ANTLR start "rule__Annotation__Group_1__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4258:1: rule__Annotation__Group_1__1__Impl : ( ( rule__Annotation__ValuesAssignment_1_1 ) ) ;
    public final void rule__Annotation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4262:1: ( ( ( rule__Annotation__ValuesAssignment_1_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4263:1: ( ( rule__Annotation__ValuesAssignment_1_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4263:1: ( ( rule__Annotation__ValuesAssignment_1_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4264:1: ( rule__Annotation__ValuesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getValuesAssignment_1_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4265:1: ( rule__Annotation__ValuesAssignment_1_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4265:2: rule__Annotation__ValuesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Annotation__ValuesAssignment_1_1_in_rule__Annotation__Group_1__1__Impl8706);
            rule__Annotation__ValuesAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getValuesAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_1__1__Impl"


    // $ANTLR start "rule__Annotation__Group_1__2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4275:1: rule__Annotation__Group_1__2 : rule__Annotation__Group_1__2__Impl ;
    public final void rule__Annotation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4279:1: ( rule__Annotation__Group_1__2__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4280:2: rule__Annotation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_1__2__Impl_in_rule__Annotation__Group_1__28736);
            rule__Annotation__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_1__2"


    // $ANTLR start "rule__Annotation__Group_1__2__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4286:1: rule__Annotation__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Annotation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4290:1: ( ( ')' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4291:1: ( ')' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4291:1: ( ')' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4292:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,38,FOLLOW_38_in_rule__Annotation__Group_1__2__Impl8764); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_1__2__Impl"


    // $ANTLR start "rule__Values__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4311:1: rule__Values__Group__0 : rule__Values__Group__0__Impl rule__Values__Group__1 ;
    public final void rule__Values__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4315:1: ( rule__Values__Group__0__Impl rule__Values__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4316:2: rule__Values__Group__0__Impl rule__Values__Group__1
            {
            pushFollow(FOLLOW_rule__Values__Group__0__Impl_in_rule__Values__Group__08801);
            rule__Values__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Values__Group__1_in_rule__Values__Group__08804);
            rule__Values__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__0"


    // $ANTLR start "rule__Values__Group__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4323:1: rule__Values__Group__0__Impl : ( () ) ;
    public final void rule__Values__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4327:1: ( ( () ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4328:1: ( () )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4328:1: ( () )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4329:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getValuesAction_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4330:1: ()
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4332:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesAccess().getValuesAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__0__Impl"


    // $ANTLR start "rule__Values__Group__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4342:1: rule__Values__Group__1 : rule__Values__Group__1__Impl ;
    public final void rule__Values__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4346:1: ( rule__Values__Group__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4347:2: rule__Values__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Values__Group__1__Impl_in_rule__Values__Group__18862);
            rule__Values__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__1"


    // $ANTLR start "rule__Values__Group__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4353:1: rule__Values__Group__1__Impl : ( ( rule__Values__Alternatives_1 )* ) ;
    public final void rule__Values__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4357:1: ( ( ( rule__Values__Alternatives_1 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4358:1: ( ( rule__Values__Alternatives_1 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4358:1: ( ( rule__Values__Alternatives_1 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4359:1: ( rule__Values__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getAlternatives_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4360:1: ( rule__Values__Alternatives_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_INT||LA34_0==RULE_STRING||LA34_0==17||(LA34_0>=30 && LA34_0<=31)||LA34_0==43||LA34_0==47) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4360:2: rule__Values__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Values__Alternatives_1_in_rule__Values__Group__1__Impl8889);
            	    rule__Values__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__1__Impl"


    // $ANTLR start "rule__Values__Group_1_1__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4374:1: rule__Values__Group_1_1__0 : rule__Values__Group_1_1__0__Impl rule__Values__Group_1_1__1 ;
    public final void rule__Values__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4378:1: ( rule__Values__Group_1_1__0__Impl rule__Values__Group_1_1__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4379:2: rule__Values__Group_1_1__0__Impl rule__Values__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Values__Group_1_1__0__Impl_in_rule__Values__Group_1_1__08924);
            rule__Values__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Values__Group_1_1__1_in_rule__Values__Group_1_1__08927);
            rule__Values__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_1_1__0"


    // $ANTLR start "rule__Values__Group_1_1__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4386:1: rule__Values__Group_1_1__0__Impl : ( ( rule__Values__ValueAssignment_1_1_0 ) ) ;
    public final void rule__Values__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4390:1: ( ( ( rule__Values__ValueAssignment_1_1_0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4391:1: ( ( rule__Values__ValueAssignment_1_1_0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4391:1: ( ( rule__Values__ValueAssignment_1_1_0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4392:1: ( rule__Values__ValueAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getValueAssignment_1_1_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4393:1: ( rule__Values__ValueAssignment_1_1_0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4393:2: rule__Values__ValueAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__Values__ValueAssignment_1_1_0_in_rule__Values__Group_1_1__0__Impl8954);
            rule__Values__ValueAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesAccess().getValueAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_1_1__0__Impl"


    // $ANTLR start "rule__Values__Group_1_1__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4403:1: rule__Values__Group_1_1__1 : rule__Values__Group_1_1__1__Impl ;
    public final void rule__Values__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4407:1: ( rule__Values__Group_1_1__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4408:2: rule__Values__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Values__Group_1_1__1__Impl_in_rule__Values__Group_1_1__18984);
            rule__Values__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_1_1__1"


    // $ANTLR start "rule__Values__Group_1_1__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4414:1: rule__Values__Group_1_1__1__Impl : ( ( rule__Values__Group_1_1_1__0 )* ) ;
    public final void rule__Values__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4418:1: ( ( ( rule__Values__Group_1_1_1__0 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4419:1: ( ( rule__Values__Group_1_1_1__0 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4419:1: ( ( rule__Values__Group_1_1_1__0 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4420:1: ( rule__Values__Group_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getGroup_1_1_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4421:1: ( rule__Values__Group_1_1_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==39) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4421:2: rule__Values__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Values__Group_1_1_1__0_in_rule__Values__Group_1_1__1__Impl9011);
            	    rule__Values__Group_1_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesAccess().getGroup_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_1_1__1__Impl"


    // $ANTLR start "rule__Values__Group_1_1_1__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4435:1: rule__Values__Group_1_1_1__0 : rule__Values__Group_1_1_1__0__Impl rule__Values__Group_1_1_1__1 ;
    public final void rule__Values__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4439:1: ( rule__Values__Group_1_1_1__0__Impl rule__Values__Group_1_1_1__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4440:2: rule__Values__Group_1_1_1__0__Impl rule__Values__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__Values__Group_1_1_1__0__Impl_in_rule__Values__Group_1_1_1__09046);
            rule__Values__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Values__Group_1_1_1__1_in_rule__Values__Group_1_1_1__09049);
            rule__Values__Group_1_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_1_1_1__0"


    // $ANTLR start "rule__Values__Group_1_1_1__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4447:1: rule__Values__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__Values__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4451:1: ( ( ',' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4452:1: ( ',' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4452:1: ( ',' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4453:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getCommaKeyword_1_1_1_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Values__Group_1_1_1__0__Impl9077); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesAccess().getCommaKeyword_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Values__Group_1_1_1__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4466:1: rule__Values__Group_1_1_1__1 : rule__Values__Group_1_1_1__1__Impl ;
    public final void rule__Values__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4470:1: ( rule__Values__Group_1_1_1__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4471:2: rule__Values__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Values__Group_1_1_1__1__Impl_in_rule__Values__Group_1_1_1__19108);
            rule__Values__Group_1_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_1_1_1__1"


    // $ANTLR start "rule__Values__Group_1_1_1__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4477:1: rule__Values__Group_1_1_1__1__Impl : ( ( rule__Values__ValueAssignment_1_1_1_1 ) ) ;
    public final void rule__Values__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4481:1: ( ( ( rule__Values__ValueAssignment_1_1_1_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4482:1: ( ( rule__Values__ValueAssignment_1_1_1_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4482:1: ( ( rule__Values__ValueAssignment_1_1_1_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4483:1: ( rule__Values__ValueAssignment_1_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getValueAssignment_1_1_1_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4484:1: ( rule__Values__ValueAssignment_1_1_1_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4484:2: rule__Values__ValueAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_rule__Values__ValueAssignment_1_1_1_1_in_rule__Values__Group_1_1_1__1__Impl9135);
            rule__Values__ValueAssignment_1_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesAccess().getValueAssignment_1_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__Array__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4498:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4502:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4503:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__09169);
            rule__Array__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__1_in_rule__Array__Group__09172);
            rule__Array__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__0"


    // $ANTLR start "rule__Array__Group__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4510:1: rule__Array__Group__0__Impl : ( ( '[' ) ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4514:1: ( ( ( '[' ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4515:1: ( ( '[' ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4515:1: ( ( '[' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4516:1: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4517:1: ( '[' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4518:2: '['
            {
            match(input,43,FOLLOW_43_in_rule__Array__Group__0__Impl9201); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__0__Impl"


    // $ANTLR start "rule__Array__Group__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4529:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4533:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4534:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__19233);
            rule__Array__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__2_in_rule__Array__Group__19236);
            rule__Array__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__1"


    // $ANTLR start "rule__Array__Group__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4541:1: rule__Array__Group__1__Impl : ( ( rule__Array__ValuesAssignment_1 ) ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4545:1: ( ( ( rule__Array__ValuesAssignment_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4546:1: ( ( rule__Array__ValuesAssignment_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4546:1: ( ( rule__Array__ValuesAssignment_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4547:1: ( rule__Array__ValuesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getValuesAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4548:1: ( rule__Array__ValuesAssignment_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4548:2: rule__Array__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__Array__ValuesAssignment_1_in_rule__Array__Group__1__Impl9263);
            rule__Array__ValuesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getValuesAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__1__Impl"


    // $ANTLR start "rule__Array__Group__2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4558:1: rule__Array__Group__2 : rule__Array__Group__2__Impl ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4562:1: ( rule__Array__Group__2__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4563:2: rule__Array__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__29293);
            rule__Array__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__2"


    // $ANTLR start "rule__Array__Group__2__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4569:1: rule__Array__Group__2__Impl : ( ']' ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4573:1: ( ( ']' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4574:1: ( ']' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4574:1: ( ']' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4575:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,44,FOLLOW_44_in_rule__Array__Group__2__Impl9321); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__2__Impl"


    // $ANTLR start "rule__EscapableId__Group_1__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4594:1: rule__EscapableId__Group_1__0 : rule__EscapableId__Group_1__0__Impl rule__EscapableId__Group_1__1 ;
    public final void rule__EscapableId__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4598:1: ( rule__EscapableId__Group_1__0__Impl rule__EscapableId__Group_1__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4599:2: rule__EscapableId__Group_1__0__Impl rule__EscapableId__Group_1__1
            {
            pushFollow(FOLLOW_rule__EscapableId__Group_1__0__Impl_in_rule__EscapableId__Group_1__09358);
            rule__EscapableId__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EscapableId__Group_1__1_in_rule__EscapableId__Group_1__09361);
            rule__EscapableId__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapableId__Group_1__0"


    // $ANTLR start "rule__EscapableId__Group_1__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4606:1: rule__EscapableId__Group_1__0__Impl : ( '`' ) ;
    public final void rule__EscapableId__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4610:1: ( ( '`' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4611:1: ( '`' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4611:1: ( '`' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4612:1: '`'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEscapableIdAccess().getGraveAccentKeyword_1_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__EscapableId__Group_1__0__Impl9389); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEscapableIdAccess().getGraveAccentKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapableId__Group_1__0__Impl"


    // $ANTLR start "rule__EscapableId__Group_1__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4625:1: rule__EscapableId__Group_1__1 : rule__EscapableId__Group_1__1__Impl rule__EscapableId__Group_1__2 ;
    public final void rule__EscapableId__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4629:1: ( rule__EscapableId__Group_1__1__Impl rule__EscapableId__Group_1__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4630:2: rule__EscapableId__Group_1__1__Impl rule__EscapableId__Group_1__2
            {
            pushFollow(FOLLOW_rule__EscapableId__Group_1__1__Impl_in_rule__EscapableId__Group_1__19420);
            rule__EscapableId__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EscapableId__Group_1__2_in_rule__EscapableId__Group_1__19423);
            rule__EscapableId__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapableId__Group_1__1"


    // $ANTLR start "rule__EscapableId__Group_1__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4637:1: rule__EscapableId__Group_1__1__Impl : ( ruleReservedKeyWords ) ;
    public final void rule__EscapableId__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4641:1: ( ( ruleReservedKeyWords ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4642:1: ( ruleReservedKeyWords )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4642:1: ( ruleReservedKeyWords )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4643:1: ruleReservedKeyWords
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEscapableIdAccess().getReservedKeyWordsParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleReservedKeyWords_in_rule__EscapableId__Group_1__1__Impl9450);
            ruleReservedKeyWords();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEscapableIdAccess().getReservedKeyWordsParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapableId__Group_1__1__Impl"


    // $ANTLR start "rule__EscapableId__Group_1__2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4654:1: rule__EscapableId__Group_1__2 : rule__EscapableId__Group_1__2__Impl ;
    public final void rule__EscapableId__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4658:1: ( rule__EscapableId__Group_1__2__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4659:2: rule__EscapableId__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__EscapableId__Group_1__2__Impl_in_rule__EscapableId__Group_1__29479);
            rule__EscapableId__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapableId__Group_1__2"


    // $ANTLR start "rule__EscapableId__Group_1__2__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4665:1: rule__EscapableId__Group_1__2__Impl : ( '`' ) ;
    public final void rule__EscapableId__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4669:1: ( ( '`' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4670:1: ( '`' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4670:1: ( '`' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4671:1: '`'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEscapableIdAccess().getGraveAccentKeyword_1_2()); 
            }
            match(input,45,FOLLOW_45_in_rule__EscapableId__Group_1__2__Impl9507); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEscapableIdAccess().getGraveAccentKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapableId__Group_1__2__Impl"


    // $ANTLR start "rule__AN__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4690:1: rule__AN__Group__0 : rule__AN__Group__0__Impl rule__AN__Group__1 ;
    public final void rule__AN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4694:1: ( rule__AN__Group__0__Impl rule__AN__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4695:2: rule__AN__Group__0__Impl rule__AN__Group__1
            {
            pushFollow(FOLLOW_rule__AN__Group__0__Impl_in_rule__AN__Group__09544);
            rule__AN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AN__Group__1_in_rule__AN__Group__09547);
            rule__AN__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AN__Group__0"


    // $ANTLR start "rule__AN__Group__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4702:1: rule__AN__Group__0__Impl : ( '@' ) ;
    public final void rule__AN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4706:1: ( ( '@' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4707:1: ( '@' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4707:1: ( '@' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4708:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANAccess().getCommercialAtKeyword_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__AN__Group__0__Impl9575); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getANAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AN__Group__0__Impl"


    // $ANTLR start "rule__AN__Group__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4721:1: rule__AN__Group__1 : rule__AN__Group__1__Impl rule__AN__Group__2 ;
    public final void rule__AN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4725:1: ( rule__AN__Group__1__Impl rule__AN__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4726:2: rule__AN__Group__1__Impl rule__AN__Group__2
            {
            pushFollow(FOLLOW_rule__AN__Group__1__Impl_in_rule__AN__Group__19606);
            rule__AN__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AN__Group__2_in_rule__AN__Group__19609);
            rule__AN__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AN__Group__1"


    // $ANTLR start "rule__AN__Group__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4733:1: rule__AN__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__AN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4737:1: ( ( RULE_ID ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4738:1: ( RULE_ID )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4738:1: ( RULE_ID )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4739:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AN__Group__1__Impl9636); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getANAccess().getIDTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AN__Group__1__Impl"


    // $ANTLR start "rule__AN__Group__2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4750:1: rule__AN__Group__2 : rule__AN__Group__2__Impl ;
    public final void rule__AN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4754:1: ( rule__AN__Group__2__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4755:2: rule__AN__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AN__Group__2__Impl_in_rule__AN__Group__29665);
            rule__AN__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AN__Group__2"


    // $ANTLR start "rule__AN__Group__2__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4761:1: rule__AN__Group__2__Impl : ( ( rule__AN__Group_2__0 )* ) ;
    public final void rule__AN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4765:1: ( ( ( rule__AN__Group_2__0 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4766:1: ( ( rule__AN__Group_2__0 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4766:1: ( ( rule__AN__Group_2__0 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4767:1: ( rule__AN__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANAccess().getGroup_2()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4768:1: ( rule__AN__Group_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==47) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4768:2: rule__AN__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__AN__Group_2__0_in_rule__AN__Group__2__Impl9692);
            	    rule__AN__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getANAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AN__Group__2__Impl"


    // $ANTLR start "rule__AN__Group_2__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4784:1: rule__AN__Group_2__0 : rule__AN__Group_2__0__Impl rule__AN__Group_2__1 ;
    public final void rule__AN__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4788:1: ( rule__AN__Group_2__0__Impl rule__AN__Group_2__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4789:2: rule__AN__Group_2__0__Impl rule__AN__Group_2__1
            {
            pushFollow(FOLLOW_rule__AN__Group_2__0__Impl_in_rule__AN__Group_2__09729);
            rule__AN__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AN__Group_2__1_in_rule__AN__Group_2__09732);
            rule__AN__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AN__Group_2__0"


    // $ANTLR start "rule__AN__Group_2__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4796:1: rule__AN__Group_2__0__Impl : ( '-' ) ;
    public final void rule__AN__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4800:1: ( ( '-' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4801:1: ( '-' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4801:1: ( '-' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4802:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANAccess().getHyphenMinusKeyword_2_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__AN__Group_2__0__Impl9760); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getANAccess().getHyphenMinusKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AN__Group_2__0__Impl"


    // $ANTLR start "rule__AN__Group_2__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4815:1: rule__AN__Group_2__1 : rule__AN__Group_2__1__Impl ;
    public final void rule__AN__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4819:1: ( rule__AN__Group_2__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4820:2: rule__AN__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AN__Group_2__1__Impl_in_rule__AN__Group_2__19791);
            rule__AN__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AN__Group_2__1"


    // $ANTLR start "rule__AN__Group_2__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4826:1: rule__AN__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__AN__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4830:1: ( ( RULE_ID ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4831:1: ( RULE_ID )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4831:1: ( RULE_ID )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4832:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANAccess().getIDTerminalRuleCall_2_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AN__Group_2__1__Impl9818); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getANAccess().getIDTerminalRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AN__Group_2__1__Impl"


    // $ANTLR start "rule__NegativeInt__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4847:1: rule__NegativeInt__Group__0 : rule__NegativeInt__Group__0__Impl rule__NegativeInt__Group__1 ;
    public final void rule__NegativeInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4851:1: ( rule__NegativeInt__Group__0__Impl rule__NegativeInt__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4852:2: rule__NegativeInt__Group__0__Impl rule__NegativeInt__Group__1
            {
            pushFollow(FOLLOW_rule__NegativeInt__Group__0__Impl_in_rule__NegativeInt__Group__09851);
            rule__NegativeInt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NegativeInt__Group__1_in_rule__NegativeInt__Group__09854);
            rule__NegativeInt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeInt__Group__0"


    // $ANTLR start "rule__NegativeInt__Group__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4859:1: rule__NegativeInt__Group__0__Impl : ( '-' ) ;
    public final void rule__NegativeInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4863:1: ( ( '-' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4864:1: ( '-' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4864:1: ( '-' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4865:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeIntAccess().getHyphenMinusKeyword_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__NegativeInt__Group__0__Impl9882); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeIntAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeInt__Group__0__Impl"


    // $ANTLR start "rule__NegativeInt__Group__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4878:1: rule__NegativeInt__Group__1 : rule__NegativeInt__Group__1__Impl ;
    public final void rule__NegativeInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4882:1: ( rule__NegativeInt__Group__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4883:2: rule__NegativeInt__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NegativeInt__Group__1__Impl_in_rule__NegativeInt__Group__19913);
            rule__NegativeInt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeInt__Group__1"


    // $ANTLR start "rule__NegativeInt__Group__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4889:1: rule__NegativeInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__NegativeInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4893:1: ( ( RULE_INT ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4894:1: ( RULE_INT )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4894:1: ( RULE_INT )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4895:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeIntAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NegativeInt__Group__1__Impl9940); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeIntAccess().getINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeInt__Group__1__Impl"


    // $ANTLR start "rule__AvroIDLFile__ImportsAssignment_0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4911:1: rule__AvroIDLFile__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__AvroIDLFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4915:1: ( ( ruleImport ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4916:1: ( ruleImport )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4916:1: ( ruleImport )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4917:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvroIDLFileAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__AvroIDLFile__ImportsAssignment_09978);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvroIDLFileAccess().getImportsImportParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvroIDLFile__ImportsAssignment_0"


    // $ANTLR start "rule__AvroIDLFile__ProtocolsAssignment_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4926:1: rule__AvroIDLFile__ProtocolsAssignment_1 : ( ruleProtocol ) ;
    public final void rule__AvroIDLFile__ProtocolsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4930:1: ( ( ruleProtocol ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4931:1: ( ruleProtocol )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4931:1: ( ruleProtocol )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4932:1: ruleProtocol
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvroIDLFileAccess().getProtocolsProtocolParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleProtocol_in_rule__AvroIDLFile__ProtocolsAssignment_110009);
            ruleProtocol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvroIDLFileAccess().getProtocolsProtocolParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvroIDLFile__ProtocolsAssignment_1"


    // $ANTLR start "rule__Import__TypeAssignment_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4941:1: rule__Import__TypeAssignment_1 : ( ruleImportType ) ;
    public final void rule__Import__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4945:1: ( ( ruleImportType ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4946:1: ( ruleImportType )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4946:1: ( ruleImportType )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4947:1: ruleImportType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getTypeImportTypeEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleImportType_in_rule__Import__TypeAssignment_110040);
            ruleImportType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getTypeImportTypeEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__TypeAssignment_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4956:1: rule__Import__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4960:1: ( ( RULE_STRING ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4961:1: ( RULE_STRING )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4961:1: ( RULE_STRING )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4962:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_210071); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_2"


    // $ANTLR start "rule__Protocol__AnnotationsAssignment_0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4971:1: rule__Protocol__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Protocol__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4975:1: ( ( ruleAnnotation ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4976:1: ( ruleAnnotation )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4976:1: ( ruleAnnotation )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4977:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Protocol__AnnotationsAssignment_010102);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__AnnotationsAssignment_0"


    // $ANTLR start "rule__Protocol__NameAssignment_2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4986:1: rule__Protocol__NameAssignment_2 : ( ruleEscapableId ) ;
    public final void rule__Protocol__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4990:1: ( ( ruleEscapableId ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4991:1: ( ruleEscapableId )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4991:1: ( ruleEscapableId )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:4992:1: ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getNameEscapableIdParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_rule__Protocol__NameAssignment_210133);
            ruleEscapableId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolAccess().getNameEscapableIdParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__NameAssignment_2"


    // $ANTLR start "rule__Protocol__ElementsAssignment_4"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5001:1: rule__Protocol__ElementsAssignment_4 : ( ruleElement ) ;
    public final void rule__Protocol__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5005:1: ( ( ruleElement ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5006:1: ( ruleElement )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5006:1: ( ruleElement )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5007:1: ruleElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getElementsElementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleElement_in_rule__Protocol__ElementsAssignment_410164);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolAccess().getElementsElementParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__ElementsAssignment_4"


    // $ANTLR start "rule__RPCMessage__ReturnTypeAssignment_0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5016:1: rule__RPCMessage__ReturnTypeAssignment_0 : ( ruleReturnTypeLink ) ;
    public final void rule__RPCMessage__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5020:1: ( ( ruleReturnTypeLink ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5021:1: ( ruleReturnTypeLink )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5021:1: ( ruleReturnTypeLink )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5022:1: ruleReturnTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getReturnTypeReturnTypeLinkParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleReturnTypeLink_in_rule__RPCMessage__ReturnTypeAssignment_010195);
            ruleReturnTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getReturnTypeReturnTypeLinkParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__ReturnTypeAssignment_0"


    // $ANTLR start "rule__RPCMessage__NameAssignment_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5031:1: rule__RPCMessage__NameAssignment_1 : ( ruleEscapableId ) ;
    public final void rule__RPCMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5035:1: ( ( ruleEscapableId ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5036:1: ( ruleEscapableId )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5036:1: ( ruleEscapableId )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5037:1: ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getNameEscapableIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_rule__RPCMessage__NameAssignment_110226);
            ruleEscapableId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getNameEscapableIdParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__NameAssignment_1"


    // $ANTLR start "rule__RPCMessage__ArgumentsAssignment_3_0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5046:1: rule__RPCMessage__ArgumentsAssignment_3_0 : ( ruleArgument ) ;
    public final void rule__RPCMessage__ArgumentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5050:1: ( ( ruleArgument ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5051:1: ( ruleArgument )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5051:1: ( ruleArgument )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5052:1: ruleArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getArgumentsArgumentParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleArgument_in_rule__RPCMessage__ArgumentsAssignment_3_010257);
            ruleArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getArgumentsArgumentParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__ArgumentsAssignment_3_0"


    // $ANTLR start "rule__RPCMessage__ArgumentsAssignment_3_1_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5061:1: rule__RPCMessage__ArgumentsAssignment_3_1_1 : ( ruleArgument ) ;
    public final void rule__RPCMessage__ArgumentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5065:1: ( ( ruleArgument ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5066:1: ( ruleArgument )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5066:1: ( ruleArgument )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5067:1: ruleArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getArgumentsArgumentParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleArgument_in_rule__RPCMessage__ArgumentsAssignment_3_1_110288);
            ruleArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getArgumentsArgumentParserRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__ArgumentsAssignment_3_1_1"


    // $ANTLR start "rule__RPCMessage__ErrorAssignment_5_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5076:1: rule__RPCMessage__ErrorAssignment_5_1 : ( ( ruleEscapableId ) ) ;
    public final void rule__RPCMessage__ErrorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5080:1: ( ( ( ruleEscapableId ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5081:1: ( ( ruleEscapableId ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5081:1: ( ( ruleEscapableId ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5082:1: ( ruleEscapableId )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getErrorErrorTypeCrossReference_5_1_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5083:1: ( ruleEscapableId )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5084:1: ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getErrorErrorTypeEscapableIdParserRuleCall_5_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_rule__RPCMessage__ErrorAssignment_5_110323);
            ruleEscapableId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getErrorErrorTypeEscapableIdParserRuleCall_5_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getErrorErrorTypeCrossReference_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__ErrorAssignment_5_1"


    // $ANTLR start "rule__RPCMessage__OnewayAssignment_6"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5095:1: rule__RPCMessage__OnewayAssignment_6 : ( ( 'oneway' ) ) ;
    public final void rule__RPCMessage__OnewayAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5099:1: ( ( ( 'oneway' ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5100:1: ( ( 'oneway' ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5100:1: ( ( 'oneway' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5101:1: ( 'oneway' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getOnewayOnewayKeyword_6_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5102:1: ( 'oneway' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5103:1: 'oneway'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getOnewayOnewayKeyword_6_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__RPCMessage__OnewayAssignment_610363); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getOnewayOnewayKeyword_6_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageAccess().getOnewayOnewayKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPCMessage__OnewayAssignment_6"


    // $ANTLR start "rule__Argument__TypeAssignment_0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5118:1: rule__Argument__TypeAssignment_0 : ( ruleTypeLink ) ;
    public final void rule__Argument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5122:1: ( ( ruleTypeLink ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5123:1: ( ruleTypeLink )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5123:1: ( ruleTypeLink )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5124:1: ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getTypeTypeLinkParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_rule__Argument__TypeAssignment_010402);
            ruleTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentAccess().getTypeTypeLinkParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__TypeAssignment_0"


    // $ANTLR start "rule__Argument__NameAssignment_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5133:1: rule__Argument__NameAssignment_1 : ( ruleEscapableId ) ;
    public final void rule__Argument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5137:1: ( ( ruleEscapableId ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5138:1: ( ruleEscapableId )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5138:1: ( ruleEscapableId )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5139:1: ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getNameEscapableIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_rule__Argument__NameAssignment_110433);
            ruleEscapableId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentAccess().getNameEscapableIdParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__NameAssignment_1"


    // $ANTLR start "rule__Argument__DefaultAssignment_2_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5148:1: rule__Argument__DefaultAssignment_2_1 : ( ruleValue ) ;
    public final void rule__Argument__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5152:1: ( ( ruleValue ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5153:1: ( ruleValue )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5153:1: ( ruleValue )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5154:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getDefaultValueParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Argument__DefaultAssignment_2_110464);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentAccess().getDefaultValueParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__DefaultAssignment_2_1"


    // $ANTLR start "rule__VoidTypeLink__TargetAssignment"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5163:1: rule__VoidTypeLink__TargetAssignment : ( ( 'void' ) ) ;
    public final void rule__VoidTypeLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5167:1: ( ( ( 'void' ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5168:1: ( ( 'void' ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5168:1: ( ( 'void' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5169:1: ( 'void' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoidTypeLinkAccess().getTargetVoidKeyword_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5170:1: ( 'void' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5171:1: 'void'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoidTypeLinkAccess().getTargetVoidKeyword_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__VoidTypeLink__TargetAssignment10500); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoidTypeLinkAccess().getTargetVoidKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoidTypeLinkAccess().getTargetVoidKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoidTypeLink__TargetAssignment"


    // $ANTLR start "rule__TypeDef__AnnotationsAssignment_0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5186:1: rule__TypeDef__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__TypeDef__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5190:1: ( ( ruleAnnotation ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5191:1: ( ruleAnnotation )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5191:1: ( ruleAnnotation )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5192:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__TypeDef__AnnotationsAssignment_010539);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__AnnotationsAssignment_0"


    // $ANTLR start "rule__TypeDef__TypeAssignment_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5201:1: rule__TypeDef__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__TypeDef__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5205:1: ( ( ruleType ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5206:1: ( ruleType )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5206:1: ( ruleType )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5207:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefAccess().getTypeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__TypeDef__TypeAssignment_110570);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefAccess().getTypeTypeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__TypeAssignment_1"


    // $ANTLR start "rule__ErrorType__NameAssignment_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5216:1: rule__ErrorType__NameAssignment_1 : ( ruleEscapableId ) ;
    public final void rule__ErrorType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5220:1: ( ( ruleEscapableId ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5221:1: ( ruleEscapableId )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5221:1: ( ruleEscapableId )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5222:1: ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorTypeAccess().getNameEscapableIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_rule__ErrorType__NameAssignment_110601);
            ruleEscapableId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorTypeAccess().getNameEscapableIdParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorType__NameAssignment_1"


    // $ANTLR start "rule__ErrorType__FieldsAssignment_3"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5231:1: rule__ErrorType__FieldsAssignment_3 : ( ruleField ) ;
    public final void rule__ErrorType__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5235:1: ( ( ruleField ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5236:1: ( ruleField )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5236:1: ( ruleField )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5237:1: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorTypeAccess().getFieldsFieldParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleField_in_rule__ErrorType__FieldsAssignment_310632);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorTypeAccess().getFieldsFieldParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorType__FieldsAssignment_3"


    // $ANTLR start "rule__RecordType__NameAssignment_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5246:1: rule__RecordType__NameAssignment_1 : ( ruleEscapableId ) ;
    public final void rule__RecordType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5250:1: ( ( ruleEscapableId ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5251:1: ( ruleEscapableId )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5251:1: ( ruleEscapableId )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5252:1: ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getNameEscapableIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_rule__RecordType__NameAssignment_110663);
            ruleEscapableId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getNameEscapableIdParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__NameAssignment_1"


    // $ANTLR start "rule__RecordType__FieldsAssignment_3"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5261:1: rule__RecordType__FieldsAssignment_3 : ( ruleField ) ;
    public final void rule__RecordType__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5265:1: ( ( ruleField ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5266:1: ( ruleField )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5266:1: ( ruleField )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5267:1: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleField_in_rule__RecordType__FieldsAssignment_310694);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__FieldsAssignment_3"


    // $ANTLR start "rule__Field__AnnotationsAssignment_0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5276:1: rule__Field__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Field__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5280:1: ( ( ruleAnnotation ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5281:1: ( ruleAnnotation )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5281:1: ( ruleAnnotation )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5282:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Field__AnnotationsAssignment_010725);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__AnnotationsAssignment_0"


    // $ANTLR start "rule__Field__TypeAssignment_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5291:1: rule__Field__TypeAssignment_1 : ( ruleFieldType ) ;
    public final void rule__Field__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5295:1: ( ( ruleFieldType ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5296:1: ( ruleFieldType )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5296:1: ( ruleFieldType )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5297:1: ruleFieldType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldType_in_rule__Field__TypeAssignment_110756);
            ruleFieldType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypeAssignment_1"


    // $ANTLR start "rule__Field__NameAnnotationsAssignment_2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5306:1: rule__Field__NameAnnotationsAssignment_2 : ( ruleAnnotation ) ;
    public final void rule__Field__NameAnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5310:1: ( ( ruleAnnotation ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5311:1: ( ruleAnnotation )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5311:1: ( ruleAnnotation )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5312:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAnnotationsAnnotationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Field__NameAnnotationsAssignment_210787);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameAnnotationsAnnotationParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAnnotationsAssignment_2"


    // $ANTLR start "rule__Field__NameAssignment_3"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5321:1: rule__Field__NameAssignment_3 : ( ruleEscapableId ) ;
    public final void rule__Field__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5325:1: ( ( ruleEscapableId ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5326:1: ( ruleEscapableId )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5326:1: ( ruleEscapableId )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5327:1: ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameEscapableIdParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_rule__Field__NameAssignment_310818);
            ruleEscapableId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameEscapableIdParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_3"


    // $ANTLR start "rule__Field__DefaultAssignment_4_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5336:1: rule__Field__DefaultAssignment_4_1 : ( ruleValue ) ;
    public final void rule__Field__DefaultAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5340:1: ( ( ruleValue ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5341:1: ( ruleValue )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5341:1: ( ruleValue )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5342:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getDefaultValueParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Field__DefaultAssignment_4_110849);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getDefaultValueParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__DefaultAssignment_4_1"


    // $ANTLR start "rule__SimpleFieldType__TypeAssignment"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5351:1: rule__SimpleFieldType__TypeAssignment : ( ruleTypeLink ) ;
    public final void rule__SimpleFieldType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5355:1: ( ( ruleTypeLink ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5356:1: ( ruleTypeLink )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5356:1: ( ruleTypeLink )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5357:1: ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleFieldTypeAccess().getTypeTypeLinkParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_rule__SimpleFieldType__TypeAssignment10880);
            ruleTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleFieldTypeAccess().getTypeTypeLinkParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFieldType__TypeAssignment"


    // $ANTLR start "rule__UnionFieldType__TypesAssignment_2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5366:1: rule__UnionFieldType__TypesAssignment_2 : ( ruleTypeLink ) ;
    public final void rule__UnionFieldType__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5370:1: ( ( ruleTypeLink ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5371:1: ( ruleTypeLink )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5371:1: ( ruleTypeLink )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5372:1: ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeAccess().getTypesTypeLinkParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_rule__UnionFieldType__TypesAssignment_210911);
            ruleTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionFieldTypeAccess().getTypesTypeLinkParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionFieldType__TypesAssignment_2"


    // $ANTLR start "rule__UnionFieldType__TypesAssignment_3_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5381:1: rule__UnionFieldType__TypesAssignment_3_1 : ( ruleTypeLink ) ;
    public final void rule__UnionFieldType__TypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5385:1: ( ( ruleTypeLink ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5386:1: ( ruleTypeLink )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5386:1: ( ruleTypeLink )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5387:1: ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeAccess().getTypesTypeLinkParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_rule__UnionFieldType__TypesAssignment_3_110942);
            ruleTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionFieldTypeAccess().getTypesTypeLinkParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionFieldType__TypesAssignment_3_1"


    // $ANTLR start "rule__ArrayFieldType__AnnotationAssignment_2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5396:1: rule__ArrayFieldType__AnnotationAssignment_2 : ( ruleAnnotation ) ;
    public final void rule__ArrayFieldType__AnnotationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5400:1: ( ( ruleAnnotation ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5401:1: ( ruleAnnotation )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5401:1: ( ruleAnnotation )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5402:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayFieldTypeAccess().getAnnotationAnnotationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__ArrayFieldType__AnnotationAssignment_210973);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayFieldTypeAccess().getAnnotationAnnotationParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayFieldType__AnnotationAssignment_2"


    // $ANTLR start "rule__ArrayFieldType__TypeAssignment_3"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5411:1: rule__ArrayFieldType__TypeAssignment_3 : ( ruleTypeLink ) ;
    public final void rule__ArrayFieldType__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5415:1: ( ( ruleTypeLink ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5416:1: ( ruleTypeLink )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5416:1: ( ruleTypeLink )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5417:1: ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayFieldTypeAccess().getTypeTypeLinkParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_rule__ArrayFieldType__TypeAssignment_311004);
            ruleTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayFieldTypeAccess().getTypeTypeLinkParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayFieldType__TypeAssignment_3"


    // $ANTLR start "rule__MapFieldType__AnnotationAssignment_2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5426:1: rule__MapFieldType__AnnotationAssignment_2 : ( ruleAnnotation ) ;
    public final void rule__MapFieldType__AnnotationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5430:1: ( ( ruleAnnotation ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5431:1: ( ruleAnnotation )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5431:1: ( ruleAnnotation )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5432:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapFieldTypeAccess().getAnnotationAnnotationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__MapFieldType__AnnotationAssignment_211035);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapFieldTypeAccess().getAnnotationAnnotationParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapFieldType__AnnotationAssignment_2"


    // $ANTLR start "rule__MapFieldType__TypeAssignment_3"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5441:1: rule__MapFieldType__TypeAssignment_3 : ( ruleTypeLink ) ;
    public final void rule__MapFieldType__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5445:1: ( ( ruleTypeLink ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5446:1: ( ruleTypeLink )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5446:1: ( ruleTypeLink )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5447:1: ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapFieldTypeAccess().getTypeTypeLinkParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_rule__MapFieldType__TypeAssignment_311066);
            ruleTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapFieldTypeAccess().getTypeTypeLinkParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapFieldType__TypeAssignment_3"


    // $ANTLR start "rule__PrimativeTypeLink__TargetAssignment"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5456:1: rule__PrimativeTypeLink__TargetAssignment : ( ( rule__PrimativeTypeLink__TargetAlternatives_0 ) ) ;
    public final void rule__PrimativeTypeLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5460:1: ( ( ( rule__PrimativeTypeLink__TargetAlternatives_0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5461:1: ( ( rule__PrimativeTypeLink__TargetAlternatives_0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5461:1: ( ( rule__PrimativeTypeLink__TargetAlternatives_0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5462:1: ( rule__PrimativeTypeLink__TargetAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimativeTypeLinkAccess().getTargetAlternatives_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5463:1: ( rule__PrimativeTypeLink__TargetAlternatives_0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5463:2: rule__PrimativeTypeLink__TargetAlternatives_0
            {
            pushFollow(FOLLOW_rule__PrimativeTypeLink__TargetAlternatives_0_in_rule__PrimativeTypeLink__TargetAssignment11097);
            rule__PrimativeTypeLink__TargetAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimativeTypeLinkAccess().getTargetAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimativeTypeLink__TargetAssignment"


    // $ANTLR start "rule__CustomTypeLink__TargetAssignment"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5472:1: rule__CustomTypeLink__TargetAssignment : ( ( ruleEscapableId ) ) ;
    public final void rule__CustomTypeLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5476:1: ( ( ( ruleEscapableId ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5477:1: ( ( ruleEscapableId ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5477:1: ( ( ruleEscapableId ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5478:1: ( ruleEscapableId )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeLinkAccess().getTargetTypeCrossReference_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5479:1: ( ruleEscapableId )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5480:1: ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeLinkAccess().getTargetTypeEscapableIdParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_rule__CustomTypeLink__TargetAssignment11134);
            ruleEscapableId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomTypeLinkAccess().getTargetTypeEscapableIdParserRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomTypeLinkAccess().getTargetTypeCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTypeLink__TargetAssignment"


    // $ANTLR start "rule__FixedType__NameAssignment_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5491:1: rule__FixedType__NameAssignment_1 : ( ruleEscapableId ) ;
    public final void rule__FixedType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5495:1: ( ( ruleEscapableId ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5496:1: ( ruleEscapableId )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5496:1: ( ruleEscapableId )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5497:1: ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixedTypeAccess().getNameEscapableIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_rule__FixedType__NameAssignment_111169);
            ruleEscapableId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixedTypeAccess().getNameEscapableIdParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__NameAssignment_1"


    // $ANTLR start "rule__FixedType__SizeAssignment_3"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5506:1: rule__FixedType__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__FixedType__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5510:1: ( ( RULE_INT ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5511:1: ( RULE_INT )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5511:1: ( RULE_INT )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5512:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixedTypeAccess().getSizeINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FixedType__SizeAssignment_311200); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixedTypeAccess().getSizeINTTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__SizeAssignment_3"


    // $ANTLR start "rule__EnumType__NameAssignment_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5521:1: rule__EnumType__NameAssignment_1 : ( ruleEscapableId ) ;
    public final void rule__EnumType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5525:1: ( ( ruleEscapableId ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5526:1: ( ruleEscapableId )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5526:1: ( ruleEscapableId )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5527:1: ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getNameEscapableIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_rule__EnumType__NameAssignment_111231);
            ruleEscapableId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumTypeAccess().getNameEscapableIdParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__NameAssignment_1"


    // $ANTLR start "rule__EnumType__LiteralsAssignment_3"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5536:1: rule__EnumType__LiteralsAssignment_3 : ( RULE_ID ) ;
    public final void rule__EnumType__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5540:1: ( ( RULE_ID ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5541:1: ( RULE_ID )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5541:1: ( RULE_ID )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5542:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getLiteralsIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumType__LiteralsAssignment_311262); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumTypeAccess().getLiteralsIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__LiteralsAssignment_3"


    // $ANTLR start "rule__EnumType__LiteralsAssignment_4_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5551:1: rule__EnumType__LiteralsAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__EnumType__LiteralsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5555:1: ( ( RULE_ID ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5556:1: ( RULE_ID )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5556:1: ( RULE_ID )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5557:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getLiteralsIDTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumType__LiteralsAssignment_4_111293); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumTypeAccess().getLiteralsIDTerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__LiteralsAssignment_4_1"


    // $ANTLR start "rule__Annotation__NameAssignment_0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5566:1: rule__Annotation__NameAssignment_0 : ( ruleAN ) ;
    public final void rule__Annotation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5570:1: ( ( ruleAN ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5571:1: ( ruleAN )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5571:1: ( ruleAN )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5572:1: ruleAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameANParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAN_in_rule__Annotation__NameAssignment_011324);
            ruleAN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getNameANParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__NameAssignment_0"


    // $ANTLR start "rule__Annotation__ValuesAssignment_1_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5581:1: rule__Annotation__ValuesAssignment_1_1 : ( ruleValues ) ;
    public final void rule__Annotation__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5585:1: ( ( ruleValues ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5586:1: ( ruleValues )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5586:1: ( ruleValues )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5587:1: ruleValues
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getValuesValuesParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValues_in_rule__Annotation__ValuesAssignment_1_111355);
            ruleValues();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getValuesValuesParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__ValuesAssignment_1_1"


    // $ANTLR start "rule__Values__ValueAssignment_1_0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5596:1: rule__Values__ValueAssignment_1_0 : ( ruleArray ) ;
    public final void rule__Values__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5600:1: ( ( ruleArray ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5601:1: ( ruleArray )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5601:1: ( ruleArray )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5602:1: ruleArray
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getValueArrayParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleArray_in_rule__Values__ValueAssignment_1_011386);
            ruleArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesAccess().getValueArrayParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__ValueAssignment_1_0"


    // $ANTLR start "rule__Values__ValueAssignment_1_1_0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5611:1: rule__Values__ValueAssignment_1_1_0 : ( ruleValue ) ;
    public final void rule__Values__ValueAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5615:1: ( ( ruleValue ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5616:1: ( ruleValue )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5616:1: ( ruleValue )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5617:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getValueValueParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Values__ValueAssignment_1_1_011417);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesAccess().getValueValueParserRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__ValueAssignment_1_1_0"


    // $ANTLR start "rule__Values__ValueAssignment_1_1_1_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5626:1: rule__Values__ValueAssignment_1_1_1_1 : ( ruleValue ) ;
    public final void rule__Values__ValueAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5630:1: ( ( ruleValue ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5631:1: ( ruleValue )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5631:1: ( ruleValue )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5632:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getValueValueParserRuleCall_1_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Values__ValueAssignment_1_1_1_111448);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesAccess().getValueValueParserRuleCall_1_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__ValueAssignment_1_1_1_1"


    // $ANTLR start "rule__Array__ValuesAssignment_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5641:1: rule__Array__ValuesAssignment_1 : ( ruleValues ) ;
    public final void rule__Array__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5645:1: ( ( ruleValues ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5646:1: ( ruleValues )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5646:1: ( ruleValues )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5647:1: ruleValues
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getValuesValuesParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValues_in_rule__Array__ValuesAssignment_111479);
            ruleValues();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getValuesValuesParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__ValuesAssignment_1"


    // $ANTLR start "rule__BooleanValue__ValAssignment"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5656:1: rule__BooleanValue__ValAssignment : ( ruleBoolean ) ;
    public final void rule__BooleanValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5660:1: ( ( ruleBoolean ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5661:1: ( ruleBoolean )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5661:1: ( ruleBoolean )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5662:1: ruleBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValBooleanParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBoolean_in_rule__BooleanValue__ValAssignment11510);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getValBooleanParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__ValAssignment"


    // $ANTLR start "rule__Null__ValAssignment"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5671:1: rule__Null__ValAssignment : ( ( 'null' ) ) ;
    public final void rule__Null__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5675:1: ( ( ( 'null' ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5676:1: ( ( 'null' ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5676:1: ( ( 'null' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5677:1: ( 'null' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAccess().getValNullKeyword_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5678:1: ( 'null' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5679:1: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAccess().getValNullKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Null__ValAssignment11546); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullAccess().getValNullKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullAccess().getValNullKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Null__ValAssignment"


    // $ANTLR start "rule__StringValue__ValAssignment"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5694:1: rule__StringValue__ValAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5698:1: ( ( RULE_STRING ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5699:1: ( RULE_STRING )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5699:1: ( RULE_STRING )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5700:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__ValAssignment11585); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getValSTRINGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValAssignment"


    // $ANTLR start "rule__IntValue__ValAssignment"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5709:1: rule__IntValue__ValAssignment : ( ( rule__IntValue__ValAlternatives_0 ) ) ;
    public final void rule__IntValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5713:1: ( ( ( rule__IntValue__ValAlternatives_0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5714:1: ( ( rule__IntValue__ValAlternatives_0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5714:1: ( ( rule__IntValue__ValAlternatives_0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5715:1: ( rule__IntValue__ValAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValAlternatives_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5716:1: ( rule__IntValue__ValAlternatives_0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:5716:2: rule__IntValue__ValAlternatives_0
            {
            pushFollow(FOLLOW_rule__IntValue__ValAlternatives_0_in_rule__IntValue__ValAssignment11616);
            rule__IntValue__ValAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueAccess().getValAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__ValAssignment"

    // $ANTLR start synpred17_InternalAvroIDL
    public final void synpred17_InternalAvroIDL_fragment() throws RecognitionException {   
        // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1301:1: ( ( ( rule__Values__ValueAssignment_1_0 ) ) )
        // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1301:1: ( ( rule__Values__ValueAssignment_1_0 ) )
        {
        // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1301:1: ( ( rule__Values__ValueAssignment_1_0 ) )
        // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1302:1: ( rule__Values__ValueAssignment_1_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getValuesAccess().getValueAssignment_1_0()); 
        }
        // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1303:1: ( rule__Values__ValueAssignment_1_0 )
        // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvroIDL.g:1303:2: rule__Values__ValueAssignment_1_0
        {
        pushFollow(FOLLOW_rule__Values__ValueAssignment_1_0_in_synpred17_InternalAvroIDL2760);
        rule__Values__ValueAssignment_1_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred17_InternalAvroIDL

    // Delegated rules

    public final boolean synpred17_InternalAvroIDL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalAvroIDL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleAvroIDLFile_in_entryRuleAvroIDLFile67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvroIDLFile74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvroIDLFile__Group__0_in_ruleAvroIDLFile100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_entryRuleProtocol187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocol194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__0_in_ruleProtocol220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRPCMessage_in_entryRuleRPCMessage307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRPCMessage314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__0_in_ruleRPCMessage340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0_in_ruleArgument400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnTypeLink_in_entryRuleReturnTypeLink427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnTypeLink434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnTypeLink__Alternatives_in_ruleReturnTypeLink460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidTypeLink_in_entryRuleVoidTypeLink487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoidTypeLink494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VoidTypeLink__TargetAssignment_in_ruleVoidTypeLink520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__0_in_ruleTypeDef580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleErrorType_in_entryRuleErrorType667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleErrorType674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ErrorType__Group__0_in_ruleErrorType700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_entryRuleRecordType727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordType734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__0_in_ruleRecordType760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_entryRuleFieldType847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldType854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__Alternatives_in_ruleFieldType880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldType_in_entryRuleSimpleFieldType907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFieldType914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFieldType__TypeAssignment_in_ruleSimpleFieldType940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionFieldType_in_entryRuleUnionFieldType967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnionFieldType974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group__0_in_ruleUnionFieldType1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayFieldType_in_entryRuleArrayFieldType1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayFieldType1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__Group__0_in_ruleArrayFieldType1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapFieldType_in_entryRuleMapFieldType1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapFieldType1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFieldType__Group__0_in_ruleMapFieldType1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_entryRuleTypeLink1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeLink1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeLink__Alternatives_in_ruleTypeLink1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimativeTypeLink_in_entryRulePrimativeTypeLink1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimativeTypeLink1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimativeTypeLink__TargetAssignment_in_rulePrimativeTypeLink1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomTypeLink_in_entryRuleCustomTypeLink1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomTypeLink1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomTypeLink__TargetAssignment_in_ruleCustomTypeLink1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_entryRuleFixedType1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFixedType1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__0_in_ruleFixedType1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__0_in_ruleEnumType1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_entryRuleValues1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValues1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__Group__0_in_ruleValues1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray1567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0_in_ruleArray1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValAssignment_in_ruleBooleanValue1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_entryRuleNull1747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNull1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Null__ValAssignment_in_ruleNull1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValAssignment_in_ruleStringValue1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntValue__ValAssignment_in_ruleIntValue1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_entryRuleEscapableId1927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapableId1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapableId__Alternatives_in_ruleEscapableId1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedKeyWords_in_entryRuleReservedKeyWords1987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReservedKeyWords1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReservedKeyWords__Alternatives_in_ruleReservedKeyWords2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAN_in_entryRuleAN2047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAN2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AN__Group__0_in_ruleAN2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegativeInt_in_entryRuleNegativeInt2107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegativeInt2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegativeInt__Group__0_in_ruleNegativeInt2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean2167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportType__Alternatives_in_ruleImportType2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_rule__Element__Alternatives2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRPCMessage_in_rule__Element__Alternatives2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidTypeLink_in_rule__ReturnTypeLink__Alternatives2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__ReturnTypeLink__Alternatives2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__Type__Alternatives2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_rule__Type__Alternatives2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__Type__Alternatives2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleErrorType_in_rule__Type__Alternatives2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldType_in_rule__FieldType__Alternatives2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionFieldType_in_rule__FieldType__Alternatives2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayFieldType_in_rule__FieldType__Alternatives2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapFieldType_in_rule__FieldType__Alternatives2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimativeTypeLink_in_rule__TypeLink__Alternatives2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomTypeLink_in_rule__TypeLink__Alternatives2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PrimativeTypeLink__TargetAlternatives_02586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PrimativeTypeLink__TargetAlternatives_02606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PrimativeTypeLink__TargetAlternatives_02626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PrimativeTypeLink__TargetAlternatives_02646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PrimativeTypeLink__TargetAlternatives_02666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PrimativeTypeLink__TargetAlternatives_02686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PrimativeTypeLink__TargetAlternatives_02706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PrimativeTypeLink__TargetAlternatives_02726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__ValueAssignment_1_0_in_rule__Values__Alternatives_12760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__Group_1_1__0_in_rule__Values__Alternatives_12778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__Value__Alternatives2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rule__Value__Alternatives2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Value__Alternatives2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__Value__Alternatives2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_rule__Value__Alternatives2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValAlternatives_02913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegativeInt_in_rule__IntValue__ValAlternatives_02930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EscapableId__Alternatives2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapableId__Group_1__0_in_rule__EscapableId__Alternatives2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ReservedKeyWords__Alternatives3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ReservedKeyWords__Alternatives3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ReservedKeyWords__Alternatives3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ReservedKeyWords__Alternatives3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ReservedKeyWords__Alternatives3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ReservedKeyWords__Alternatives3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ReservedKeyWords__Alternatives3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ReservedKeyWords__Alternatives3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ReservedKeyWords__Alternatives3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ReservedKeyWords__Alternatives3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ReservedKeyWords__Alternatives3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Boolean__Alternatives3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Boolean__Alternatives3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ImportType__Alternatives3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ImportType__Alternatives3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ImportType__Alternatives3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvroIDLFile__Group__0__Impl_in_rule__AvroIDLFile__Group__03378 = new BitSet(new long[]{0x0000400004000000L});
    public static final BitSet FOLLOW_rule__AvroIDLFile__Group__1_in_rule__AvroIDLFile__Group__03381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvroIDLFile__ImportsAssignment_0_in_rule__AvroIDLFile__Group__0__Impl3408 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__AvroIDLFile__Group__1__Impl_in_rule__AvroIDLFile__Group__13439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvroIDLFile__ProtocolsAssignment_1_in_rule__AvroIDLFile__Group__1__Impl3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03501 = new BitSet(new long[]{0x0000000304000000L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Import__Group__0__Impl3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13563 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__13566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__TypeAssignment_1_in_rule__Import__Group__1__Impl3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__23623 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Import__Group__3_in_rule__Import__Group__23626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_2_in_rule__Import__Group__2__Impl3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__3__Impl_in_rule__Import__Group__33683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Import__Group__3__Impl3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__0__Impl_in_rule__Protocol__Group__03750 = new BitSet(new long[]{0x0000400004000000L});
    public static final BitSet FOLLOW_rule__Protocol__Group__1_in_rule__Protocol__Group__03753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__AnnotationsAssignment_0_in_rule__Protocol__Group__0__Impl3780 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__1__Impl_in_rule__Protocol__Group__13811 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_rule__Protocol__Group__2_in_rule__Protocol__Group__13814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Protocol__Group__1__Impl3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__2__Impl_in_rule__Protocol__Group__23873 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Protocol__Group__3_in_rule__Protocol__Group__23876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__NameAssignment_2_in_rule__Protocol__Group__2__Impl3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__3__Impl_in_rule__Protocol__Group__33933 = new BitSet(new long[]{0x00016010023FF820L});
    public static final BitSet FOLLOW_rule__Protocol__Group__4_in_rule__Protocol__Group__33936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Protocol__Group__3__Impl3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__4__Impl_in_rule__Protocol__Group__43995 = new BitSet(new long[]{0x00016010023FF820L});
    public static final BitSet FOLLOW_rule__Protocol__Group__5_in_rule__Protocol__Group__43998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__ElementsAssignment_4_in_rule__Protocol__Group__4__Impl4025 = new BitSet(new long[]{0x00016000023FF822L});
    public static final BitSet FOLLOW_rule__Protocol__Group__5__Impl_in_rule__Protocol__Group__54056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Protocol__Group__5__Impl4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__0__Impl_in_rule__RPCMessage__Group__04127 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__1_in_rule__RPCMessage__Group__04130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__ReturnTypeAssignment_0_in_rule__RPCMessage__Group__0__Impl4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__1__Impl_in_rule__RPCMessage__Group__14187 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__2_in_rule__RPCMessage__Group__14190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__NameAssignment_1_in_rule__RPCMessage__Group__1__Impl4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__2__Impl_in_rule__RPCMessage__Group__24247 = new BitSet(new long[]{0x00016040023FF820L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__3_in_rule__RPCMessage__Group__24250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__RPCMessage__Group__2__Impl4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__3__Impl_in_rule__RPCMessage__Group__34309 = new BitSet(new long[]{0x00016040023FF820L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__4_in_rule__RPCMessage__Group__34312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_3__0_in_rule__RPCMessage__Group__3__Impl4339 = new BitSet(new long[]{0x00016000023FF822L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__4__Impl_in_rule__RPCMessage__Group__44370 = new BitSet(new long[]{0x0000000428000000L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__5_in_rule__RPCMessage__Group__44373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__RPCMessage__Group__4__Impl4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__5__Impl_in_rule__RPCMessage__Group__54432 = new BitSet(new long[]{0x0000000428000000L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__6_in_rule__RPCMessage__Group__54435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_5__0_in_rule__RPCMessage__Group__5__Impl4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__6__Impl_in_rule__RPCMessage__Group__64493 = new BitSet(new long[]{0x0000000428000000L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__7_in_rule__RPCMessage__Group__64496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__OnewayAssignment_6_in_rule__RPCMessage__Group__6__Impl4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__7__Impl_in_rule__RPCMessage__Group__74554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__RPCMessage__Group__7__Impl4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_3__0__Impl_in_rule__RPCMessage__Group_3__04629 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_3__1_in_rule__RPCMessage__Group_3__04632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__ArgumentsAssignment_3_0_in_rule__RPCMessage__Group_3__0__Impl4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_3__1__Impl_in_rule__RPCMessage__Group_3__14689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_3_1__0_in_rule__RPCMessage__Group_3__1__Impl4716 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_3_1__0__Impl_in_rule__RPCMessage__Group_3_1__04751 = new BitSet(new long[]{0x00016000023FF820L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_3_1__1_in_rule__RPCMessage__Group_3_1__04754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__RPCMessage__Group_3_1__0__Impl4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_3_1__1__Impl_in_rule__RPCMessage__Group_3_1__14813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__ArgumentsAssignment_3_1_1_in_rule__RPCMessage__Group_3_1__1__Impl4840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_5__0__Impl_in_rule__RPCMessage__Group_5__04874 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_5__1_in_rule__RPCMessage__Group_5__04877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RPCMessage__Group_5__0__Impl4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_5__1__Impl_in_rule__RPCMessage__Group_5__14936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__ErrorAssignment_5_1_in_rule__RPCMessage__Group_5__1__Impl4963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__04997 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__05000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__TypeAssignment_0_in_rule__Argument__Group__0__Impl5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__15057 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Argument__Group__2_in_rule__Argument__Group__15060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__NameAssignment_1_in_rule__Argument__Group__1__Impl5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__2__Impl_in_rule__Argument__Group__25117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2__0_in_rule__Argument__Group__2__Impl5144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2__0__Impl_in_rule__Argument__Group_2__05181 = new BitSet(new long[]{0x00008800C0020050L});
    public static final BitSet FOLLOW_rule__Argument__Group_2__1_in_rule__Argument__Group_2__05184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Argument__Group_2__0__Impl5212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2__1__Impl_in_rule__Argument__Group_2__15243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__DefaultAssignment_2_1_in_rule__Argument__Group_2__1__Impl5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__0__Impl_in_rule__TypeDef__Group__05304 = new BitSet(new long[]{0x0000400002380000L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__1_in_rule__TypeDef__Group__05307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__AnnotationsAssignment_0_in_rule__TypeDef__Group__0__Impl5334 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__1__Impl_in_rule__TypeDef__Group__15365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__TypeAssignment_1_in_rule__TypeDef__Group__1__Impl5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ErrorType__Group__0__Impl_in_rule__ErrorType__Group__05426 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_rule__ErrorType__Group__1_in_rule__ErrorType__Group__05429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ErrorType__Group__0__Impl5457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ErrorType__Group__1__Impl_in_rule__ErrorType__Group__15488 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ErrorType__Group__2_in_rule__ErrorType__Group__15491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ErrorType__NameAssignment_1_in_rule__ErrorType__Group__1__Impl5518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ErrorType__Group__2__Impl_in_rule__ErrorType__Group__25548 = new BitSet(new long[]{0x0001601003FFF820L});
    public static final BitSet FOLLOW_rule__ErrorType__Group__3_in_rule__ErrorType__Group__25551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ErrorType__Group__2__Impl5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ErrorType__Group__3__Impl_in_rule__ErrorType__Group__35610 = new BitSet(new long[]{0x0001601003FFF820L});
    public static final BitSet FOLLOW_rule__ErrorType__Group__4_in_rule__ErrorType__Group__35613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ErrorType__FieldsAssignment_3_in_rule__ErrorType__Group__3__Impl5640 = new BitSet(new long[]{0x0001600003FFF822L});
    public static final BitSet FOLLOW_rule__ErrorType__Group__4__Impl_in_rule__ErrorType__Group__45671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ErrorType__Group__4__Impl5699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__0__Impl_in_rule__RecordType__Group__05740 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_rule__RecordType__Group__1_in_rule__RecordType__Group__05743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RecordType__Group__0__Impl5771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__1__Impl_in_rule__RecordType__Group__15802 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__2_in_rule__RecordType__Group__15805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__NameAssignment_1_in_rule__RecordType__Group__1__Impl5832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__2__Impl_in_rule__RecordType__Group__25862 = new BitSet(new long[]{0x0001601003FFF820L});
    public static final BitSet FOLLOW_rule__RecordType__Group__3_in_rule__RecordType__Group__25865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__RecordType__Group__2__Impl5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__3__Impl_in_rule__RecordType__Group__35924 = new BitSet(new long[]{0x0001601003FFF820L});
    public static final BitSet FOLLOW_rule__RecordType__Group__4_in_rule__RecordType__Group__35927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__FieldsAssignment_3_in_rule__RecordType__Group__3__Impl5954 = new BitSet(new long[]{0x0001600003FFF822L});
    public static final BitSet FOLLOW_rule__RecordType__Group__4__Impl_in_rule__RecordType__Group__45985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__RecordType__Group__4__Impl6013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__06054 = new BitSet(new long[]{0x0001600003FFF820L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__06057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__AnnotationsAssignment_0_in_rule__Field__Group__0__Impl6084 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__16115 = new BitSet(new long[]{0x0000600000000020L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__16118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypeAssignment_1_in_rule__Field__Group__1__Impl6145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__26175 = new BitSet(new long[]{0x0000600000000020L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__26178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAnnotationsAssignment_2_in_rule__Field__Group__2__Impl6205 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__36236 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__36239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_3_in_rule__Field__Group__3__Impl6266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__46296 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_rule__Field__Group__5_in_rule__Field__Group__46299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_4__0_in_rule__Field__Group__4__Impl6326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__56357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Field__Group__5__Impl6385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_4__0__Impl_in_rule__Field__Group_4__06428 = new BitSet(new long[]{0x00008800C0020050L});
    public static final BitSet FOLLOW_rule__Field__Group_4__1_in_rule__Field__Group_4__06431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Field__Group_4__0__Impl6459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_4__1__Impl_in_rule__Field__Group_4__16490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__DefaultAssignment_4_1_in_rule__Field__Group_4__1__Impl6517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group__0__Impl_in_rule__UnionFieldType__Group__06551 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group__1_in_rule__UnionFieldType__Group__06554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UnionFieldType__Group__0__Impl6582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group__1__Impl_in_rule__UnionFieldType__Group__16613 = new BitSet(new long[]{0x00016000023FF820L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group__2_in_rule__UnionFieldType__Group__16616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__UnionFieldType__Group__1__Impl6644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group__2__Impl_in_rule__UnionFieldType__Group__26675 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group__3_in_rule__UnionFieldType__Group__26678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__TypesAssignment_2_in_rule__UnionFieldType__Group__2__Impl6705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group__3__Impl_in_rule__UnionFieldType__Group__36735 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group__4_in_rule__UnionFieldType__Group__36738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group_3__0_in_rule__UnionFieldType__Group__3__Impl6765 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group__4__Impl_in_rule__UnionFieldType__Group__46796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__UnionFieldType__Group__4__Impl6824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group_3__0__Impl_in_rule__UnionFieldType__Group_3__06865 = new BitSet(new long[]{0x00016000023FF820L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group_3__1_in_rule__UnionFieldType__Group_3__06868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__UnionFieldType__Group_3__0__Impl6896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group_3__1__Impl_in_rule__UnionFieldType__Group_3__16927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__TypesAssignment_3_1_in_rule__UnionFieldType__Group_3__1__Impl6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__Group__0__Impl_in_rule__ArrayFieldType__Group__06988 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__Group__1_in_rule__ArrayFieldType__Group__06991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArrayFieldType__Group__0__Impl7019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__Group__1__Impl_in_rule__ArrayFieldType__Group__17050 = new BitSet(new long[]{0x00016000023FF820L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__Group__2_in_rule__ArrayFieldType__Group__17053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ArrayFieldType__Group__1__Impl7081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__Group__2__Impl_in_rule__ArrayFieldType__Group__27112 = new BitSet(new long[]{0x00016000023FF820L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__Group__3_in_rule__ArrayFieldType__Group__27115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__AnnotationAssignment_2_in_rule__ArrayFieldType__Group__2__Impl7142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__Group__3__Impl_in_rule__ArrayFieldType__Group__37173 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__Group__4_in_rule__ArrayFieldType__Group__37176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__TypeAssignment_3_in_rule__ArrayFieldType__Group__3__Impl7203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__Group__4__Impl_in_rule__ArrayFieldType__Group__47233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ArrayFieldType__Group__4__Impl7261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFieldType__Group__0__Impl_in_rule__MapFieldType__Group__07302 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__MapFieldType__Group__1_in_rule__MapFieldType__Group__07305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MapFieldType__Group__0__Impl7333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFieldType__Group__1__Impl_in_rule__MapFieldType__Group__17364 = new BitSet(new long[]{0x00016000023FF820L});
    public static final BitSet FOLLOW_rule__MapFieldType__Group__2_in_rule__MapFieldType__Group__17367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MapFieldType__Group__1__Impl7395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFieldType__Group__2__Impl_in_rule__MapFieldType__Group__27426 = new BitSet(new long[]{0x00016000023FF820L});
    public static final BitSet FOLLOW_rule__MapFieldType__Group__3_in_rule__MapFieldType__Group__27429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFieldType__AnnotationAssignment_2_in_rule__MapFieldType__Group__2__Impl7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFieldType__Group__3__Impl_in_rule__MapFieldType__Group__37487 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__MapFieldType__Group__4_in_rule__MapFieldType__Group__37490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFieldType__TypeAssignment_3_in_rule__MapFieldType__Group__3__Impl7517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFieldType__Group__4__Impl_in_rule__MapFieldType__Group__47547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MapFieldType__Group__4__Impl7575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__0__Impl_in_rule__FixedType__Group__07616 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_rule__FixedType__Group__1_in_rule__FixedType__Group__07619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FixedType__Group__0__Impl7647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__1__Impl_in_rule__FixedType__Group__17678 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__2_in_rule__FixedType__Group__17681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__NameAssignment_1_in_rule__FixedType__Group__1__Impl7708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__2__Impl_in_rule__FixedType__Group__27738 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FixedType__Group__3_in_rule__FixedType__Group__27741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FixedType__Group__2__Impl7769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__3__Impl_in_rule__FixedType__Group__37800 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__4_in_rule__FixedType__Group__37803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__SizeAssignment_3_in_rule__FixedType__Group__3__Impl7830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__4__Impl_in_rule__FixedType__Group__47860 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__5_in_rule__FixedType__Group__47863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FixedType__Group__4__Impl7891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__5__Impl_in_rule__FixedType__Group__57922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FixedType__Group__5__Impl7950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__0__Impl_in_rule__EnumType__Group__07993 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_rule__EnumType__Group__1_in_rule__EnumType__Group__07996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumType__Group__0__Impl8024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__1__Impl_in_rule__EnumType__Group__18055 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__2_in_rule__EnumType__Group__18058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__NameAssignment_1_in_rule__EnumType__Group__1__Impl8085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__2__Impl_in_rule__EnumType__Group__28115 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumType__Group__3_in_rule__EnumType__Group__28118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EnumType__Group__2__Impl8146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__3__Impl_in_rule__EnumType__Group__38177 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__4_in_rule__EnumType__Group__38180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__LiteralsAssignment_3_in_rule__EnumType__Group__3__Impl8207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__4__Impl_in_rule__EnumType__Group__48237 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__5_in_rule__EnumType__Group__48240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_4__0_in_rule__EnumType__Group__4__Impl8267 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__5__Impl_in_rule__EnumType__Group__58298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EnumType__Group__5__Impl8326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_4__0__Impl_in_rule__EnumType__Group_4__08369 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumType__Group_4__1_in_rule__EnumType__Group_4__08372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EnumType__Group_4__0__Impl8400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_4__1__Impl_in_rule__EnumType__Group_4__18431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__LiteralsAssignment_4_1_in_rule__EnumType__Group_4__1__Impl8458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__08492 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__08495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__NameAssignment_0_in_rule__Annotation__Group__0__Impl8522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__18552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_1__0_in_rule__Annotation__Group__1__Impl8579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_1__0__Impl_in_rule__Annotation__Group_1__08614 = new BitSet(new long[]{0x00008800C0020050L});
    public static final BitSet FOLLOW_rule__Annotation__Group_1__1_in_rule__Annotation__Group_1__08617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Annotation__Group_1__0__Impl8645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_1__1__Impl_in_rule__Annotation__Group_1__18676 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_1__2_in_rule__Annotation__Group_1__18679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ValuesAssignment_1_1_in_rule__Annotation__Group_1__1__Impl8706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_1__2__Impl_in_rule__Annotation__Group_1__28736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Annotation__Group_1__2__Impl8764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__Group__0__Impl_in_rule__Values__Group__08801 = new BitSet(new long[]{0x00008800C0020050L});
    public static final BitSet FOLLOW_rule__Values__Group__1_in_rule__Values__Group__08804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__Group__1__Impl_in_rule__Values__Group__18862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__Alternatives_1_in_rule__Values__Group__1__Impl8889 = new BitSet(new long[]{0x00008800C0020052L});
    public static final BitSet FOLLOW_rule__Values__Group_1_1__0__Impl_in_rule__Values__Group_1_1__08924 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Values__Group_1_1__1_in_rule__Values__Group_1_1__08927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__ValueAssignment_1_1_0_in_rule__Values__Group_1_1__0__Impl8954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__Group_1_1__1__Impl_in_rule__Values__Group_1_1__18984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__Group_1_1_1__0_in_rule__Values__Group_1_1__1__Impl9011 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__Values__Group_1_1_1__0__Impl_in_rule__Values__Group_1_1_1__09046 = new BitSet(new long[]{0x00008800C0020050L});
    public static final BitSet FOLLOW_rule__Values__Group_1_1_1__1_in_rule__Values__Group_1_1_1__09049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Values__Group_1_1_1__0__Impl9077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__Group_1_1_1__1__Impl_in_rule__Values__Group_1_1_1__19108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__ValueAssignment_1_1_1_1_in_rule__Values__Group_1_1_1__1__Impl9135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__09169 = new BitSet(new long[]{0x00008800C0020050L});
    public static final BitSet FOLLOW_rule__Array__Group__1_in_rule__Array__Group__09172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Array__Group__0__Impl9201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__19233 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Array__Group__2_in_rule__Array__Group__19236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__ValuesAssignment_1_in_rule__Array__Group__1__Impl9263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__29293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Array__Group__2__Impl9321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapableId__Group_1__0__Impl_in_rule__EscapableId__Group_1__09358 = new BitSet(new long[]{0x000000003FF80000L});
    public static final BitSet FOLLOW_rule__EscapableId__Group_1__1_in_rule__EscapableId__Group_1__09361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__EscapableId__Group_1__0__Impl9389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapableId__Group_1__1__Impl_in_rule__EscapableId__Group_1__19420 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__EscapableId__Group_1__2_in_rule__EscapableId__Group_1__19423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedKeyWords_in_rule__EscapableId__Group_1__1__Impl9450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapableId__Group_1__2__Impl_in_rule__EscapableId__Group_1__29479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__EscapableId__Group_1__2__Impl9507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AN__Group__0__Impl_in_rule__AN__Group__09544 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AN__Group__1_in_rule__AN__Group__09547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__AN__Group__0__Impl9575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AN__Group__1__Impl_in_rule__AN__Group__19606 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__AN__Group__2_in_rule__AN__Group__19609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AN__Group__1__Impl9636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AN__Group__2__Impl_in_rule__AN__Group__29665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AN__Group_2__0_in_rule__AN__Group__2__Impl9692 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__AN__Group_2__0__Impl_in_rule__AN__Group_2__09729 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AN__Group_2__1_in_rule__AN__Group_2__09732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__AN__Group_2__0__Impl9760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AN__Group_2__1__Impl_in_rule__AN__Group_2__19791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AN__Group_2__1__Impl9818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegativeInt__Group__0__Impl_in_rule__NegativeInt__Group__09851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NegativeInt__Group__1_in_rule__NegativeInt__Group__09854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__NegativeInt__Group__0__Impl9882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegativeInt__Group__1__Impl_in_rule__NegativeInt__Group__19913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NegativeInt__Group__1__Impl9940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__AvroIDLFile__ImportsAssignment_09978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_rule__AvroIDLFile__ProtocolsAssignment_110009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportType_in_rule__Import__TypeAssignment_110040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_210071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Protocol__AnnotationsAssignment_010102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_rule__Protocol__NameAssignment_210133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Protocol__ElementsAssignment_410164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnTypeLink_in_rule__RPCMessage__ReturnTypeAssignment_010195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_rule__RPCMessage__NameAssignment_110226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__RPCMessage__ArgumentsAssignment_3_010257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__RPCMessage__ArgumentsAssignment_3_1_110288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_rule__RPCMessage__ErrorAssignment_5_110323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RPCMessage__OnewayAssignment_610363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__Argument__TypeAssignment_010402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_rule__Argument__NameAssignment_110433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Argument__DefaultAssignment_2_110464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__VoidTypeLink__TargetAssignment10500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__TypeDef__AnnotationsAssignment_010539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TypeDef__TypeAssignment_110570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_rule__ErrorType__NameAssignment_110601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__ErrorType__FieldsAssignment_310632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_rule__RecordType__NameAssignment_110663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__RecordType__FieldsAssignment_310694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Field__AnnotationsAssignment_010725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__TypeAssignment_110756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Field__NameAnnotationsAssignment_210787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_rule__Field__NameAssignment_310818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Field__DefaultAssignment_4_110849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__SimpleFieldType__TypeAssignment10880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__UnionFieldType__TypesAssignment_210911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__UnionFieldType__TypesAssignment_3_110942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__ArrayFieldType__AnnotationAssignment_210973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__ArrayFieldType__TypeAssignment_311004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__MapFieldType__AnnotationAssignment_211035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__MapFieldType__TypeAssignment_311066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimativeTypeLink__TargetAlternatives_0_in_rule__PrimativeTypeLink__TargetAssignment11097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_rule__CustomTypeLink__TargetAssignment11134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_rule__FixedType__NameAssignment_111169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FixedType__SizeAssignment_311200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_rule__EnumType__NameAssignment_111231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumType__LiteralsAssignment_311262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumType__LiteralsAssignment_4_111293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAN_in_rule__Annotation__NameAssignment_011324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_rule__Annotation__ValuesAssignment_1_111355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rule__Values__ValueAssignment_1_011386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Values__ValueAssignment_1_1_011417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Values__ValueAssignment_1_1_1_111448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_rule__Array__ValuesAssignment_111479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__BooleanValue__ValAssignment11510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Null__ValAssignment11546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValAssignment11585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntValue__ValAlternatives_0_in_rule__IntValue__ValAssignment11616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__ValueAssignment_1_0_in_synpred17_InternalAvroIDL2760 = new BitSet(new long[]{0x0000000000000002L});

}