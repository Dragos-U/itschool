package org.session16lambda.homework.interfaces;

import org.session16lambda.homework.Pair;

@FunctionalInterface
public interface PairMaker<T, U> {

    Pair<T,U> makepair(T t, U u);
}
