package org.session16lambda.homework.interfaces;

import java.util.List;

@FunctionalInterface
public interface NameFormatter {

    List<String> toUpperCase(List<String> inputList);
}
