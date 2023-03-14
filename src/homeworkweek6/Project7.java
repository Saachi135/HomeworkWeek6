package homeworkweek6;

import java.util.Scanner;

public class Project7 {


    /**
     * Write a program to insert any temperature value in degree Fahrenheit and
     * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);         // Scanner method
        System.out.println("Farenheit to Celsuis");    //int result = scan.nextInt();
        {
            System.out.println("Enter Fahrenheit Value: ");
            double value = scan.nextDouble();
            double valueFinal = (value - 32) * 5 / 9;
            System.out.print("Celsius is: ");          // print statement
            System.out.println(Math.round(valueFinal * 10.0 / 10.0));
        scan.close();
        }
    }
}

