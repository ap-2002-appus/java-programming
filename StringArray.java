import java.util.Scanner;
public class StringArray {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number of rows: ");
				int rows = sc.nextInt();
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter the number of columns:");
				int cols = sc1.nextInt();
				String [][] matrix = new String[rows][cols];
				
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Enter the elements of the matrix:");
				for(int i=0;i<rows;i++) {
					for(int j=0;j<cols;j++) {
						matrix[i][j] = sc2.nextLine();
					}
				}
				for(int i=0;i<rows;i++) {
					for(int j=0;j<cols;j++) {
						System.out.print(matrix[i][j]+"\t");
					}
					System.out.println();
				}
				

			}
}	

		



	
