package com.capgemini.input;

import com.capgemini.exception.ExceptionWhenKeyIsInvalid;

import java.util.Scanner;

public class Key {

    public Key(){ }

    public int getKeyNumber() throws ExceptionWhenKeyIsInvalid {
        int key;
        Scanner scanner = new Scanner(System.in);
        try{
            key = scanner.nextInt();
        } catch (NumberFormatException number) {
            throw new ExceptionWhenKeyIsInvalid("Your parameter is not a valid key.");
        }
        return key;
    }
}
