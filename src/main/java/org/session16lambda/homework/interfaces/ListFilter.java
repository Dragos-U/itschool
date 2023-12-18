package org.session16lambda.homework.interfaces;

import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
public interface ListFilter<T> {

    List<T> filterList(List<T> inputList, Predicate<T> condition);
}
