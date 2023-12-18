package org.session8lists.onlinepractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int index = 0; index < 500000 ; index++){
            arrayList.add(String.valueOf(index));
            linkedList.add(String.valueOf(index));
        }

        long startTimer = System.currentTimeMillis();
        for (int index = 0; index < 50000; index++){
            arrayList.add(0,String.valueOf(index));
        }
        long endTimer = System.currentTimeMillis();
        long durationAL = endTimer - startTimer;

        startTimer = System.currentTimeMillis();
        for (int index = 0; index < 50000; index++){
            linkedList.add(0,String.valueOf(index));
        }
        endTimer = System.currentTimeMillis();
        long durationLL = endTimer - startTimer;

        System.out.println("ArrayList duration :"+durationAL);
        System.out.println("LinkedList duration :"+durationLL);


    }
}
