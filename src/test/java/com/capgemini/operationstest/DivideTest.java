package com.capgemini.operationstest;

import com.capgemini.exception.ExceptionWhenDividingBy0;
import com.capgemini.operations.Divide;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivideTest {

    Divide divide = new Divide();

    @Test
    public void testDivideTwoNumbers() throws ExceptionWhenDividingBy0 {
        int result = divide.executeEquationWithNumbers(8,"/",2);
        assertEquals(4, result);
    }

    @Test
    public void throwingErrorTest() {
        assertThrows(ExceptionWhenDividingBy0.class , () -> divide.executeEquationWithNumbers(9,"/",0));
    }

}