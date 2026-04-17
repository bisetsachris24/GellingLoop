package com.Plularsight;

public class Dice {

    //roll method that returns a random number between 6 and 1
    public int roll() {

        int randomNumber = (int)(Math.random() * 6) + 1;

        return randomNumber;
    }
}