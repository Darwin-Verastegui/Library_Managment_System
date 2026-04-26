# Library Management System

A console-based library management system built with Java, 
designed to grow in complexity as new concepts are learned.

## Tech Stack
- Java 17
- Maven

## Current Features
- Book model with encapsulation (getters/setters)
- Basic library service with ArrayList

## Project Structure
src/
└── main/java/com/verastegui/library/
├── models/
│   └── Book.java
├── services/
│   └── LibraryService.java
└── Main.java

## How to Run
```bash
javac -d target/classes src/main/java/com/verastegui/library/models/Book.java \
      src/main/java/com/verastegui/library/Main.java

java -cp target/classes com.verastegui.library.Main
```

## Roadmap
- [x] Book model with OOP principles
- [ ] Inheritance with DigitalBook and PhysicalBook
- [ ] Loanable interface
- [ ] Custom exceptions
- [ ] JDBC persistence with MySQL
- [ ] REST API with Spring Boot