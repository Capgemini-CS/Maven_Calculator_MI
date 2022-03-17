package com.capgemini.main;

import com.capgemini.calculator.CalculatorLogic;
import com.capgemini.exception.ExceptionWhenKeyIsInvalid;
import com.capgemini.exception.ExceptionWhenOperatorIsDifferent;
import com.capgemini.input.Key;
import com.capgemini.input.Operator;
import com.capgemini.screen.OutputScreen;

public class ProgramMainCalculator {
    public static void main(String[] args) throws ExceptionWhenKeyIsInvalid, ExceptionWhenOperatorIsDifferent {
        CalculatorLogic calculator = new CalculatorLogic();

        Key firstNumber = new Key();
        Key secondNumber = new Key();
        Operator operator = new Operator();

        int resultOfEquation = calculator.executeEquationWithNumbers(
                firstNumber.getKeyNumber(),
                operator.getOperatorInput(),
                secondNumber.getKeyNumber()
        );

        OutputScreen outputScreen = new OutputScreen();
        outputScreen.showOutputOnScreen(resultOfEquation);
    }
}
