package com.sparta;

public class PalCheck3 implements PalinInt {

    @Override
    public boolean isPalindrome(String word) {
        word = word.replaceAll("\\s+", "").toLowerCase();
        String noSpaces = word.replaceAll("'", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(word);
        String reverse = stringBuilder.reverse().toString();

        if (reverse.equals(word)) {
            return true;
        } else {
            return false;
        }
    }
}
