package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    @Test
    void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    void testSub(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.sub(2, 2));
    }

    @Test
    void testMulti(){
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.multi(4, 2));
    }

    @Test
    void testDiv(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.div(8, 2));
    }
}
