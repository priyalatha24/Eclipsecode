package Recursion;

public class Fibonnaciseries {

	public static void main(String[] args) {
		for(long i = 1;i<=9;i++) {
			System.out.print(fibonacci(i)+" ");
		}
		System.out.println();
	}
		/*A recursive fibnocci sequesnce in jva program */
		public static  long fibonacci(long number) {
			if(number == 1||number == 2) {
				return 1;
			}
			return fibonacci (number - 1)+fibonacci(number-2);

	}

}
