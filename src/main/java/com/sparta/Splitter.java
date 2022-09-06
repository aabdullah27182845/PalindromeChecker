package com.sparta;

public class Splitter {
    public String[] stringSplitter(String word) {
        word = word.replaceAll("'", "");
        String[] words = word.split("\\s+");

        return words;
    }
}
