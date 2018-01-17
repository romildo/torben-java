package absyn;

import io.vavr.collection.Tree;
import parse.Loc;

public class ExpInt extends Exp {
   public final int value;

   public ExpInt(Loc loc, int value) {
      super(loc);
      this.value = value;
   }

   @Override
   public Tree.Node<String> toTree() {
      return Tree.of("ExpInt: " + value);
   }
}
