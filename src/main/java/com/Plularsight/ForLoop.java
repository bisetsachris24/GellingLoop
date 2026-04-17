package com.Plularsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {

        // Creating for loop
        for (int i = 10; i >= 1; i--) {
            Thread.sleep(1000); // pause for 1 second
            System.out.println(i);

        }

        System.out.println("Launch!");
    }
}