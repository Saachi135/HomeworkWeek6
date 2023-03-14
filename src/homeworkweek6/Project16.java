package homeworkweek6;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 */
public class Project16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Binary Number: ");
        int abc = sc.nextInt(2);

        System.out.println("Enter Second Binary Number: ");
        int xyz = sc.nextInt(2);
        int sum = abc + xyz;

        System.out.println("Sum of two binary numbers:" + Integer.toBinaryString(sum));
    sc.close();
    }

}
