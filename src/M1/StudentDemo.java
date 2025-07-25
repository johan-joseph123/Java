package M1;
import java.util.*;
class SampleData{
    String name;
    int age;
    void display(){
        System.err.println("Student Details");
        System.err.println("Enter name"+ name);
        System.err.println("Enter age"+ age);
    }
}
public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	        SampleData student = new SampleData();
	        System.out.print("Enter name: ");
	        student.name = sc.nextLine();
	        System.out.print("Enter age: ");
	        student.age = sc.nextInt();
	        student.display();
            sc.close();
        }
}
