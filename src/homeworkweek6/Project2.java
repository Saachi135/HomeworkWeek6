package homeworkweek6;

/**
 * 2. Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class Project2 {
    //Declare two static variables
    static int a = 10;
    static int b = 20;

    //2.4 Declare the Main method.
    public static void main(String[] args) {

        abc(); // 2.5 Call the static method into the Main method and Run the programme
    }
//2.2 Declare one static method
    public static void abc (){
        System.out.println(Project2.a); //2.3 Call both static variables into the static method inside the print statement
        System.out.println(Project2.b);
    }
}
