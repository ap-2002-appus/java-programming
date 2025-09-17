package music_player.java;

public class Exceptiondemo {

	public static void main(String[] args) {
		//index out of bounds exception
		String college = "SJCET";
		System.out.println(college.charAt(10));
		
		
		int[] array = {1,2,3,4,5};
		System.out.println(array[6]);
		
		
		//number format exception
		String s2 ="abc";
		System.out.println(Integer.parseInt(s2));
		//null pointer exception
		String s1=null;
		System.out.println(s1.length());
		// Arithmetic expression
		System.out.println(10/0);
		System.out.println("After Exception");

	}

}
