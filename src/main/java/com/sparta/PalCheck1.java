package com.sparta;

public class PalCheck1 implements PalinInt{

    @Override
    public boolean isPalindrome(String word) {
        String noSpaces = word.replaceAll("\\s+", "").toLowerCase();

        int length = noSpaces.length();
        int front = 0;
        int back = length - 1;

        while (back > front) {
            char frontChar = noSpaces.charAt(front);
            char backChar = noSpaces.charAt(back);
            if (frontChar != backChar) {
                return false;
            }
            back--;
            front++;
        }
        return true;
    }
}
