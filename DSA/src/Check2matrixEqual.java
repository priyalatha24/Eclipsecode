import java.util.Scanner;

public class Check2matrixEqual {

	public static void main(String[] args) {
		// check 2 matrix are equal 
		int row1,col1,row2,col2,count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ther row: ");
		row1 = s.nextInt();
		
		System.out.println("Enter the col: ");
		col1 = s.nextInt();
		System.out.println("Enter ther row2: ");
		row2 = s.nextInt();
		
		System.out.println("Enter the col2: ");
		col2 = s.nextInt();
		
		if(row1==row2 && col1==col2) {
		int a[][] = new int[row1][col1];
		int b[][]=new int[row2][col2];
		System.out.println("Enter the  A matrix elements: ");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++)
				a[i][j]=s.nextInt();
		}
		System.out.println("Enter the B matrix elements: ");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++)
				b[i][j]=s.nextInt();
			count++;
			break;
		}
			
		}

	
if(count==0){
	System.out.println("Both matrix are same");
	}
else{
	System.out.print("Bothe matrix are not same");
}
	System.out.println("rows and columns are not same.");

}}
