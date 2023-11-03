package Arrays;

import java.util.Scanner;

public class TWodimensional_array {

	public static void main(String[] args) {
		// Two dimensionarrat int int row = 3,col=3;
		Scanner s=new Scanner(System.in);
		int row=3,col=3;
		int[][]a = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("2D matrix A: ");
		
		int [][]b = new int[row][col];
		System.out.println("ENter the B matrix: ");
	
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				b[i][j]=s.nextInt();
			}
		}
				System.out.print("2D Matrix B: ");
				for(int i=0;i<row;i++) {
					for(int j=0;j<col;j++) {
						System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
				
				System.out.println("2D Matrix A: ");
				for(int i=0;i<row;i++) {
					for(int j=0;j<col;j++) {
						System.out.print(a[i][j]+" ");
					}
					System.out.println();
				}
	}

}
