package org.session16lambda.onlinepractice;

public class LambdasAndThreads {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("> Running in a separate thread.");
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
