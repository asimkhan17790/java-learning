package com.learning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for HelloWorld.
 * Demonstrates basic JUnit 5 testing.
 */
class HelloWorldTest {

    @Test
    void testGetGreeting() {
        HelloWorld helloWorld = new HelloWorld();
        String greeting = helloWorld.getGreeting();
        
        assertNotNull(greeting, "Greeting should not be null");
        assertEquals("Hello, Java Learning!", greeting, "Greeting message should match");
    }

    @Test
    void testGreetingIsNotEmpty() {
        HelloWorld helloWorld = new HelloWorld();
        String greeting = helloWorld.getGreeting();
        
        assertFalse(greeting.isEmpty(), "Greeting should not be empty");
        assertTrue(greeting.length() > 0, "Greeting should have content");
    }
}
