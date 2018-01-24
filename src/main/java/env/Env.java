package env;

import io.vavr.collection.List;
import types.INT;
import types.Type;
import types.VOID;

public class Env {

  public Table<Type> tenv;
  public Table<Entry> venv;

  public Env() {
    tenv = new Table<Type>();
    put(tenv, "void", VOID.T);
    put(tenv, "int", INT.T);

    venv = new Table<Entry>();
     put(venv, "minint", new VarEntry(INT.T));
     put(venv, "maxint", new VarEntry(INT.T));
     put(venv, "printint", new FunEntry(List.of(INT.T), VOID.T));
  }

  @Override
  public String toString() {
    return "Env{" +
           "tenv=" + tenv +
           ", venv=" + venv +
           '}';
  }

  private static <E> void put(Table<E> table, String name, E value) {
    table.put(name.intern(), value);
  }

}
