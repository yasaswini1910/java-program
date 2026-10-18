class Book {

    private int bookId;
    private String bookName;
    private String author;
    private double price;

    // Default constructor
    Book() {
        bookId = 0;
        bookName = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(int bookId, String bookName, String author, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}


// Inheritance

class Person {

    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {

    int rollNo;

    Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    void displayStudent() {
        displayPerson();
        System.out.println("Roll Number: " + rollNo);
    }
}

class Faculty extends Person {

    String department;

    Faculty(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayFaculty() {
        displayPerson();
        System.out.println("Department: " + department);
    }
}


// Method Overloading

class Area {

    int calculateArea(int side) {
        return side * side;
    }

    int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}


// Method Overriding

class Vehicle {

    void display() {
        System.out.println("Vehicle");
    }
}

class Car extends Vehicle {

    @Override
    void display() {
        System.out.println("Car");
    }
}

class Bike extends Vehicle {

    @Override
    void display() {
        System.out.println("Bike");
    }
}


// Abstraction

abstract class Shape {

    abstract void draw();
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}


// Interface

interface Printable {

    void print();
}

class Report implements Printable {

    @Override
    public void print() {
        System.out.println("Printing Report");
    }
}


// Main Class

public class LibraryManagementSystem {

    public static void main(String[] args) {

        // Classes and Objects
        Book b1 = new Book();
        Book b2 = new Book(
                101,
                "Java Programming",
                "James Gosling",
                500.0
        );

        System.out.println("===== BOOK DETAILS =====");

        b1.display();

        System.out.println();

        b2.display();

        // Encapsulation
        b2.setPrice(550.0);

        System.out.println("\nUpdated Price: " + b2.getPrice());


        // Inheritance
        System.out.println("\n===== STUDENT =====");

        Student s = new Student("Ravi", 20, 101);
        s.displayStudent();

        System.out.println("\n===== FACULTY =====");

        Faculty f = new Faculty(
                "Kumar",
                45,
                "Computer Science"
        );

        f.displayFaculty();


        // Method Overloading
        System.out.println("\n===== METHOD OVERLOADING =====");

        Area a = new Area();

        System.out.println("Square Area: " +
                a.calculateArea(5));

        System.out.println("Rectangle Area: " +
                a.calculateArea(5, 10));

        System.out.println("Circle Area: " +
                a.calculateArea(5.0));


        // Method Overriding
        System.out.println("\n===== METHOD OVERRIDING =====");

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.display();
        v2.display();


        // Abstraction
        System.out.println("\n===== ABSTRACTION =====");

        Shape c = new Circle();
        Shape r = new Rectangle();

        c.draw();
        r.draw();


        // Interface
        System.out.println("\n===== INTERFACE =====");

        Printable report = new Report();
        report.print();
    }
}