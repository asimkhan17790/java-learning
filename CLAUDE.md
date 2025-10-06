# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a comprehensive Java learning repository called "Java Complete Guide" - a Maven-based project that covers Java programming from beginner to advanced levels. The project is structured as a complete educational resource with 33+ chapters covering all aspects of Java development.

**Project Details:**
- **Group ID**: com.javalearning
- **Artifact ID**: java-complete-guide
- **Version**: 1.0-SNAPSHOT
- **Java Version**: 17+ (with support for Java 21+ features)
- **Build Tool**: Maven 3.6+
- **Module System**: Uses Java Platform Module System (JPMS)

## Environment Setup

- **Java Version**: OpenJDK 24.0.2 (Temurin) - supports Java 17+ features
- **Java Compiler**: javac 24.0.2
- **Build Tool**: Maven (configured in pom.xml)
- **Module System**: JPMS enabled with module-info.java

## Build and Development Commands

### Maven Commands
```bash
# Compile the project
mvn compile

# Run tests
mvn test

# Package into JAR
mvn package

# Clean build artifacts
mvn clean

# Run specific test class
mvn test -Dtest=ExampleTest

# Run with Java 21+ profile
mvn compile -P java21

# Generate site documentation
mvn site

# View dependency tree
mvn dependency:tree

# Install to local repository
mvn install
```

### Running the Application
```bash
# Run main application (shows help menu)
mvn exec:java -Dexec.mainClass="com.javalearning.Main"

# Run specific module examples
mvn exec:java -Dexec.mainClass="com.javalearning.Main" -Dexec.args="basics"
mvn exec:java -Dexec.mainClass="com.javalearning.Main" -Dexec.args="oop"
mvn exec:java -Dexec.mainClass="com.javalearning.Main" -Dexec.args="functional"
mvn exec:java -Dexec.mainClass="com.javalearning.Main" -Dexec.args="memory"
mvn exec:java -Dexec.mainClass="com.javalearning.Main" -Dexec.args="collections"
mvn exec:java -Dexec.mainClass="com.javalearning.Main" -Dexec.args="advanced"
mvn exec:java -Dexec.mainClass="com.javalearning.Main" -Dexec.args="datetime"
mvn exec:java -Dexec.mainClass="com.javalearning.Main" -Dexec.args="modules"
mvn exec:java -Dexec.mainClass="com.javalearning.Main" -Dexec.args="modern"
mvn exec:java -Dexec.mainClass="com.javalearning.Main" -Dexec.args="best-practices"

# Run all examples
mvn exec:java -Dexec.mainClass="com.javalearning.Main" -Dexec.args="all"
```

### Development Workflow
```bash
# Full build and test cycle
mvn clean compile test

# Quick compile and run
mvn compile && mvn exec:java -Dexec.mainClass="com.javalearning.Main" -Dexec.args="basics"

# Package for distribution
mvn clean package
```

## Project Structure

```
java-complete-guide/
├── pom.xml                           # Maven configuration
├── README.md                         # Comprehensive learning guide
├── CLAUDE.md                         # This file
├── module-info.java                  # Module descriptor for JPMS
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── javalearning/
│   │   │           ├── Main.java              # Application entry point
│   │   │           ├── basics/                # Chapters 1-5: Fundamentals
│   │   │           ├── memory/                # Chapter 6: Object Lifecycle
│   │   │           ├── oop/                   # Chapters 7-11: OOP
│   │   │           ├── collections/           # Chapters 12-14: Collections
│   │   │           ├── advanced/              # Chapters 15-19: Advanced
│   │   │           ├── datetime/              # Chapters 20-21: Date & Time
│   │   │           ├── functional/            # Chapters 22-24: Functional
│   │   │           ├── modules/               # Chapter 25: Java Modules
│   │   │           ├── modern/                # Chapters 26-29: Modern Features
│   │   │           └── bestpractices/         # Chapter 30+: Best Practices
│   │   └── resources/
│   └── test/
│       └── java/
│           └── com/
│               └── javalearning/
│                   └── examples/              # Test examples
```

## Learning Modules Overview

1. **basics/** - Java Fundamentals (Chapters 1-5)
   - Introduction, syntax, data types, control flow, arrays, methods

2. **memory/** - Memory Management (Chapter 6)
   - Object lifecycle, garbage collection, reference types, memory optimization

3. **oop/** - Object-Oriented Programming (Chapters 7-11)
   - Classes, encapsulation, inheritance, polymorphism, abstraction

4. **collections/** - Collections Framework (Chapters 12-14)
   - Strings, collections hierarchy, generics

5. **advanced/** - Advanced Concepts (Chapters 15-19)
   - Exceptions, I/O, multithreading, concurrency, reflection

6. **datetime/** - Date & Time APIs (Chapters 20-21)
   - Legacy date/time issues, modern java.time API

7. **functional/** - Functional Programming (Chapters 22-24)
   - Lambda expressions, Stream API, Optional

8. **modules/** - Java Platform Module System (Chapter 25)
   - JPMS, module descriptors, modular applications

9. **modern/** - Modern Java Features (Chapters 26-29)
   - Records, sealed classes, pattern matching, latest features

10. **bestpractices/** - Professional Development (Chapter 30+)
    - Design patterns, SOLID principles, clean code

## Dependencies and Tools

### Key Dependencies
- **JUnit 5**: Testing framework
- **AssertJ**: Fluent assertions for tests
- **Mockito**: Mocking framework
- **Jackson**: JSON processing for examples
- **SLF4J + Logback**: Logging

### Maven Profiles
- **Default**: Java 17+ features
- **java21**: Enables Java 21+ specific features
- **dev**: Development profile
- **prod**: Production profile

## Development Guidelines

### When Adding New Examples
1. Follow the existing package structure
2. Add examples to appropriate module directory
3. Update the Main.java to include new examples
4. Write corresponding tests in test directory
5. Update README.md with new example references

### Code Standards
- Use Java 17+ features appropriately
- Follow standard Java naming conventions
- Include comprehensive JavaDoc comments
- Provide practical, real-world examples
- Include both basic and advanced examples for each concept

### Testing
- Run `mvn test` before committing changes
- Ensure all examples compile and run correctly
- Test with different Java versions if using version-specific features

## Module System (JPMS)

This project uses the Java Platform Module System. The module descriptor is in `src/main/java/module-info.java`:

- **Module Name**: `java.complete.guide`
- **Exports**: All learning packages are exported
- **Requires**: Standard Java modules plus dependencies
- **Opens**: Packages opened for reflection and testing

## Notes for Contributors

- This is a comprehensive educational resource covering Java from basics to advanced
- Each chapter should include multiple practical examples
- Focus on real-world scenarios and best practices
- Maintain backward compatibility with Java 17+
- Examples should be runnable and well-documented
- Follow the established learning progression from beginner to advanced