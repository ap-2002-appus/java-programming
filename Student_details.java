package java_lab;
import java.util.Scanner;
public class Student_details {
	String Name;
	int age;
public void studentDetails() {
	System.out.println("Name:"+Name);
	System.out.println("age:"+age);
}
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
		Student_details std=new Student_details();
		System.out.println("Enter name:");
		std.Name=sc.nextLine();
		System.out.println("Enter age:");
		std.age=sc.nextInt();
		std.studentDetails();
}

}
		
		
