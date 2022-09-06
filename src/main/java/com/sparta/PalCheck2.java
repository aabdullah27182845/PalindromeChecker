package com.sparta;

public class PalCheck2 implements PalinInt{
    @Override
    public boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }

        try {
            String noSpaces = word.replaceAll("\\s+", "").toLowerCase();
            int limit = (noSpaces.length() / 2) + 1;

            for (int i = 0; i < limit; i++) {
                if (noSpaces.charAt(i) != noSpaces.charAt(noSpaces.length() - i - 1)) {
                    return false;
                }
            }
            return true;
        } catch (Exception NullPointerException) {
            return false;
        }
    }
}
