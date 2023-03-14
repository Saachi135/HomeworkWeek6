package homeworkweek6;

public class Project4 {
    /**
     * Write a Java programme using the following steps.
     * 4.1 Declare two instance and two static variables.
     * 4.2 Declare one instance method.
     * 4.3 Declare one static method.
     * 4.4 Call all four instance and static variables into both instance and static methods inside the
     * print statement.
     * 4.5 Declare the Main method.
     * 4.6 Call both instance and static methods into the Main method and run the programme.
     */

// 4.1 Two instance and two static variables
    int a = 9;
    int b = 34;
    static int x = 7;
    static int y = 40;

    public static void main(String[] args) { // 4.5 Declared Main method
        abc();                               // 4.6 Both instance and static methods into main method
        Project4 obj = new Project4();
        obj.xyz();

    }
// 4.3 static variable
    public static void abc() {
        Project4 abc = new Project4();  // 4.4 call all four variables
        System.out.println(abc.a);
        System.out.println(abc.b);
        System.out.println(Project4.x);
        System.out.println(Project4.y);
    }

// 4.2 instance variable
    public void xyz(){
        Project4 xyz = new Project4();  // 4.4 call all four variables
        System.out.println(xyz.a);
        System.out.println(xyz.b);
        System.out.println(Project4.x);
        System.out.println(Project4.y);
        }
}








