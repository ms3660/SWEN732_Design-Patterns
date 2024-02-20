# Visitor Pattern Project: RIT Global Campus Visits

This project is a simple Java application that demonstrates the use of the Visitor Design Pattern in the context of the Rochester Institute of Technology (RIT) and its global campuses.

## Project Overview

The application models different types of people (students, faculty, and visitors) visiting different global campuses of RIT. The Visitor Design Pattern is used to allow the addition of new operations (visits) to objects of different types (campuses) without modifying their individual classes.

## Key Components

The key components of the project are:

- **Visitable Interface (Campus)**: An interface that declares the `accept` operation. This is the entry point which enables an object to be "visited" by the visitor object.

- **Concrete Visitable Classes (ChinaCampus, CroatiaCampus, DubaiCampus)**: These classes implement the Visitable interface and define the `accept` operation. The visitor object is passed to this object using the `accept` operation.

- **Visitor Interface (Visitor)**: An interface that declares the `visit` operations for all the types of visitable classes.

- **Concrete Visitor Classes (Student, Faculty, CampusVisitor)**: For each type of visitor, all the `visit` methods, declared in the abstract visitor, must be implemented. Each Visitor will be responsible for different operations.

- **Driver Class (Main)**: The entry point of the application where the campuses and visitors are created, and the visits are performed.

## Running the Project

To run the project, ensure you have the Java Development Kit (JDK) installed on your computer. Compile the Java code using the `javac` command followed by the name of your Java file. Then, run your program by typing `java Main` in the terminal.

## Conclusion

This project is a simple demonstration of the Visitor Design Pattern. It shows how the pattern can be used to add new operations to existing object structures without modifying the structures, providing a flexible design that is easy to maintain and extend.