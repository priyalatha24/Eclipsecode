package Switch_prog;

public class Unlabelledstmt {

	public static void main(String[] args) {
		// Unlable statemnt 
		int[] numbers = {10,20,30,40,50};
		
		for(int x :numbers) {
			if(x==30) {
				continue;
			}
		System.out.print(x);
		System.out.print("\n");
		}

	}

}

