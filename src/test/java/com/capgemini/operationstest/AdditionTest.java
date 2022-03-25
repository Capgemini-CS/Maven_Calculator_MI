package com.capgemini.operationstest;

import com.capgemini.operations.Addition;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AdditionTest {

    Addition addition = new Addition();

    @Test
    public void testAdditionOfTwoNumbers() {
        int result = addition.executeEquationWithNumbers(5,"+",7);
        assertEquals(12,result);
    }



}