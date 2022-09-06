package com.sparta;

public class Main {
    public static void main(String[] args) {
        InputManager inputManager = new InputManager();
        Splitter splitter = new Splitter();

        String inputString = inputManager.sentenceInput();
        String[] inputWords = splitter.stringSplitter(inputString);

        





    }
}