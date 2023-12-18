package org.session16lambda.homework.interfaces;

@FunctionalInterface
public interface StringTruncator {

    String returnFirstNChars(String stringInput, int firstNChars);
}
