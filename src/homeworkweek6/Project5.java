package homeworkweek6;

import java.util.Scanner;

/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Project5 {

    public static void main(String[] args) {  // main method
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type first number: "); // input statement
        int a = scanner.nextInt();
        System.out.println("Type Second number: ");// input statement
        int b = scanner.nextInt();
        System.out.println("Type Third number: "); // input statement
        int x = scanner.nextInt();
        System.out.println("Type Forth number: "); // input statement
        int y = scanner.nextInt();

        car();                                  // static method calling
        van();                                  // static method calling
        Project5 obj = new Project5();          // instance method calling
        obj.hot();
        obj.cold();
        int add = a + b + x + y;
        System.out.println("Addition answer is: " + add);   //  addition
        int sub = a - b;
        System.out.println("Subtraction answer is: " + sub); // subtraction
        int div = a / b;
        System.out.println("Division answer is: " + div);   // division
        int mult = a * b;
        System.out.println("Multiplication answer is: " + mult); // multiplication

        scanner.close();
        }
        public static void car() {      // static method
        int a;
        }
        public static void van(){      // static method
            int b;
        }
        public void hot(){      // instance method
            int x;
        }
        public void cold(){     // instance method
            int y;
        }

    }