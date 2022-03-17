package com.capgemini.operationstest;

import com.capgemini.exception.ExceptionWhenDividingBy0;
import com.capgemini.exception.ExceptionWhenOperatorIsDifferent;
import com.capgemini.operations.Divide;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivideTest {

    Divide divide = new Divide();

    @Test
    public void testDivideTwoNumbers() throws ExceptionWhenOperatorIsDifferent {
        int result = divide.executeEquationWithNumbers(8,"/",2);
        Assert.assertEquals(4, result);
    }

    @Test(expected = ExceptionWhenDividingBy0.class)
    public void throwingErrorTest() {
        Exception exception =  assertThrows(ExceptionWhenDividingBy0.class,() ->divide.executeEquationWithNumbers(8,"/",0));
        String expectedMessage = "You can use only : /";
        String actualMessage = exception.getMessage();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }
}