package com.capgemini.operationstest;

import com.capgemini.operations.Multiply;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyTest {

    Multiply multiply = new Multiply();

    @Test
    public void testDivideTwoNumbers() {
        int result = multiply.executeEquationWithNumbers(10,"*",20);
        assertEquals(200,result);
    }
}