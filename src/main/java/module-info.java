/**
 * Java Complete Guide Module
 *
 * This module demonstrates the Java Platform Module System (JPMS)
 * and serves as a comprehensive learning resource for Java programming
 * from beginner to advanced levels.
 *
 * Module Structure:
 * - com.javalearning.basics: Fundamental Java concepts
 * - com.javalearning.memory: Object lifecycle and memory management
 * - com.javalearning.oop: Object-oriented programming concepts
 * - com.javalearning.collections: Collections framework and generics
 * - com.javalearning.advanced: Advanced concepts (exceptions, I/O, threading)
 * - com.javalearning.datetime: Date and time APIs
 * - com.javalearning.functional: Functional programming (lambdas, streams)
 * - com.javalearning.modules: Java modules system
 * - com.javalearning.modern: Modern Java features (records, sealed classes, etc.)
 * - com.javalearning.bestpractices: Design patterns and best practices
 *
 * @since Java 17
 * @author Java Learning Guide
 */
module java.complete.guide {

    // Required modules for core functionality
    requires java.base;

    // Required for logging examples
    requires java.logging;

    // Required for HTTP client examples (Java 11+)
    requires java.net.http;

    // Required for JSON processing examples
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.datatype.jsr310;

    // Required for logging framework
    requires org.slf4j;
    requires ch.qos.logback.classic;

    // Export packages for external use
    // Main entry point
    exports com.javalearning;

    // Note: Other exports will be enabled as packages are populated with classes
    // exports com.javalearning.basics;
    // exports com.javalearning.memory;
    // exports com.javalearning.oop;
    // exports com.javalearning.collections;
    // exports com.javalearning.advanced;
    // exports com.javalearning.datetime;
    // exports com.javalearning.functional;
    // exports com.javalearning.modules;
    // exports com.javalearning.modern;
    // exports com.javalearning.bestpractices;

    // Open packages for reflection examples in Chapter 19
    // opens com.javalearning.advanced.reflection to ALL-UNNAMED;

    // Open packages for testing
    // Note: These will be uncommented when packages contain actual classes
    // opens com.javalearning to ALL-UNNAMED;
    // opens com.javalearning.basics to ALL-UNNAMED;
    // opens com.javalearning.memory to ALL-UNNAMED;
    // opens com.javalearning.oop to ALL-UNNAMED;
    // opens com.javalearning.collections to ALL-UNNAMED;
    // opens com.javalearning.advanced to ALL-UNNAMED;
    // opens com.javalearning.datetime to ALL-UNNAMED;
    // opens com.javalearning.functional to ALL-UNNAMED;
    // opens com.javalearning.modules to ALL-UNNAMED;
    // opens com.javalearning.modern to ALL-UNNAMED;
    // opens com.javalearning.bestpractices to ALL-UNNAMED;
}