package com.learning;

/**
 * A simple Hello World class to demonstrate the Java project setup.
 * This serves as a starting point for adding Java learning concepts.
 */
public class HelloWorld {
    
    /**
     * Returns a greeting message.
     *
     * @return A greeting string
     */
    public String getGreeting() {
        return "Hello, Java Learning!";
    }

    /**
     * Main method to run the application.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.getGreeting());
    }
}
