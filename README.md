# java-learning
Java Learning

A Maven-based Java project for learning and practicing Java concepts.

## Project Structure

This is a standard Maven project with the following structure:

```
java-learning/
├── pom.xml                          # Maven project configuration
├── src/
│   ├── main/
│   │   ├── java/                    # Java source files
│   │   │   └── com/learning/
│   │   └── resources/               # Application resources
│   └── test/
│       ├── java/                    # Test source files
│       │   └── com/learning/
│       └── resources/               # Test resources
└── README.md
```

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

## Building the Project

To compile the project, run:

```bash
mvn clean compile
```

## Running Tests

To run the unit tests:

```bash
mvn test
```

## Running the Application

To run the main application:

```bash
mvn exec:java -Dexec.mainClass="com.learning.HelloWorld"
```

Or after building:

```bash
java -cp target/classes com.learning.HelloWorld
```

## Packaging

To create a JAR file:

```bash
mvn clean package
```

The JAR file will be created in the `target/` directory.

## Adding New Java Concepts

As you learn new Java concepts, you can add them to the project:

1. Create new Java classes in `src/main/java/com/learning/`
2. Create corresponding test classes in `src/test/java/com/learning/`
3. Run tests to verify your implementation
4. Use Maven commands to build and test your code

## Maven Commands Reference

- `mvn clean` - Clean the project (remove target directory)
- `mvn compile` - Compile the source code
- `mvn test` - Run the tests
- `mvn package` - Create a JAR file
- `mvn install` - Install the package in local repository
- `mvn clean install` - Clean, compile, test, and install

