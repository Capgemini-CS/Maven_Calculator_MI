package com.capgemini.main;

import com.capgemini.exception.ExceptionWhenDividingBy0;
import com.capgemini.exception.ExceptionWhenFileIsIncorrect;
import com.capgemini.exception.ExceptionWhenKeyIsInvalid;
import com.capgemini.exception.ExceptionWhenOperatorIsDifferent;
import com.capgemini.screen.OutputScreenFile;

public class ProgramMainCalculatorFile {
    public static void main(String[] args) throws ExceptionWhenKeyIsInvalid, ExceptionWhenOperatorIsDifferent, ExceptionWhenFileIsIncorrect, ExceptionWhenDividingBy0 {
        OutputScreenFile outputScreenFile = new OutputScreenFile();
        outputScreenFile.showEquationUsingFile();
    }
}
