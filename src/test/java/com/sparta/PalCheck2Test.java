package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalCheck2Test {

    @Test
    @DisplayName("Test for true")
    void isPalindrome() {
        PalCheck2 palCheck2 = new PalCheck2();
        String word = "racecar";
        Assertions.assertTrue(palCheck2.isPalindrome(word));
    }

    @Test
    @DisplayName("Test for false")
    void isNotPalindrome() {
        PalCheck2 palCheck2 = new PalCheck2();
        String word = "racenotcar";
        Assertions.assertFalse(palCheck2.isPalindrome(word));
    }

}