package homeworkweek6;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Project9 {
    public static void main(String[] args) {            // main method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input data: " );     // scanner method
        String txt = scanner.nextLine();

     // System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());          // convert all to lower case now
        scanner.close();
    }
}