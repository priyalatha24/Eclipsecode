
public class Continue {

	public static void main(String[] args) {
		// continue 
		for(int i=1; i<=10;i++) {
			if(i==6) // if(i==6 || i = 8) = i=6,i=8
				continue; //only 6 does n't print 
			else
			System.out.println("i= "+i);
		}
		System.out.println("completed ");

	}

}
