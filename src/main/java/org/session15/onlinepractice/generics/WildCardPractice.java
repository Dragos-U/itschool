package org.session15.onlinepractice.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardPractice {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Dan","Alice");
        List<Integer> integerList =Arrays.asList(1, 2);

        printFirstClass(stringList);
        printFirstClass(integerList);
    }

    private static void printFirstClass(List<?> list){
        if(!list.isEmpty()){
            System.out.println(list.get(0).getClass().getSimpleName());
        }
    }
}
