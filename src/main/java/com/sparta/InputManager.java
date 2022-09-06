package com.sparta;

import java.util.Scanner;

public class InputManager {

    static Scanner scanner = new Scanner(System.in);
    public String sentenceInput() {
        String input = scanner.nextLine();
        return input;
    }

    public int optionsInput(String[] inputList) {
        System.out.println("Enter the numbers between this range (1, " + inputList.length + ")");
            try {
                int input = scanner.nextInt();
                while (input < 1 || input > inputList.length) {
                    input = scanner.nextInt();
            }
                return input;
        } catch (Exception e) {
                return -1;
            }




    }
}
