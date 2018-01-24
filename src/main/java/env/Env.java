package env;

import types.INT;
import types.Type;
import types.VOID;

public class Env {

  public Table<Type> tenv;
  public Table<Entry> venv;

  public Env() {
    tenv = new Table<Type>();
    put(tenv, "unit", VOID.T);
    put(tenv, "int", INT.T);

    venv = new Table<Entry>();
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
