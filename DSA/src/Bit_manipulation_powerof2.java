
public class Bit_manipulation_powerof2 {
	static public boolean isPowerOfTwo(int x) {
		//first x in below expression is for the case when 
		return(x!=0)&& ((x&(x-1))==0);
	}

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(261));
		

	}

}
