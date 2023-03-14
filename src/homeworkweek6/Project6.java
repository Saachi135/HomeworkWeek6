package homeworkweek6;

import java.util.Scanner;
/**
 *  Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */
public class Project6 {
    public static void main(String[] args) {
            double radius,area;
            Scanner input = new Scanner(System.in); // scanner method
            System.out.println("Enter the radius of the circle : "); // print statement
            radius =  input.nextDouble();
            input.close();
            area =  Math.PI * radius * radius;                    // print triangle
            System.out.println("Area of the Circle is: " + area); // print method
        input.close();
        }
    }