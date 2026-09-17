package recordprograms;
        import java.util.Scanner;
// Library Management System demonstrating OOP concepts

// Part A & B: Classes, Objects, Constructors, Encapsulation
class Book {
    private int bookId;
    private String bookName;
    private String author;
    private double price;

    // Default Constructor
    public Book() {
        bookId = 0;
        bookName = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    public Book(int id, String name, String auth, double pr) {
        bookId = id;
        bookName = name;
        author = auth;
        price = pr;
    }

    // Getters and Setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int id) {
        bookId = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String name) {
        bookName = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String auth) {
        author = auth;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double pr) {
        price = pr;
    }

    public void displayDetails() {
        System.out.println(bookId + " | " + bookName + " | "
                + author + " | " + price);
    }
}

// Part C: Inheritance
class Person {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    String course;

    @Override
    void display() {
        super.display();
        System.out.println("Course: " + course);
    }
}

class Faculty extends Person {
    String department;

    @Override
    void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}

// Part D: Polymorphism
class AreaCalculator {

    // Circle
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Rectangle
    double area(double length, double breadth) {
        return length * breadth;
    }

    // Triangle
    double area(double base, double height, boolean triangle) {
        return 0.5 * base * height;
    }
}

// Runtime Polymorphism
class Vehicle {
    void display() {
        System.out.println("This is a Vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a Car.");
    }
}

class Bike extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a Bike.");
    }
}

// Part E: Abstraction
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Interface
interface Printable {
    void print();
}

class Report implements Printable {
    @Override
    public void print() {
        System.out.println("Printing Report...");
    }
}

// Main Class
public class LibraryManagementSystem {

    public static void main(String[] args) {

        // Part A & B
        System.out.println("=== Part A & B: Book Details ===");

        Book b1 = new Book();
        Book b2 = new Book(
                101,
                "Java Programming",
                "James Gosling",
                499.99
        );

        b1.displayDetails();
        b2.displayDetails();

        // Part C
        System.out.println("\n=== Part C: Inheritance ===");

        Student s = new Student();
        s.name = "Sufiyy";
        s.age = 18;
        s.course = "Computer Science AI ML";
        s.display();

        System.out.println();

        Faculty f = new Faculty();
        f.name = "Dr. Ram";
        f.age = 40;
        f.department = "Engineering Graphics";
        f.display();

        // Part D
        System.out.println("\n=== Part D: Polymorphism ===");

        AreaCalculator ac = new AreaCalculator();

        System.out.println("Circle Area: " + ac.area(5));
        System.out.println("Rectangle Area: " + ac.area(4, 6));
        System.out.println("Triangle Area: " + ac.area(3, 7, true));

        System.out.println();

        Vehicle v = new Vehicle();
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        v.display();
        car.display();
        bike.display();

        // Part E
        System.out.println("\n=== Part E: Abstraction & Interfaces ===");

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();

        Report report = new Report();
        report.print();
    }
}
