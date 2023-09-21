package org.session16.homework.interfaces;

import java.util.List;

@FunctionalInterface
public interface NameFormatter {

    List<String> toUpperCase(List<String> inputList);
}
