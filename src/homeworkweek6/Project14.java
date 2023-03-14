package homeworkweek6;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data    Width = 5.5 Height = 8.5
 */
public class Project14 {
    public static void main(String[] args) {   // print statement
        double abc = 5.6;
        double xyz = 8.5;
        double data = abc * xyz;
        double data1 = abc + xyz;
        System.out.println("Area is 5.6 * 8.5 = " );
        System.out.println(Math.round(data * 10.0 / 10.0));
        System.out.println("Perimeter is: ");
        System.out.println(2 * (data1));
    }
}
