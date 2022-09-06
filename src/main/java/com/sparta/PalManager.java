package com.sparta;

import java.util.ArrayList;

public class PalManager {

    public ArrayList<String> palindromes = new ArrayList<String>();

    public void addPalindrome(String palindrome) {
        palindromes.add(palindrome);
    }

    public ArrayList<String> returnList() {
        return palindromes;
    }
}
