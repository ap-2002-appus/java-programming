class Student{
	int rollNumber;
	String name;
	int m1,m2,m3;
	float avg;
	
	Student(int rollNumber, String name,int m1,int m2,int m3){
	   this.rollNumber = rollNumber;
	   this.name = name;
	   this.m1 = m1;
	   this.m2 = m2;
	   this.m3 = m3;
	}
	public void calculateAverage() {
		avg = (m1+m2+m3)/3;
	}
	public void displayDetails() {
		System.out.println("Roll number:" + rollNumber);
		System.out.println("Name:" + name);
		System.out.println("Mark1:" + m1);
		System.out.println("Mark2:" + m2);
		System.out.println("Mark3:" + m3);
		System.out.println("Average marks:" + avg);
		
	}
	   
}
public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student(1,"jacob",56,45,79);
		s1.calculateAverage();
		s1.displayDetails();
		
		Student s2 = new Student(2,"sebin",50,85,99);
		s2.calculateAverage();
		s2.displayDetails();
	
	  

	}

}
