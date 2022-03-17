package com.capgemini.operationstest;

import com.capgemini.operations.Subtract;
import junit.framework.TestCase;

public class SubtractTest extends TestCase {

    Subtract subtract = new Subtract();

    public void testDivideTwoNumbers() {
        int result = subtract.executeEquationWithNumbers(10,"-",9);
        assertEquals(1,result);
    }

}