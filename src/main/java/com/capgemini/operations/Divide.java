package com.capgemini.operations;

import com.capgemini.exception.ExceptionWhenDividingBy0;
import com.capgemini.validation.IValidationNumber;
import org.tinylog.Logger;

public class Divide implements IEquations, IValidationNumber {

    @Override
    public int executeEquationWithNumbers(int firstNumberOfEquation, String operator, int secondNumberOfEquation) throws ExceptionWhenDividingBy0 {
        if(!checkValidationNumber(secondNumberOfEquation)){
            Logger.warn("You can use only : /");
            throw new ExceptionWhenDividingBy0("You can use only : / and you can't divide by 0.");
        }
        return firstNumberOfEquation / secondNumberOfEquation;
    }

    @Override
    public boolean checkValidationNumber(int number) {
        if(number == 0) {
            Logger.error("Something went wrong");
            return false;
        }
        return true;
    }
}
