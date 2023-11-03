
public class GCDofTwoNumbers {

	public static void main(String[] args) {
		// GCD of two nmbers 
		//find ZGCD btw n1 and n2 
		int n1 = 20 , n2=77;
		
		//initially set to gcd 
		int gcd =1;
		for(int i=1;i<=n1&&i<=n2;i++) {
			
			//check if i perfectly divides both n1 and n2 
			if (n1% i==0&&n2%i==0)
				gcd=i;
			
		}
		System.out.println("GCD of "+n1+" and "+n2+" is "+gcd);

	}

}
