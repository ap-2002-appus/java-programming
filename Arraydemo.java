import java.util.Scanner;

public class Arraydemo {
	public static void main(String[]args)
	{
		
		int [] array =new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements");
		for(int i=0;i<10;i++) {
			array[i]=sc.nextInt();
		}
		for(int num:array) {
			System.out.print(num+"\t");;
			
		}
	}

}
