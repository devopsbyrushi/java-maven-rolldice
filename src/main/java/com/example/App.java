package com.example;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int diceRoll = random.nextInt(6) + 1; // Generates a random number between 1 and 6
        System.out.println("You rolled a: " + diceRoll);
    }
}
