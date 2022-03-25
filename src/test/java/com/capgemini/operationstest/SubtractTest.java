package com.capgemini.operationstest;

import com.capgemini.operations.Subtract;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SubtractTest {

    Subtract subtract = new Subtract();

    @Test
    public void testDivideTwoNumbers() {
        int result = subtract.executeEquationWithNumbers(10,"-",9);
        assertEquals(1,result);
    }

}