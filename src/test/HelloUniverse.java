package test;

public class HelloUniverse {

	public static void main(String[] args) {
		System.out.println("HelloUniverse");  
		print(null);
		print("HelloWorld not HelloUniverse");

	}
	
	private static void print(Object o){
		if(o==null) System.out.println("input object is null");  
		else System.out.println("input object = " + o.toString());  
	}

}
