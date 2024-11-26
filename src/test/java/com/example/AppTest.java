package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

public class AppTest {

    @Test
    public void testDiceRoll() {
        Random random = new Random();
        int diceRoll = random.nextInt(6) + 1; // Simulates a dice roll
        assertTrue(diceRoll >= 1 && diceRoll <= 6, "Dice roll is out of range!");
    }
}
