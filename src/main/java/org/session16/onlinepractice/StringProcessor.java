package org.session16.onlinepractice;

public interface StringProcessor {

    String process(String input);

    default StringProcessor andThen(StringProcessor after) {
        return input -> after.process(this.process(input));
    }
}
