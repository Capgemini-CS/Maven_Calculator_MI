package com.capgemini.input;

import java.util.Scanner;

public class Operator {
    public Operator() {
    }

    public String getOperatorInput() {
        String operator;
        Scanner scanner = new Scanner(System.in);
        operator = scanner.nextLine();
        return operator;
    }
}
