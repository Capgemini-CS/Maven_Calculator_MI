package com.capgemini.operationstest;

import com.capgemini.operations.Multiply;
import junit.framework.TestCase;

public class MultiplyTest extends TestCase {

    Multiply multiply = new Multiply();

    public void testDivideTwoNumbers() {
        int result = multiply.executeEquationWithNumbers(10,"*",20);
        assertEquals(200,result);
    }

}