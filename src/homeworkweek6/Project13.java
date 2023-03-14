package homeworkweek6;
/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers
 */

import java.util.Scanner;
public class Project13 {
    public static void main(String[] args) { // main method
        Scanner in = new Scanner(System.in); // input data

        System.out.println("Input First number: ");
        int a = in.nextInt();

        System.out.println("Input Second number: ");
        int b = in.nextInt();

        System.out.println("Input Third number: ");
        int c = in.nextInt();

        System.out.println("Input Four number: ");
        int d = in.nextInt();

        System.out.println("Enter Fifth number: ");
        int e = in.nextInt();

        System.out.println("Average of five number is: "+ a+b+c+d+e/5); // print statement
        in.close();
    }
}
