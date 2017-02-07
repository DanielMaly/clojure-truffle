package net.danielmaly.scheme.eval;

import com.oracle.truffle.api.dsl.TypeSystem;
import net.danielmaly.scheme.types.ConsCell;
import net.danielmaly.scheme.types.NilValue;
import net.danielmaly.scheme.types.SchemeFunction;

@TypeSystem({long.class, double.class, boolean.class, String.class, SchemeFunction.class,
         ConsCell.class, NilValue.class})
public abstract class SchemeTypes {
}