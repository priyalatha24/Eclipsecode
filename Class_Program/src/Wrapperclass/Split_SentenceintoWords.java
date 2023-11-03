package Wrapperclass;

public class Split_SentenceintoWords {

	public static void main(String[] args) {
		// Split sentence into words 
		String text = "java is a worst programming language";
		
		//split string from space 
		String[] result=text.split(" ");
		
		System.out.print("result = ");
		for(String str:result) {
			System.out.print(str +",");
		}

	}

}
