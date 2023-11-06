import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		// transpose matrix 
		int row,col,trace = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ther row: ");
		row = s.nextInt();
		
		System.out.println("Enter the col: ");
		col = s.nextInt();
		
		int a[][] = new int[row][col];
		System.out.println("Enter the matrix elements: ");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
				a[i][j]=s.nextInt();
		}
		System.out.println("transpose of a  matrix  : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
				System.out.print(a[j][i]+" ");
			System.out.println();
			
		}

	}

}
