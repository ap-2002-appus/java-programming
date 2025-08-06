class Student{
	String name;
	static int studentcount = 0;
	Student(String name){
		this.name=name;
		studentcount++;
	}	
	 public static int getStudentCount() {
	        return studentcount;
	    }
	 

	
public String getName() {
    return name;
}

	
		
	}
public class Static_student
{
	public static void main(String[] args) {
   
    Student s1 = new Student("jacob");
    Student s2 = new Student("Bobin");
    Student s3 = new Student("kichu");
 
    System.out.println("Total number of students: " + Student.getStudentCount());
}
}



