package org.session16.homework.interfaces;

import org.session16.homework.Pair;

@FunctionalInterface
public interface PairMaker<T, U> {

    Pair<T,U> makepair(T t, U u);
}
