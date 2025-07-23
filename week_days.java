package java_lab;
import java.util.Scanner;

public class week_days {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day number:");
		int days = sc.nextInt();
		switch(days) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;	
		case 4:
			System.out.println("Wednesday");
			break;	
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;	
		case 7:
			System.out.println("Saturday");
			break;	
		default:
			System.out.println("invalid entry");
			break;	
		}
	}
}
