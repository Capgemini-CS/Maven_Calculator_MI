package com.capgemini.operationstest;

import com.capgemini.operations.Addition;
import junit.framework.TestCase;


public class AdditionTest extends TestCase {

    Addition addition = new Addition();

    public void testAdditionOfTwoNumbers() {
        int result = addition.executeEquationWithNumbers(5,"+",7);
        assertEquals(12,result);
    }



}