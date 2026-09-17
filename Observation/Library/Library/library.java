class Book {
    int bookId;
    String bookName;
    String author;
    double price;

    Book() {
        bookId = 1;
        bookName = "Java Programs";
        author = "Oracle";
        price = 189.99;
    }

    Book(int bookId, String bookName, String author, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

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

    public void displayBook() {
        System.out.println("Book ID   : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author    : " + author);
        System.out.println("Price     : " + price);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int roll;

    public Student(String name, int age, int roll) {
        super(name, age);
        this.roll = roll;
    }

    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Roll No      : " + roll);
    }
}

class Faculty extends Person {
    String sub;

    Faculty(String name, int age, String sub) {
        super(name, age);
        this.sub = sub;
    }

    void display() {
        System.out.println("Faculty Name : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Subject      : " + sub);
    }
}

class Area {
    double area(double radius) {
        return 3.14 * radius * radius;
    }

    int area(int length, int breadth) {
        return length * breadth;
    }

    double area(double base, double height) {
        return 0.5 * base * height;
    }
}

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

interface Printable {
    void print();
}

class Report implements Printable {
    @Override
    public void print() {
        System.out.println("Printing Library Report");
    }
}

public class Library {
    public static void main(String[] args) {
        System.out.println("Book Class");
        Book b1 = new Book();
        Book b2 = new Book(101, "Java Programming", "James Gosling", 650.50);
        b1.displayBook();
        System.out.println();
        b2.displayBook();
        System.out.println("\nInheritance");
        Student s = new Student("Rahul", 20, 101);
        Faculty f = new Faculty("Dr. Sharma", 45, "Computer Science");
        s.display();
        System.out.println();
        f.display();
        System.out.println("\nMethod Overloading");
        Area a = new Area();
        System.out.println("Circle Area = " +
                a.area(7.0));
        System.out.println("Rectangle Area = " +
                a.area(10, 5));
        System.out.println("Triangle Area = " +
                a.area(12.0, 6.0));
        System.out.println("\nMethod Overriding");
        Car v = new Car();
        v.display();
        Bike b = new Bike();
        b.display();
        System.out.println("\nAbstraction");
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.draw();
        r.draw();
        System.out.println("\nInterface");
        Report p = new Report();
        p.print();
    }
}