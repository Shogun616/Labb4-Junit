package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextProcessorTest {

    @BeforeAll
    public static void init(){
        System.out.println("Before All init() method called");
    }

    @DisplayName("Uppercase operation test")
    @Test
    void testUppercase(){
        assertEquals("JAVA", TextProcessor.uppercase("java"));
    }

    @BeforeEach
    public void initEach(){
        System.out.println("Before Each initEach() method called");
    }

    @DisplayName("Lowercase operation test")
    @Test
    void testLowercase(){
        assertEquals("java", TextProcessor.lowercase("JAVA"));
    }

    @AfterEach
    public void cleanUpEach(){
        System.out.println("After Each cleanUpEach() method called");
    }

    @DisplayName("Reverse operation test")
    @RepeatedTest(5)
    void testReverse(TestInfo testInfo, RepetitionInfo repetitionInfo){
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        Assertions.assertNotEquals("avaj", TextProcessor.backwards("java"));
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("After All cleanUp() method called");
    }
}
