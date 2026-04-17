package com.Plularsight;

public class DiceApplication {
    public static void main(String[] args) {

        //created object dice
        Dice dice = new Dice();

        //created 2 variables for 2 dice rolls
        int diceRoll1;
        int diceRoll2;

        //variables for four different counters for the amount of times
        // 2, 4, 6, and 7 are rolled
        int counterFor2 = 0;
        int counterFor4 = 0;
        int counterFor6 = 0;
        int counterFor7 = 0;

        //for loop that iterates 100 times and prints out the sum each time
        for (int i = 1; i <= 100; i++) {
            diceRoll1 = dice.roll();
            diceRoll2 = dice.roll();

            //intializing a sum for dice rolls
            int diceSum = diceRoll1 + diceRoll2;

            //Print statement
            System.out.println("Roll " + i + ": " + diceRoll1 + " + "  + diceRoll2 + " Sum: " + diceSum);

            //Increases the counter for each specific number if the dice sum = that number
            if(diceSum == 2) {
                counterFor2++;
            }
            if(diceSum == 4) {
                counterFor4++;
            }
            if(diceSum == 6) {
                counterFor6++;
            }
            if(diceSum == 7) {
                counterFor7++;
            }
        }
        //Displaying the amount of times each number got rolled
        System.out.println("\nAmount of times 2 got rolled: " + counterFor2);
        System.out.println("Amount of times 4 got rolled: " + counterFor4);
        System.out.println("Amount of times 6 got rolled: " + counterFor6);
        System.out.println("Amount of times 7 got rolled: " + counterFor7);
    }
}