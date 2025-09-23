package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculator21Test {
    @Test
    public void testMax() {
        int[] numbers = {1, 2, 3, 4, 5};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        assertEquals(5, max);
    }


}