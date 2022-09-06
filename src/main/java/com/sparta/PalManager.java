package com.sparta;

import java.util.ArrayList;

public class PalManager {

    public ArrayList<String> palindromes = new ArrayList<String>();

    public void addPalindrome(String palindrome) {
        palindromes.add(palindrome);
    }

    public String printList() {
        for (int i = 0; i < palindromes.size(); i++) {
            System.out.println(palindromes.get(i));
        }
        return "Total amount of palindromes: " + palindromes.size();
    }
}
