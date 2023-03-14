package homeworkweek6;

/**
 * 1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Project1 {
    //1.1 Declare two instance variables
    int a = 10;
    int b = 20;

    //1.4 Declare the Main method
    public static void main(String[] args) {
        Project1 obj = new Project1();
        //1.5 Calling instance method into the Main method
        obj.myMethod();
    }

    // 1.2 Declare one instance method
    public void myMethod() {
        Project1 gp = new Project1();
        System.out.println(gp.a);    // 1.3 Call both instance variables into the instance method inside the print statemen
        System.out.println(gp.b);

        }

    }
