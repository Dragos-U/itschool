package org.session15.homework.bulkchallenges;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public enum CarTypes {

    SUV("Jeep", 35_000),
    COUPE("Ferrari",150_000),
    SEDAN("Dacia", 15_000),
    HATCHBACK("Mitsubishi", 25_000);

    String manufacturer;
    int averagePrice;
}

class TestCarTypes{

    public static void main(String[] args) {
        CarTypes car1 = CarTypes.COUPE;
        CarTypes car2 = CarTypes.HATCHBACK;

        System.out.println(car1);
        System.out.println(car2);
    }
}
