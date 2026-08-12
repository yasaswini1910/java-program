import java.util.Scanner;
public class StudentProgram{
    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    int max(int a, int b) {
        if(a > b)
            return a;
        else
            return b;
    }
    double area(double r) {
        return 3.14 * r * r;
    }
    public static void main(String[] args) {
        StudentProgram s = new StudentProgram();
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\nSTUDENT UTILITY PROGRAM");
            System.out.println("1.Student Information");
            System.out.println("2.Even or Odd");
            System.out.println("3.Largest of Three Numbers");
            System.out.println("4.Display Grade");
            System.out.println("5.Day of the Week");
            System.out.println("6.Multiplication Table");
            System.out.println("7.Numbers from 1 to N");
            System.out.println("8.Sum of First N Natural Numbers");
            System.out.println("9.Fibonacci Series");
            System.out.println("10.Factorial");
            System.out.println("11.Prime Check");
            System.out.println("12.Maximum of Two Numbers");
            System.out.println("13.Area of Circle");
            System.out.println("14.Exit");
            System.out.println("Enter your choice :");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter Student Name: ");
                    String name= sc.nextLine();
                    System.out.println("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    System.out.println("Enter Marks in Subject 1: ");
                    double m1 = sc.nextDouble();
                    System.out.println("Enter Marks in Subject 2: ");
                    double m2 = sc.nextDouble();
                    System.out.println("Enter Marks in Subject 3: ");
                    double m3 = sc.nextDouble();
                    double total = m1 + m2 + m3;
                    double perc = total / 3;
                    System.out.println("\nStudent Details");
                    System.out.println("Name       : " + name);
                    System.out.println("Roll No    : " + roll);
                    System.out.println("Total Marks: " + total);
                    System.out.println("Percentage : " + perc + "%");
                    break;
                case 2:
                    System.out.println("Enter a Number: ");
                    int num = sc.nextInt();
                    if (num % 2 == 0)
                        System.out.println("Even Number");
                    else
                        System.out.println("Odd Number");
                    break;

                case 3:
                    System.out.println("Enter First Number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter Second Number: ");
                    int b = sc.nextInt();
                    System.out.println("Enter Third Number: ");
                    int c = sc.nextInt();
                    int largest = a;
                    if (b > largest)
                        largest = b;
                    if (c > largest)
                        largest = c;
                    System.out.println("Largest Number = " + largest);
                    break;
                case 4:
                    System.out.println("Enter Percentage: ");
                    double per = sc.nextDouble();
                    if (per >= 90)
                        System.out.println("Grade A");
                    else if (per >= 75)
                        System.out.println("Grade B");
                    else if (per >= 60)
                        System.out.println("Grade C");
                    else if (per >= 40)
                        System.out.println("Grade D");
                    else
                        System.out.println("Grade F");
                    break;
                case 5:
                    System.out.println("Enter Day Number (1-7): ");
                    int day = sc.nextInt();
                    switch (day) {
                        case 1:
                            System.out.println("Monday");
                            break;
                        case 2:
                            System.out.println("Tuesday");
                            break;
                        case 3:
                            System.out.println("Wednesday");
                            break;
                        case 4:
                            System.out.println("Thursday");
                            break;
                        case 5:
                            System.out.println("Friday");
                            break;
                        case 6:
                            System.out.println("Saturday");
                            break;
                        case 7:
                            System.out.println("Sunday");
                            break;
                        default:
                            System.out.println("Invalid Day");
                    }
                    break;
                case 6:
                    System.out.println("Enter Number: ");
                    int numb = sc.nextInt();
                    System.out.println("Multiplication Table:");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numb + " x " + i + " = " + (numb * i));
                    }
                    break;
                case 7:
                    System.out.println("Enter N: ");
                    int n = sc.nextInt();
                    for (int i = 1; i <= n; i++) {
                        System.out.println(i + " ");
                    }
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Enter N: ");
                    int numN = sc.nextInt();
                    int sum = 0;
                    for (int i = 1; i <= numN; i++) {
                        sum += i;
                    }
                    System.out.println("Sum = " + sum);
                    break;

                case 9:
                    System.out.println("Enter Number of Terms: ");
                    int terms = sc.nextInt();
                    int first = 0, second = 1;
                    System.out.println("Fibonacci Series:");
                    for (int i = 1; i <= terms; i++) {
                        System.out.println(first);
                        int next = first + second;
                        first = second;
                        second = next;
                    }
                    System.out.println();
                    break;
                case 10:
                    System.out.println("Enter Number: ");
                    int fact = sc.nextInt();
                    System.out.println("Factorial = " + s.factorial(fact));
                    break;
                case 11:
                    System.out.println("Enter Number: ");
                    int prime = sc.nextInt();
                    if (s.isPrime(prime))
                        System.out.println("Prime Number");
                    else
                        System.out.println("Not a Prime Number");
                    break;
                case 12:
                    System.out.println("Enter First Number: ");
                    int x = sc.nextInt();
                    System.out.print("Enter Second Number: ");
                    int y = sc.nextInt();
                    System.out.println("Maximum = " + s.max(x, y));
                    break;

                case 13:
                    System.out.println("Enter Radius: ");
                    double radius = sc.nextDouble();

                    System.out.println("Area = "+ s.area(radius));
                    break;

                case 14:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (ch != 14);
        sc.close();
    }
}