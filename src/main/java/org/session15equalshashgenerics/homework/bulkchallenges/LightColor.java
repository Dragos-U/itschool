package org.session15equalshashgenerics.homework.bulkchallenges;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LightColor {
    red("Stop", 30),
    yellow("Caution", 5),
    green("Go", 45);

    String name;
    int durationInSeconds;
}

class Test {

    public static void main(String[] args) {
        System.out.println(LightColor.red.getDurationInSeconds());
    }
}
