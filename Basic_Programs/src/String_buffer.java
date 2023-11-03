
public class String_buffer {

	public static void main(String[] args) {
		//String buffer methods 
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer("20");
		StringBuffer s3=new StringBuffer("welcome");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		s1.append("sdjkneoijfknfe oijfkw f 9ufwnfwpifuh");
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		s1.setLength(5);
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		
		System.out.println(s1);
		System.out.println(s1.reverse());
		
		
		

	}

}
