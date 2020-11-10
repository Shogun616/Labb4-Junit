package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextProcessorTest {

    @BeforeAll
    public static void init(){
        System.out.println("Before All init() method called");
    }

    @BeforeEach
    public void initEach(){
        System.out.println("Before Each initEach() method called");
    }

    @DisplayName("Uppercase operation test")
    @Test
    void testUppercase(){}

    @DisplayName("Lowercase operation test")
    @Test
    void testLowercase(){}

    @DisplayName("Reverse operation test")
    @Test
    void testReverse(){}

    @AfterEach
    public void cleanUpEach(){
        System.out.println("After Each cleanUpEach() method called");
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("After All cleanUp() method called");
    }
}
