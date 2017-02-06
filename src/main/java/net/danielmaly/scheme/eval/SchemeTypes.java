package net.danielmaly.scheme.eval;

import com.oracle.truffle.api.dsl.TypeSystem;

@TypeSystem({long.class, double.class, boolean.class, String.class, SchemeFunction.class,
         ConsCell.class, NilValue.class})
public abstract class SchemeTypes {
}