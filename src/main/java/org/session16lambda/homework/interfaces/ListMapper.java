package org.session16lambda.homework.interfaces;

import java.util.List;
import java.util.function.Function;

@FunctionalInterface
public interface ListMapper {

    List<Integer> map(List<Integer> integerList, Function<Integer, Integer> function);
}
