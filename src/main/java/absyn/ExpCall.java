package absyn;

import env.Env;
import io.vavr.collection.List;
import io.vavr.collection.Tree;
import parse.Loc;
import types.Type;
import types.VOID;

public class ExpCall extends Exp {
   public final String function;
   public final List<Exp> arguments;

   public ExpCall(Loc loc, String function, List<Exp> arguments) {
      super(loc);
      this.function = function;
      this.arguments = arguments;
   }

   @Override
   public Tree.Node<String> toTree() {
      return Tree.of(annotateType("ExpCall: " + function),
                     arguments.map(Exp::toTree));
   }

   @Override
   protected Type semantic_(Env env) {
      
   }
}
