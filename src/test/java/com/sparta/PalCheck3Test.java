package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalCheck3Test {

    @Test
    @DisplayName("Test for true")
    void isPalindrome() {
        PalCheck3 palCheck3 = new PalCheck3();
        String word = "racecar";
        Assertions.assertTrue(palCheck3.isPalindrome(word));
    }

    @Test
    @DisplayName("Test for false")
    void isNotPalindrome() {
        PalCheck3 palCheck3 = new PalCheck3();
        String word = "racenotcar";
        Assertions.assertFalse(palCheck3.isPalindrome(word));
    }

}