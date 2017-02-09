package net.danielmaly.scheme.eval;

public class GenericPair<X,Y> {
    public X fst;
    public Y snd;

    public GenericPair(X fst, Y snd) {
        this.fst = fst;
        this.snd = snd;
    }
}
