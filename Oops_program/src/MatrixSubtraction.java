import java.util.Scanner;

public class MatrixSubtraction {

	public static void main(String[] args) {
		// matrix subtraction 
		int row,col;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ther row: ");
		row = s.nextInt();
		
		System.out.println("Enter the col: ");
		col = s.nextInt();
		
		int a[][] = new int[row][col];
		int b[][] = new int[row][col];
		int result[][]=new int[row][col];
		
		System.out.println("Enter the A matrix values : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
				a[i][j]=s.nextInt();	
		}
		System.out.println("Enter the B matrix values : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
				b[i][j]=s.nextInt();
		}
		System.out.println("Mattrix Addition: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				result[i][j]=Math.abs(a[i][j]-b[i][j]);
			System.out.print(result[i][j]+" ");
		}
		System.out.println();
		
		

	}

	


	}

}
