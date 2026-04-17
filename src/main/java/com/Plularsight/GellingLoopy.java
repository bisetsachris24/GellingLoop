package com.Plularsight;

public class GellingLoopy {
    public static void main(String[] args) {
        int i=0;
        while(i <=10){
            System.out.println(i);
            i++;

            int j = 1;
            int sum = 0;
            while (j <= 10) {
                sum += j;
                j++;
            }
            System.out.println("Sum = " + sum);
        }
    }

}
