import java.util.Scanner;
public class Arraycopy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the number of columns:");
		int cols = sc1.nextInt();
		int [][] matrix = new int[rows][cols];
		int [][] copy = new int[rows][cols];
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the elements of the matrix:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix[i][j] = sc2.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				copy [i][j] = matrix[i][j];
			}
		}
		System.out.println("Copy of the matrix is:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(copy[i][j]+"\t");
			}
			System.out.println();
		}

	}

}

