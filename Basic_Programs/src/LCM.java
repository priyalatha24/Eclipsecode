
public class LCM {

	public static void main(String[] args) {
		//find LCM btw n1 and n2 
				int n1 = 72 , n2=120;
				
				//initially set to gcd 
				int gcd =1;
				for(int i=1;i<=n1&&i<=n2;i++) {
					
					//check if i perfectly divides both n1 and n2 
					if (n1% i==0&&n2%i==0)
						gcd=i;
					
				}
				int lcm=(n1*n2)/gcd;
				System.out.printf("The Lcm of %d and %d is %d.",n1,n2,lcm);

	}

}
