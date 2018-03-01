package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {


    @Test

    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1, 1);
        double result = calc.getResult();
        double expected = 2;
        assertThat(result, is(expected));
    }
    @Test
    public void whenSubtractTwoNumbers() {
        Calculator calc = new Calculator();
        calc.subtract(4D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test

    public void whenDivideTwoNumbers() {
        Calculator calc = new Calculator();
        calc.div(4D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test

    public void whenMultiplyTwoNumbers() {
        Calculator calc = new Calculator();
        calc.multiply(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));

    }

}