package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @BeforeAll
    public static void init(){
        System.out.println("Before All init() method called");
    }

    @BeforeEach
    public void initEach(){
        System.out.println("Before Each initEach() method called");
    }

    @DisplayName("Add operation test")
    @RepeatedTest(5)
    void testAdd(RepetitionInfo repetitionInfo){
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        assertEquals(4, Calculator.add(2,2));
    }

    @DisplayName("Sub operation test")
    @RepeatedTest(5)
    void testSub(RepetitionInfo repetitionInfo){
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        assertEquals(0, Calculator.sub(2, 2));
        Assertions.assertNotEquals(3, Calculator.sub(2, 2));
    }

    @DisplayName("Multi operation test")
    @RepeatedTest(5)
    void testMulti(RepetitionInfo repetitionInfo){
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        assertEquals(8, Calculator.multi(4, 2));
    }

    @DisplayName("Div operation test")
    @RepeatedTest(5)
    void testDiv(RepetitionInfo repetitionInfo){
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        assertEquals(4, Calculator.div(8, 2));
    }

    @AfterEach
    public void cleanUpEach(){
        System.out.println("After Each cleanUpEach() method called");
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("After All cleanUp() method called");
    }
}
