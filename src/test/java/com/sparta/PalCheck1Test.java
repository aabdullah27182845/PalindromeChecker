package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalCheck1Test {

    @Test
    @DisplayName("Test for true")
    void isPalindrome() {
        PalCheck1 palCheck1 = new PalCheck1();
        String word = "racecar";
        Assertions.assertTrue(palCheck1.isPalindrome(word));
    }

    @Test
    @DisplayName("Test for false")
    void isNotPalindrome() {
        PalCheck1 palCheck1 = new PalCheck1();
        String word = "racenotcar";
        Assertions.assertFalse(palCheck1.isPalindrome(word));
    }

}