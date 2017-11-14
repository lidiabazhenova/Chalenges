package com.lidiabazhenova;


import org.junit.Assert;



public class CalculatorTest {
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void div() throws Exception {
        Calculator calculator = new Calculator();
               calculator.div(1.0, 0.0);
}



}
