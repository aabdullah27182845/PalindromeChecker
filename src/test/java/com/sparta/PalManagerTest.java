package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalManagerTest {

    @Test
    @DisplayName("Returned List")
    void testSize() {
        PalManager palManager = new PalManager();
        palManager.palindromes.add("racecar");
        palManager.palindromes.add("hannah");
        palManager.palindromes.add("wow");
        Assertions.assertEquals("Total amount of palindromes: 3", palManager.printList());
    }

}