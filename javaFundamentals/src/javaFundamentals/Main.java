package javaFundamentals;

public class Main {
	int id =0;
	String name;
public Main(int id,String name) {
		this .id = id;
		this.name=name; 
		System.out.println("id"+id);
		System.out.println("name"+name);
	}
	public Main(int id) {
		this.id =id;
	}

}
