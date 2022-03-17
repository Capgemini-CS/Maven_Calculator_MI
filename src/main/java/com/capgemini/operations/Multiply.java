package com.capgemini.operations;

public class Multiply implements IEquations {

    @Override
    public int executeEquationWithNumbers(int firstNumberOfEquation, String operator, int secondNumberOfEquation) {
        return firstNumberOfEquation * secondNumberOfEquation;
    }
}
