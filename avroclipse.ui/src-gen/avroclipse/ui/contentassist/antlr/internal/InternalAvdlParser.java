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
import avroclipse.services.AvdlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAvdlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'null'", "'int'", "'long'", "'float'", "'double'", "'bytes'", "'string'", "'record'", "'fixed'", "'enum'", "'map'", "'array'", "'union'", "'error'", "'protocol'", "'oneway'", "'import'", "'throws'", "'idl'", "'schema'", "';'", "'{'", "'}'", "'('", "')'", "','", "'='", "'<'", "'>'", "'@'", "'['", "']'", "'`'", "'-'", "'void'"
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
    public String getGrammarFileName() { return "../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g"; }


     
     	private AvdlGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AvdlGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleAvdlFile"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:61:1: entryRuleAvdlFile : ruleAvdlFile EOF ;
    public final void entryRuleAvdlFile() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:62:1: ( ruleAvdlFile EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:63:1: ruleAvdlFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvdlFileRule()); 
            }
            pushFollow(FOLLOW_ruleAvdlFile_in_entryRuleAvdlFile67);
            ruleAvdlFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvdlFileRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvdlFile74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAvdlFile"


    // $ANTLR start "ruleAvdlFile"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:70:1: ruleAvdlFile : ( ( rule__AvdlFile__Alternatives )* ) ;
    public final void ruleAvdlFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:74:2: ( ( ( rule__AvdlFile__Alternatives )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:75:1: ( ( rule__AvdlFile__Alternatives )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:75:1: ( ( rule__AvdlFile__Alternatives )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:76:1: ( rule__AvdlFile__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvdlFileAccess().getAlternatives()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:77:1: ( rule__AvdlFile__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25||LA1_0==27||LA1_0==40) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:77:2: rule__AvdlFile__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__AvdlFile__Alternatives_in_ruleAvdlFile100);
            	    rule__AvdlFile__Alternatives();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvdlFileAccess().getAlternatives()); 
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
    // $ANTLR end "ruleAvdlFile"


    // $ANTLR start "entryRuleImport"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:90:1: ( ruleImport EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:91:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport128);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport135); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:103:1: ( ( rule__Import__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:104:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:105:1: ( rule__Import__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:105:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport161);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:117:1: entryRuleProtocol : ruleProtocol EOF ;
    public final void entryRuleProtocol() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:118:1: ( ruleProtocol EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:119:1: ruleProtocol EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolRule()); 
            }
            pushFollow(FOLLOW_ruleProtocol_in_entryRuleProtocol188);
            ruleProtocol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocol195); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:126:1: ruleProtocol : ( ( rule__Protocol__Group__0 ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:130:2: ( ( ( rule__Protocol__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:131:1: ( ( rule__Protocol__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:131:1: ( ( rule__Protocol__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:132:1: ( rule__Protocol__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:133:1: ( rule__Protocol__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:133:2: rule__Protocol__Group__0
            {
            pushFollow(FOLLOW_rule__Protocol__Group__0_in_ruleProtocol221);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:145:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:146:1: ( ruleElement EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:147:1: ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement248);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement255); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:154:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:158:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:159:1: ( ( rule__Element__Alternatives ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:159:1: ( ( rule__Element__Alternatives ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:160:1: ( rule__Element__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getAlternatives()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:161:1: ( rule__Element__Alternatives )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:161:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement281);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:173:1: entryRuleRPCMessage : ruleRPCMessage EOF ;
    public final void entryRuleRPCMessage() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:174:1: ( ruleRPCMessage EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:175:1: ruleRPCMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageRule()); 
            }
            pushFollow(FOLLOW_ruleRPCMessage_in_entryRuleRPCMessage308);
            ruleRPCMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPCMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRPCMessage315); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:182:1: ruleRPCMessage : ( ( rule__RPCMessage__Group__0 ) ) ;
    public final void ruleRPCMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:186:2: ( ( ( rule__RPCMessage__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:187:1: ( ( rule__RPCMessage__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:187:1: ( ( rule__RPCMessage__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:188:1: ( rule__RPCMessage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:189:1: ( rule__RPCMessage__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:189:2: rule__RPCMessage__Group__0
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group__0_in_ruleRPCMessage341);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:201:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:202:1: ( ruleArgument EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:203:1: ruleArgument EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentRule()); 
            }
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument368);
            ruleArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument375); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:210:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:214:2: ( ( ( rule__Argument__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:215:1: ( ( rule__Argument__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:215:1: ( ( rule__Argument__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:216:1: ( rule__Argument__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:217:1: ( rule__Argument__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:217:2: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_rule__Argument__Group__0_in_ruleArgument401);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:229:1: entryRuleReturnTypeLink : ruleReturnTypeLink EOF ;
    public final void entryRuleReturnTypeLink() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:230:1: ( ruleReturnTypeLink EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:231:1: ruleReturnTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleReturnTypeLink_in_entryRuleReturnTypeLink428);
            ruleReturnTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnTypeLink435); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:238:1: ruleReturnTypeLink : ( ( rule__ReturnTypeLink__Alternatives ) ) ;
    public final void ruleReturnTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:242:2: ( ( ( rule__ReturnTypeLink__Alternatives ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:243:1: ( ( rule__ReturnTypeLink__Alternatives ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:243:1: ( ( rule__ReturnTypeLink__Alternatives ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:244:1: ( rule__ReturnTypeLink__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnTypeLinkAccess().getAlternatives()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:245:1: ( rule__ReturnTypeLink__Alternatives )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:245:2: rule__ReturnTypeLink__Alternatives
            {
            pushFollow(FOLLOW_rule__ReturnTypeLink__Alternatives_in_ruleReturnTypeLink461);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:257:1: entryRuleVoidTypeLink : ruleVoidTypeLink EOF ;
    public final void entryRuleVoidTypeLink() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:258:1: ( ruleVoidTypeLink EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:259:1: ruleVoidTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoidTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleVoidTypeLink_in_entryRuleVoidTypeLink488);
            ruleVoidTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoidTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoidTypeLink495); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:266:1: ruleVoidTypeLink : ( ( rule__VoidTypeLink__TargetAssignment ) ) ;
    public final void ruleVoidTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:270:2: ( ( ( rule__VoidTypeLink__TargetAssignment ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:271:1: ( ( rule__VoidTypeLink__TargetAssignment ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:271:1: ( ( rule__VoidTypeLink__TargetAssignment ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:272:1: ( rule__VoidTypeLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoidTypeLinkAccess().getTargetAssignment()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:273:1: ( rule__VoidTypeLink__TargetAssignment )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:273:2: rule__VoidTypeLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__VoidTypeLink__TargetAssignment_in_ruleVoidTypeLink521);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:285:1: entryRuleTypeDef : ruleTypeDef EOF ;
    public final void entryRuleTypeDef() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:286:1: ( ruleTypeDef EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:287:1: ruleTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef548);
            ruleTypeDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef555); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:294:1: ruleTypeDef : ( ( rule__TypeDef__Group__0 ) ) ;
    public final void ruleTypeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:298:2: ( ( ( rule__TypeDef__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:299:1: ( ( rule__TypeDef__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:299:1: ( ( rule__TypeDef__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:300:1: ( rule__TypeDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:301:1: ( rule__TypeDef__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:301:2: rule__TypeDef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDef__Group__0_in_ruleTypeDef581);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:313:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:314:1: ( ruleType EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:315:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType608);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType615); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:322:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:326:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:327:1: ( ( rule__Type__Alternatives ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:327:1: ( ( rule__Type__Alternatives ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:328:1: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:329:1: ( rule__Type__Alternatives )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:329:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType641);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:341:1: entryRuleErrorType : ruleErrorType EOF ;
    public final void entryRuleErrorType() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:342:1: ( ruleErrorType EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:343:1: ruleErrorType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorTypeRule()); 
            }
            pushFollow(FOLLOW_ruleErrorType_in_entryRuleErrorType668);
            ruleErrorType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleErrorType675); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:350:1: ruleErrorType : ( ( rule__ErrorType__Group__0 ) ) ;
    public final void ruleErrorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:354:2: ( ( ( rule__ErrorType__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:355:1: ( ( rule__ErrorType__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:355:1: ( ( rule__ErrorType__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:356:1: ( rule__ErrorType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorTypeAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:357:1: ( rule__ErrorType__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:357:2: rule__ErrorType__Group__0
            {
            pushFollow(FOLLOW_rule__ErrorType__Group__0_in_ruleErrorType701);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:369:1: entryRuleRecordType : ruleRecordType EOF ;
    public final void entryRuleRecordType() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:370:1: ( ruleRecordType EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:371:1: ruleRecordType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeRule()); 
            }
            pushFollow(FOLLOW_ruleRecordType_in_entryRuleRecordType728);
            ruleRecordType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordType735); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:378:1: ruleRecordType : ( ( rule__RecordType__Group__0 ) ) ;
    public final void ruleRecordType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:382:2: ( ( ( rule__RecordType__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:383:1: ( ( rule__RecordType__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:383:1: ( ( rule__RecordType__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:384:1: ( rule__RecordType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:385:1: ( rule__RecordType__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:385:2: rule__RecordType__Group__0
            {
            pushFollow(FOLLOW_rule__RecordType__Group__0_in_ruleRecordType761);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:397:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:398:1: ( ruleField EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:399:1: ruleField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField788);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField795); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:406:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:410:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:411:1: ( ( rule__Field__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:411:1: ( ( rule__Field__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:412:1: ( rule__Field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:413:1: ( rule__Field__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:413:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField821);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:425:1: entryRuleFieldType : ruleFieldType EOF ;
    public final void entryRuleFieldType() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:426:1: ( ruleFieldType EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:427:1: ruleFieldType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleFieldType_in_entryRuleFieldType848);
            ruleFieldType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldType855); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:434:1: ruleFieldType : ( ( rule__FieldType__Alternatives ) ) ;
    public final void ruleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:438:2: ( ( ( rule__FieldType__Alternatives ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:439:1: ( ( rule__FieldType__Alternatives ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:439:1: ( ( rule__FieldType__Alternatives ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:440:1: ( rule__FieldType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:441:1: ( rule__FieldType__Alternatives )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:441:2: rule__FieldType__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldType__Alternatives_in_ruleFieldType881);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:453:1: entryRuleSimpleFieldType : ruleSimpleFieldType EOF ;
    public final void entryRuleSimpleFieldType() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:454:1: ( ruleSimpleFieldType EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:455:1: ruleSimpleFieldType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleFieldType_in_entryRuleSimpleFieldType908);
            ruleSimpleFieldType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleFieldTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleFieldType915); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:462:1: ruleSimpleFieldType : ( ( rule__SimpleFieldType__TypeAssignment ) ) ;
    public final void ruleSimpleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:466:2: ( ( ( rule__SimpleFieldType__TypeAssignment ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:467:1: ( ( rule__SimpleFieldType__TypeAssignment ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:467:1: ( ( rule__SimpleFieldType__TypeAssignment ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:468:1: ( rule__SimpleFieldType__TypeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleFieldTypeAccess().getTypeAssignment()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:469:1: ( rule__SimpleFieldType__TypeAssignment )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:469:2: rule__SimpleFieldType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__SimpleFieldType__TypeAssignment_in_ruleSimpleFieldType941);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:481:1: entryRuleUnionFieldType : ruleUnionFieldType EOF ;
    public final void entryRuleUnionFieldType() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:482:1: ( ruleUnionFieldType EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:483:1: ruleUnionFieldType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleUnionFieldType_in_entryRuleUnionFieldType968);
            ruleUnionFieldType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionFieldTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnionFieldType975); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:490:1: ruleUnionFieldType : ( ( rule__UnionFieldType__Group__0 ) ) ;
    public final void ruleUnionFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:494:2: ( ( ( rule__UnionFieldType__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:495:1: ( ( rule__UnionFieldType__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:495:1: ( ( rule__UnionFieldType__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:496:1: ( rule__UnionFieldType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:497:1: ( rule__UnionFieldType__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:497:2: rule__UnionFieldType__Group__0
            {
            pushFollow(FOLLOW_rule__UnionFieldType__Group__0_in_ruleUnionFieldType1001);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:509:1: entryRuleArrayFieldType : ruleArrayFieldType EOF ;
    public final void entryRuleArrayFieldType() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:510:1: ( ruleArrayFieldType EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:511:1: ruleArrayFieldType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleArrayFieldType_in_entryRuleArrayFieldType1028);
            ruleArrayFieldType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayFieldTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayFieldType1035); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:518:1: ruleArrayFieldType : ( ( rule__ArrayFieldType__Group__0 ) ) ;
    public final void ruleArrayFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:522:2: ( ( ( rule__ArrayFieldType__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:523:1: ( ( rule__ArrayFieldType__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:523:1: ( ( rule__ArrayFieldType__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:524:1: ( rule__ArrayFieldType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayFieldTypeAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:525:1: ( rule__ArrayFieldType__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:525:2: rule__ArrayFieldType__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayFieldType__Group__0_in_ruleArrayFieldType1061);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:537:1: entryRuleMapFieldType : ruleMapFieldType EOF ;
    public final void entryRuleMapFieldType() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:538:1: ( ruleMapFieldType EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:539:1: ruleMapFieldType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleMapFieldType_in_entryRuleMapFieldType1088);
            ruleMapFieldType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapFieldTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapFieldType1095); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:546:1: ruleMapFieldType : ( ( rule__MapFieldType__Group__0 ) ) ;
    public final void ruleMapFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:550:2: ( ( ( rule__MapFieldType__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:551:1: ( ( rule__MapFieldType__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:551:1: ( ( rule__MapFieldType__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:552:1: ( rule__MapFieldType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapFieldTypeAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:553:1: ( rule__MapFieldType__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:553:2: rule__MapFieldType__Group__0
            {
            pushFollow(FOLLOW_rule__MapFieldType__Group__0_in_ruleMapFieldType1121);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:565:1: entryRuleTypeLink : ruleTypeLink EOF ;
    public final void entryRuleTypeLink() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:566:1: ( ruleTypeLink EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:567:1: ruleTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_entryRuleTypeLink1148);
            ruleTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeLink1155); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:574:1: ruleTypeLink : ( ( rule__TypeLink__Alternatives ) ) ;
    public final void ruleTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:578:2: ( ( ( rule__TypeLink__Alternatives ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:579:1: ( ( rule__TypeLink__Alternatives ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:579:1: ( ( rule__TypeLink__Alternatives ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:580:1: ( rule__TypeLink__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLinkAccess().getAlternatives()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:581:1: ( rule__TypeLink__Alternatives )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:581:2: rule__TypeLink__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeLink__Alternatives_in_ruleTypeLink1181);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:593:1: entryRulePrimativeTypeLink : rulePrimativeTypeLink EOF ;
    public final void entryRulePrimativeTypeLink() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:594:1: ( rulePrimativeTypeLink EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:595:1: rulePrimativeTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimativeTypeLinkRule()); 
            }
            pushFollow(FOLLOW_rulePrimativeTypeLink_in_entryRulePrimativeTypeLink1208);
            rulePrimativeTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimativeTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimativeTypeLink1215); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:602:1: rulePrimativeTypeLink : ( ( rule__PrimativeTypeLink__TargetAssignment ) ) ;
    public final void rulePrimativeTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:606:2: ( ( ( rule__PrimativeTypeLink__TargetAssignment ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:607:1: ( ( rule__PrimativeTypeLink__TargetAssignment ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:607:1: ( ( rule__PrimativeTypeLink__TargetAssignment ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:608:1: ( rule__PrimativeTypeLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimativeTypeLinkAccess().getTargetAssignment()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:609:1: ( rule__PrimativeTypeLink__TargetAssignment )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:609:2: rule__PrimativeTypeLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__PrimativeTypeLink__TargetAssignment_in_rulePrimativeTypeLink1241);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:621:1: entryRuleCustomTypeLink : ruleCustomTypeLink EOF ;
    public final void entryRuleCustomTypeLink() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:622:1: ( ruleCustomTypeLink EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:623:1: ruleCustomTypeLink EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeLinkRule()); 
            }
            pushFollow(FOLLOW_ruleCustomTypeLink_in_entryRuleCustomTypeLink1268);
            ruleCustomTypeLink();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomTypeLinkRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomTypeLink1275); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:630:1: ruleCustomTypeLink : ( ( rule__CustomTypeLink__TargetAssignment ) ) ;
    public final void ruleCustomTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:634:2: ( ( ( rule__CustomTypeLink__TargetAssignment ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:635:1: ( ( rule__CustomTypeLink__TargetAssignment ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:635:1: ( ( rule__CustomTypeLink__TargetAssignment ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:636:1: ( rule__CustomTypeLink__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeLinkAccess().getTargetAssignment()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:637:1: ( rule__CustomTypeLink__TargetAssignment )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:637:2: rule__CustomTypeLink__TargetAssignment
            {
            pushFollow(FOLLOW_rule__CustomTypeLink__TargetAssignment_in_ruleCustomTypeLink1301);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:649:1: entryRuleFixedType : ruleFixedType EOF ;
    public final void entryRuleFixedType() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:650:1: ( ruleFixedType EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:651:1: ruleFixedType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixedTypeRule()); 
            }
            pushFollow(FOLLOW_ruleFixedType_in_entryRuleFixedType1328);
            ruleFixedType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixedTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFixedType1335); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:658:1: ruleFixedType : ( ( rule__FixedType__Group__0 ) ) ;
    public final void ruleFixedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:662:2: ( ( ( rule__FixedType__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:663:1: ( ( rule__FixedType__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:663:1: ( ( rule__FixedType__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:664:1: ( rule__FixedType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixedTypeAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:665:1: ( rule__FixedType__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:665:2: rule__FixedType__Group__0
            {
            pushFollow(FOLLOW_rule__FixedType__Group__0_in_ruleFixedType1361);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:677:1: entryRuleEnumType : ruleEnumType EOF ;
    public final void entryRuleEnumType() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:678:1: ( ruleEnumType EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:679:1: ruleEnumType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeRule()); 
            }
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType1388);
            ruleEnumType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType1395); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:686:1: ruleEnumType : ( ( rule__EnumType__Group__0 ) ) ;
    public final void ruleEnumType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:690:2: ( ( ( rule__EnumType__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:691:1: ( ( rule__EnumType__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:691:1: ( ( rule__EnumType__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:692:1: ( rule__EnumType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:693:1: ( rule__EnumType__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:693:2: rule__EnumType__Group__0
            {
            pushFollow(FOLLOW_rule__EnumType__Group__0_in_ruleEnumType1421);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:705:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:706:1: ( ruleAnnotation EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:707:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation1448);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation1455); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:714:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:718:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:719:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:719:1: ( ( rule__Annotation__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:720:1: ( rule__Annotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:721:1: ( rule__Annotation__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:721:2: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation1481);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:733:1: entryRuleValues : ruleValues EOF ;
    public final void entryRuleValues() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:734:1: ( ruleValues EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:735:1: ruleValues EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesRule()); 
            }
            pushFollow(FOLLOW_ruleValues_in_entryRuleValues1508);
            ruleValues();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValues1515); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:742:1: ruleValues : ( ( rule__Values__Group__0 ) ) ;
    public final void ruleValues() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:746:2: ( ( ( rule__Values__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:747:1: ( ( rule__Values__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:747:1: ( ( rule__Values__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:748:1: ( rule__Values__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:749:1: ( rule__Values__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:749:2: rule__Values__Group__0
            {
            pushFollow(FOLLOW_rule__Values__Group__0_in_ruleValues1541);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:761:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:762:1: ( ruleArray EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:763:1: ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray1568);
            ruleArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray1575); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:770:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:774:2: ( ( ( rule__Array__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:775:1: ( ( rule__Array__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:775:1: ( ( rule__Array__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:776:1: ( rule__Array__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:777:1: ( rule__Array__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:777:2: rule__Array__Group__0
            {
            pushFollow(FOLLOW_rule__Array__Group__0_in_ruleArray1601);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:789:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:790:1: ( ruleValue EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:791:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1628);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1635); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:798:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:802:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:803:1: ( ( rule__Value__Alternatives ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:803:1: ( ( rule__Value__Alternatives ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:804:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:805:1: ( rule__Value__Alternatives )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:805:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue1661);
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


    // $ANTLR start "entryRuleNull"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:817:1: entryRuleNull : ruleNull EOF ;
    public final void entryRuleNull() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:818:1: ( ruleNull EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:819:1: ruleNull EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullRule()); 
            }
            pushFollow(FOLLOW_ruleNull_in_entryRuleNull1688);
            ruleNull();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNull1695); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:826:1: ruleNull : ( ( rule__Null__ValAssignment ) ) ;
    public final void ruleNull() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:830:2: ( ( ( rule__Null__ValAssignment ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:831:1: ( ( rule__Null__ValAssignment ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:831:1: ( ( rule__Null__ValAssignment ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:832:1: ( rule__Null__ValAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAccess().getValAssignment()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:833:1: ( rule__Null__ValAssignment )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:833:2: rule__Null__ValAssignment
            {
            pushFollow(FOLLOW_rule__Null__ValAssignment_in_ruleNull1721);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:845:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:846:1: ( ruleStringValue EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:847:1: ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1748);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1755); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:854:1: ruleStringValue : ( ( rule__StringValue__ValAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:858:2: ( ( ( rule__StringValue__ValAssignment ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:859:1: ( ( rule__StringValue__ValAssignment ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:859:1: ( ( rule__StringValue__ValAssignment ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:860:1: ( rule__StringValue__ValAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValAssignment()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:861:1: ( rule__StringValue__ValAssignment )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:861:2: rule__StringValue__ValAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValAssignment_in_ruleStringValue1781);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:873:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:874:1: ( ruleIntValue EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:875:1: ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue1808);
            ruleIntValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue1815); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:882:1: ruleIntValue : ( ( rule__IntValue__ValAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:886:2: ( ( ( rule__IntValue__ValAssignment ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:887:1: ( ( rule__IntValue__ValAssignment ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:887:1: ( ( rule__IntValue__ValAssignment ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:888:1: ( rule__IntValue__ValAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValAssignment()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:889:1: ( rule__IntValue__ValAssignment )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:889:2: rule__IntValue__ValAssignment
            {
            pushFollow(FOLLOW_rule__IntValue__ValAssignment_in_ruleIntValue1841);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:901:1: entryRuleEscapableId : ruleEscapableId EOF ;
    public final void entryRuleEscapableId() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:902:1: ( ruleEscapableId EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:903:1: ruleEscapableId EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEscapableIdRule()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_entryRuleEscapableId1868);
            ruleEscapableId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEscapableIdRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapableId1875); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:910:1: ruleEscapableId : ( ( rule__EscapableId__Alternatives ) ) ;
    public final void ruleEscapableId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:914:2: ( ( ( rule__EscapableId__Alternatives ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:915:1: ( ( rule__EscapableId__Alternatives ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:915:1: ( ( rule__EscapableId__Alternatives ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:916:1: ( rule__EscapableId__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEscapableIdAccess().getAlternatives()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:917:1: ( rule__EscapableId__Alternatives )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:917:2: rule__EscapableId__Alternatives
            {
            pushFollow(FOLLOW_rule__EscapableId__Alternatives_in_ruleEscapableId1901);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:929:1: entryRuleReservedKeyWords : ruleReservedKeyWords EOF ;
    public final void entryRuleReservedKeyWords() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:930:1: ( ruleReservedKeyWords EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:931:1: ruleReservedKeyWords EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReservedKeyWordsRule()); 
            }
            pushFollow(FOLLOW_ruleReservedKeyWords_in_entryRuleReservedKeyWords1928);
            ruleReservedKeyWords();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReservedKeyWordsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReservedKeyWords1935); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:938:1: ruleReservedKeyWords : ( ( rule__ReservedKeyWords__Alternatives ) ) ;
    public final void ruleReservedKeyWords() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:942:2: ( ( ( rule__ReservedKeyWords__Alternatives ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:943:1: ( ( rule__ReservedKeyWords__Alternatives ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:943:1: ( ( rule__ReservedKeyWords__Alternatives ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:944:1: ( rule__ReservedKeyWords__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReservedKeyWordsAccess().getAlternatives()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:945:1: ( rule__ReservedKeyWords__Alternatives )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:945:2: rule__ReservedKeyWords__Alternatives
            {
            pushFollow(FOLLOW_rule__ReservedKeyWords__Alternatives_in_ruleReservedKeyWords1961);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:957:1: entryRuleAN : ruleAN EOF ;
    public final void entryRuleAN() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:958:1: ( ruleAN EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:959:1: ruleAN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANRule()); 
            }
            pushFollow(FOLLOW_ruleAN_in_entryRuleAN1988);
            ruleAN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getANRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAN1995); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:966:1: ruleAN : ( ( rule__AN__Group__0 ) ) ;
    public final void ruleAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:970:2: ( ( ( rule__AN__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:971:1: ( ( rule__AN__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:971:1: ( ( rule__AN__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:972:1: ( rule__AN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:973:1: ( rule__AN__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:973:2: rule__AN__Group__0
            {
            pushFollow(FOLLOW_rule__AN__Group__0_in_ruleAN2021);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:985:1: entryRuleNegativeInt : ruleNegativeInt EOF ;
    public final void entryRuleNegativeInt() throws RecognitionException {
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:986:1: ( ruleNegativeInt EOF )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:987:1: ruleNegativeInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeIntRule()); 
            }
            pushFollow(FOLLOW_ruleNegativeInt_in_entryRuleNegativeInt2048);
            ruleNegativeInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeIntRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegativeInt2055); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:994:1: ruleNegativeInt : ( ( rule__NegativeInt__Group__0 ) ) ;
    public final void ruleNegativeInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:998:2: ( ( ( rule__NegativeInt__Group__0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:999:1: ( ( rule__NegativeInt__Group__0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:999:1: ( ( rule__NegativeInt__Group__0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1000:1: ( rule__NegativeInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeIntAccess().getGroup()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1001:1: ( rule__NegativeInt__Group__0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1001:2: rule__NegativeInt__Group__0
            {
            pushFollow(FOLLOW_rule__NegativeInt__Group__0_in_ruleNegativeInt2081);
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


    // $ANTLR start "ruleImportType"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1014:1: ruleImportType : ( ( rule__ImportType__Alternatives ) ) ;
    public final void ruleImportType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1018:1: ( ( ( rule__ImportType__Alternatives ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1019:1: ( ( rule__ImportType__Alternatives ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1019:1: ( ( rule__ImportType__Alternatives ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1020:1: ( rule__ImportType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportTypeAccess().getAlternatives()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1021:1: ( rule__ImportType__Alternatives )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1021:2: rule__ImportType__Alternatives
            {
            pushFollow(FOLLOW_rule__ImportType__Alternatives_in_ruleImportType2118);
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


    // $ANTLR start "rule__AvdlFile__Alternatives"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1032:1: rule__AvdlFile__Alternatives : ( ( ( rule__AvdlFile__ImportsAssignment_0 ) ) | ( ( rule__AvdlFile__ProtocolsAssignment_1 ) ) );
    public final void rule__AvdlFile__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1036:1: ( ( ( rule__AvdlFile__ImportsAssignment_0 ) ) | ( ( rule__AvdlFile__ProtocolsAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            else if ( (LA2_0==25||LA2_0==40) ) {
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
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1037:1: ( ( rule__AvdlFile__ImportsAssignment_0 ) )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1037:1: ( ( rule__AvdlFile__ImportsAssignment_0 ) )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1038:1: ( rule__AvdlFile__ImportsAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAvdlFileAccess().getImportsAssignment_0()); 
                    }
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1039:1: ( rule__AvdlFile__ImportsAssignment_0 )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1039:2: rule__AvdlFile__ImportsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__AvdlFile__ImportsAssignment_0_in_rule__AvdlFile__Alternatives2153);
                    rule__AvdlFile__ImportsAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAvdlFileAccess().getImportsAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1043:6: ( ( rule__AvdlFile__ProtocolsAssignment_1 ) )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1043:6: ( ( rule__AvdlFile__ProtocolsAssignment_1 ) )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1044:1: ( rule__AvdlFile__ProtocolsAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAvdlFileAccess().getProtocolsAssignment_1()); 
                    }
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1045:1: ( rule__AvdlFile__ProtocolsAssignment_1 )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1045:2: rule__AvdlFile__ProtocolsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__AvdlFile__ProtocolsAssignment_1_in_rule__AvdlFile__Alternatives2171);
                    rule__AvdlFile__ProtocolsAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAvdlFileAccess().getProtocolsAssignment_1()); 
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
    // $ANTLR end "rule__AvdlFile__Alternatives"


    // $ANTLR start "rule__Element__Alternatives"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1054:1: rule__Element__Alternatives : ( ( ruleTypeDef ) | ( ruleRPCMessage ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1058:1: ( ( ruleTypeDef ) | ( ruleRPCMessage ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=18 && LA3_0<=20)||LA3_0==24||LA3_0==40) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||(LA3_0>=11 && LA3_0<=17)||LA3_0==43||LA3_0==45) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1059:1: ( ruleTypeDef )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1059:1: ( ruleTypeDef )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1060:1: ruleTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getTypeDefParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleTypeDef_in_rule__Element__Alternatives2204);
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
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1065:6: ( ruleRPCMessage )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1065:6: ( ruleRPCMessage )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1066:1: ruleRPCMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getRPCMessageParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleRPCMessage_in_rule__Element__Alternatives2221);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1076:1: rule__ReturnTypeLink__Alternatives : ( ( ruleVoidTypeLink ) | ( ruleTypeLink ) );
    public final void rule__ReturnTypeLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1080:1: ( ( ruleVoidTypeLink ) | ( ruleTypeLink ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==45) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID||(LA4_0>=11 && LA4_0<=17)||LA4_0==43) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1081:1: ( ruleVoidTypeLink )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1081:1: ( ruleVoidTypeLink )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1082:1: ruleVoidTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReturnTypeLinkAccess().getVoidTypeLinkParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleVoidTypeLink_in_rule__ReturnTypeLink__Alternatives2253);
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
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1087:6: ( ruleTypeLink )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1087:6: ( ruleTypeLink )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1088:1: ruleTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReturnTypeLinkAccess().getTypeLinkParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleTypeLink_in_rule__ReturnTypeLink__Alternatives2270);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1098:1: rule__Type__Alternatives : ( ( ruleEnumType ) | ( ruleFixedType ) | ( ruleRecordType ) | ( ruleErrorType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1102:1: ( ( ruleEnumType ) | ( ruleFixedType ) | ( ruleRecordType ) | ( ruleErrorType ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 24:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1103:1: ( ruleEnumType )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1103:1: ( ruleEnumType )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1104:1: ruleEnumType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEnumType_in_rule__Type__Alternatives2302);
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
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1109:6: ( ruleFixedType )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1109:6: ( ruleFixedType )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1110:1: ruleFixedType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getFixedTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleFixedType_in_rule__Type__Alternatives2319);
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
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1115:6: ( ruleRecordType )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1115:6: ( ruleRecordType )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1116:1: ruleRecordType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getRecordTypeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleRecordType_in_rule__Type__Alternatives2336);
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
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1121:6: ( ruleErrorType )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1121:6: ( ruleErrorType )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1122:1: ruleErrorType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getErrorTypeParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleErrorType_in_rule__Type__Alternatives2353);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1132:1: rule__FieldType__Alternatives : ( ( ruleSimpleFieldType ) | ( ruleUnionFieldType ) | ( ruleArrayFieldType ) | ( ruleMapFieldType ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1136:1: ( ( ruleSimpleFieldType ) | ( ruleUnionFieldType ) | ( ruleArrayFieldType ) | ( ruleMapFieldType ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 43:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
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
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1137:1: ( ruleSimpleFieldType )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1137:1: ( ruleSimpleFieldType )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1138:1: ruleSimpleFieldType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldTypeAccess().getSimpleFieldTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSimpleFieldType_in_rule__FieldType__Alternatives2385);
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
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1143:6: ( ruleUnionFieldType )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1143:6: ( ruleUnionFieldType )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1144:1: ruleUnionFieldType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldTypeAccess().getUnionFieldTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleUnionFieldType_in_rule__FieldType__Alternatives2402);
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
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1149:6: ( ruleArrayFieldType )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1149:6: ( ruleArrayFieldType )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1150:1: ruleArrayFieldType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldTypeAccess().getArrayFieldTypeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleArrayFieldType_in_rule__FieldType__Alternatives2419);
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
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1155:6: ( ruleMapFieldType )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1155:6: ( ruleMapFieldType )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1156:1: ruleMapFieldType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldTypeAccess().getMapFieldTypeParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleMapFieldType_in_rule__FieldType__Alternatives2436);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1166:1: rule__TypeLink__Alternatives : ( ( rulePrimativeTypeLink ) | ( ruleCustomTypeLink ) );
    public final void rule__TypeLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1170:1: ( ( rulePrimativeTypeLink ) | ( ruleCustomTypeLink ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=11 && LA7_0<=17)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID||LA7_0==43) ) {
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
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1171:1: ( rulePrimativeTypeLink )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1171:1: ( rulePrimativeTypeLink )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1172:1: rulePrimativeTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLinkAccess().getPrimativeTypeLinkParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePrimativeTypeLink_in_rule__TypeLink__Alternatives2468);
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
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1177:6: ( ruleCustomTypeLink )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1177:6: ( ruleCustomTypeLink )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1178:1: ruleCustomTypeLink
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLinkAccess().getCustomTypeLinkParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCustomTypeLink_in_rule__TypeLink__Alternatives2485);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1188:1: rule__PrimativeTypeLink__TargetAlternatives_0 : ( ( 'null' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'bytes' ) | ( 'string' ) );
    public final void rule__PrimativeTypeLink__TargetAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1192:1: ( ( 'null' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'bytes' ) | ( 'string' ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 13:
                {
                alt8=3;
                }
                break;
            case 14:
                {
                alt8=4;
                }
                break;
            case 15:
                {
                alt8=5;
                }
                break;
            case 16:
                {
                alt8=6;
                }
                break;
            case 17:
                {
                alt8=7;
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
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1193:1: ( 'null' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1193:1: ( 'null' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1194:1: 'null'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimativeTypeLinkAccess().getTargetNullKeyword_0_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__PrimativeTypeLink__TargetAlternatives_02518); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimativeTypeLinkAccess().getTargetNullKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1201:6: ( 'int' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1201:6: ( 'int' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1202:1: 'int'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimativeTypeLinkAccess().getTargetIntKeyword_0_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__PrimativeTypeLink__TargetAlternatives_02538); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimativeTypeLinkAccess().getTargetIntKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1209:6: ( 'long' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1209:6: ( 'long' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1210:1: 'long'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimativeTypeLinkAccess().getTargetLongKeyword_0_2()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__PrimativeTypeLink__TargetAlternatives_02558); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimativeTypeLinkAccess().getTargetLongKeyword_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1217:6: ( 'float' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1217:6: ( 'float' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1218:1: 'float'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimativeTypeLinkAccess().getTargetFloatKeyword_0_3()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__PrimativeTypeLink__TargetAlternatives_02578); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimativeTypeLinkAccess().getTargetFloatKeyword_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1225:6: ( 'double' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1225:6: ( 'double' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1226:1: 'double'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimativeTypeLinkAccess().getTargetDoubleKeyword_0_4()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__PrimativeTypeLink__TargetAlternatives_02598); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimativeTypeLinkAccess().getTargetDoubleKeyword_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1233:6: ( 'bytes' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1233:6: ( 'bytes' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1234:1: 'bytes'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimativeTypeLinkAccess().getTargetBytesKeyword_0_5()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__PrimativeTypeLink__TargetAlternatives_02618); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimativeTypeLinkAccess().getTargetBytesKeyword_0_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1241:6: ( 'string' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1241:6: ( 'string' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1242:1: 'string'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimativeTypeLinkAccess().getTargetStringKeyword_0_6()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__PrimativeTypeLink__TargetAlternatives_02638); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimativeTypeLinkAccess().getTargetStringKeyword_0_6()); 
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1254:1: rule__Values__Alternatives_1 : ( ( ( rule__Values__ValueAssignment_1_0 ) ) | ( ( rule__Values__Group_1_1__0 ) ) );
    public final void rule__Values__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1258:1: ( ( ( rule__Values__ValueAssignment_1_0 ) ) | ( ( rule__Values__Group_1_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==41) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred18_InternalAvdl()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==RULE_INT||LA9_0==RULE_STRING||LA9_0==11||LA9_0==44) ) {
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
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1259:1: ( ( rule__Values__ValueAssignment_1_0 ) )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1259:1: ( ( rule__Values__ValueAssignment_1_0 ) )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1260:1: ( rule__Values__ValueAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuesAccess().getValueAssignment_1_0()); 
                    }
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1261:1: ( rule__Values__ValueAssignment_1_0 )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1261:2: rule__Values__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Values__ValueAssignment_1_0_in_rule__Values__Alternatives_12672);
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
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1265:6: ( ( rule__Values__Group_1_1__0 ) )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1265:6: ( ( rule__Values__Group_1_1__0 ) )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1266:1: ( rule__Values__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuesAccess().getGroup_1_1()); 
                    }
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1267:1: ( rule__Values__Group_1_1__0 )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1267:2: rule__Values__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Values__Group_1_1__0_in_rule__Values__Alternatives_12690);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1276:1: rule__Value__Alternatives : ( ( ruleStringValue ) | ( ( ruleArray ) ) | ( ruleIntValue ) | ( ruleNull ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1280:1: ( ( ruleStringValue ) | ( ( ruleArray ) ) | ( ruleIntValue ) | ( ruleNull ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt10=1;
                }
                break;
            case 41:
                {
                alt10=2;
                }
                break;
            case RULE_INT:
            case 44:
                {
                alt10=3;
                }
                break;
            case 11:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1281:1: ( ruleStringValue )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1281:1: ( ruleStringValue )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1282:1: ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_rule__Value__Alternatives2723);
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
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1287:6: ( ( ruleArray ) )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1287:6: ( ( ruleArray ) )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1288:1: ( ruleArray )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getArrayParserRuleCall_1()); 
                    }
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1289:1: ( ruleArray )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1289:3: ruleArray
                    {
                    pushFollow(FOLLOW_ruleArray_in_rule__Value__Alternatives2741);
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
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1293:6: ( ruleIntValue )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1293:6: ( ruleIntValue )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1294:1: ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getIntValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_rule__Value__Alternatives2759);
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
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1299:6: ( ruleNull )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1299:6: ( ruleNull )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1300:1: ruleNull
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getNullParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleNull_in_rule__Value__Alternatives2776);
                    ruleNull();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getNullParserRuleCall_3()); 
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1310:1: rule__IntValue__ValAlternatives_0 : ( ( RULE_INT ) | ( ruleNegativeInt ) );
    public final void rule__IntValue__ValAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1314:1: ( ( RULE_INT ) | ( ruleNegativeInt ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            else if ( (LA11_0==44) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1315:1: ( RULE_INT )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1315:1: ( RULE_INT )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1316:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIntValueAccess().getValINTTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntValue__ValAlternatives_02808); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIntValueAccess().getValINTTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1321:6: ( ruleNegativeInt )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1321:6: ( ruleNegativeInt )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1322:1: ruleNegativeInt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIntValueAccess().getValNegativeIntParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleNegativeInt_in_rule__IntValue__ValAlternatives_02825);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1332:1: rule__EscapableId__Alternatives : ( ( RULE_ID ) | ( ( rule__EscapableId__Group_1__0 ) ) );
    public final void rule__EscapableId__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1336:1: ( ( RULE_ID ) | ( ( rule__EscapableId__Group_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==43) ) {
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
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1337:1: ( RULE_ID )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1337:1: ( RULE_ID )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1338:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEscapableIdAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EscapableId__Alternatives2857); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEscapableIdAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1343:6: ( ( rule__EscapableId__Group_1__0 ) )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1343:6: ( ( rule__EscapableId__Group_1__0 ) )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1344:1: ( rule__EscapableId__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEscapableIdAccess().getGroup_1()); 
                    }
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1345:1: ( rule__EscapableId__Group_1__0 )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1345:2: rule__EscapableId__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EscapableId__Group_1__0_in_rule__EscapableId__Alternatives2874);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1354:1: rule__ReservedKeyWords__Alternatives : ( ( 'record' ) | ( 'fixed' ) | ( 'enum' ) | ( 'map' ) | ( 'array' ) | ( 'union' ) | ( 'error' ) | ( 'protocol' ) | ( 'oneway' ) | ( 'import' ) | ( 'throws' ) );
    public final void rule__ReservedKeyWords__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1358:1: ( ( 'record' ) | ( 'fixed' ) | ( 'enum' ) | ( 'map' ) | ( 'array' ) | ( 'union' ) | ( 'error' ) | ( 'protocol' ) | ( 'oneway' ) | ( 'import' ) | ( 'throws' ) )
            int alt13=11;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt13=1;
                }
                break;
            case 19:
                {
                alt13=2;
                }
                break;
            case 20:
                {
                alt13=3;
                }
                break;
            case 21:
                {
                alt13=4;
                }
                break;
            case 22:
                {
                alt13=5;
                }
                break;
            case 23:
                {
                alt13=6;
                }
                break;
            case 24:
                {
                alt13=7;
                }
                break;
            case 25:
                {
                alt13=8;
                }
                break;
            case 26:
                {
                alt13=9;
                }
                break;
            case 27:
                {
                alt13=10;
                }
                break;
            case 28:
                {
                alt13=11;
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
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1359:1: ( 'record' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1359:1: ( 'record' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1360:1: 'record'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getRecordKeyword_0()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__ReservedKeyWords__Alternatives2908); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReservedKeyWordsAccess().getRecordKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1367:6: ( 'fixed' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1367:6: ( 'fixed' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1368:1: 'fixed'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getFixedKeyword_1()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__ReservedKeyWords__Alternatives2928); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReservedKeyWordsAccess().getFixedKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1375:6: ( 'enum' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1375:6: ( 'enum' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1376:1: 'enum'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getEnumKeyword_2()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__ReservedKeyWords__Alternatives2948); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReservedKeyWordsAccess().getEnumKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1383:6: ( 'map' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1383:6: ( 'map' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1384:1: 'map'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getMapKeyword_3()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__ReservedKeyWords__Alternatives2968); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReservedKeyWordsAccess().getMapKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1391:6: ( 'array' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1391:6: ( 'array' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1392:1: 'array'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getArrayKeyword_4()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__ReservedKeyWords__Alternatives2988); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReservedKeyWordsAccess().getArrayKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1399:6: ( 'union' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1399:6: ( 'union' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1400:1: 'union'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getUnionKeyword_5()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__ReservedKeyWords__Alternatives3008); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReservedKeyWordsAccess().getUnionKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1407:6: ( 'error' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1407:6: ( 'error' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1408:1: 'error'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getErrorKeyword_6()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__ReservedKeyWords__Alternatives3028); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReservedKeyWordsAccess().getErrorKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1415:6: ( 'protocol' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1415:6: ( 'protocol' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1416:1: 'protocol'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getProtocolKeyword_7()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__ReservedKeyWords__Alternatives3048); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReservedKeyWordsAccess().getProtocolKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1423:6: ( 'oneway' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1423:6: ( 'oneway' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1424:1: 'oneway'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getOnewayKeyword_8()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__ReservedKeyWords__Alternatives3068); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReservedKeyWordsAccess().getOnewayKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1431:6: ( 'import' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1431:6: ( 'import' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1432:1: 'import'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getImportKeyword_9()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__ReservedKeyWords__Alternatives3088); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReservedKeyWordsAccess().getImportKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1439:6: ( 'throws' )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1439:6: ( 'throws' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1440:1: 'throws'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReservedKeyWordsAccess().getThrowsKeyword_10()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__ReservedKeyWords__Alternatives3108); if (state.failed) return ;
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


    // $ANTLR start "rule__ImportType__Alternatives"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1452:1: rule__ImportType__Alternatives : ( ( ( 'idl' ) ) | ( ( 'protocol' ) ) | ( ( 'schema' ) ) );
    public final void rule__ImportType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1456:1: ( ( ( 'idl' ) ) | ( ( 'protocol' ) ) | ( ( 'schema' ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt14=1;
                }
                break;
            case 25:
                {
                alt14=2;
                }
                break;
            case 30:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1457:1: ( ( 'idl' ) )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1457:1: ( ( 'idl' ) )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1458:1: ( 'idl' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportTypeAccess().getIDLEnumLiteralDeclaration_0()); 
                    }
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1459:1: ( 'idl' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1459:3: 'idl'
                    {
                    match(input,29,FOLLOW_29_in_rule__ImportType__Alternatives3143); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImportTypeAccess().getIDLEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1464:6: ( ( 'protocol' ) )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1464:6: ( ( 'protocol' ) )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1465:1: ( 'protocol' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportTypeAccess().getPROTOCOLEnumLiteralDeclaration_1()); 
                    }
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1466:1: ( 'protocol' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1466:3: 'protocol'
                    {
                    match(input,25,FOLLOW_25_in_rule__ImportType__Alternatives3164); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImportTypeAccess().getPROTOCOLEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1471:6: ( ( 'schema' ) )
                    {
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1471:6: ( ( 'schema' ) )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1472:1: ( 'schema' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportTypeAccess().getSCHEMAEnumLiteralDeclaration_2()); 
                    }
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1473:1: ( 'schema' )
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1473:3: 'schema'
                    {
                    match(input,30,FOLLOW_30_in_rule__ImportType__Alternatives3185); if (state.failed) return ;

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


    // $ANTLR start "rule__Import__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1485:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1489:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1490:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03218);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03221);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1497:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1501:1: ( ( 'import' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1502:1: ( 'import' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1502:1: ( 'import' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1503:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Import__Group__0__Impl3249); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1516:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1520:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1521:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13280);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__2_in_rule__Import__Group__13283);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1528:1: rule__Import__Group__1__Impl : ( ( rule__Import__TypeAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1532:1: ( ( ( rule__Import__TypeAssignment_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1533:1: ( ( rule__Import__TypeAssignment_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1533:1: ( ( rule__Import__TypeAssignment_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1534:1: ( rule__Import__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getTypeAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1535:1: ( rule__Import__TypeAssignment_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1535:2: rule__Import__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__TypeAssignment_1_in_rule__Import__Group__1__Impl3310);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1545:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1549:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1550:2: rule__Import__Group__2__Impl rule__Import__Group__3
            {
            pushFollow(FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__23340);
            rule__Import__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__3_in_rule__Import__Group__23343);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1557:1: rule__Import__Group__2__Impl : ( ( rule__Import__ImportUriAssignment_2 ) ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1561:1: ( ( ( rule__Import__ImportUriAssignment_2 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1562:1: ( ( rule__Import__ImportUriAssignment_2 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1562:1: ( ( rule__Import__ImportUriAssignment_2 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1563:1: ( rule__Import__ImportUriAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportUriAssignment_2()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1564:1: ( rule__Import__ImportUriAssignment_2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1564:2: rule__Import__ImportUriAssignment_2
            {
            pushFollow(FOLLOW_rule__Import__ImportUriAssignment_2_in_rule__Import__Group__2__Impl3370);
            rule__Import__ImportUriAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportUriAssignment_2()); 
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1574:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1578:1: ( rule__Import__Group__3__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1579:2: rule__Import__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__3__Impl_in_rule__Import__Group__33400);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1585:1: rule__Import__Group__3__Impl : ( ';' ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1589:1: ( ( ';' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1590:1: ( ';' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1590:1: ( ';' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1591:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getSemicolonKeyword_3()); 
            }
            match(input,31,FOLLOW_31_in_rule__Import__Group__3__Impl3428); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1612:1: rule__Protocol__Group__0 : rule__Protocol__Group__0__Impl rule__Protocol__Group__1 ;
    public final void rule__Protocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1616:1: ( rule__Protocol__Group__0__Impl rule__Protocol__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1617:2: rule__Protocol__Group__0__Impl rule__Protocol__Group__1
            {
            pushFollow(FOLLOW_rule__Protocol__Group__0__Impl_in_rule__Protocol__Group__03467);
            rule__Protocol__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Protocol__Group__1_in_rule__Protocol__Group__03470);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1624:1: rule__Protocol__Group__0__Impl : ( ( rule__Protocol__AnnotationsAssignment_0 )* ) ;
    public final void rule__Protocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1628:1: ( ( ( rule__Protocol__AnnotationsAssignment_0 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1629:1: ( ( rule__Protocol__AnnotationsAssignment_0 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1629:1: ( ( rule__Protocol__AnnotationsAssignment_0 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1630:1: ( rule__Protocol__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getAnnotationsAssignment_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1631:1: ( rule__Protocol__AnnotationsAssignment_0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==40) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1631:2: rule__Protocol__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Protocol__AnnotationsAssignment_0_in_rule__Protocol__Group__0__Impl3497);
            	    rule__Protocol__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1641:1: rule__Protocol__Group__1 : rule__Protocol__Group__1__Impl rule__Protocol__Group__2 ;
    public final void rule__Protocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1645:1: ( rule__Protocol__Group__1__Impl rule__Protocol__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1646:2: rule__Protocol__Group__1__Impl rule__Protocol__Group__2
            {
            pushFollow(FOLLOW_rule__Protocol__Group__1__Impl_in_rule__Protocol__Group__13528);
            rule__Protocol__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Protocol__Group__2_in_rule__Protocol__Group__13531);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1653:1: rule__Protocol__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__Protocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1657:1: ( ( 'protocol' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1658:1: ( 'protocol' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1658:1: ( 'protocol' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1659:1: 'protocol'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getProtocolKeyword_1()); 
            }
            match(input,25,FOLLOW_25_in_rule__Protocol__Group__1__Impl3559); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1672:1: rule__Protocol__Group__2 : rule__Protocol__Group__2__Impl rule__Protocol__Group__3 ;
    public final void rule__Protocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1676:1: ( rule__Protocol__Group__2__Impl rule__Protocol__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1677:2: rule__Protocol__Group__2__Impl rule__Protocol__Group__3
            {
            pushFollow(FOLLOW_rule__Protocol__Group__2__Impl_in_rule__Protocol__Group__23590);
            rule__Protocol__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Protocol__Group__3_in_rule__Protocol__Group__23593);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1684:1: rule__Protocol__Group__2__Impl : ( ( rule__Protocol__NameAssignment_2 ) ) ;
    public final void rule__Protocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1688:1: ( ( ( rule__Protocol__NameAssignment_2 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1689:1: ( ( rule__Protocol__NameAssignment_2 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1689:1: ( ( rule__Protocol__NameAssignment_2 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1690:1: ( rule__Protocol__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getNameAssignment_2()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1691:1: ( rule__Protocol__NameAssignment_2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1691:2: rule__Protocol__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Protocol__NameAssignment_2_in_rule__Protocol__Group__2__Impl3620);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1701:1: rule__Protocol__Group__3 : rule__Protocol__Group__3__Impl rule__Protocol__Group__4 ;
    public final void rule__Protocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1705:1: ( rule__Protocol__Group__3__Impl rule__Protocol__Group__4 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1706:2: rule__Protocol__Group__3__Impl rule__Protocol__Group__4
            {
            pushFollow(FOLLOW_rule__Protocol__Group__3__Impl_in_rule__Protocol__Group__33650);
            rule__Protocol__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Protocol__Group__4_in_rule__Protocol__Group__33653);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1713:1: rule__Protocol__Group__3__Impl : ( '{' ) ;
    public final void rule__Protocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1717:1: ( ( '{' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1718:1: ( '{' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1718:1: ( '{' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1719:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__Protocol__Group__3__Impl3681); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1732:1: rule__Protocol__Group__4 : rule__Protocol__Group__4__Impl rule__Protocol__Group__5 ;
    public final void rule__Protocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1736:1: ( rule__Protocol__Group__4__Impl rule__Protocol__Group__5 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1737:2: rule__Protocol__Group__4__Impl rule__Protocol__Group__5
            {
            pushFollow(FOLLOW_rule__Protocol__Group__4__Impl_in_rule__Protocol__Group__43712);
            rule__Protocol__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Protocol__Group__5_in_rule__Protocol__Group__43715);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1744:1: rule__Protocol__Group__4__Impl : ( ( rule__Protocol__ElementsAssignment_4 )* ) ;
    public final void rule__Protocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1748:1: ( ( ( rule__Protocol__ElementsAssignment_4 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1749:1: ( ( rule__Protocol__ElementsAssignment_4 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1749:1: ( ( rule__Protocol__ElementsAssignment_4 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1750:1: ( rule__Protocol__ElementsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getElementsAssignment_4()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1751:1: ( rule__Protocol__ElementsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||(LA16_0>=11 && LA16_0<=20)||LA16_0==24||LA16_0==40||LA16_0==43||LA16_0==45) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1751:2: rule__Protocol__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Protocol__ElementsAssignment_4_in_rule__Protocol__Group__4__Impl3742);
            	    rule__Protocol__ElementsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1761:1: rule__Protocol__Group__5 : rule__Protocol__Group__5__Impl ;
    public final void rule__Protocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1765:1: ( rule__Protocol__Group__5__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1766:2: rule__Protocol__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Protocol__Group__5__Impl_in_rule__Protocol__Group__53773);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1772:1: rule__Protocol__Group__5__Impl : ( '}' ) ;
    public final void rule__Protocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1776:1: ( ( '}' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1777:1: ( '}' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1777:1: ( '}' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1778:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,33,FOLLOW_33_in_rule__Protocol__Group__5__Impl3801); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1803:1: rule__RPCMessage__Group__0 : rule__RPCMessage__Group__0__Impl rule__RPCMessage__Group__1 ;
    public final void rule__RPCMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1807:1: ( rule__RPCMessage__Group__0__Impl rule__RPCMessage__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1808:2: rule__RPCMessage__Group__0__Impl rule__RPCMessage__Group__1
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group__0__Impl_in_rule__RPCMessage__Group__03844);
            rule__RPCMessage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RPCMessage__Group__1_in_rule__RPCMessage__Group__03847);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1815:1: rule__RPCMessage__Group__0__Impl : ( ( rule__RPCMessage__ReturnTypeAssignment_0 ) ) ;
    public final void rule__RPCMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1819:1: ( ( ( rule__RPCMessage__ReturnTypeAssignment_0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1820:1: ( ( rule__RPCMessage__ReturnTypeAssignment_0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1820:1: ( ( rule__RPCMessage__ReturnTypeAssignment_0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1821:1: ( rule__RPCMessage__ReturnTypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getReturnTypeAssignment_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1822:1: ( rule__RPCMessage__ReturnTypeAssignment_0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1822:2: rule__RPCMessage__ReturnTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__RPCMessage__ReturnTypeAssignment_0_in_rule__RPCMessage__Group__0__Impl3874);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1832:1: rule__RPCMessage__Group__1 : rule__RPCMessage__Group__1__Impl rule__RPCMessage__Group__2 ;
    public final void rule__RPCMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1836:1: ( rule__RPCMessage__Group__1__Impl rule__RPCMessage__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1837:2: rule__RPCMessage__Group__1__Impl rule__RPCMessage__Group__2
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group__1__Impl_in_rule__RPCMessage__Group__13904);
            rule__RPCMessage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RPCMessage__Group__2_in_rule__RPCMessage__Group__13907);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1844:1: rule__RPCMessage__Group__1__Impl : ( ( rule__RPCMessage__NameAssignment_1 ) ) ;
    public final void rule__RPCMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1848:1: ( ( ( rule__RPCMessage__NameAssignment_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1849:1: ( ( rule__RPCMessage__NameAssignment_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1849:1: ( ( rule__RPCMessage__NameAssignment_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1850:1: ( rule__RPCMessage__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getNameAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1851:1: ( rule__RPCMessage__NameAssignment_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1851:2: rule__RPCMessage__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RPCMessage__NameAssignment_1_in_rule__RPCMessage__Group__1__Impl3934);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1861:1: rule__RPCMessage__Group__2 : rule__RPCMessage__Group__2__Impl rule__RPCMessage__Group__3 ;
    public final void rule__RPCMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1865:1: ( rule__RPCMessage__Group__2__Impl rule__RPCMessage__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1866:2: rule__RPCMessage__Group__2__Impl rule__RPCMessage__Group__3
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group__2__Impl_in_rule__RPCMessage__Group__23964);
            rule__RPCMessage__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RPCMessage__Group__3_in_rule__RPCMessage__Group__23967);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1873:1: rule__RPCMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__RPCMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1877:1: ( ( '(' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1878:1: ( '(' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1878:1: ( '(' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1879:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,34,FOLLOW_34_in_rule__RPCMessage__Group__2__Impl3995); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1892:1: rule__RPCMessage__Group__3 : rule__RPCMessage__Group__3__Impl rule__RPCMessage__Group__4 ;
    public final void rule__RPCMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1896:1: ( rule__RPCMessage__Group__3__Impl rule__RPCMessage__Group__4 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1897:2: rule__RPCMessage__Group__3__Impl rule__RPCMessage__Group__4
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group__3__Impl_in_rule__RPCMessage__Group__34026);
            rule__RPCMessage__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RPCMessage__Group__4_in_rule__RPCMessage__Group__34029);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1904:1: rule__RPCMessage__Group__3__Impl : ( ( rule__RPCMessage__Group_3__0 )* ) ;
    public final void rule__RPCMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1908:1: ( ( ( rule__RPCMessage__Group_3__0 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1909:1: ( ( rule__RPCMessage__Group_3__0 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1909:1: ( ( rule__RPCMessage__Group_3__0 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1910:1: ( rule__RPCMessage__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getGroup_3()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1911:1: ( rule__RPCMessage__Group_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||(LA17_0>=11 && LA17_0<=17)||LA17_0==43) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1911:2: rule__RPCMessage__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__RPCMessage__Group_3__0_in_rule__RPCMessage__Group__3__Impl4056);
            	    rule__RPCMessage__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1921:1: rule__RPCMessage__Group__4 : rule__RPCMessage__Group__4__Impl rule__RPCMessage__Group__5 ;
    public final void rule__RPCMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1925:1: ( rule__RPCMessage__Group__4__Impl rule__RPCMessage__Group__5 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1926:2: rule__RPCMessage__Group__4__Impl rule__RPCMessage__Group__5
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group__4__Impl_in_rule__RPCMessage__Group__44087);
            rule__RPCMessage__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RPCMessage__Group__5_in_rule__RPCMessage__Group__44090);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1933:1: rule__RPCMessage__Group__4__Impl : ( ')' ) ;
    public final void rule__RPCMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1937:1: ( ( ')' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1938:1: ( ')' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1938:1: ( ')' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1939:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,35,FOLLOW_35_in_rule__RPCMessage__Group__4__Impl4118); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1952:1: rule__RPCMessage__Group__5 : rule__RPCMessage__Group__5__Impl rule__RPCMessage__Group__6 ;
    public final void rule__RPCMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1956:1: ( rule__RPCMessage__Group__5__Impl rule__RPCMessage__Group__6 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1957:2: rule__RPCMessage__Group__5__Impl rule__RPCMessage__Group__6
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group__5__Impl_in_rule__RPCMessage__Group__54149);
            rule__RPCMessage__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RPCMessage__Group__6_in_rule__RPCMessage__Group__54152);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1964:1: rule__RPCMessage__Group__5__Impl : ( ( rule__RPCMessage__Group_5__0 )? ) ;
    public final void rule__RPCMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1968:1: ( ( ( rule__RPCMessage__Group_5__0 )? ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1969:1: ( ( rule__RPCMessage__Group_5__0 )? )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1969:1: ( ( rule__RPCMessage__Group_5__0 )? )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1970:1: ( rule__RPCMessage__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getGroup_5()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1971:1: ( rule__RPCMessage__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1971:2: rule__RPCMessage__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__RPCMessage__Group_5__0_in_rule__RPCMessage__Group__5__Impl4179);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1981:1: rule__RPCMessage__Group__6 : rule__RPCMessage__Group__6__Impl rule__RPCMessage__Group__7 ;
    public final void rule__RPCMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1985:1: ( rule__RPCMessage__Group__6__Impl rule__RPCMessage__Group__7 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1986:2: rule__RPCMessage__Group__6__Impl rule__RPCMessage__Group__7
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group__6__Impl_in_rule__RPCMessage__Group__64210);
            rule__RPCMessage__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RPCMessage__Group__7_in_rule__RPCMessage__Group__64213);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1993:1: rule__RPCMessage__Group__6__Impl : ( ( rule__RPCMessage__OnewayAssignment_6 )? ) ;
    public final void rule__RPCMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1997:1: ( ( ( rule__RPCMessage__OnewayAssignment_6 )? ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1998:1: ( ( rule__RPCMessage__OnewayAssignment_6 )? )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1998:1: ( ( rule__RPCMessage__OnewayAssignment_6 )? )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1999:1: ( rule__RPCMessage__OnewayAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getOnewayAssignment_6()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2000:1: ( rule__RPCMessage__OnewayAssignment_6 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2000:2: rule__RPCMessage__OnewayAssignment_6
                    {
                    pushFollow(FOLLOW_rule__RPCMessage__OnewayAssignment_6_in_rule__RPCMessage__Group__6__Impl4240);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2010:1: rule__RPCMessage__Group__7 : rule__RPCMessage__Group__7__Impl ;
    public final void rule__RPCMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2014:1: ( rule__RPCMessage__Group__7__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2015:2: rule__RPCMessage__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group__7__Impl_in_rule__RPCMessage__Group__74271);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2021:1: rule__RPCMessage__Group__7__Impl : ( ';' ) ;
    public final void rule__RPCMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2025:1: ( ( ';' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2026:1: ( ';' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2026:1: ( ';' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2027:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getSemicolonKeyword_7()); 
            }
            match(input,31,FOLLOW_31_in_rule__RPCMessage__Group__7__Impl4299); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2056:1: rule__RPCMessage__Group_3__0 : rule__RPCMessage__Group_3__0__Impl rule__RPCMessage__Group_3__1 ;
    public final void rule__RPCMessage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2060:1: ( rule__RPCMessage__Group_3__0__Impl rule__RPCMessage__Group_3__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2061:2: rule__RPCMessage__Group_3__0__Impl rule__RPCMessage__Group_3__1
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group_3__0__Impl_in_rule__RPCMessage__Group_3__04346);
            rule__RPCMessage__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RPCMessage__Group_3__1_in_rule__RPCMessage__Group_3__04349);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2068:1: rule__RPCMessage__Group_3__0__Impl : ( ( rule__RPCMessage__ArgumentsAssignment_3_0 ) ) ;
    public final void rule__RPCMessage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2072:1: ( ( ( rule__RPCMessage__ArgumentsAssignment_3_0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2073:1: ( ( rule__RPCMessage__ArgumentsAssignment_3_0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2073:1: ( ( rule__RPCMessage__ArgumentsAssignment_3_0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2074:1: ( rule__RPCMessage__ArgumentsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getArgumentsAssignment_3_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2075:1: ( rule__RPCMessage__ArgumentsAssignment_3_0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2075:2: rule__RPCMessage__ArgumentsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__RPCMessage__ArgumentsAssignment_3_0_in_rule__RPCMessage__Group_3__0__Impl4376);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2085:1: rule__RPCMessage__Group_3__1 : rule__RPCMessage__Group_3__1__Impl ;
    public final void rule__RPCMessage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2089:1: ( rule__RPCMessage__Group_3__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2090:2: rule__RPCMessage__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group_3__1__Impl_in_rule__RPCMessage__Group_3__14406);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2096:1: rule__RPCMessage__Group_3__1__Impl : ( ( rule__RPCMessage__Group_3_1__0 )* ) ;
    public final void rule__RPCMessage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2100:1: ( ( ( rule__RPCMessage__Group_3_1__0 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2101:1: ( ( rule__RPCMessage__Group_3_1__0 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2101:1: ( ( rule__RPCMessage__Group_3_1__0 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2102:1: ( rule__RPCMessage__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getGroup_3_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2103:1: ( rule__RPCMessage__Group_3_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==36) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2103:2: rule__RPCMessage__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RPCMessage__Group_3_1__0_in_rule__RPCMessage__Group_3__1__Impl4433);
            	    rule__RPCMessage__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2117:1: rule__RPCMessage__Group_3_1__0 : rule__RPCMessage__Group_3_1__0__Impl rule__RPCMessage__Group_3_1__1 ;
    public final void rule__RPCMessage__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2121:1: ( rule__RPCMessage__Group_3_1__0__Impl rule__RPCMessage__Group_3_1__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2122:2: rule__RPCMessage__Group_3_1__0__Impl rule__RPCMessage__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group_3_1__0__Impl_in_rule__RPCMessage__Group_3_1__04468);
            rule__RPCMessage__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RPCMessage__Group_3_1__1_in_rule__RPCMessage__Group_3_1__04471);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2129:1: rule__RPCMessage__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__RPCMessage__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2133:1: ( ( ',' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2134:1: ( ',' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2134:1: ( ',' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2135:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__RPCMessage__Group_3_1__0__Impl4499); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2148:1: rule__RPCMessage__Group_3_1__1 : rule__RPCMessage__Group_3_1__1__Impl ;
    public final void rule__RPCMessage__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2152:1: ( rule__RPCMessage__Group_3_1__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2153:2: rule__RPCMessage__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group_3_1__1__Impl_in_rule__RPCMessage__Group_3_1__14530);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2159:1: rule__RPCMessage__Group_3_1__1__Impl : ( ( rule__RPCMessage__ArgumentsAssignment_3_1_1 ) ) ;
    public final void rule__RPCMessage__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2163:1: ( ( ( rule__RPCMessage__ArgumentsAssignment_3_1_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2164:1: ( ( rule__RPCMessage__ArgumentsAssignment_3_1_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2164:1: ( ( rule__RPCMessage__ArgumentsAssignment_3_1_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2165:1: ( rule__RPCMessage__ArgumentsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getArgumentsAssignment_3_1_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2166:1: ( rule__RPCMessage__ArgumentsAssignment_3_1_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2166:2: rule__RPCMessage__ArgumentsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__RPCMessage__ArgumentsAssignment_3_1_1_in_rule__RPCMessage__Group_3_1__1__Impl4557);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2180:1: rule__RPCMessage__Group_5__0 : rule__RPCMessage__Group_5__0__Impl rule__RPCMessage__Group_5__1 ;
    public final void rule__RPCMessage__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2184:1: ( rule__RPCMessage__Group_5__0__Impl rule__RPCMessage__Group_5__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2185:2: rule__RPCMessage__Group_5__0__Impl rule__RPCMessage__Group_5__1
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group_5__0__Impl_in_rule__RPCMessage__Group_5__04591);
            rule__RPCMessage__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RPCMessage__Group_5__1_in_rule__RPCMessage__Group_5__04594);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2192:1: rule__RPCMessage__Group_5__0__Impl : ( 'throws' ) ;
    public final void rule__RPCMessage__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2196:1: ( ( 'throws' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2197:1: ( 'throws' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2197:1: ( 'throws' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2198:1: 'throws'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getThrowsKeyword_5_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__RPCMessage__Group_5__0__Impl4622); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2211:1: rule__RPCMessage__Group_5__1 : rule__RPCMessage__Group_5__1__Impl ;
    public final void rule__RPCMessage__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2215:1: ( rule__RPCMessage__Group_5__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2216:2: rule__RPCMessage__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__RPCMessage__Group_5__1__Impl_in_rule__RPCMessage__Group_5__14653);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2222:1: rule__RPCMessage__Group_5__1__Impl : ( ( rule__RPCMessage__ErrorAssignment_5_1 ) ) ;
    public final void rule__RPCMessage__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2226:1: ( ( ( rule__RPCMessage__ErrorAssignment_5_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2227:1: ( ( rule__RPCMessage__ErrorAssignment_5_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2227:1: ( ( rule__RPCMessage__ErrorAssignment_5_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2228:1: ( rule__RPCMessage__ErrorAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getErrorAssignment_5_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2229:1: ( rule__RPCMessage__ErrorAssignment_5_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2229:2: rule__RPCMessage__ErrorAssignment_5_1
            {
            pushFollow(FOLLOW_rule__RPCMessage__ErrorAssignment_5_1_in_rule__RPCMessage__Group_5__1__Impl4680);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2243:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2247:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2248:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__04714);
            rule__Argument__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__04717);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2255:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__TypeAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2259:1: ( ( ( rule__Argument__TypeAssignment_0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2260:1: ( ( rule__Argument__TypeAssignment_0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2260:1: ( ( rule__Argument__TypeAssignment_0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2261:1: ( rule__Argument__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2262:1: ( rule__Argument__TypeAssignment_0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2262:2: rule__Argument__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Argument__TypeAssignment_0_in_rule__Argument__Group__0__Impl4744);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2272:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl rule__Argument__Group__2 ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2276:1: ( rule__Argument__Group__1__Impl rule__Argument__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2277:2: rule__Argument__Group__1__Impl rule__Argument__Group__2
            {
            pushFollow(FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__14774);
            rule__Argument__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Argument__Group__2_in_rule__Argument__Group__14777);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2284:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__NameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2288:1: ( ( ( rule__Argument__NameAssignment_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2289:1: ( ( rule__Argument__NameAssignment_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2289:1: ( ( rule__Argument__NameAssignment_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2290:1: ( rule__Argument__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2291:1: ( rule__Argument__NameAssignment_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2291:2: rule__Argument__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Argument__NameAssignment_1_in_rule__Argument__Group__1__Impl4804);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2301:1: rule__Argument__Group__2 : rule__Argument__Group__2__Impl ;
    public final void rule__Argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2305:1: ( rule__Argument__Group__2__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2306:2: rule__Argument__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group__2__Impl_in_rule__Argument__Group__24834);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2312:1: rule__Argument__Group__2__Impl : ( ( rule__Argument__Group_2__0 )? ) ;
    public final void rule__Argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2316:1: ( ( ( rule__Argument__Group_2__0 )? ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2317:1: ( ( rule__Argument__Group_2__0 )? )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2317:1: ( ( rule__Argument__Group_2__0 )? )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2318:1: ( rule__Argument__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getGroup_2()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2319:1: ( rule__Argument__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2319:2: rule__Argument__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_2__0_in_rule__Argument__Group__2__Impl4861);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2335:1: rule__Argument__Group_2__0 : rule__Argument__Group_2__0__Impl rule__Argument__Group_2__1 ;
    public final void rule__Argument__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2339:1: ( rule__Argument__Group_2__0__Impl rule__Argument__Group_2__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2340:2: rule__Argument__Group_2__0__Impl rule__Argument__Group_2__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_2__0__Impl_in_rule__Argument__Group_2__04898);
            rule__Argument__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Argument__Group_2__1_in_rule__Argument__Group_2__04901);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2347:1: rule__Argument__Group_2__0__Impl : ( '=' ) ;
    public final void rule__Argument__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2351:1: ( ( '=' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2352:1: ( '=' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2352:1: ( '=' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2353:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getEqualsSignKeyword_2_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Argument__Group_2__0__Impl4929); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2366:1: rule__Argument__Group_2__1 : rule__Argument__Group_2__1__Impl ;
    public final void rule__Argument__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2370:1: ( rule__Argument__Group_2__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2371:2: rule__Argument__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_2__1__Impl_in_rule__Argument__Group_2__14960);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2377:1: rule__Argument__Group_2__1__Impl : ( ( rule__Argument__DefaultAssignment_2_1 ) ) ;
    public final void rule__Argument__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2381:1: ( ( ( rule__Argument__DefaultAssignment_2_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2382:1: ( ( rule__Argument__DefaultAssignment_2_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2382:1: ( ( rule__Argument__DefaultAssignment_2_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2383:1: ( rule__Argument__DefaultAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getDefaultAssignment_2_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2384:1: ( rule__Argument__DefaultAssignment_2_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2384:2: rule__Argument__DefaultAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Argument__DefaultAssignment_2_1_in_rule__Argument__Group_2__1__Impl4987);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2398:1: rule__TypeDef__Group__0 : rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1 ;
    public final void rule__TypeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2402:1: ( rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2403:2: rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDef__Group__0__Impl_in_rule__TypeDef__Group__05021);
            rule__TypeDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypeDef__Group__1_in_rule__TypeDef__Group__05024);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2410:1: rule__TypeDef__Group__0__Impl : ( ( rule__TypeDef__AnnotationsAssignment_0 )* ) ;
    public final void rule__TypeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2414:1: ( ( ( rule__TypeDef__AnnotationsAssignment_0 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2415:1: ( ( rule__TypeDef__AnnotationsAssignment_0 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2415:1: ( ( rule__TypeDef__AnnotationsAssignment_0 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2416:1: ( rule__TypeDef__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefAccess().getAnnotationsAssignment_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2417:1: ( rule__TypeDef__AnnotationsAssignment_0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==40) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2417:2: rule__TypeDef__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__TypeDef__AnnotationsAssignment_0_in_rule__TypeDef__Group__0__Impl5051);
            	    rule__TypeDef__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2427:1: rule__TypeDef__Group__1 : rule__TypeDef__Group__1__Impl ;
    public final void rule__TypeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2431:1: ( rule__TypeDef__Group__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2432:2: rule__TypeDef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDef__Group__1__Impl_in_rule__TypeDef__Group__15082);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2438:1: rule__TypeDef__Group__1__Impl : ( ( rule__TypeDef__TypeAssignment_1 ) ) ;
    public final void rule__TypeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2442:1: ( ( ( rule__TypeDef__TypeAssignment_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2443:1: ( ( rule__TypeDef__TypeAssignment_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2443:1: ( ( rule__TypeDef__TypeAssignment_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2444:1: ( rule__TypeDef__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefAccess().getTypeAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2445:1: ( rule__TypeDef__TypeAssignment_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2445:2: rule__TypeDef__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeDef__TypeAssignment_1_in_rule__TypeDef__Group__1__Impl5109);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2459:1: rule__ErrorType__Group__0 : rule__ErrorType__Group__0__Impl rule__ErrorType__Group__1 ;
    public final void rule__ErrorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2463:1: ( rule__ErrorType__Group__0__Impl rule__ErrorType__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2464:2: rule__ErrorType__Group__0__Impl rule__ErrorType__Group__1
            {
            pushFollow(FOLLOW_rule__ErrorType__Group__0__Impl_in_rule__ErrorType__Group__05143);
            rule__ErrorType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ErrorType__Group__1_in_rule__ErrorType__Group__05146);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2471:1: rule__ErrorType__Group__0__Impl : ( 'error' ) ;
    public final void rule__ErrorType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2475:1: ( ( 'error' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2476:1: ( 'error' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2476:1: ( 'error' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2477:1: 'error'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorTypeAccess().getErrorKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__ErrorType__Group__0__Impl5174); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2490:1: rule__ErrorType__Group__1 : rule__ErrorType__Group__1__Impl rule__ErrorType__Group__2 ;
    public final void rule__ErrorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2494:1: ( rule__ErrorType__Group__1__Impl rule__ErrorType__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2495:2: rule__ErrorType__Group__1__Impl rule__ErrorType__Group__2
            {
            pushFollow(FOLLOW_rule__ErrorType__Group__1__Impl_in_rule__ErrorType__Group__15205);
            rule__ErrorType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ErrorType__Group__2_in_rule__ErrorType__Group__15208);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2502:1: rule__ErrorType__Group__1__Impl : ( ( rule__ErrorType__NameAssignment_1 ) ) ;
    public final void rule__ErrorType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2506:1: ( ( ( rule__ErrorType__NameAssignment_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2507:1: ( ( rule__ErrorType__NameAssignment_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2507:1: ( ( rule__ErrorType__NameAssignment_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2508:1: ( rule__ErrorType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorTypeAccess().getNameAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2509:1: ( rule__ErrorType__NameAssignment_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2509:2: rule__ErrorType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ErrorType__NameAssignment_1_in_rule__ErrorType__Group__1__Impl5235);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2519:1: rule__ErrorType__Group__2 : rule__ErrorType__Group__2__Impl rule__ErrorType__Group__3 ;
    public final void rule__ErrorType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2523:1: ( rule__ErrorType__Group__2__Impl rule__ErrorType__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2524:2: rule__ErrorType__Group__2__Impl rule__ErrorType__Group__3
            {
            pushFollow(FOLLOW_rule__ErrorType__Group__2__Impl_in_rule__ErrorType__Group__25265);
            rule__ErrorType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ErrorType__Group__3_in_rule__ErrorType__Group__25268);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2531:1: rule__ErrorType__Group__2__Impl : ( '{' ) ;
    public final void rule__ErrorType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2535:1: ( ( '{' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2536:1: ( '{' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2536:1: ( '{' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2537:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorTypeAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__ErrorType__Group__2__Impl5296); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2550:1: rule__ErrorType__Group__3 : rule__ErrorType__Group__3__Impl rule__ErrorType__Group__4 ;
    public final void rule__ErrorType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2554:1: ( rule__ErrorType__Group__3__Impl rule__ErrorType__Group__4 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2555:2: rule__ErrorType__Group__3__Impl rule__ErrorType__Group__4
            {
            pushFollow(FOLLOW_rule__ErrorType__Group__3__Impl_in_rule__ErrorType__Group__35327);
            rule__ErrorType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ErrorType__Group__4_in_rule__ErrorType__Group__35330);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2562:1: rule__ErrorType__Group__3__Impl : ( ( rule__ErrorType__FieldsAssignment_3 )* ) ;
    public final void rule__ErrorType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2566:1: ( ( ( rule__ErrorType__FieldsAssignment_3 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2567:1: ( ( rule__ErrorType__FieldsAssignment_3 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2567:1: ( ( rule__ErrorType__FieldsAssignment_3 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2568:1: ( rule__ErrorType__FieldsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorTypeAccess().getFieldsAssignment_3()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2569:1: ( rule__ErrorType__FieldsAssignment_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||(LA23_0>=11 && LA23_0<=17)||(LA23_0>=21 && LA23_0<=23)||LA23_0==40||LA23_0==43) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2569:2: rule__ErrorType__FieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ErrorType__FieldsAssignment_3_in_rule__ErrorType__Group__3__Impl5357);
            	    rule__ErrorType__FieldsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2579:1: rule__ErrorType__Group__4 : rule__ErrorType__Group__4__Impl ;
    public final void rule__ErrorType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2583:1: ( rule__ErrorType__Group__4__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2584:2: rule__ErrorType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ErrorType__Group__4__Impl_in_rule__ErrorType__Group__45388);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2590:1: rule__ErrorType__Group__4__Impl : ( '}' ) ;
    public final void rule__ErrorType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2594:1: ( ( '}' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2595:1: ( '}' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2595:1: ( '}' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2596:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorTypeAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,33,FOLLOW_33_in_rule__ErrorType__Group__4__Impl5416); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2619:1: rule__RecordType__Group__0 : rule__RecordType__Group__0__Impl rule__RecordType__Group__1 ;
    public final void rule__RecordType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2623:1: ( rule__RecordType__Group__0__Impl rule__RecordType__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2624:2: rule__RecordType__Group__0__Impl rule__RecordType__Group__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group__0__Impl_in_rule__RecordType__Group__05457);
            rule__RecordType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__1_in_rule__RecordType__Group__05460);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2631:1: rule__RecordType__Group__0__Impl : ( 'record' ) ;
    public final void rule__RecordType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2635:1: ( ( 'record' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2636:1: ( 'record' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2636:1: ( 'record' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2637:1: 'record'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getRecordKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__RecordType__Group__0__Impl5488); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2650:1: rule__RecordType__Group__1 : rule__RecordType__Group__1__Impl rule__RecordType__Group__2 ;
    public final void rule__RecordType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2654:1: ( rule__RecordType__Group__1__Impl rule__RecordType__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2655:2: rule__RecordType__Group__1__Impl rule__RecordType__Group__2
            {
            pushFollow(FOLLOW_rule__RecordType__Group__1__Impl_in_rule__RecordType__Group__15519);
            rule__RecordType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__2_in_rule__RecordType__Group__15522);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2662:1: rule__RecordType__Group__1__Impl : ( ( rule__RecordType__NameAssignment_1 ) ) ;
    public final void rule__RecordType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2666:1: ( ( ( rule__RecordType__NameAssignment_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2667:1: ( ( rule__RecordType__NameAssignment_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2667:1: ( ( rule__RecordType__NameAssignment_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2668:1: ( rule__RecordType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getNameAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2669:1: ( rule__RecordType__NameAssignment_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2669:2: rule__RecordType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RecordType__NameAssignment_1_in_rule__RecordType__Group__1__Impl5549);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2679:1: rule__RecordType__Group__2 : rule__RecordType__Group__2__Impl rule__RecordType__Group__3 ;
    public final void rule__RecordType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2683:1: ( rule__RecordType__Group__2__Impl rule__RecordType__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2684:2: rule__RecordType__Group__2__Impl rule__RecordType__Group__3
            {
            pushFollow(FOLLOW_rule__RecordType__Group__2__Impl_in_rule__RecordType__Group__25579);
            rule__RecordType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__3_in_rule__RecordType__Group__25582);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2691:1: rule__RecordType__Group__2__Impl : ( '{' ) ;
    public final void rule__RecordType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2695:1: ( ( '{' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2696:1: ( '{' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2696:1: ( '{' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2697:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__RecordType__Group__2__Impl5610); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2710:1: rule__RecordType__Group__3 : rule__RecordType__Group__3__Impl rule__RecordType__Group__4 ;
    public final void rule__RecordType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2714:1: ( rule__RecordType__Group__3__Impl rule__RecordType__Group__4 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2715:2: rule__RecordType__Group__3__Impl rule__RecordType__Group__4
            {
            pushFollow(FOLLOW_rule__RecordType__Group__3__Impl_in_rule__RecordType__Group__35641);
            rule__RecordType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__4_in_rule__RecordType__Group__35644);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2722:1: rule__RecordType__Group__3__Impl : ( ( rule__RecordType__FieldsAssignment_3 )* ) ;
    public final void rule__RecordType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2726:1: ( ( ( rule__RecordType__FieldsAssignment_3 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2727:1: ( ( rule__RecordType__FieldsAssignment_3 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2727:1: ( ( rule__RecordType__FieldsAssignment_3 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2728:1: ( rule__RecordType__FieldsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getFieldsAssignment_3()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2729:1: ( rule__RecordType__FieldsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||(LA24_0>=11 && LA24_0<=17)||(LA24_0>=21 && LA24_0<=23)||LA24_0==40||LA24_0==43) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2729:2: rule__RecordType__FieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__RecordType__FieldsAssignment_3_in_rule__RecordType__Group__3__Impl5671);
            	    rule__RecordType__FieldsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2739:1: rule__RecordType__Group__4 : rule__RecordType__Group__4__Impl ;
    public final void rule__RecordType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2743:1: ( rule__RecordType__Group__4__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2744:2: rule__RecordType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group__4__Impl_in_rule__RecordType__Group__45702);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2750:1: rule__RecordType__Group__4__Impl : ( '}' ) ;
    public final void rule__RecordType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2754:1: ( ( '}' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2755:1: ( '}' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2755:1: ( '}' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2756:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,33,FOLLOW_33_in_rule__RecordType__Group__4__Impl5730); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2779:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2783:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2784:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__05771);
            rule__Field__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__05774);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2791:1: rule__Field__Group__0__Impl : ( ( rule__Field__AnnotationsAssignment_0 )* ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2795:1: ( ( ( rule__Field__AnnotationsAssignment_0 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2796:1: ( ( rule__Field__AnnotationsAssignment_0 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2796:1: ( ( rule__Field__AnnotationsAssignment_0 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2797:1: ( rule__Field__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getAnnotationsAssignment_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2798:1: ( rule__Field__AnnotationsAssignment_0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==40) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2798:2: rule__Field__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Field__AnnotationsAssignment_0_in_rule__Field__Group__0__Impl5801);
            	    rule__Field__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2808:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2812:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2813:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__15832);
            rule__Field__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__15835);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2820:1: rule__Field__Group__1__Impl : ( ( rule__Field__TypeAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2824:1: ( ( ( rule__Field__TypeAssignment_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2825:1: ( ( rule__Field__TypeAssignment_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2825:1: ( ( rule__Field__TypeAssignment_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2826:1: ( rule__Field__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2827:1: ( rule__Field__TypeAssignment_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2827:2: rule__Field__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__TypeAssignment_1_in_rule__Field__Group__1__Impl5862);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2837:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2841:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2842:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__25892);
            rule__Field__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__25895);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2849:1: rule__Field__Group__2__Impl : ( ( rule__Field__NameAnnotationsAssignment_2 )* ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2853:1: ( ( ( rule__Field__NameAnnotationsAssignment_2 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2854:1: ( ( rule__Field__NameAnnotationsAssignment_2 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2854:1: ( ( rule__Field__NameAnnotationsAssignment_2 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2855:1: ( rule__Field__NameAnnotationsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAnnotationsAssignment_2()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2856:1: ( rule__Field__NameAnnotationsAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==40) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2856:2: rule__Field__NameAnnotationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Field__NameAnnotationsAssignment_2_in_rule__Field__Group__2__Impl5922);
            	    rule__Field__NameAnnotationsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2866:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2870:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2871:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__35953);
            rule__Field__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__35956);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2878:1: rule__Field__Group__3__Impl : ( ( rule__Field__NameAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2882:1: ( ( ( rule__Field__NameAssignment_3 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2883:1: ( ( rule__Field__NameAssignment_3 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2883:1: ( ( rule__Field__NameAssignment_3 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2884:1: ( rule__Field__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAssignment_3()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2885:1: ( rule__Field__NameAssignment_3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2885:2: rule__Field__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_3_in_rule__Field__Group__3__Impl5983);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2895:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2899:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2900:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__46013);
            rule__Field__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__5_in_rule__Field__Group__46016);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2907:1: rule__Field__Group__4__Impl : ( ( rule__Field__Group_4__0 )? ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2911:1: ( ( ( rule__Field__Group_4__0 )? ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2912:1: ( ( rule__Field__Group_4__0 )? )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2912:1: ( ( rule__Field__Group_4__0 )? )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2913:1: ( rule__Field__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup_4()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2914:1: ( rule__Field__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2914:2: rule__Field__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Field__Group_4__0_in_rule__Field__Group__4__Impl6043);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2924:1: rule__Field__Group__5 : rule__Field__Group__5__Impl ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2928:1: ( rule__Field__Group__5__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2929:2: rule__Field__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__56074);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2935:1: rule__Field__Group__5__Impl : ( ';' ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2939:1: ( ( ';' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2940:1: ( ';' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2940:1: ( ';' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2941:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getSemicolonKeyword_5()); 
            }
            match(input,31,FOLLOW_31_in_rule__Field__Group__5__Impl6102); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2966:1: rule__Field__Group_4__0 : rule__Field__Group_4__0__Impl rule__Field__Group_4__1 ;
    public final void rule__Field__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2970:1: ( rule__Field__Group_4__0__Impl rule__Field__Group_4__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2971:2: rule__Field__Group_4__0__Impl rule__Field__Group_4__1
            {
            pushFollow(FOLLOW_rule__Field__Group_4__0__Impl_in_rule__Field__Group_4__06145);
            rule__Field__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group_4__1_in_rule__Field__Group_4__06148);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2978:1: rule__Field__Group_4__0__Impl : ( '=' ) ;
    public final void rule__Field__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2982:1: ( ( '=' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2983:1: ( '=' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2983:1: ( '=' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2984:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Field__Group_4__0__Impl6176); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:2997:1: rule__Field__Group_4__1 : rule__Field__Group_4__1__Impl ;
    public final void rule__Field__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3001:1: ( rule__Field__Group_4__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3002:2: rule__Field__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_4__1__Impl_in_rule__Field__Group_4__16207);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3008:1: rule__Field__Group_4__1__Impl : ( ( rule__Field__DefaultAssignment_4_1 ) ) ;
    public final void rule__Field__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3012:1: ( ( ( rule__Field__DefaultAssignment_4_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3013:1: ( ( rule__Field__DefaultAssignment_4_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3013:1: ( ( rule__Field__DefaultAssignment_4_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3014:1: ( rule__Field__DefaultAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getDefaultAssignment_4_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3015:1: ( rule__Field__DefaultAssignment_4_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3015:2: rule__Field__DefaultAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Field__DefaultAssignment_4_1_in_rule__Field__Group_4__1__Impl6234);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3029:1: rule__UnionFieldType__Group__0 : rule__UnionFieldType__Group__0__Impl rule__UnionFieldType__Group__1 ;
    public final void rule__UnionFieldType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3033:1: ( rule__UnionFieldType__Group__0__Impl rule__UnionFieldType__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3034:2: rule__UnionFieldType__Group__0__Impl rule__UnionFieldType__Group__1
            {
            pushFollow(FOLLOW_rule__UnionFieldType__Group__0__Impl_in_rule__UnionFieldType__Group__06268);
            rule__UnionFieldType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnionFieldType__Group__1_in_rule__UnionFieldType__Group__06271);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3041:1: rule__UnionFieldType__Group__0__Impl : ( 'union' ) ;
    public final void rule__UnionFieldType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3045:1: ( ( 'union' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3046:1: ( 'union' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3046:1: ( 'union' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3047:1: 'union'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeAccess().getUnionKeyword_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__UnionFieldType__Group__0__Impl6299); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3060:1: rule__UnionFieldType__Group__1 : rule__UnionFieldType__Group__1__Impl rule__UnionFieldType__Group__2 ;
    public final void rule__UnionFieldType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3064:1: ( rule__UnionFieldType__Group__1__Impl rule__UnionFieldType__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3065:2: rule__UnionFieldType__Group__1__Impl rule__UnionFieldType__Group__2
            {
            pushFollow(FOLLOW_rule__UnionFieldType__Group__1__Impl_in_rule__UnionFieldType__Group__16330);
            rule__UnionFieldType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnionFieldType__Group__2_in_rule__UnionFieldType__Group__16333);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3072:1: rule__UnionFieldType__Group__1__Impl : ( '{' ) ;
    public final void rule__UnionFieldType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3076:1: ( ( '{' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3077:1: ( '{' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3077:1: ( '{' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3078:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__UnionFieldType__Group__1__Impl6361); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3091:1: rule__UnionFieldType__Group__2 : rule__UnionFieldType__Group__2__Impl rule__UnionFieldType__Group__3 ;
    public final void rule__UnionFieldType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3095:1: ( rule__UnionFieldType__Group__2__Impl rule__UnionFieldType__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3096:2: rule__UnionFieldType__Group__2__Impl rule__UnionFieldType__Group__3
            {
            pushFollow(FOLLOW_rule__UnionFieldType__Group__2__Impl_in_rule__UnionFieldType__Group__26392);
            rule__UnionFieldType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnionFieldType__Group__3_in_rule__UnionFieldType__Group__26395);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3103:1: rule__UnionFieldType__Group__2__Impl : ( ( rule__UnionFieldType__TypesAssignment_2 ) ) ;
    public final void rule__UnionFieldType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3107:1: ( ( ( rule__UnionFieldType__TypesAssignment_2 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3108:1: ( ( rule__UnionFieldType__TypesAssignment_2 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3108:1: ( ( rule__UnionFieldType__TypesAssignment_2 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3109:1: ( rule__UnionFieldType__TypesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeAccess().getTypesAssignment_2()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3110:1: ( rule__UnionFieldType__TypesAssignment_2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3110:2: rule__UnionFieldType__TypesAssignment_2
            {
            pushFollow(FOLLOW_rule__UnionFieldType__TypesAssignment_2_in_rule__UnionFieldType__Group__2__Impl6422);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3120:1: rule__UnionFieldType__Group__3 : rule__UnionFieldType__Group__3__Impl rule__UnionFieldType__Group__4 ;
    public final void rule__UnionFieldType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3124:1: ( rule__UnionFieldType__Group__3__Impl rule__UnionFieldType__Group__4 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3125:2: rule__UnionFieldType__Group__3__Impl rule__UnionFieldType__Group__4
            {
            pushFollow(FOLLOW_rule__UnionFieldType__Group__3__Impl_in_rule__UnionFieldType__Group__36452);
            rule__UnionFieldType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnionFieldType__Group__4_in_rule__UnionFieldType__Group__36455);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3132:1: rule__UnionFieldType__Group__3__Impl : ( ( rule__UnionFieldType__Group_3__0 )* ) ;
    public final void rule__UnionFieldType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3136:1: ( ( ( rule__UnionFieldType__Group_3__0 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3137:1: ( ( rule__UnionFieldType__Group_3__0 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3137:1: ( ( rule__UnionFieldType__Group_3__0 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3138:1: ( rule__UnionFieldType__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeAccess().getGroup_3()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3139:1: ( rule__UnionFieldType__Group_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==36) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3139:2: rule__UnionFieldType__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__UnionFieldType__Group_3__0_in_rule__UnionFieldType__Group__3__Impl6482);
            	    rule__UnionFieldType__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3149:1: rule__UnionFieldType__Group__4 : rule__UnionFieldType__Group__4__Impl ;
    public final void rule__UnionFieldType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3153:1: ( rule__UnionFieldType__Group__4__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3154:2: rule__UnionFieldType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__UnionFieldType__Group__4__Impl_in_rule__UnionFieldType__Group__46513);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3160:1: rule__UnionFieldType__Group__4__Impl : ( '}' ) ;
    public final void rule__UnionFieldType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3164:1: ( ( '}' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3165:1: ( '}' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3165:1: ( '}' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3166:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,33,FOLLOW_33_in_rule__UnionFieldType__Group__4__Impl6541); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3189:1: rule__UnionFieldType__Group_3__0 : rule__UnionFieldType__Group_3__0__Impl rule__UnionFieldType__Group_3__1 ;
    public final void rule__UnionFieldType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3193:1: ( rule__UnionFieldType__Group_3__0__Impl rule__UnionFieldType__Group_3__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3194:2: rule__UnionFieldType__Group_3__0__Impl rule__UnionFieldType__Group_3__1
            {
            pushFollow(FOLLOW_rule__UnionFieldType__Group_3__0__Impl_in_rule__UnionFieldType__Group_3__06582);
            rule__UnionFieldType__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnionFieldType__Group_3__1_in_rule__UnionFieldType__Group_3__06585);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3201:1: rule__UnionFieldType__Group_3__0__Impl : ( ',' ) ;
    public final void rule__UnionFieldType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3205:1: ( ( ',' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3206:1: ( ',' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3206:1: ( ',' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3207:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeAccess().getCommaKeyword_3_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__UnionFieldType__Group_3__0__Impl6613); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3220:1: rule__UnionFieldType__Group_3__1 : rule__UnionFieldType__Group_3__1__Impl ;
    public final void rule__UnionFieldType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3224:1: ( rule__UnionFieldType__Group_3__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3225:2: rule__UnionFieldType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__UnionFieldType__Group_3__1__Impl_in_rule__UnionFieldType__Group_3__16644);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3231:1: rule__UnionFieldType__Group_3__1__Impl : ( ( rule__UnionFieldType__TypesAssignment_3_1 ) ) ;
    public final void rule__UnionFieldType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3235:1: ( ( ( rule__UnionFieldType__TypesAssignment_3_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3236:1: ( ( rule__UnionFieldType__TypesAssignment_3_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3236:1: ( ( rule__UnionFieldType__TypesAssignment_3_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3237:1: ( rule__UnionFieldType__TypesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeAccess().getTypesAssignment_3_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3238:1: ( rule__UnionFieldType__TypesAssignment_3_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3238:2: rule__UnionFieldType__TypesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__UnionFieldType__TypesAssignment_3_1_in_rule__UnionFieldType__Group_3__1__Impl6671);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3252:1: rule__ArrayFieldType__Group__0 : rule__ArrayFieldType__Group__0__Impl rule__ArrayFieldType__Group__1 ;
    public final void rule__ArrayFieldType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3256:1: ( rule__ArrayFieldType__Group__0__Impl rule__ArrayFieldType__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3257:2: rule__ArrayFieldType__Group__0__Impl rule__ArrayFieldType__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayFieldType__Group__0__Impl_in_rule__ArrayFieldType__Group__06705);
            rule__ArrayFieldType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayFieldType__Group__1_in_rule__ArrayFieldType__Group__06708);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3264:1: rule__ArrayFieldType__Group__0__Impl : ( 'array' ) ;
    public final void rule__ArrayFieldType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3268:1: ( ( 'array' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3269:1: ( 'array' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3269:1: ( 'array' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3270:1: 'array'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayFieldTypeAccess().getArrayKeyword_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__ArrayFieldType__Group__0__Impl6736); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3283:1: rule__ArrayFieldType__Group__1 : rule__ArrayFieldType__Group__1__Impl rule__ArrayFieldType__Group__2 ;
    public final void rule__ArrayFieldType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3287:1: ( rule__ArrayFieldType__Group__1__Impl rule__ArrayFieldType__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3288:2: rule__ArrayFieldType__Group__1__Impl rule__ArrayFieldType__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayFieldType__Group__1__Impl_in_rule__ArrayFieldType__Group__16767);
            rule__ArrayFieldType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayFieldType__Group__2_in_rule__ArrayFieldType__Group__16770);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3295:1: rule__ArrayFieldType__Group__1__Impl : ( '<' ) ;
    public final void rule__ArrayFieldType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3299:1: ( ( '<' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3300:1: ( '<' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3300:1: ( '<' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3301:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayFieldTypeAccess().getLessThanSignKeyword_1()); 
            }
            match(input,38,FOLLOW_38_in_rule__ArrayFieldType__Group__1__Impl6798); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3314:1: rule__ArrayFieldType__Group__2 : rule__ArrayFieldType__Group__2__Impl rule__ArrayFieldType__Group__3 ;
    public final void rule__ArrayFieldType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3318:1: ( rule__ArrayFieldType__Group__2__Impl rule__ArrayFieldType__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3319:2: rule__ArrayFieldType__Group__2__Impl rule__ArrayFieldType__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayFieldType__Group__2__Impl_in_rule__ArrayFieldType__Group__26829);
            rule__ArrayFieldType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayFieldType__Group__3_in_rule__ArrayFieldType__Group__26832);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3326:1: rule__ArrayFieldType__Group__2__Impl : ( ( rule__ArrayFieldType__AnnotationAssignment_2 )? ) ;
    public final void rule__ArrayFieldType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3330:1: ( ( ( rule__ArrayFieldType__AnnotationAssignment_2 )? ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3331:1: ( ( rule__ArrayFieldType__AnnotationAssignment_2 )? )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3331:1: ( ( rule__ArrayFieldType__AnnotationAssignment_2 )? )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3332:1: ( rule__ArrayFieldType__AnnotationAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayFieldTypeAccess().getAnnotationAssignment_2()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3333:1: ( rule__ArrayFieldType__AnnotationAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3333:2: rule__ArrayFieldType__AnnotationAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ArrayFieldType__AnnotationAssignment_2_in_rule__ArrayFieldType__Group__2__Impl6859);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3343:1: rule__ArrayFieldType__Group__3 : rule__ArrayFieldType__Group__3__Impl rule__ArrayFieldType__Group__4 ;
    public final void rule__ArrayFieldType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3347:1: ( rule__ArrayFieldType__Group__3__Impl rule__ArrayFieldType__Group__4 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3348:2: rule__ArrayFieldType__Group__3__Impl rule__ArrayFieldType__Group__4
            {
            pushFollow(FOLLOW_rule__ArrayFieldType__Group__3__Impl_in_rule__ArrayFieldType__Group__36890);
            rule__ArrayFieldType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayFieldType__Group__4_in_rule__ArrayFieldType__Group__36893);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3355:1: rule__ArrayFieldType__Group__3__Impl : ( ( rule__ArrayFieldType__TypeAssignment_3 ) ) ;
    public final void rule__ArrayFieldType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3359:1: ( ( ( rule__ArrayFieldType__TypeAssignment_3 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3360:1: ( ( rule__ArrayFieldType__TypeAssignment_3 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3360:1: ( ( rule__ArrayFieldType__TypeAssignment_3 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3361:1: ( rule__ArrayFieldType__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayFieldTypeAccess().getTypeAssignment_3()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3362:1: ( rule__ArrayFieldType__TypeAssignment_3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3362:2: rule__ArrayFieldType__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__ArrayFieldType__TypeAssignment_3_in_rule__ArrayFieldType__Group__3__Impl6920);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3372:1: rule__ArrayFieldType__Group__4 : rule__ArrayFieldType__Group__4__Impl ;
    public final void rule__ArrayFieldType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3376:1: ( rule__ArrayFieldType__Group__4__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3377:2: rule__ArrayFieldType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ArrayFieldType__Group__4__Impl_in_rule__ArrayFieldType__Group__46950);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3383:1: rule__ArrayFieldType__Group__4__Impl : ( '>' ) ;
    public final void rule__ArrayFieldType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3387:1: ( ( '>' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3388:1: ( '>' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3388:1: ( '>' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3389:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayFieldTypeAccess().getGreaterThanSignKeyword_4()); 
            }
            match(input,39,FOLLOW_39_in_rule__ArrayFieldType__Group__4__Impl6978); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3412:1: rule__MapFieldType__Group__0 : rule__MapFieldType__Group__0__Impl rule__MapFieldType__Group__1 ;
    public final void rule__MapFieldType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3416:1: ( rule__MapFieldType__Group__0__Impl rule__MapFieldType__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3417:2: rule__MapFieldType__Group__0__Impl rule__MapFieldType__Group__1
            {
            pushFollow(FOLLOW_rule__MapFieldType__Group__0__Impl_in_rule__MapFieldType__Group__07019);
            rule__MapFieldType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MapFieldType__Group__1_in_rule__MapFieldType__Group__07022);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3424:1: rule__MapFieldType__Group__0__Impl : ( 'map' ) ;
    public final void rule__MapFieldType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3428:1: ( ( 'map' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3429:1: ( 'map' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3429:1: ( 'map' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3430:1: 'map'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapFieldTypeAccess().getMapKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__MapFieldType__Group__0__Impl7050); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3443:1: rule__MapFieldType__Group__1 : rule__MapFieldType__Group__1__Impl rule__MapFieldType__Group__2 ;
    public final void rule__MapFieldType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3447:1: ( rule__MapFieldType__Group__1__Impl rule__MapFieldType__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3448:2: rule__MapFieldType__Group__1__Impl rule__MapFieldType__Group__2
            {
            pushFollow(FOLLOW_rule__MapFieldType__Group__1__Impl_in_rule__MapFieldType__Group__17081);
            rule__MapFieldType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MapFieldType__Group__2_in_rule__MapFieldType__Group__17084);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3455:1: rule__MapFieldType__Group__1__Impl : ( '<' ) ;
    public final void rule__MapFieldType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3459:1: ( ( '<' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3460:1: ( '<' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3460:1: ( '<' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3461:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapFieldTypeAccess().getLessThanSignKeyword_1()); 
            }
            match(input,38,FOLLOW_38_in_rule__MapFieldType__Group__1__Impl7112); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3474:1: rule__MapFieldType__Group__2 : rule__MapFieldType__Group__2__Impl rule__MapFieldType__Group__3 ;
    public final void rule__MapFieldType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3478:1: ( rule__MapFieldType__Group__2__Impl rule__MapFieldType__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3479:2: rule__MapFieldType__Group__2__Impl rule__MapFieldType__Group__3
            {
            pushFollow(FOLLOW_rule__MapFieldType__Group__2__Impl_in_rule__MapFieldType__Group__27143);
            rule__MapFieldType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MapFieldType__Group__3_in_rule__MapFieldType__Group__27146);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3486:1: rule__MapFieldType__Group__2__Impl : ( ( rule__MapFieldType__AnnotationAssignment_2 )? ) ;
    public final void rule__MapFieldType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3490:1: ( ( ( rule__MapFieldType__AnnotationAssignment_2 )? ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3491:1: ( ( rule__MapFieldType__AnnotationAssignment_2 )? )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3491:1: ( ( rule__MapFieldType__AnnotationAssignment_2 )? )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3492:1: ( rule__MapFieldType__AnnotationAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapFieldTypeAccess().getAnnotationAssignment_2()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3493:1: ( rule__MapFieldType__AnnotationAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3493:2: rule__MapFieldType__AnnotationAssignment_2
                    {
                    pushFollow(FOLLOW_rule__MapFieldType__AnnotationAssignment_2_in_rule__MapFieldType__Group__2__Impl7173);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3503:1: rule__MapFieldType__Group__3 : rule__MapFieldType__Group__3__Impl rule__MapFieldType__Group__4 ;
    public final void rule__MapFieldType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3507:1: ( rule__MapFieldType__Group__3__Impl rule__MapFieldType__Group__4 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3508:2: rule__MapFieldType__Group__3__Impl rule__MapFieldType__Group__4
            {
            pushFollow(FOLLOW_rule__MapFieldType__Group__3__Impl_in_rule__MapFieldType__Group__37204);
            rule__MapFieldType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MapFieldType__Group__4_in_rule__MapFieldType__Group__37207);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3515:1: rule__MapFieldType__Group__3__Impl : ( ( rule__MapFieldType__TypeAssignment_3 ) ) ;
    public final void rule__MapFieldType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3519:1: ( ( ( rule__MapFieldType__TypeAssignment_3 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3520:1: ( ( rule__MapFieldType__TypeAssignment_3 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3520:1: ( ( rule__MapFieldType__TypeAssignment_3 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3521:1: ( rule__MapFieldType__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapFieldTypeAccess().getTypeAssignment_3()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3522:1: ( rule__MapFieldType__TypeAssignment_3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3522:2: rule__MapFieldType__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__MapFieldType__TypeAssignment_3_in_rule__MapFieldType__Group__3__Impl7234);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3532:1: rule__MapFieldType__Group__4 : rule__MapFieldType__Group__4__Impl ;
    public final void rule__MapFieldType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3536:1: ( rule__MapFieldType__Group__4__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3537:2: rule__MapFieldType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MapFieldType__Group__4__Impl_in_rule__MapFieldType__Group__47264);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3543:1: rule__MapFieldType__Group__4__Impl : ( '>' ) ;
    public final void rule__MapFieldType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3547:1: ( ( '>' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3548:1: ( '>' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3548:1: ( '>' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3549:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapFieldTypeAccess().getGreaterThanSignKeyword_4()); 
            }
            match(input,39,FOLLOW_39_in_rule__MapFieldType__Group__4__Impl7292); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3572:1: rule__FixedType__Group__0 : rule__FixedType__Group__0__Impl rule__FixedType__Group__1 ;
    public final void rule__FixedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3576:1: ( rule__FixedType__Group__0__Impl rule__FixedType__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3577:2: rule__FixedType__Group__0__Impl rule__FixedType__Group__1
            {
            pushFollow(FOLLOW_rule__FixedType__Group__0__Impl_in_rule__FixedType__Group__07333);
            rule__FixedType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FixedType__Group__1_in_rule__FixedType__Group__07336);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3584:1: rule__FixedType__Group__0__Impl : ( 'fixed' ) ;
    public final void rule__FixedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3588:1: ( ( 'fixed' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3589:1: ( 'fixed' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3589:1: ( 'fixed' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3590:1: 'fixed'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixedTypeAccess().getFixedKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__FixedType__Group__0__Impl7364); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3603:1: rule__FixedType__Group__1 : rule__FixedType__Group__1__Impl rule__FixedType__Group__2 ;
    public final void rule__FixedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3607:1: ( rule__FixedType__Group__1__Impl rule__FixedType__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3608:2: rule__FixedType__Group__1__Impl rule__FixedType__Group__2
            {
            pushFollow(FOLLOW_rule__FixedType__Group__1__Impl_in_rule__FixedType__Group__17395);
            rule__FixedType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FixedType__Group__2_in_rule__FixedType__Group__17398);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3615:1: rule__FixedType__Group__1__Impl : ( ( rule__FixedType__NameAssignment_1 ) ) ;
    public final void rule__FixedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3619:1: ( ( ( rule__FixedType__NameAssignment_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3620:1: ( ( rule__FixedType__NameAssignment_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3620:1: ( ( rule__FixedType__NameAssignment_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3621:1: ( rule__FixedType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixedTypeAccess().getNameAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3622:1: ( rule__FixedType__NameAssignment_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3622:2: rule__FixedType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FixedType__NameAssignment_1_in_rule__FixedType__Group__1__Impl7425);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3632:1: rule__FixedType__Group__2 : rule__FixedType__Group__2__Impl rule__FixedType__Group__3 ;
    public final void rule__FixedType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3636:1: ( rule__FixedType__Group__2__Impl rule__FixedType__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3637:2: rule__FixedType__Group__2__Impl rule__FixedType__Group__3
            {
            pushFollow(FOLLOW_rule__FixedType__Group__2__Impl_in_rule__FixedType__Group__27455);
            rule__FixedType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FixedType__Group__3_in_rule__FixedType__Group__27458);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3644:1: rule__FixedType__Group__2__Impl : ( '(' ) ;
    public final void rule__FixedType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3648:1: ( ( '(' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3649:1: ( '(' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3649:1: ( '(' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3650:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixedTypeAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,34,FOLLOW_34_in_rule__FixedType__Group__2__Impl7486); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3663:1: rule__FixedType__Group__3 : rule__FixedType__Group__3__Impl rule__FixedType__Group__4 ;
    public final void rule__FixedType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3667:1: ( rule__FixedType__Group__3__Impl rule__FixedType__Group__4 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3668:2: rule__FixedType__Group__3__Impl rule__FixedType__Group__4
            {
            pushFollow(FOLLOW_rule__FixedType__Group__3__Impl_in_rule__FixedType__Group__37517);
            rule__FixedType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FixedType__Group__4_in_rule__FixedType__Group__37520);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3675:1: rule__FixedType__Group__3__Impl : ( ( rule__FixedType__SizeAssignment_3 ) ) ;
    public final void rule__FixedType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3679:1: ( ( ( rule__FixedType__SizeAssignment_3 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3680:1: ( ( rule__FixedType__SizeAssignment_3 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3680:1: ( ( rule__FixedType__SizeAssignment_3 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3681:1: ( rule__FixedType__SizeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixedTypeAccess().getSizeAssignment_3()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3682:1: ( rule__FixedType__SizeAssignment_3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3682:2: rule__FixedType__SizeAssignment_3
            {
            pushFollow(FOLLOW_rule__FixedType__SizeAssignment_3_in_rule__FixedType__Group__3__Impl7547);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3692:1: rule__FixedType__Group__4 : rule__FixedType__Group__4__Impl rule__FixedType__Group__5 ;
    public final void rule__FixedType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3696:1: ( rule__FixedType__Group__4__Impl rule__FixedType__Group__5 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3697:2: rule__FixedType__Group__4__Impl rule__FixedType__Group__5
            {
            pushFollow(FOLLOW_rule__FixedType__Group__4__Impl_in_rule__FixedType__Group__47577);
            rule__FixedType__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FixedType__Group__5_in_rule__FixedType__Group__47580);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3704:1: rule__FixedType__Group__4__Impl : ( ')' ) ;
    public final void rule__FixedType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3708:1: ( ( ')' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3709:1: ( ')' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3709:1: ( ')' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3710:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixedTypeAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,35,FOLLOW_35_in_rule__FixedType__Group__4__Impl7608); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3723:1: rule__FixedType__Group__5 : rule__FixedType__Group__5__Impl ;
    public final void rule__FixedType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3727:1: ( rule__FixedType__Group__5__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3728:2: rule__FixedType__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__FixedType__Group__5__Impl_in_rule__FixedType__Group__57639);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3734:1: rule__FixedType__Group__5__Impl : ( ';' ) ;
    public final void rule__FixedType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3738:1: ( ( ';' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3739:1: ( ';' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3739:1: ( ';' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3740:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixedTypeAccess().getSemicolonKeyword_5()); 
            }
            match(input,31,FOLLOW_31_in_rule__FixedType__Group__5__Impl7667); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3765:1: rule__EnumType__Group__0 : rule__EnumType__Group__0__Impl rule__EnumType__Group__1 ;
    public final void rule__EnumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3769:1: ( rule__EnumType__Group__0__Impl rule__EnumType__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3770:2: rule__EnumType__Group__0__Impl rule__EnumType__Group__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group__0__Impl_in_rule__EnumType__Group__07710);
            rule__EnumType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumType__Group__1_in_rule__EnumType__Group__07713);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3777:1: rule__EnumType__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3781:1: ( ( 'enum' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3782:1: ( 'enum' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3782:1: ( 'enum' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3783:1: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getEnumKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__EnumType__Group__0__Impl7741); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3796:1: rule__EnumType__Group__1 : rule__EnumType__Group__1__Impl rule__EnumType__Group__2 ;
    public final void rule__EnumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3800:1: ( rule__EnumType__Group__1__Impl rule__EnumType__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3801:2: rule__EnumType__Group__1__Impl rule__EnumType__Group__2
            {
            pushFollow(FOLLOW_rule__EnumType__Group__1__Impl_in_rule__EnumType__Group__17772);
            rule__EnumType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumType__Group__2_in_rule__EnumType__Group__17775);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3808:1: rule__EnumType__Group__1__Impl : ( ( rule__EnumType__NameAssignment_1 ) ) ;
    public final void rule__EnumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3812:1: ( ( ( rule__EnumType__NameAssignment_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3813:1: ( ( rule__EnumType__NameAssignment_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3813:1: ( ( rule__EnumType__NameAssignment_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3814:1: ( rule__EnumType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getNameAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3815:1: ( rule__EnumType__NameAssignment_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3815:2: rule__EnumType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumType__NameAssignment_1_in_rule__EnumType__Group__1__Impl7802);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3825:1: rule__EnumType__Group__2 : rule__EnumType__Group__2__Impl rule__EnumType__Group__3 ;
    public final void rule__EnumType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3829:1: ( rule__EnumType__Group__2__Impl rule__EnumType__Group__3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3830:2: rule__EnumType__Group__2__Impl rule__EnumType__Group__3
            {
            pushFollow(FOLLOW_rule__EnumType__Group__2__Impl_in_rule__EnumType__Group__27832);
            rule__EnumType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumType__Group__3_in_rule__EnumType__Group__27835);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3837:1: rule__EnumType__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3841:1: ( ( '{' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3842:1: ( '{' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3842:1: ( '{' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3843:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__EnumType__Group__2__Impl7863); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3856:1: rule__EnumType__Group__3 : rule__EnumType__Group__3__Impl rule__EnumType__Group__4 ;
    public final void rule__EnumType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3860:1: ( rule__EnumType__Group__3__Impl rule__EnumType__Group__4 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3861:2: rule__EnumType__Group__3__Impl rule__EnumType__Group__4
            {
            pushFollow(FOLLOW_rule__EnumType__Group__3__Impl_in_rule__EnumType__Group__37894);
            rule__EnumType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumType__Group__4_in_rule__EnumType__Group__37897);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3868:1: rule__EnumType__Group__3__Impl : ( ( rule__EnumType__LiteralsAssignment_3 ) ) ;
    public final void rule__EnumType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3872:1: ( ( ( rule__EnumType__LiteralsAssignment_3 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3873:1: ( ( rule__EnumType__LiteralsAssignment_3 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3873:1: ( ( rule__EnumType__LiteralsAssignment_3 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3874:1: ( rule__EnumType__LiteralsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getLiteralsAssignment_3()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3875:1: ( rule__EnumType__LiteralsAssignment_3 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3875:2: rule__EnumType__LiteralsAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumType__LiteralsAssignment_3_in_rule__EnumType__Group__3__Impl7924);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3885:1: rule__EnumType__Group__4 : rule__EnumType__Group__4__Impl rule__EnumType__Group__5 ;
    public final void rule__EnumType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3889:1: ( rule__EnumType__Group__4__Impl rule__EnumType__Group__5 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3890:2: rule__EnumType__Group__4__Impl rule__EnumType__Group__5
            {
            pushFollow(FOLLOW_rule__EnumType__Group__4__Impl_in_rule__EnumType__Group__47954);
            rule__EnumType__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumType__Group__5_in_rule__EnumType__Group__47957);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3897:1: rule__EnumType__Group__4__Impl : ( ( rule__EnumType__Group_4__0 )* ) ;
    public final void rule__EnumType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3901:1: ( ( ( rule__EnumType__Group_4__0 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3902:1: ( ( rule__EnumType__Group_4__0 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3902:1: ( ( rule__EnumType__Group_4__0 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3903:1: ( rule__EnumType__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getGroup_4()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3904:1: ( rule__EnumType__Group_4__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==36) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3904:2: rule__EnumType__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumType__Group_4__0_in_rule__EnumType__Group__4__Impl7984);
            	    rule__EnumType__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3914:1: rule__EnumType__Group__5 : rule__EnumType__Group__5__Impl ;
    public final void rule__EnumType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3918:1: ( rule__EnumType__Group__5__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3919:2: rule__EnumType__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group__5__Impl_in_rule__EnumType__Group__58015);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3925:1: rule__EnumType__Group__5__Impl : ( '}' ) ;
    public final void rule__EnumType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3929:1: ( ( '}' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3930:1: ( '}' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3930:1: ( '}' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3931:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,33,FOLLOW_33_in_rule__EnumType__Group__5__Impl8043); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3956:1: rule__EnumType__Group_4__0 : rule__EnumType__Group_4__0__Impl rule__EnumType__Group_4__1 ;
    public final void rule__EnumType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3960:1: ( rule__EnumType__Group_4__0__Impl rule__EnumType__Group_4__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3961:2: rule__EnumType__Group_4__0__Impl rule__EnumType__Group_4__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group_4__0__Impl_in_rule__EnumType__Group_4__08086);
            rule__EnumType__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumType__Group_4__1_in_rule__EnumType__Group_4__08089);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3968:1: rule__EnumType__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EnumType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3972:1: ( ( ',' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3973:1: ( ',' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3973:1: ( ',' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3974:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getCommaKeyword_4_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__EnumType__Group_4__0__Impl8117); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3987:1: rule__EnumType__Group_4__1 : rule__EnumType__Group_4__1__Impl ;
    public final void rule__EnumType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3991:1: ( rule__EnumType__Group_4__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3992:2: rule__EnumType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group_4__1__Impl_in_rule__EnumType__Group_4__18148);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:3998:1: rule__EnumType__Group_4__1__Impl : ( ( rule__EnumType__LiteralsAssignment_4_1 ) ) ;
    public final void rule__EnumType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4002:1: ( ( ( rule__EnumType__LiteralsAssignment_4_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4003:1: ( ( rule__EnumType__LiteralsAssignment_4_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4003:1: ( ( rule__EnumType__LiteralsAssignment_4_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4004:1: ( rule__EnumType__LiteralsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getLiteralsAssignment_4_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4005:1: ( rule__EnumType__LiteralsAssignment_4_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4005:2: rule__EnumType__LiteralsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__EnumType__LiteralsAssignment_4_1_in_rule__EnumType__Group_4__1__Impl8175);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4019:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4023:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4024:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__08209);
            rule__Annotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__08212);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4031:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4035:1: ( ( '@' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4036:1: ( '@' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4036:1: ( '@' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4037:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__Annotation__Group__0__Impl8240); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4050:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4054:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4055:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__18271);
            rule__Annotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__18274);
            rule__Annotation__Group__2();

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4062:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__NameAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4066:1: ( ( ( rule__Annotation__NameAssignment_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4067:1: ( ( rule__Annotation__NameAssignment_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4067:1: ( ( rule__Annotation__NameAssignment_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4068:1: ( rule__Annotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4069:1: ( rule__Annotation__NameAssignment_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4069:2: rule__Annotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Annotation__NameAssignment_1_in_rule__Annotation__Group__1__Impl8301);
            rule__Annotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 
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


    // $ANTLR start "rule__Annotation__Group__2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4079:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4083:1: ( rule__Annotation__Group__2__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4084:2: rule__Annotation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__28331);
            rule__Annotation__Group__2__Impl();

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
    // $ANTLR end "rule__Annotation__Group__2"


    // $ANTLR start "rule__Annotation__Group__2__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4090:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__Group_2__0 )? ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4094:1: ( ( ( rule__Annotation__Group_2__0 )? ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4095:1: ( ( rule__Annotation__Group_2__0 )? )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4095:1: ( ( rule__Annotation__Group_2__0 )? )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4096:1: ( rule__Annotation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_2()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4097:1: ( rule__Annotation__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4097:2: rule__Annotation__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl8358);
                    rule__Annotation__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Annotation__Group__2__Impl"


    // $ANTLR start "rule__Annotation__Group_2__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4113:1: rule__Annotation__Group_2__0 : rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 ;
    public final void rule__Annotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4117:1: ( rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4118:2: rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__08395);
            rule__Annotation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__08398);
            rule__Annotation__Group_2__1();

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
    // $ANTLR end "rule__Annotation__Group_2__0"


    // $ANTLR start "rule__Annotation__Group_2__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4125:1: rule__Annotation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Annotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4129:1: ( ( '(' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4130:1: ( '(' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4130:1: ( '(' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4131:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Annotation__Group_2__0__Impl8426); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
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
    // $ANTLR end "rule__Annotation__Group_2__0__Impl"


    // $ANTLR start "rule__Annotation__Group_2__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4144:1: rule__Annotation__Group_2__1 : rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 ;
    public final void rule__Annotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4148:1: ( rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4149:2: rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__18457);
            rule__Annotation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__2_in_rule__Annotation__Group_2__18460);
            rule__Annotation__Group_2__2();

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
    // $ANTLR end "rule__Annotation__Group_2__1"


    // $ANTLR start "rule__Annotation__Group_2__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4156:1: rule__Annotation__Group_2__1__Impl : ( ( rule__Annotation__ValuesAssignment_2_1 ) ) ;
    public final void rule__Annotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4160:1: ( ( ( rule__Annotation__ValuesAssignment_2_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4161:1: ( ( rule__Annotation__ValuesAssignment_2_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4161:1: ( ( rule__Annotation__ValuesAssignment_2_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4162:1: ( rule__Annotation__ValuesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getValuesAssignment_2_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4163:1: ( rule__Annotation__ValuesAssignment_2_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4163:2: rule__Annotation__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__ValuesAssignment_2_1_in_rule__Annotation__Group_2__1__Impl8487);
            rule__Annotation__ValuesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getValuesAssignment_2_1()); 
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
    // $ANTLR end "rule__Annotation__Group_2__1__Impl"


    // $ANTLR start "rule__Annotation__Group_2__2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4173:1: rule__Annotation__Group_2__2 : rule__Annotation__Group_2__2__Impl ;
    public final void rule__Annotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4177:1: ( rule__Annotation__Group_2__2__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4178:2: rule__Annotation__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__2__Impl_in_rule__Annotation__Group_2__28517);
            rule__Annotation__Group_2__2__Impl();

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
    // $ANTLR end "rule__Annotation__Group_2__2"


    // $ANTLR start "rule__Annotation__Group_2__2__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4184:1: rule__Annotation__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Annotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4188:1: ( ( ')' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4189:1: ( ')' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4189:1: ( ')' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4190:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__Annotation__Group_2__2__Impl8545); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_2()); 
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
    // $ANTLR end "rule__Annotation__Group_2__2__Impl"


    // $ANTLR start "rule__Values__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4209:1: rule__Values__Group__0 : rule__Values__Group__0__Impl rule__Values__Group__1 ;
    public final void rule__Values__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4213:1: ( rule__Values__Group__0__Impl rule__Values__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4214:2: rule__Values__Group__0__Impl rule__Values__Group__1
            {
            pushFollow(FOLLOW_rule__Values__Group__0__Impl_in_rule__Values__Group__08582);
            rule__Values__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Values__Group__1_in_rule__Values__Group__08585);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4221:1: rule__Values__Group__0__Impl : ( () ) ;
    public final void rule__Values__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4225:1: ( ( () ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4226:1: ( () )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4226:1: ( () )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4227:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getValuesAction_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4228:1: ()
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4230:1: 
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4240:1: rule__Values__Group__1 : rule__Values__Group__1__Impl ;
    public final void rule__Values__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4244:1: ( rule__Values__Group__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4245:2: rule__Values__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Values__Group__1__Impl_in_rule__Values__Group__18643);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4251:1: rule__Values__Group__1__Impl : ( ( rule__Values__Alternatives_1 )* ) ;
    public final void rule__Values__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4255:1: ( ( ( rule__Values__Alternatives_1 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4256:1: ( ( rule__Values__Alternatives_1 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4256:1: ( ( rule__Values__Alternatives_1 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4257:1: ( rule__Values__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getAlternatives_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4258:1: ( rule__Values__Alternatives_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_INT||LA33_0==RULE_STRING||LA33_0==11||LA33_0==41||LA33_0==44) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4258:2: rule__Values__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Values__Alternatives_1_in_rule__Values__Group__1__Impl8670);
            	    rule__Values__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4272:1: rule__Values__Group_1_1__0 : rule__Values__Group_1_1__0__Impl rule__Values__Group_1_1__1 ;
    public final void rule__Values__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4276:1: ( rule__Values__Group_1_1__0__Impl rule__Values__Group_1_1__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4277:2: rule__Values__Group_1_1__0__Impl rule__Values__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Values__Group_1_1__0__Impl_in_rule__Values__Group_1_1__08705);
            rule__Values__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Values__Group_1_1__1_in_rule__Values__Group_1_1__08708);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4284:1: rule__Values__Group_1_1__0__Impl : ( ( rule__Values__ValueAssignment_1_1_0 ) ) ;
    public final void rule__Values__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4288:1: ( ( ( rule__Values__ValueAssignment_1_1_0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4289:1: ( ( rule__Values__ValueAssignment_1_1_0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4289:1: ( ( rule__Values__ValueAssignment_1_1_0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4290:1: ( rule__Values__ValueAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getValueAssignment_1_1_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4291:1: ( rule__Values__ValueAssignment_1_1_0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4291:2: rule__Values__ValueAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__Values__ValueAssignment_1_1_0_in_rule__Values__Group_1_1__0__Impl8735);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4301:1: rule__Values__Group_1_1__1 : rule__Values__Group_1_1__1__Impl ;
    public final void rule__Values__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4305:1: ( rule__Values__Group_1_1__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4306:2: rule__Values__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Values__Group_1_1__1__Impl_in_rule__Values__Group_1_1__18765);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4312:1: rule__Values__Group_1_1__1__Impl : ( ( rule__Values__Group_1_1_1__0 )* ) ;
    public final void rule__Values__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4316:1: ( ( ( rule__Values__Group_1_1_1__0 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4317:1: ( ( rule__Values__Group_1_1_1__0 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4317:1: ( ( rule__Values__Group_1_1_1__0 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4318:1: ( rule__Values__Group_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getGroup_1_1_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4319:1: ( rule__Values__Group_1_1_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==36) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4319:2: rule__Values__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Values__Group_1_1_1__0_in_rule__Values__Group_1_1__1__Impl8792);
            	    rule__Values__Group_1_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4333:1: rule__Values__Group_1_1_1__0 : rule__Values__Group_1_1_1__0__Impl rule__Values__Group_1_1_1__1 ;
    public final void rule__Values__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4337:1: ( rule__Values__Group_1_1_1__0__Impl rule__Values__Group_1_1_1__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4338:2: rule__Values__Group_1_1_1__0__Impl rule__Values__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__Values__Group_1_1_1__0__Impl_in_rule__Values__Group_1_1_1__08827);
            rule__Values__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Values__Group_1_1_1__1_in_rule__Values__Group_1_1_1__08830);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4345:1: rule__Values__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__Values__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4349:1: ( ( ',' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4350:1: ( ',' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4350:1: ( ',' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4351:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getCommaKeyword_1_1_1_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Values__Group_1_1_1__0__Impl8858); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4364:1: rule__Values__Group_1_1_1__1 : rule__Values__Group_1_1_1__1__Impl ;
    public final void rule__Values__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4368:1: ( rule__Values__Group_1_1_1__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4369:2: rule__Values__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Values__Group_1_1_1__1__Impl_in_rule__Values__Group_1_1_1__18889);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4375:1: rule__Values__Group_1_1_1__1__Impl : ( ( rule__Values__ValueAssignment_1_1_1_1 ) ) ;
    public final void rule__Values__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4379:1: ( ( ( rule__Values__ValueAssignment_1_1_1_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4380:1: ( ( rule__Values__ValueAssignment_1_1_1_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4380:1: ( ( rule__Values__ValueAssignment_1_1_1_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4381:1: ( rule__Values__ValueAssignment_1_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getValueAssignment_1_1_1_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4382:1: ( rule__Values__ValueAssignment_1_1_1_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4382:2: rule__Values__ValueAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_rule__Values__ValueAssignment_1_1_1_1_in_rule__Values__Group_1_1_1__1__Impl8916);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4396:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4400:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4401:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__08950);
            rule__Array__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__1_in_rule__Array__Group__08953);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4408:1: rule__Array__Group__0__Impl : ( ( '[' ) ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4412:1: ( ( ( '[' ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4413:1: ( ( '[' ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4413:1: ( ( '[' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4414:1: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4415:1: ( '[' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4416:2: '['
            {
            match(input,41,FOLLOW_41_in_rule__Array__Group__0__Impl8982); if (state.failed) return ;

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4427:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4431:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4432:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__19014);
            rule__Array__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__2_in_rule__Array__Group__19017);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4439:1: rule__Array__Group__1__Impl : ( ( rule__Array__ValuesAssignment_1 ) ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4443:1: ( ( ( rule__Array__ValuesAssignment_1 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4444:1: ( ( rule__Array__ValuesAssignment_1 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4444:1: ( ( rule__Array__ValuesAssignment_1 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4445:1: ( rule__Array__ValuesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getValuesAssignment_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4446:1: ( rule__Array__ValuesAssignment_1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4446:2: rule__Array__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__Array__ValuesAssignment_1_in_rule__Array__Group__1__Impl9044);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4456:1: rule__Array__Group__2 : rule__Array__Group__2__Impl ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4460:1: ( rule__Array__Group__2__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4461:2: rule__Array__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__29074);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4467:1: rule__Array__Group__2__Impl : ( ']' ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4471:1: ( ( ']' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4472:1: ( ']' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4472:1: ( ']' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4473:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,42,FOLLOW_42_in_rule__Array__Group__2__Impl9102); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4492:1: rule__EscapableId__Group_1__0 : rule__EscapableId__Group_1__0__Impl rule__EscapableId__Group_1__1 ;
    public final void rule__EscapableId__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4496:1: ( rule__EscapableId__Group_1__0__Impl rule__EscapableId__Group_1__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4497:2: rule__EscapableId__Group_1__0__Impl rule__EscapableId__Group_1__1
            {
            pushFollow(FOLLOW_rule__EscapableId__Group_1__0__Impl_in_rule__EscapableId__Group_1__09139);
            rule__EscapableId__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EscapableId__Group_1__1_in_rule__EscapableId__Group_1__09142);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4504:1: rule__EscapableId__Group_1__0__Impl : ( '`' ) ;
    public final void rule__EscapableId__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4508:1: ( ( '`' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4509:1: ( '`' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4509:1: ( '`' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4510:1: '`'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEscapableIdAccess().getGraveAccentKeyword_1_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__EscapableId__Group_1__0__Impl9170); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4523:1: rule__EscapableId__Group_1__1 : rule__EscapableId__Group_1__1__Impl rule__EscapableId__Group_1__2 ;
    public final void rule__EscapableId__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4527:1: ( rule__EscapableId__Group_1__1__Impl rule__EscapableId__Group_1__2 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4528:2: rule__EscapableId__Group_1__1__Impl rule__EscapableId__Group_1__2
            {
            pushFollow(FOLLOW_rule__EscapableId__Group_1__1__Impl_in_rule__EscapableId__Group_1__19201);
            rule__EscapableId__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EscapableId__Group_1__2_in_rule__EscapableId__Group_1__19204);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4535:1: rule__EscapableId__Group_1__1__Impl : ( ruleReservedKeyWords ) ;
    public final void rule__EscapableId__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4539:1: ( ( ruleReservedKeyWords ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4540:1: ( ruleReservedKeyWords )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4540:1: ( ruleReservedKeyWords )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4541:1: ruleReservedKeyWords
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEscapableIdAccess().getReservedKeyWordsParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleReservedKeyWords_in_rule__EscapableId__Group_1__1__Impl9231);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4552:1: rule__EscapableId__Group_1__2 : rule__EscapableId__Group_1__2__Impl ;
    public final void rule__EscapableId__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4556:1: ( rule__EscapableId__Group_1__2__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4557:2: rule__EscapableId__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__EscapableId__Group_1__2__Impl_in_rule__EscapableId__Group_1__29260);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4563:1: rule__EscapableId__Group_1__2__Impl : ( '`' ) ;
    public final void rule__EscapableId__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4567:1: ( ( '`' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4568:1: ( '`' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4568:1: ( '`' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4569:1: '`'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEscapableIdAccess().getGraveAccentKeyword_1_2()); 
            }
            match(input,43,FOLLOW_43_in_rule__EscapableId__Group_1__2__Impl9288); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4588:1: rule__AN__Group__0 : rule__AN__Group__0__Impl rule__AN__Group__1 ;
    public final void rule__AN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4592:1: ( rule__AN__Group__0__Impl rule__AN__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4593:2: rule__AN__Group__0__Impl rule__AN__Group__1
            {
            pushFollow(FOLLOW_rule__AN__Group__0__Impl_in_rule__AN__Group__09325);
            rule__AN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AN__Group__1_in_rule__AN__Group__09328);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4600:1: rule__AN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__AN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4604:1: ( ( RULE_ID ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4605:1: ( RULE_ID )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4605:1: ( RULE_ID )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4606:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AN__Group__0__Impl9355); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getANAccess().getIDTerminalRuleCall_0()); 
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4617:1: rule__AN__Group__1 : rule__AN__Group__1__Impl ;
    public final void rule__AN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4621:1: ( rule__AN__Group__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4622:2: rule__AN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AN__Group__1__Impl_in_rule__AN__Group__19384);
            rule__AN__Group__1__Impl();

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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4628:1: rule__AN__Group__1__Impl : ( ( rule__AN__Group_1__0 )* ) ;
    public final void rule__AN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4632:1: ( ( ( rule__AN__Group_1__0 )* ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4633:1: ( ( rule__AN__Group_1__0 )* )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4633:1: ( ( rule__AN__Group_1__0 )* )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4634:1: ( rule__AN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANAccess().getGroup_1()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4635:1: ( rule__AN__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==44) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4635:2: rule__AN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AN__Group_1__0_in_rule__AN__Group__1__Impl9411);
            	    rule__AN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getANAccess().getGroup_1()); 
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


    // $ANTLR start "rule__AN__Group_1__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4649:1: rule__AN__Group_1__0 : rule__AN__Group_1__0__Impl rule__AN__Group_1__1 ;
    public final void rule__AN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4653:1: ( rule__AN__Group_1__0__Impl rule__AN__Group_1__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4654:2: rule__AN__Group_1__0__Impl rule__AN__Group_1__1
            {
            pushFollow(FOLLOW_rule__AN__Group_1__0__Impl_in_rule__AN__Group_1__09446);
            rule__AN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AN__Group_1__1_in_rule__AN__Group_1__09449);
            rule__AN__Group_1__1();

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
    // $ANTLR end "rule__AN__Group_1__0"


    // $ANTLR start "rule__AN__Group_1__0__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4661:1: rule__AN__Group_1__0__Impl : ( '-' ) ;
    public final void rule__AN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4665:1: ( ( '-' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4666:1: ( '-' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4666:1: ( '-' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4667:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANAccess().getHyphenMinusKeyword_1_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__AN__Group_1__0__Impl9477); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getANAccess().getHyphenMinusKeyword_1_0()); 
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
    // $ANTLR end "rule__AN__Group_1__0__Impl"


    // $ANTLR start "rule__AN__Group_1__1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4680:1: rule__AN__Group_1__1 : rule__AN__Group_1__1__Impl ;
    public final void rule__AN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4684:1: ( rule__AN__Group_1__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4685:2: rule__AN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AN__Group_1__1__Impl_in_rule__AN__Group_1__19508);
            rule__AN__Group_1__1__Impl();

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
    // $ANTLR end "rule__AN__Group_1__1"


    // $ANTLR start "rule__AN__Group_1__1__Impl"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4691:1: rule__AN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__AN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4695:1: ( ( RULE_ID ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4696:1: ( RULE_ID )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4696:1: ( RULE_ID )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4697:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AN__Group_1__1__Impl9535); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getANAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__AN__Group_1__1__Impl"


    // $ANTLR start "rule__NegativeInt__Group__0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4712:1: rule__NegativeInt__Group__0 : rule__NegativeInt__Group__0__Impl rule__NegativeInt__Group__1 ;
    public final void rule__NegativeInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4716:1: ( rule__NegativeInt__Group__0__Impl rule__NegativeInt__Group__1 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4717:2: rule__NegativeInt__Group__0__Impl rule__NegativeInt__Group__1
            {
            pushFollow(FOLLOW_rule__NegativeInt__Group__0__Impl_in_rule__NegativeInt__Group__09568);
            rule__NegativeInt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NegativeInt__Group__1_in_rule__NegativeInt__Group__09571);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4724:1: rule__NegativeInt__Group__0__Impl : ( '-' ) ;
    public final void rule__NegativeInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4728:1: ( ( '-' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4729:1: ( '-' )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4729:1: ( '-' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4730:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeIntAccess().getHyphenMinusKeyword_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__NegativeInt__Group__0__Impl9599); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4743:1: rule__NegativeInt__Group__1 : rule__NegativeInt__Group__1__Impl ;
    public final void rule__NegativeInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4747:1: ( rule__NegativeInt__Group__1__Impl )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4748:2: rule__NegativeInt__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NegativeInt__Group__1__Impl_in_rule__NegativeInt__Group__19630);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4754:1: rule__NegativeInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__NegativeInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4758:1: ( ( RULE_INT ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4759:1: ( RULE_INT )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4759:1: ( RULE_INT )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4760:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeIntAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NegativeInt__Group__1__Impl9657); if (state.failed) return ;
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


    // $ANTLR start "rule__AvdlFile__ImportsAssignment_0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4776:1: rule__AvdlFile__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__AvdlFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4780:1: ( ( ruleImport ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4781:1: ( ruleImport )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4781:1: ( ruleImport )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4782:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvdlFileAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__AvdlFile__ImportsAssignment_09695);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvdlFileAccess().getImportsImportParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__AvdlFile__ImportsAssignment_0"


    // $ANTLR start "rule__AvdlFile__ProtocolsAssignment_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4791:1: rule__AvdlFile__ProtocolsAssignment_1 : ( ruleProtocol ) ;
    public final void rule__AvdlFile__ProtocolsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4795:1: ( ( ruleProtocol ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4796:1: ( ruleProtocol )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4796:1: ( ruleProtocol )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4797:1: ruleProtocol
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvdlFileAccess().getProtocolsProtocolParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleProtocol_in_rule__AvdlFile__ProtocolsAssignment_19726);
            ruleProtocol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvdlFileAccess().getProtocolsProtocolParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__AvdlFile__ProtocolsAssignment_1"


    // $ANTLR start "rule__Import__TypeAssignment_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4806:1: rule__Import__TypeAssignment_1 : ( ruleImportType ) ;
    public final void rule__Import__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4810:1: ( ( ruleImportType ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4811:1: ( ruleImportType )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4811:1: ( ruleImportType )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4812:1: ruleImportType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getTypeImportTypeEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleImportType_in_rule__Import__TypeAssignment_19757);
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


    // $ANTLR start "rule__Import__ImportUriAssignment_2"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4821:1: rule__Import__ImportUriAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Import__ImportUriAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4825:1: ( ( RULE_STRING ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4826:1: ( RULE_STRING )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4826:1: ( RULE_STRING )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4827:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportUriSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportUriAssignment_29788); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportUriSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Import__ImportUriAssignment_2"


    // $ANTLR start "rule__Protocol__AnnotationsAssignment_0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4836:1: rule__Protocol__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Protocol__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4840:1: ( ( ruleAnnotation ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4841:1: ( ruleAnnotation )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4841:1: ( ruleAnnotation )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4842:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Protocol__AnnotationsAssignment_09819);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4851:1: rule__Protocol__NameAssignment_2 : ( ruleEscapableId ) ;
    public final void rule__Protocol__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4855:1: ( ( ruleEscapableId ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4856:1: ( ruleEscapableId )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4856:1: ( ruleEscapableId )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4857:1: ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getNameEscapableIdParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_rule__Protocol__NameAssignment_29850);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4866:1: rule__Protocol__ElementsAssignment_4 : ( ruleElement ) ;
    public final void rule__Protocol__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4870:1: ( ( ruleElement ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4871:1: ( ruleElement )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4871:1: ( ruleElement )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4872:1: ruleElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getElementsElementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleElement_in_rule__Protocol__ElementsAssignment_49881);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4881:1: rule__RPCMessage__ReturnTypeAssignment_0 : ( ruleReturnTypeLink ) ;
    public final void rule__RPCMessage__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4885:1: ( ( ruleReturnTypeLink ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4886:1: ( ruleReturnTypeLink )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4886:1: ( ruleReturnTypeLink )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4887:1: ruleReturnTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getReturnTypeReturnTypeLinkParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleReturnTypeLink_in_rule__RPCMessage__ReturnTypeAssignment_09912);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4896:1: rule__RPCMessage__NameAssignment_1 : ( ruleEscapableId ) ;
    public final void rule__RPCMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4900:1: ( ( ruleEscapableId ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4901:1: ( ruleEscapableId )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4901:1: ( ruleEscapableId )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4902:1: ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getNameEscapableIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_rule__RPCMessage__NameAssignment_19943);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4911:1: rule__RPCMessage__ArgumentsAssignment_3_0 : ( ruleArgument ) ;
    public final void rule__RPCMessage__ArgumentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4915:1: ( ( ruleArgument ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4916:1: ( ruleArgument )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4916:1: ( ruleArgument )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4917:1: ruleArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getArgumentsArgumentParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleArgument_in_rule__RPCMessage__ArgumentsAssignment_3_09974);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4926:1: rule__RPCMessage__ArgumentsAssignment_3_1_1 : ( ruleArgument ) ;
    public final void rule__RPCMessage__ArgumentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4930:1: ( ( ruleArgument ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4931:1: ( ruleArgument )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4931:1: ( ruleArgument )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4932:1: ruleArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getArgumentsArgumentParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleArgument_in_rule__RPCMessage__ArgumentsAssignment_3_1_110005);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4941:1: rule__RPCMessage__ErrorAssignment_5_1 : ( ( ruleEscapableId ) ) ;
    public final void rule__RPCMessage__ErrorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4945:1: ( ( ( ruleEscapableId ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4946:1: ( ( ruleEscapableId ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4946:1: ( ( ruleEscapableId ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4947:1: ( ruleEscapableId )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getErrorErrorTypeCrossReference_5_1_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4948:1: ( ruleEscapableId )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4949:1: ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getErrorErrorTypeEscapableIdParserRuleCall_5_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_rule__RPCMessage__ErrorAssignment_5_110040);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4960:1: rule__RPCMessage__OnewayAssignment_6 : ( ( 'oneway' ) ) ;
    public final void rule__RPCMessage__OnewayAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4964:1: ( ( ( 'oneway' ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4965:1: ( ( 'oneway' ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4965:1: ( ( 'oneway' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4966:1: ( 'oneway' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getOnewayOnewayKeyword_6_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4967:1: ( 'oneway' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4968:1: 'oneway'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPCMessageAccess().getOnewayOnewayKeyword_6_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__RPCMessage__OnewayAssignment_610080); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4983:1: rule__Argument__TypeAssignment_0 : ( ruleTypeLink ) ;
    public final void rule__Argument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4987:1: ( ( ruleTypeLink ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4988:1: ( ruleTypeLink )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4988:1: ( ruleTypeLink )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4989:1: ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getTypeTypeLinkParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_rule__Argument__TypeAssignment_010119);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:4998:1: rule__Argument__NameAssignment_1 : ( ruleEscapableId ) ;
    public final void rule__Argument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5002:1: ( ( ruleEscapableId ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5003:1: ( ruleEscapableId )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5003:1: ( ruleEscapableId )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5004:1: ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getNameEscapableIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_rule__Argument__NameAssignment_110150);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5013:1: rule__Argument__DefaultAssignment_2_1 : ( ruleValue ) ;
    public final void rule__Argument__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5017:1: ( ( ruleValue ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5018:1: ( ruleValue )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5018:1: ( ruleValue )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5019:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getDefaultValueParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Argument__DefaultAssignment_2_110181);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5028:1: rule__VoidTypeLink__TargetAssignment : ( ( 'void' ) ) ;
    public final void rule__VoidTypeLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5032:1: ( ( ( 'void' ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5033:1: ( ( 'void' ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5033:1: ( ( 'void' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5034:1: ( 'void' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoidTypeLinkAccess().getTargetVoidKeyword_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5035:1: ( 'void' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5036:1: 'void'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoidTypeLinkAccess().getTargetVoidKeyword_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__VoidTypeLink__TargetAssignment10217); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5051:1: rule__TypeDef__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__TypeDef__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5055:1: ( ( ruleAnnotation ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5056:1: ( ruleAnnotation )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5056:1: ( ruleAnnotation )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5057:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__TypeDef__AnnotationsAssignment_010256);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5066:1: rule__TypeDef__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__TypeDef__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5070:1: ( ( ruleType ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5071:1: ( ruleType )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5071:1: ( ruleType )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5072:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefAccess().getTypeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__TypeDef__TypeAssignment_110287);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5081:1: rule__ErrorType__NameAssignment_1 : ( ruleEscapableId ) ;
    public final void rule__ErrorType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5085:1: ( ( ruleEscapableId ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5086:1: ( ruleEscapableId )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5086:1: ( ruleEscapableId )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5087:1: ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorTypeAccess().getNameEscapableIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_rule__ErrorType__NameAssignment_110318);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5096:1: rule__ErrorType__FieldsAssignment_3 : ( ruleField ) ;
    public final void rule__ErrorType__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5100:1: ( ( ruleField ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5101:1: ( ruleField )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5101:1: ( ruleField )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5102:1: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorTypeAccess().getFieldsFieldParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleField_in_rule__ErrorType__FieldsAssignment_310349);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5111:1: rule__RecordType__NameAssignment_1 : ( ruleEscapableId ) ;
    public final void rule__RecordType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5115:1: ( ( ruleEscapableId ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5116:1: ( ruleEscapableId )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5116:1: ( ruleEscapableId )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5117:1: ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getNameEscapableIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_rule__RecordType__NameAssignment_110380);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5126:1: rule__RecordType__FieldsAssignment_3 : ( ruleField ) ;
    public final void rule__RecordType__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5130:1: ( ( ruleField ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5131:1: ( ruleField )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5131:1: ( ruleField )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5132:1: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleField_in_rule__RecordType__FieldsAssignment_310411);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5141:1: rule__Field__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Field__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5145:1: ( ( ruleAnnotation ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5146:1: ( ruleAnnotation )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5146:1: ( ruleAnnotation )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5147:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Field__AnnotationsAssignment_010442);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5156:1: rule__Field__TypeAssignment_1 : ( ruleFieldType ) ;
    public final void rule__Field__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5160:1: ( ( ruleFieldType ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5161:1: ( ruleFieldType )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5161:1: ( ruleFieldType )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5162:1: ruleFieldType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldType_in_rule__Field__TypeAssignment_110473);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5171:1: rule__Field__NameAnnotationsAssignment_2 : ( ruleAnnotation ) ;
    public final void rule__Field__NameAnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5175:1: ( ( ruleAnnotation ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5176:1: ( ruleAnnotation )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5176:1: ( ruleAnnotation )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5177:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAnnotationsAnnotationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Field__NameAnnotationsAssignment_210504);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5186:1: rule__Field__NameAssignment_3 : ( ruleEscapableId ) ;
    public final void rule__Field__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5190:1: ( ( ruleEscapableId ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5191:1: ( ruleEscapableId )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5191:1: ( ruleEscapableId )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5192:1: ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameEscapableIdParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_rule__Field__NameAssignment_310535);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5201:1: rule__Field__DefaultAssignment_4_1 : ( ruleValue ) ;
    public final void rule__Field__DefaultAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5205:1: ( ( ruleValue ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5206:1: ( ruleValue )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5206:1: ( ruleValue )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5207:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getDefaultValueParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Field__DefaultAssignment_4_110566);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5216:1: rule__SimpleFieldType__TypeAssignment : ( ruleTypeLink ) ;
    public final void rule__SimpleFieldType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5220:1: ( ( ruleTypeLink ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5221:1: ( ruleTypeLink )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5221:1: ( ruleTypeLink )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5222:1: ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleFieldTypeAccess().getTypeTypeLinkParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_rule__SimpleFieldType__TypeAssignment10597);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5231:1: rule__UnionFieldType__TypesAssignment_2 : ( ruleTypeLink ) ;
    public final void rule__UnionFieldType__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5235:1: ( ( ruleTypeLink ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5236:1: ( ruleTypeLink )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5236:1: ( ruleTypeLink )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5237:1: ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeAccess().getTypesTypeLinkParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_rule__UnionFieldType__TypesAssignment_210628);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5246:1: rule__UnionFieldType__TypesAssignment_3_1 : ( ruleTypeLink ) ;
    public final void rule__UnionFieldType__TypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5250:1: ( ( ruleTypeLink ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5251:1: ( ruleTypeLink )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5251:1: ( ruleTypeLink )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5252:1: ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionFieldTypeAccess().getTypesTypeLinkParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_rule__UnionFieldType__TypesAssignment_3_110659);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5261:1: rule__ArrayFieldType__AnnotationAssignment_2 : ( ruleAnnotation ) ;
    public final void rule__ArrayFieldType__AnnotationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5265:1: ( ( ruleAnnotation ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5266:1: ( ruleAnnotation )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5266:1: ( ruleAnnotation )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5267:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayFieldTypeAccess().getAnnotationAnnotationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__ArrayFieldType__AnnotationAssignment_210690);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5276:1: rule__ArrayFieldType__TypeAssignment_3 : ( ruleTypeLink ) ;
    public final void rule__ArrayFieldType__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5280:1: ( ( ruleTypeLink ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5281:1: ( ruleTypeLink )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5281:1: ( ruleTypeLink )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5282:1: ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayFieldTypeAccess().getTypeTypeLinkParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_rule__ArrayFieldType__TypeAssignment_310721);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5291:1: rule__MapFieldType__AnnotationAssignment_2 : ( ruleAnnotation ) ;
    public final void rule__MapFieldType__AnnotationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5295:1: ( ( ruleAnnotation ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5296:1: ( ruleAnnotation )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5296:1: ( ruleAnnotation )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5297:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapFieldTypeAccess().getAnnotationAnnotationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__MapFieldType__AnnotationAssignment_210752);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5306:1: rule__MapFieldType__TypeAssignment_3 : ( ruleTypeLink ) ;
    public final void rule__MapFieldType__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5310:1: ( ( ruleTypeLink ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5311:1: ( ruleTypeLink )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5311:1: ( ruleTypeLink )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5312:1: ruleTypeLink
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapFieldTypeAccess().getTypeTypeLinkParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTypeLink_in_rule__MapFieldType__TypeAssignment_310783);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5321:1: rule__PrimativeTypeLink__TargetAssignment : ( ( rule__PrimativeTypeLink__TargetAlternatives_0 ) ) ;
    public final void rule__PrimativeTypeLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5325:1: ( ( ( rule__PrimativeTypeLink__TargetAlternatives_0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5326:1: ( ( rule__PrimativeTypeLink__TargetAlternatives_0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5326:1: ( ( rule__PrimativeTypeLink__TargetAlternatives_0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5327:1: ( rule__PrimativeTypeLink__TargetAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimativeTypeLinkAccess().getTargetAlternatives_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5328:1: ( rule__PrimativeTypeLink__TargetAlternatives_0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5328:2: rule__PrimativeTypeLink__TargetAlternatives_0
            {
            pushFollow(FOLLOW_rule__PrimativeTypeLink__TargetAlternatives_0_in_rule__PrimativeTypeLink__TargetAssignment10814);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5337:1: rule__CustomTypeLink__TargetAssignment : ( ( ruleEscapableId ) ) ;
    public final void rule__CustomTypeLink__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5341:1: ( ( ( ruleEscapableId ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5342:1: ( ( ruleEscapableId ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5342:1: ( ( ruleEscapableId ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5343:1: ( ruleEscapableId )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeLinkAccess().getTargetTypeCrossReference_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5344:1: ( ruleEscapableId )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5345:1: ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeLinkAccess().getTargetTypeEscapableIdParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_rule__CustomTypeLink__TargetAssignment10851);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5356:1: rule__FixedType__NameAssignment_1 : ( ruleEscapableId ) ;
    public final void rule__FixedType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5360:1: ( ( ruleEscapableId ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5361:1: ( ruleEscapableId )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5361:1: ( ruleEscapableId )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5362:1: ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixedTypeAccess().getNameEscapableIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_rule__FixedType__NameAssignment_110886);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5371:1: rule__FixedType__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__FixedType__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5375:1: ( ( RULE_INT ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5376:1: ( RULE_INT )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5376:1: ( RULE_INT )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5377:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixedTypeAccess().getSizeINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FixedType__SizeAssignment_310917); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5386:1: rule__EnumType__NameAssignment_1 : ( ruleEscapableId ) ;
    public final void rule__EnumType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5390:1: ( ( ruleEscapableId ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5391:1: ( ruleEscapableId )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5391:1: ( ruleEscapableId )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5392:1: ruleEscapableId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getNameEscapableIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEscapableId_in_rule__EnumType__NameAssignment_110948);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5401:1: rule__EnumType__LiteralsAssignment_3 : ( RULE_ID ) ;
    public final void rule__EnumType__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5405:1: ( ( RULE_ID ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5406:1: ( RULE_ID )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5406:1: ( RULE_ID )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5407:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getLiteralsIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumType__LiteralsAssignment_310979); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5416:1: rule__EnumType__LiteralsAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__EnumType__LiteralsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5420:1: ( ( RULE_ID ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5421:1: ( RULE_ID )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5421:1: ( RULE_ID )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5422:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumTypeAccess().getLiteralsIDTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumType__LiteralsAssignment_4_111010); if (state.failed) return ;
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


    // $ANTLR start "rule__Annotation__NameAssignment_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5431:1: rule__Annotation__NameAssignment_1 : ( ruleAN ) ;
    public final void rule__Annotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5435:1: ( ( ruleAN ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5436:1: ( ruleAN )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5436:1: ( ruleAN )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5437:1: ruleAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameANParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAN_in_rule__Annotation__NameAssignment_111041);
            ruleAN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getNameANParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Annotation__NameAssignment_1"


    // $ANTLR start "rule__Annotation__ValuesAssignment_2_1"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5446:1: rule__Annotation__ValuesAssignment_2_1 : ( ruleValues ) ;
    public final void rule__Annotation__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5450:1: ( ( ruleValues ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5451:1: ( ruleValues )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5451:1: ( ruleValues )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5452:1: ruleValues
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getValuesValuesParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleValues_in_rule__Annotation__ValuesAssignment_2_111072);
            ruleValues();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getValuesValuesParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Annotation__ValuesAssignment_2_1"


    // $ANTLR start "rule__Values__ValueAssignment_1_0"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5461:1: rule__Values__ValueAssignment_1_0 : ( ruleArray ) ;
    public final void rule__Values__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5465:1: ( ( ruleArray ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5466:1: ( ruleArray )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5466:1: ( ruleArray )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5467:1: ruleArray
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getValueArrayParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleArray_in_rule__Values__ValueAssignment_1_011103);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5476:1: rule__Values__ValueAssignment_1_1_0 : ( ruleValue ) ;
    public final void rule__Values__ValueAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5480:1: ( ( ruleValue ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5481:1: ( ruleValue )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5481:1: ( ruleValue )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5482:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getValueValueParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Values__ValueAssignment_1_1_011134);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5491:1: rule__Values__ValueAssignment_1_1_1_1 : ( ruleValue ) ;
    public final void rule__Values__ValueAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5495:1: ( ( ruleValue ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5496:1: ( ruleValue )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5496:1: ( ruleValue )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5497:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getValueValueParserRuleCall_1_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Values__ValueAssignment_1_1_1_111165);
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5506:1: rule__Array__ValuesAssignment_1 : ( ruleValues ) ;
    public final void rule__Array__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5510:1: ( ( ruleValues ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5511:1: ( ruleValues )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5511:1: ( ruleValues )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5512:1: ruleValues
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getValuesValuesParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValues_in_rule__Array__ValuesAssignment_111196);
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


    // $ANTLR start "rule__Null__ValAssignment"
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5521:1: rule__Null__ValAssignment : ( ( 'null' ) ) ;
    public final void rule__Null__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5525:1: ( ( ( 'null' ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5526:1: ( ( 'null' ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5526:1: ( ( 'null' ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5527:1: ( 'null' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAccess().getValNullKeyword_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5528:1: ( 'null' )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5529:1: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAccess().getValNullKeyword_0()); 
            }
            match(input,11,FOLLOW_11_in_rule__Null__ValAssignment11232); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5544:1: rule__StringValue__ValAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5548:1: ( ( RULE_STRING ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5549:1: ( RULE_STRING )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5549:1: ( RULE_STRING )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5550:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__ValAssignment11271); if (state.failed) return ;
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
    // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5559:1: rule__IntValue__ValAssignment : ( ( rule__IntValue__ValAlternatives_0 ) ) ;
    public final void rule__IntValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5563:1: ( ( ( rule__IntValue__ValAlternatives_0 ) ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5564:1: ( ( rule__IntValue__ValAlternatives_0 ) )
            {
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5564:1: ( ( rule__IntValue__ValAlternatives_0 ) )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5565:1: ( rule__IntValue__ValAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValAlternatives_0()); 
            }
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5566:1: ( rule__IntValue__ValAlternatives_0 )
            // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:5566:2: rule__IntValue__ValAlternatives_0
            {
            pushFollow(FOLLOW_rule__IntValue__ValAlternatives_0_in_rule__IntValue__ValAssignment11302);
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

    // $ANTLR start synpred18_InternalAvdl
    public final void synpred18_InternalAvdl_fragment() throws RecognitionException {   
        // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1259:1: ( ( ( rule__Values__ValueAssignment_1_0 ) ) )
        // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1259:1: ( ( rule__Values__ValueAssignment_1_0 ) )
        {
        // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1259:1: ( ( rule__Values__ValueAssignment_1_0 ) )
        // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1260:1: ( rule__Values__ValueAssignment_1_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getValuesAccess().getValueAssignment_1_0()); 
        }
        // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1261:1: ( rule__Values__ValueAssignment_1_0 )
        // ../avroclipse.ui/src-gen/avroclipse/ui/contentassist/antlr/internal/InternalAvdl.g:1261:2: rule__Values__ValueAssignment_1_0
        {
        pushFollow(FOLLOW_rule__Values__ValueAssignment_1_0_in_synpred18_InternalAvdl2672);
        rule__Values__ValueAssignment_1_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred18_InternalAvdl

    // Delegated rules

    public final boolean synpred18_InternalAvdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalAvdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleAvdlFile_in_entryRuleAvdlFile67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvdlFile74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvdlFile__Alternatives_in_ruleAvdlFile100 = new BitSet(new long[]{0x000001000A000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_entryRuleProtocol188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocol195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__0_in_ruleProtocol221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRPCMessage_in_entryRuleRPCMessage308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRPCMessage315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__0_in_ruleRPCMessage341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0_in_ruleArgument401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnTypeLink_in_entryRuleReturnTypeLink428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnTypeLink435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnTypeLink__Alternatives_in_ruleReturnTypeLink461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidTypeLink_in_entryRuleVoidTypeLink488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoidTypeLink495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VoidTypeLink__TargetAssignment_in_ruleVoidTypeLink521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__0_in_ruleTypeDef581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleErrorType_in_entryRuleErrorType668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleErrorType675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ErrorType__Group__0_in_ruleErrorType701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_entryRuleRecordType728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordType735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__0_in_ruleRecordType761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_entryRuleFieldType848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldType855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__Alternatives_in_ruleFieldType881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldType_in_entryRuleSimpleFieldType908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFieldType915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFieldType__TypeAssignment_in_ruleSimpleFieldType941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionFieldType_in_entryRuleUnionFieldType968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnionFieldType975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group__0_in_ruleUnionFieldType1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayFieldType_in_entryRuleArrayFieldType1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayFieldType1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__Group__0_in_ruleArrayFieldType1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapFieldType_in_entryRuleMapFieldType1088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapFieldType1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFieldType__Group__0_in_ruleMapFieldType1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_entryRuleTypeLink1148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeLink1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeLink__Alternatives_in_ruleTypeLink1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimativeTypeLink_in_entryRulePrimativeTypeLink1208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimativeTypeLink1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimativeTypeLink__TargetAssignment_in_rulePrimativeTypeLink1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomTypeLink_in_entryRuleCustomTypeLink1268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomTypeLink1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomTypeLink__TargetAssignment_in_ruleCustomTypeLink1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_entryRuleFixedType1328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFixedType1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__0_in_ruleFixedType1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType1388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__0_in_ruleEnumType1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_entryRuleValues1508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValues1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__Group__0_in_ruleValues1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray1568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0_in_ruleArray1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_entryRuleNull1688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNull1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Null__ValAssignment_in_ruleNull1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValAssignment_in_ruleStringValue1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue1808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntValue__ValAssignment_in_ruleIntValue1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_entryRuleEscapableId1868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapableId1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapableId__Alternatives_in_ruleEscapableId1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedKeyWords_in_entryRuleReservedKeyWords1928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReservedKeyWords1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReservedKeyWords__Alternatives_in_ruleReservedKeyWords1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAN_in_entryRuleAN1988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAN1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AN__Group__0_in_ruleAN2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegativeInt_in_entryRuleNegativeInt2048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegativeInt2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegativeInt__Group__0_in_ruleNegativeInt2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportType__Alternatives_in_ruleImportType2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvdlFile__ImportsAssignment_0_in_rule__AvdlFile__Alternatives2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvdlFile__ProtocolsAssignment_1_in_rule__AvdlFile__Alternatives2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_rule__Element__Alternatives2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRPCMessage_in_rule__Element__Alternatives2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidTypeLink_in_rule__ReturnTypeLink__Alternatives2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__ReturnTypeLink__Alternatives2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__Type__Alternatives2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_rule__Type__Alternatives2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__Type__Alternatives2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleErrorType_in_rule__Type__Alternatives2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldType_in_rule__FieldType__Alternatives2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionFieldType_in_rule__FieldType__Alternatives2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayFieldType_in_rule__FieldType__Alternatives2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapFieldType_in_rule__FieldType__Alternatives2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimativeTypeLink_in_rule__TypeLink__Alternatives2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomTypeLink_in_rule__TypeLink__Alternatives2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PrimativeTypeLink__TargetAlternatives_02518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PrimativeTypeLink__TargetAlternatives_02538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PrimativeTypeLink__TargetAlternatives_02558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PrimativeTypeLink__TargetAlternatives_02578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PrimativeTypeLink__TargetAlternatives_02598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PrimativeTypeLink__TargetAlternatives_02618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PrimativeTypeLink__TargetAlternatives_02638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__ValueAssignment_1_0_in_rule__Values__Alternatives_12672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__Group_1_1__0_in_rule__Values__Alternatives_12690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__Value__Alternatives2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rule__Value__Alternatives2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Value__Alternatives2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_rule__Value__Alternatives2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValAlternatives_02808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegativeInt_in_rule__IntValue__ValAlternatives_02825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EscapableId__Alternatives2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapableId__Group_1__0_in_rule__EscapableId__Alternatives2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ReservedKeyWords__Alternatives2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ReservedKeyWords__Alternatives2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ReservedKeyWords__Alternatives2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ReservedKeyWords__Alternatives2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ReservedKeyWords__Alternatives2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ReservedKeyWords__Alternatives3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ReservedKeyWords__Alternatives3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ReservedKeyWords__Alternatives3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ReservedKeyWords__Alternatives3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ReservedKeyWords__Alternatives3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ReservedKeyWords__Alternatives3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ImportType__Alternatives3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ImportType__Alternatives3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ImportType__Alternatives3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03218 = new BitSet(new long[]{0x0000000062000000L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Import__Group__0__Impl3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13280 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__13283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__TypeAssignment_1_in_rule__Import__Group__1__Impl3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__23340 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Import__Group__3_in_rule__Import__Group__23343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportUriAssignment_2_in_rule__Import__Group__2__Impl3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__3__Impl_in_rule__Import__Group__33400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Import__Group__3__Impl3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__0__Impl_in_rule__Protocol__Group__03467 = new BitSet(new long[]{0x000001000A000000L});
    public static final BitSet FOLLOW_rule__Protocol__Group__1_in_rule__Protocol__Group__03470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__AnnotationsAssignment_0_in_rule__Protocol__Group__0__Impl3497 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__1__Impl_in_rule__Protocol__Group__13528 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__Protocol__Group__2_in_rule__Protocol__Group__13531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Protocol__Group__1__Impl3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__2__Impl_in_rule__Protocol__Group__23590 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Protocol__Group__3_in_rule__Protocol__Group__23593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__NameAssignment_2_in_rule__Protocol__Group__2__Impl3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__3__Impl_in_rule__Protocol__Group__33650 = new BitSet(new long[]{0x00002902011FF820L});
    public static final BitSet FOLLOW_rule__Protocol__Group__4_in_rule__Protocol__Group__33653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Protocol__Group__3__Impl3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__4__Impl_in_rule__Protocol__Group__43712 = new BitSet(new long[]{0x00002902011FF820L});
    public static final BitSet FOLLOW_rule__Protocol__Group__5_in_rule__Protocol__Group__43715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__ElementsAssignment_4_in_rule__Protocol__Group__4__Impl3742 = new BitSet(new long[]{0x00002900011FF822L});
    public static final BitSet FOLLOW_rule__Protocol__Group__5__Impl_in_rule__Protocol__Group__53773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Protocol__Group__5__Impl3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__0__Impl_in_rule__RPCMessage__Group__03844 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__1_in_rule__RPCMessage__Group__03847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__ReturnTypeAssignment_0_in_rule__RPCMessage__Group__0__Impl3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__1__Impl_in_rule__RPCMessage__Group__13904 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__2_in_rule__RPCMessage__Group__13907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__NameAssignment_1_in_rule__RPCMessage__Group__1__Impl3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__2__Impl_in_rule__RPCMessage__Group__23964 = new BitSet(new long[]{0x00002908011FF820L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__3_in_rule__RPCMessage__Group__23967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__RPCMessage__Group__2__Impl3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__3__Impl_in_rule__RPCMessage__Group__34026 = new BitSet(new long[]{0x00002908011FF820L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__4_in_rule__RPCMessage__Group__34029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_3__0_in_rule__RPCMessage__Group__3__Impl4056 = new BitSet(new long[]{0x00002900011FF822L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__4__Impl_in_rule__RPCMessage__Group__44087 = new BitSet(new long[]{0x0000000094000000L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__5_in_rule__RPCMessage__Group__44090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__RPCMessage__Group__4__Impl4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__5__Impl_in_rule__RPCMessage__Group__54149 = new BitSet(new long[]{0x0000000094000000L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__6_in_rule__RPCMessage__Group__54152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_5__0_in_rule__RPCMessage__Group__5__Impl4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__6__Impl_in_rule__RPCMessage__Group__64210 = new BitSet(new long[]{0x0000000094000000L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__7_in_rule__RPCMessage__Group__64213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__OnewayAssignment_6_in_rule__RPCMessage__Group__6__Impl4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group__7__Impl_in_rule__RPCMessage__Group__74271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__RPCMessage__Group__7__Impl4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_3__0__Impl_in_rule__RPCMessage__Group_3__04346 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_3__1_in_rule__RPCMessage__Group_3__04349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__ArgumentsAssignment_3_0_in_rule__RPCMessage__Group_3__0__Impl4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_3__1__Impl_in_rule__RPCMessage__Group_3__14406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_3_1__0_in_rule__RPCMessage__Group_3__1__Impl4433 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_3_1__0__Impl_in_rule__RPCMessage__Group_3_1__04468 = new BitSet(new long[]{0x00002900011FF820L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_3_1__1_in_rule__RPCMessage__Group_3_1__04471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__RPCMessage__Group_3_1__0__Impl4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_3_1__1__Impl_in_rule__RPCMessage__Group_3_1__14530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__ArgumentsAssignment_3_1_1_in_rule__RPCMessage__Group_3_1__1__Impl4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_5__0__Impl_in_rule__RPCMessage__Group_5__04591 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_5__1_in_rule__RPCMessage__Group_5__04594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__RPCMessage__Group_5__0__Impl4622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__Group_5__1__Impl_in_rule__RPCMessage__Group_5__14653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPCMessage__ErrorAssignment_5_1_in_rule__RPCMessage__Group_5__1__Impl4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__04714 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__04717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__TypeAssignment_0_in_rule__Argument__Group__0__Impl4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__14774 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Argument__Group__2_in_rule__Argument__Group__14777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__NameAssignment_1_in_rule__Argument__Group__1__Impl4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__2__Impl_in_rule__Argument__Group__24834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2__0_in_rule__Argument__Group__2__Impl4861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2__0__Impl_in_rule__Argument__Group_2__04898 = new BitSet(new long[]{0x0000120000000850L});
    public static final BitSet FOLLOW_rule__Argument__Group_2__1_in_rule__Argument__Group_2__04901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Argument__Group_2__0__Impl4929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2__1__Impl_in_rule__Argument__Group_2__14960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__DefaultAssignment_2_1_in_rule__Argument__Group_2__1__Impl4987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__0__Impl_in_rule__TypeDef__Group__05021 = new BitSet(new long[]{0x00000100011C0000L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__1_in_rule__TypeDef__Group__05024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__AnnotationsAssignment_0_in_rule__TypeDef__Group__0__Impl5051 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__1__Impl_in_rule__TypeDef__Group__15082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__TypeAssignment_1_in_rule__TypeDef__Group__1__Impl5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ErrorType__Group__0__Impl_in_rule__ErrorType__Group__05143 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__ErrorType__Group__1_in_rule__ErrorType__Group__05146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ErrorType__Group__0__Impl5174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ErrorType__Group__1__Impl_in_rule__ErrorType__Group__15205 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ErrorType__Group__2_in_rule__ErrorType__Group__15208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ErrorType__NameAssignment_1_in_rule__ErrorType__Group__1__Impl5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ErrorType__Group__2__Impl_in_rule__ErrorType__Group__25265 = new BitSet(new long[]{0x0000290201FFF820L});
    public static final BitSet FOLLOW_rule__ErrorType__Group__3_in_rule__ErrorType__Group__25268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ErrorType__Group__2__Impl5296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ErrorType__Group__3__Impl_in_rule__ErrorType__Group__35327 = new BitSet(new long[]{0x0000290201FFF820L});
    public static final BitSet FOLLOW_rule__ErrorType__Group__4_in_rule__ErrorType__Group__35330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ErrorType__FieldsAssignment_3_in_rule__ErrorType__Group__3__Impl5357 = new BitSet(new long[]{0x0000290001FFF822L});
    public static final BitSet FOLLOW_rule__ErrorType__Group__4__Impl_in_rule__ErrorType__Group__45388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ErrorType__Group__4__Impl5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__0__Impl_in_rule__RecordType__Group__05457 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__RecordType__Group__1_in_rule__RecordType__Group__05460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RecordType__Group__0__Impl5488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__1__Impl_in_rule__RecordType__Group__15519 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__2_in_rule__RecordType__Group__15522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__NameAssignment_1_in_rule__RecordType__Group__1__Impl5549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__2__Impl_in_rule__RecordType__Group__25579 = new BitSet(new long[]{0x0000290201FFF820L});
    public static final BitSet FOLLOW_rule__RecordType__Group__3_in_rule__RecordType__Group__25582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__RecordType__Group__2__Impl5610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__3__Impl_in_rule__RecordType__Group__35641 = new BitSet(new long[]{0x0000290201FFF820L});
    public static final BitSet FOLLOW_rule__RecordType__Group__4_in_rule__RecordType__Group__35644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__FieldsAssignment_3_in_rule__RecordType__Group__3__Impl5671 = new BitSet(new long[]{0x0000290001FFF822L});
    public static final BitSet FOLLOW_rule__RecordType__Group__4__Impl_in_rule__RecordType__Group__45702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__RecordType__Group__4__Impl5730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__05771 = new BitSet(new long[]{0x0000290001FFF820L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__05774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__AnnotationsAssignment_0_in_rule__Field__Group__0__Impl5801 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__15832 = new BitSet(new long[]{0x0000090000000020L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__15835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypeAssignment_1_in_rule__Field__Group__1__Impl5862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__25892 = new BitSet(new long[]{0x0000090000000020L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__25895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAnnotationsAssignment_2_in_rule__Field__Group__2__Impl5922 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__35953 = new BitSet(new long[]{0x0000002080000000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__35956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_3_in_rule__Field__Group__3__Impl5983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__46013 = new BitSet(new long[]{0x0000002080000000L});
    public static final BitSet FOLLOW_rule__Field__Group__5_in_rule__Field__Group__46016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_4__0_in_rule__Field__Group__4__Impl6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__56074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Field__Group__5__Impl6102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_4__0__Impl_in_rule__Field__Group_4__06145 = new BitSet(new long[]{0x0000120000000850L});
    public static final BitSet FOLLOW_rule__Field__Group_4__1_in_rule__Field__Group_4__06148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Field__Group_4__0__Impl6176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_4__1__Impl_in_rule__Field__Group_4__16207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__DefaultAssignment_4_1_in_rule__Field__Group_4__1__Impl6234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group__0__Impl_in_rule__UnionFieldType__Group__06268 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group__1_in_rule__UnionFieldType__Group__06271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UnionFieldType__Group__0__Impl6299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group__1__Impl_in_rule__UnionFieldType__Group__16330 = new BitSet(new long[]{0x00002900011FF820L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group__2_in_rule__UnionFieldType__Group__16333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__UnionFieldType__Group__1__Impl6361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group__2__Impl_in_rule__UnionFieldType__Group__26392 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group__3_in_rule__UnionFieldType__Group__26395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__TypesAssignment_2_in_rule__UnionFieldType__Group__2__Impl6422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group__3__Impl_in_rule__UnionFieldType__Group__36452 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group__4_in_rule__UnionFieldType__Group__36455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group_3__0_in_rule__UnionFieldType__Group__3__Impl6482 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group__4__Impl_in_rule__UnionFieldType__Group__46513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__UnionFieldType__Group__4__Impl6541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group_3__0__Impl_in_rule__UnionFieldType__Group_3__06582 = new BitSet(new long[]{0x00002900011FF820L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group_3__1_in_rule__UnionFieldType__Group_3__06585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__UnionFieldType__Group_3__0__Impl6613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__Group_3__1__Impl_in_rule__UnionFieldType__Group_3__16644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionFieldType__TypesAssignment_3_1_in_rule__UnionFieldType__Group_3__1__Impl6671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__Group__0__Impl_in_rule__ArrayFieldType__Group__06705 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__Group__1_in_rule__ArrayFieldType__Group__06708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArrayFieldType__Group__0__Impl6736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__Group__1__Impl_in_rule__ArrayFieldType__Group__16767 = new BitSet(new long[]{0x00002900011FF820L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__Group__2_in_rule__ArrayFieldType__Group__16770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ArrayFieldType__Group__1__Impl6798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__Group__2__Impl_in_rule__ArrayFieldType__Group__26829 = new BitSet(new long[]{0x00002900011FF820L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__Group__3_in_rule__ArrayFieldType__Group__26832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__AnnotationAssignment_2_in_rule__ArrayFieldType__Group__2__Impl6859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__Group__3__Impl_in_rule__ArrayFieldType__Group__36890 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__Group__4_in_rule__ArrayFieldType__Group__36893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__TypeAssignment_3_in_rule__ArrayFieldType__Group__3__Impl6920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayFieldType__Group__4__Impl_in_rule__ArrayFieldType__Group__46950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ArrayFieldType__Group__4__Impl6978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFieldType__Group__0__Impl_in_rule__MapFieldType__Group__07019 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__MapFieldType__Group__1_in_rule__MapFieldType__Group__07022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MapFieldType__Group__0__Impl7050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFieldType__Group__1__Impl_in_rule__MapFieldType__Group__17081 = new BitSet(new long[]{0x00002900011FF820L});
    public static final BitSet FOLLOW_rule__MapFieldType__Group__2_in_rule__MapFieldType__Group__17084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__MapFieldType__Group__1__Impl7112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFieldType__Group__2__Impl_in_rule__MapFieldType__Group__27143 = new BitSet(new long[]{0x00002900011FF820L});
    public static final BitSet FOLLOW_rule__MapFieldType__Group__3_in_rule__MapFieldType__Group__27146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFieldType__AnnotationAssignment_2_in_rule__MapFieldType__Group__2__Impl7173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFieldType__Group__3__Impl_in_rule__MapFieldType__Group__37204 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__MapFieldType__Group__4_in_rule__MapFieldType__Group__37207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFieldType__TypeAssignment_3_in_rule__MapFieldType__Group__3__Impl7234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFieldType__Group__4__Impl_in_rule__MapFieldType__Group__47264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MapFieldType__Group__4__Impl7292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__0__Impl_in_rule__FixedType__Group__07333 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__FixedType__Group__1_in_rule__FixedType__Group__07336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FixedType__Group__0__Impl7364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__1__Impl_in_rule__FixedType__Group__17395 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__2_in_rule__FixedType__Group__17398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__NameAssignment_1_in_rule__FixedType__Group__1__Impl7425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__2__Impl_in_rule__FixedType__Group__27455 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FixedType__Group__3_in_rule__FixedType__Group__27458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FixedType__Group__2__Impl7486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__3__Impl_in_rule__FixedType__Group__37517 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__4_in_rule__FixedType__Group__37520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__SizeAssignment_3_in_rule__FixedType__Group__3__Impl7547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__4__Impl_in_rule__FixedType__Group__47577 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__5_in_rule__FixedType__Group__47580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FixedType__Group__4__Impl7608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__5__Impl_in_rule__FixedType__Group__57639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FixedType__Group__5__Impl7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__0__Impl_in_rule__EnumType__Group__07710 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__EnumType__Group__1_in_rule__EnumType__Group__07713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumType__Group__0__Impl7741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__1__Impl_in_rule__EnumType__Group__17772 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__2_in_rule__EnumType__Group__17775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__NameAssignment_1_in_rule__EnumType__Group__1__Impl7802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__2__Impl_in_rule__EnumType__Group__27832 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumType__Group__3_in_rule__EnumType__Group__27835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EnumType__Group__2__Impl7863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__3__Impl_in_rule__EnumType__Group__37894 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__4_in_rule__EnumType__Group__37897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__LiteralsAssignment_3_in_rule__EnumType__Group__3__Impl7924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__4__Impl_in_rule__EnumType__Group__47954 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__5_in_rule__EnumType__Group__47957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_4__0_in_rule__EnumType__Group__4__Impl7984 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__5__Impl_in_rule__EnumType__Group__58015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EnumType__Group__5__Impl8043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_4__0__Impl_in_rule__EnumType__Group_4__08086 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumType__Group_4__1_in_rule__EnumType__Group_4__08089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EnumType__Group_4__0__Impl8117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_4__1__Impl_in_rule__EnumType__Group_4__18148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__LiteralsAssignment_4_1_in_rule__EnumType__Group_4__1__Impl8175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__08209 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__08212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Annotation__Group__0__Impl8240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__18271 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__18274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__NameAssignment_1_in_rule__Annotation__Group__1__Impl8301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__28331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl8358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__08395 = new BitSet(new long[]{0x0000120000000850L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__08398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Annotation__Group_2__0__Impl8426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__18457 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__2_in_rule__Annotation__Group_2__18460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ValuesAssignment_2_1_in_rule__Annotation__Group_2__1__Impl8487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__2__Impl_in_rule__Annotation__Group_2__28517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Annotation__Group_2__2__Impl8545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__Group__0__Impl_in_rule__Values__Group__08582 = new BitSet(new long[]{0x0000120000000850L});
    public static final BitSet FOLLOW_rule__Values__Group__1_in_rule__Values__Group__08585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__Group__1__Impl_in_rule__Values__Group__18643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__Alternatives_1_in_rule__Values__Group__1__Impl8670 = new BitSet(new long[]{0x0000120000000852L});
    public static final BitSet FOLLOW_rule__Values__Group_1_1__0__Impl_in_rule__Values__Group_1_1__08705 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Values__Group_1_1__1_in_rule__Values__Group_1_1__08708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__ValueAssignment_1_1_0_in_rule__Values__Group_1_1__0__Impl8735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__Group_1_1__1__Impl_in_rule__Values__Group_1_1__18765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__Group_1_1_1__0_in_rule__Values__Group_1_1__1__Impl8792 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Values__Group_1_1_1__0__Impl_in_rule__Values__Group_1_1_1__08827 = new BitSet(new long[]{0x0000120000000850L});
    public static final BitSet FOLLOW_rule__Values__Group_1_1_1__1_in_rule__Values__Group_1_1_1__08830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Values__Group_1_1_1__0__Impl8858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__Group_1_1_1__1__Impl_in_rule__Values__Group_1_1_1__18889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__ValueAssignment_1_1_1_1_in_rule__Values__Group_1_1_1__1__Impl8916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__08950 = new BitSet(new long[]{0x0000120000000850L});
    public static final BitSet FOLLOW_rule__Array__Group__1_in_rule__Array__Group__08953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Array__Group__0__Impl8982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__19014 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Array__Group__2_in_rule__Array__Group__19017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__ValuesAssignment_1_in_rule__Array__Group__1__Impl9044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__29074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Array__Group__2__Impl9102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapableId__Group_1__0__Impl_in_rule__EscapableId__Group_1__09139 = new BitSet(new long[]{0x000000001FFC0000L});
    public static final BitSet FOLLOW_rule__EscapableId__Group_1__1_in_rule__EscapableId__Group_1__09142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__EscapableId__Group_1__0__Impl9170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapableId__Group_1__1__Impl_in_rule__EscapableId__Group_1__19201 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__EscapableId__Group_1__2_in_rule__EscapableId__Group_1__19204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedKeyWords_in_rule__EscapableId__Group_1__1__Impl9231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapableId__Group_1__2__Impl_in_rule__EscapableId__Group_1__29260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__EscapableId__Group_1__2__Impl9288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AN__Group__0__Impl_in_rule__AN__Group__09325 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__AN__Group__1_in_rule__AN__Group__09328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AN__Group__0__Impl9355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AN__Group__1__Impl_in_rule__AN__Group__19384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AN__Group_1__0_in_rule__AN__Group__1__Impl9411 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__AN__Group_1__0__Impl_in_rule__AN__Group_1__09446 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AN__Group_1__1_in_rule__AN__Group_1__09449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__AN__Group_1__0__Impl9477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AN__Group_1__1__Impl_in_rule__AN__Group_1__19508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AN__Group_1__1__Impl9535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegativeInt__Group__0__Impl_in_rule__NegativeInt__Group__09568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NegativeInt__Group__1_in_rule__NegativeInt__Group__09571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__NegativeInt__Group__0__Impl9599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegativeInt__Group__1__Impl_in_rule__NegativeInt__Group__19630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NegativeInt__Group__1__Impl9657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__AvdlFile__ImportsAssignment_09695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_rule__AvdlFile__ProtocolsAssignment_19726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportType_in_rule__Import__TypeAssignment_19757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportUriAssignment_29788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Protocol__AnnotationsAssignment_09819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_rule__Protocol__NameAssignment_29850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Protocol__ElementsAssignment_49881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnTypeLink_in_rule__RPCMessage__ReturnTypeAssignment_09912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_rule__RPCMessage__NameAssignment_19943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__RPCMessage__ArgumentsAssignment_3_09974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__RPCMessage__ArgumentsAssignment_3_1_110005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_rule__RPCMessage__ErrorAssignment_5_110040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__RPCMessage__OnewayAssignment_610080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__Argument__TypeAssignment_010119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_rule__Argument__NameAssignment_110150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Argument__DefaultAssignment_2_110181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__VoidTypeLink__TargetAssignment10217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__TypeDef__AnnotationsAssignment_010256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TypeDef__TypeAssignment_110287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_rule__ErrorType__NameAssignment_110318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__ErrorType__FieldsAssignment_310349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_rule__RecordType__NameAssignment_110380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__RecordType__FieldsAssignment_310411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Field__AnnotationsAssignment_010442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__TypeAssignment_110473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Field__NameAnnotationsAssignment_210504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_rule__Field__NameAssignment_310535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Field__DefaultAssignment_4_110566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__SimpleFieldType__TypeAssignment10597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__UnionFieldType__TypesAssignment_210628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__UnionFieldType__TypesAssignment_3_110659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__ArrayFieldType__AnnotationAssignment_210690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__ArrayFieldType__TypeAssignment_310721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__MapFieldType__AnnotationAssignment_210752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLink_in_rule__MapFieldType__TypeAssignment_310783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimativeTypeLink__TargetAlternatives_0_in_rule__PrimativeTypeLink__TargetAssignment10814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_rule__CustomTypeLink__TargetAssignment10851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_rule__FixedType__NameAssignment_110886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FixedType__SizeAssignment_310917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapableId_in_rule__EnumType__NameAssignment_110948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumType__LiteralsAssignment_310979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumType__LiteralsAssignment_4_111010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAN_in_rule__Annotation__NameAssignment_111041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_rule__Annotation__ValuesAssignment_2_111072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rule__Values__ValueAssignment_1_011103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Values__ValueAssignment_1_1_011134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Values__ValueAssignment_1_1_1_111165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_rule__Array__ValuesAssignment_111196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Null__ValAssignment11232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValAssignment11271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntValue__ValAlternatives_0_in_rule__IntValue__ValAssignment11302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__ValueAssignment_1_0_in_synpred18_InternalAvdl2672 = new BitSet(new long[]{0x0000000000000002L});

}