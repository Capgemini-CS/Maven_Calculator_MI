package com.capgemini.screen;

import com.capgemini.exception.ExceptionWhenFileIsIncorrect;
import com.capgemini.exception.ExceptionWhenOperatorIsDifferent;

public interface IWriteAndReadTxtFile {
    void saveNumbersInTxtFile(int firstNumber, String operator, int secondNumber) throws ExceptionWhenFileIsIncorrect;

    void readNumbersFromTxtFile() throws ExceptionWhenOperatorIsDifferent, ExceptionWhenFileIsIncorrect;
}
