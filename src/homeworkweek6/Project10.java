package homeworkweek6;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 */
public class Project10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int sum = scanner.nextInt();  //
        multi(sum);
        scanner.close();
    }
    public static void multi(int sum) {
        System.out.println(sum + "x 1 = " + (sum * 1));
        System.out.println(sum + "x 2 = " + (sum * 2));
        System.out.println(sum + "x 3 = " + (sum * 3));
        System.out.println(sum + "x 4 = " + (sum * 4));
        System.out.println(sum + "x 5 = " + (sum * 5));
        System.out.println(sum + "x 6 = " + (sum * 6));
        System.out.println(sum + "x 7 = " + (sum * 7));
        System.out.println(sum + "x 8 = " + (sum * 8));
        System.out.println(sum + "x 9 = " + (sum * 9));
        System.out.println(sum + "x 10 = " + (sum * 10));


    }
}
