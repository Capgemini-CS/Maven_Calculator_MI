package com.capgemini.operations;

import com.capgemini.exception.ExceptionWhenOperatorIsDifferent;

public interface IEquations {
    int executeEquationWithNumbers(int firstNumberOfEquation, String operator, int secondNumberOfEquation) throws ExceptionWhenOperatorIsDifferent;
}
