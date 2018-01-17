package absyn;

import io.vavr.collection.List;
import io.vavr.collection.Tree;
import parse.Loc;

public class ExpSeq extends Exp {
   public final List<Exp> sequence;

   public ExpSeq(Loc loc, List<Exp> sequence) {
      super(loc);
      this.sequence = sequence;
   }

   @Override
   public Tree.Node<String> toTree() {
      return Tree.of("ExpSeq", sequence.map(Exp::toTree));
   }
}
