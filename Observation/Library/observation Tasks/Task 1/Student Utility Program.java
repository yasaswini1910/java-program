import java.util.Scanner;

public class StudentUtilityProgram {

    static void studentDetails(Scanner sc) {
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter marks in 3 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
    }

    static void evenOdd(int n) {
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    static void largest(int a, int b, int c) {
        if (a >= b && a >= c)
            System.out.println("Largest: " + a);
        else if (b >= a && b >= c)
            System.out.println("Largest: " + b);
        else
            System.out.println("Largest: " + c);
    }

    static void grade(double percentage) {
        if (percentage >= 90)
            System.out.println("Grade: A+");
        else if (percentage >= 80)
            System.out.println("Grade: A");
        else if (percentage >= 70)
            System.out.println("Grade: B");
        else if (percentage >= 60)
            System.out.println("Grade: C");
        else if (percentage >= 50)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
    }

    static void day(int n) {
        switch (n) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid Day");
        }
    }

    static void table(int n) {
        for (int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + (n * i));
    }

    static void numbers(int n) {
        for (int i = 1; i <= n; i++)
            System.out.print(i + " ");
        System.out.println();
    }

    static int sum(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++)
            s += i;
        return s;
    }

    static void fibonacci(int n) {
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++)
            fact *= i;

        return fact;
    }

    static boolean prime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    static int maximum(int a, int b) {
        return (a > b) ? a : b;
    }

    static double circleArea(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== STUDENT UTILITY PROGRAM =====");
            System.out.println("1. Student Information");
            System.out.println("2. Even or Odd");
            System.out.println("3. Largest of Three Numbers");
            System.out.println("4. Grade");
            System.out.println("5. Day of Week");
            System.out.println("6. Multiplication Table");
            System.out.println("7. Numbers 1 to N");
            System.out.println("8. Sum of N Natural Numbers");
            System.out.println("9. Fibonacci Series");
            System.out.println("10. Factorial");
            System.out.println("11. Prime Check");
            System.out.println("12. Maximum of Two Numbers");
            System.out.println("13. Area of Circle");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    studentDetails(sc);
                    break;

                case 2:
                    System.out.print("Enter number: ");
                    evenOdd(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter three numbers: ");
                    largest(sc.nextInt(), sc.nextInt(), sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter percentage: ");
                    grade(sc.nextDouble());
                    break;

                case 5:
                    System.out.print("Enter day number: ");
                    day(sc.nextInt());
                    break;

                case 6:
                    System.out.print("Enter number: ");
                    table(sc.nextInt());
                    break;

                case 7:
                    System.out.print("Enter N: ");
                    numbers(sc.nextInt());
                    break;

                case 8:
                    System.out.print("Enter N: ");
                    System.out.println("Sum: " + sum(sc.nextInt()));
                    break;

                case 9:
                    System.out.print("Enter number of terms: ");
                    fibonacci(sc.nextInt());
                    break;

                case 10:
                    System.out.print("Enter number: ");
                    System.out.println("Factorial: " + factorial(sc.nextInt()));
                    break;

                case 11:
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    System.out.println(prime(n) ? "Prime" : "Not Prime");
                    break;

                case 12:
                    System.out.print("Enter two numbers: ");
                    System.out.println("Maximum: " +
                            maximum(sc.nextInt(), sc.nextInt()));
                    break;

                case 13:
                    System.out.print("Enter radius: ");
                    System.out.println("Area: " +
                            circleArea(sc.nextDouble()));
                    break;

                case 0:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 0);

        sc.close();
    }
}