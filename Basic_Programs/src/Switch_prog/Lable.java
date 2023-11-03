package Switch_prog;

public class Lable {

	public static void main(String[] args) {
		// Labelledtsmt
		int[] numbers = {10,20,30,40,50};
		
		star:for(int x : numbers) {
			if(x==30) {
				continue star;
			}
			System.out.print(x);
			System.out.print("\n");
		}

	}

}
