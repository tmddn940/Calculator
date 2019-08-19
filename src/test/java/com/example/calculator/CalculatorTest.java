package com.example.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    @Test
    public void test_양수덧셈() {
    }
    @Test
    public void test_음수테스트() {
    }
    @Test
    public void test_양수덧셈2(){

    }

    @Test
    public void test_정수나눗셈(){
        Calculator calc = new Calculator();
        int result = calc.divide(10,5);
        assertEquals( 2, result);
    }

    @Test
    public void test_실수나눗셈() {
        Calculator calc = new Calculator();
        double result = calc.divide(10.0, 4.0);
        assertEquals(2.5, result);
    }
    @Test(expected = ArithmeticException.class)
    public void test_0으로나누기2(){ //100%오류
        Calculator calc = new Calculator();
        int result = calc.divide(10,0);
        assertEquals( 0, result);
    }
    @Test
    public void test_곱하기(){
        Calculator calc = new Calculator();
        int result = calc.divide(2,2);
        assertEquals( 4, result);
    }
    @Test
    public void test_양수빼기(){
        Calculator calc = new Calculator();
        int result = calc.divide(2,2);
        assertEquals( "두 뺄샘 차이는 1이여야합니다.",0, result);
    }
}
