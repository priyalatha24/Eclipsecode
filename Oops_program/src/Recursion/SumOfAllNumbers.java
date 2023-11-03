package Recursion;

public class SumOfAllNumbers {

	public static void main(String[] args) {
		long SumOfAllNumbers = SumOfAllNumbers(9);
		System.out.println(SumOfAllNumbers);

	}
	/*A recursive java example to sum all natural number 
	 * up to given long. 
	 */

	private static long SumOfAllNumbers(long number) {
		// stops the recursice java prog at zero 
		if (number != 0) { //9+8+7+6+5+4+3+2+1+
		return number + SumOfAllNumbers(number-1); // 9+8+SumOfAllNumbers(7)
	}else {
		return number;
	}

}
}
