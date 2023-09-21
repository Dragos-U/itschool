package org.session16.homework.interfaces;

@FunctionalInterface
public interface StringTruncator {

    String returnFirstNChars(String stringInput, int firstNChars);
}
