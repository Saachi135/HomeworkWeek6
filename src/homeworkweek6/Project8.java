package homeworkweek6;
import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle
 */

public class Project8 {

    public static void main(String[] args) { // main method
            int a,b,c,per; double area;
            System.out.println("Enter value for sides of Triangle: "); // print statement
            Scanner h = new Scanner(System.in);  // Scanner method
            a = h.nextInt();
            b = h.nextInt();
            c = h.nextInt();
            per = (a+b+c)/2;
            area = Math.sqrt(per *(per-a)*(per-b)*(per-c));
            System.out.println("Area of Triangle " + area); // Triangle formula
            h.close();
        }
    }
