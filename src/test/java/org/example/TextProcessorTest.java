package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class TextProcessorTest {

    @BeforeAll
    public static void init(){

        System.out.println("Before All init() method called");
        //Assertions.assertEquals(true, false, "Start"); Fick det inte att funka.
    }

    @DisplayName("Uppercase operation test")
    @Test
    void testUppercase(){
        assertEquals("JAVA", TextProcessor.uppercase("java"));
        assertNull(null);
    }

    @BeforeEach
    public void initEach(){

        System.out.println("Before Each initEach() method called");
    }

    @DisplayName("Lowercase operation test")
    @Test
    void testLowercase(){
        assertEquals("java", TextProcessor.lowercase("JAVA"));
        assertNull(null);
    }

    @AfterEach
    public void cleanUpEach(){

        System.out.println("After Each cleanUpEach() method called");
    }

    @DisplayName("Reverse operation test")
    @Test
    void testReverse(){
        assertNotEquals("avaj", TextProcessor.backwards("java"));
        assertNull(null);
    }

    @AfterAll
    public static void cleanUp(){

        System.out.println("After All cleanUp() method called");
    }
}
