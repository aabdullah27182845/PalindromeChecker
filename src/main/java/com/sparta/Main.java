package com.sparta;

public class Main {
    public static void main(String[] args) {
        InputManager inputManager = new InputManager();
        Splitter splitter = new Splitter();
        PalManager palManager = new PalManager();
        PalCheck1 palCheck = new PalCheck1();

        String inputString = inputManager.sentenceInput();
        String[] inputWords = splitter.stringSplitter(inputString);

        for (int i = 0; i < inputWords.length; i++) {
            if (palCheck.isPalindrome(inputWords[i])) {
                palManager.addPalindrome(inputWords[i]);
            }
        }

        System.out.println(palManager.printList());







    }
}