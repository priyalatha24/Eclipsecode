import java.util.Scanner;

class EncapsBank{
	private String Ac_Num;
	private float Balance;
	
	public String getAc_Num(){
		return Ac_Num;
	}
	public float getBalance(){
		return Balance;
	}
	//setter
	public void setAc_Num(String newValue) {
		Ac_Num = newValue;
	}
	public void setBalance(float newValue) {
		Balance = newValue;
	}
}
public class EncapsPrmbl_Bank {

	public static void main(String[] args) {
		EncapsBank obj = new EncapsBank();
		Scanner s=new Scanner(System.in);
		String Ac_Num =s.next();
		float Balance =s.nextFloat();
		
		obj.setAc_Num(Ac_Num);
		obj.setBalance(Balance);
		
		System.out.println("AccNum: "+obj.getAc_Num());
		System.out.println("BAlance: "+obj.getBalance());
	

	}

}