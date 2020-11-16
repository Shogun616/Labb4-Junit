package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextProcessorTest {

    static boolean trueBool = true;
    static boolean falseBool = false;

    @BeforeAll
    public static void init(){
        System.out.println("Before All init() method called");
    }

    @DisplayName("Uppercase operation test")
    @Test
    void testUppercase(){
        assertEquals("JAVA", TextProcessor.uppercase("java"));
        Assertions.assertNull(null);
    }

    @BeforeEach
    public void initEach(){
        System.out.println("Before Each initEach() method called");
    }

    @DisplayName("Lowercase operation test")
    @Test
    void testLowercase(){
        assertEquals("java", TextProcessor.lowercase("JAVA"));
        Assertions.assertNull(null);
    }

    @AfterEach
    public void cleanUpEach(){

        System.out.println("After Each cleanUpEach() method called");
    }

    @DisplayName("Reverse operation test")
    @Test
    void testReverse(){
        Assertions.assertNotEquals("avaj", TextProcessor.backwards("java"));
        Assertions.assertNull(null);
    }

    @AfterAll
    public static void cleanUp(){

        System.out.println("After All cleanUp() method called");
    }
}
