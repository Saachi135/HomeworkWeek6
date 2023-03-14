package homeworkweek6;

import java.util.Scanner;

/**
 * . Write a Java program to convert a decimal number to binary number.
 * Input Data:
 *  Input a Decimal Number : 5
 */
public class Project17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner method
        System.out.println("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary number is; " + binary);
    sc.close();
    }
}
