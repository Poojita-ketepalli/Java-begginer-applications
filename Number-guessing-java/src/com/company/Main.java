package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        while(true){
            Scanner s = new Scanner(System.in);
            System.out.print("Guess the number:");
            int guess = s.nextInt();
            Random rand = new Random();
            int unknown = rand.nextInt(5);
            if (guess == unknown) {
                System.out.println("Your guess is correct");
            } else {
                System.out.println("Your guess is incorrect");
                System.out.println("The correct answer is " + unknown);
            }
        }
    }
}
