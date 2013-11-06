package hampi.parser;

import hampi.parser.HProgram.HTypeEnvironment;


public abstract class HStatement extends HAbstractGrammarElement{

  protected HStatement(HGrammarElementKind kind){
    super(kind);
  }

  public abstract void typeCheck(HTypeEnvironment typeEnvironment, HVarDeclStatement varDecl);
}
