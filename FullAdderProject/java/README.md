# Java Full Adder

## Overview
This Java-based implementation builds a 1-bit full adder with an emphasis on object-oriented design. It features:
- **Reusable Components**: Wires, gates, and circuits.
- **Event-Driven Simulation**
- **Comprehensive Unit Testing and Benchmarking**

## Directory Structure
The project is organized as follows:
```
java/
├── src/
│   ├── core/    # Core simulation and wiring logic.
│   ├── gates/   # AND, OR, and XOR gate implementations.
│   ├── test/    # Unit tests and benchmarks.
│   └── Main.java
├── build.gradle  # Gradle build configuration.
└── README.md     # Project documentation.
```

## Prerequisites
- **Java 8+**
- **Gradle**

## Build & Run Instructions
Navigate to the `java/` directory and execute the following commands:

### Build the Project
```bash
./gradlew build
```

### Run the Simulation
```bash
./gradlew run
```

### Execute Unit Tests
```bash
./gradlew test
```

## Example Output
For an input of `A=1, B=1, Cin=0`, the expected output is:
```
Sum: 0
Cout: 1
```

---

## Extensions & Enhancements

### Extensions
- **Database Integration**: Log full adder inputs/outputs to a Neo4j graph database.
- **Web Interface**: Develop a Spring MVC controller with a user interface to input data and dynamically display outputs.
- **Serializations**: Incorporate serialization libraries to enable state saving and loading.

### Project Structure and Configuration
1. **Java Project (Gradle Setup)**
   - `build.gradle` is configured with dependencies for JUnit 5, Mockito, Neo4j Driver, Hibernate, Spring JDBC, serialization libraries (Kryo, SnakeYaml, XStream), Spring MVC, and Logback.
   - `settings.gradle` is used for project naming.
2. **Documentation**
   - **C**: Detailed `README.md` for compilation and usage instructions.
   - **Mojo**: Specific `README.md` for simulation details and potential extensions.
   - **Java**: This comprehensive documentation covers build instructions, project structure, and available extensions.

---

## Suggested Enhancements

### General Enhancements
1. **Unified Performance Benchmark**
   - Develop a cross-language benchmark suite for Java, C, and Mojo implementations.
2. **Robust Testing Frameworks**
   - **Java**: Expand JUnit tests to include database logging and serialization.
   - **C**: Utilize a testing framework like `cmocka`.
   - **Mojo**: Create test cases to validate each gate and full adder using comprehensive truth tables.

### Java Specific Extensions
1. **Database Integration**
   - Log all adder inputs/outputs to a Neo4j graph database for visualization and analysis.
2. **Web Interface**
   - Build a Spring application that provides an interactive interface for full adder operations.

---

## Final Steps for Deployment

1. **Reload and Validate**
   - Ensure the front-end dynamically updates results without page reloads.
   - Verify that the `.jar` file runs correctly in both local and production environments.
   - Confirm that the Neo4j database is initialized and its schema is enforced.
2. **Deployment**
   - Package the application as a `.jar` or `.war` file.
   - Deploy on platforms such as AWS, Heroku, or a local server.
3. **Monitoring**
   - Integrate tools like Spring Actuator for effective application monitoring.

---

## Additional Enhancements

1. **Neo4j Integration**
   - Implement `Neo4jLogger.java` for logging and clearing full adder inputs/outputs in a Neo4j database.
2. **Spring MVC Web Application**
   - Add `FullAdderController.java` to handle APIs:
     - `/api/add` for evaluating the full adder.
     - `/api/clearLog` for clearing database logs.
3. **Thymeleaf Front-End**
   - Develop `index.html` to provide a user-friendly interface for inputting values and evaluating the full adder interactively.
4. **Unit Tests**
   - `Neo4jIntegrationTest.java`: Tests for Neo4j logging and cleanup.
   - `FullAdderControllerTest.java`: Tests for the Spring endpoints.

### Extending the Thymeleaf Front-End
To enhance interactivity without page reloads:
- Utilize AJAX with Thymeleaf to dynamically display computed `Sum` and `Cout`.
- Update `index.html` with JavaScript for AJAX-based form submission.
- Modify the Spring controller to return JSON responses from `/api/add`.

---

## C and Mojo Extensions

**C Extensions**
- **Multi-bit Adder**: Implement chaining for multi-bit addition with configurable bit-length.

**Mojo Extensions**
- **SIMD Optimization**: Leverage Mojo’s batch processing capabilities for efficient input handling.

If you require further enhancements or additional assistance, please let me know!