package org.session16lambda.homework.interfaces;

import java.util.List;

@FunctionalInterface
public interface ListMaxFinder<T extends Number>{

    T findMaximum(List<T> numberList);
}
