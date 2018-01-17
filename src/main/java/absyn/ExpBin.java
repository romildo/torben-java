package absyn;

import io.vavr.collection.Tree;
import parse.Loc;

public class ExpBin extends Exp {
   public enum Operator {
      PLUS, MINUS, TIMES, DIV, MOD,
      EQ, NE, GT, GE, LT, LE,
      AND, OR
   }

   public final Operator op;
   public final Exp left;
   public final Exp right;

   public ExpBin(Loc loc, Operator op, Exp left, Exp right) {
      super(loc);
      this.op = op;
      this.left = left;
      this.right = right;
   }

   @Override
   public Tree.Node<String> toTree() {
      return Tree.of("ExpBin: " + op, left.toTree(), right.toTree());
   }
}
