package homeworkweek6;

/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */


public class Project3 {

    int x = 40; // 3.1 instance variable
    static int y = 50; // 3.1 static variable

    public static void main(String[] args) { //declare main method
        Project3 obj = new Project3();
        obj.myName();// 3.6 calling both method
        myAddress();

    }

        // 3.2 instance method
        public void myName(){
        Project3 xyz = new Project3();
        System.out.println(xyz.x);
        }
        // 3.3 static method
        public static void myAddress(){
        Project3 abc = new Project3();
            System.out.println(abc.y);

        }
}
