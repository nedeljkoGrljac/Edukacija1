package test;

import java.math.BigDecimal;
import java.util.Date;

import util.StringUtil;;

public class HelloUniverse {

	public static void main(String[] args) {
		BigDecimal bD = null;
		Date dt = null;
		System.out.println("1");  
		print("");
		System.out.println("2");  
		print(bD);
		//print("HelloWorld not HelloUniverse");
		System.out.println("3");  
		print(dt);
		bD = BigDecimal.ZERO;
		System.out.println("4");  
		print(bD);
		dt = java.sql.Date.valueOf("1981-10-03");
		System.out.println("5");  
		print(dt);

	}
	
	private static void print(Object o){
		if(o!=null){ 
			
			Class cls = o.getClass();
	    System.out.println("The type of the object is: " + cls.getName());	
		}else System.out.println("The type of the object is null ");
		StringUtil stringHandler = new StringUtil();
		if(o instanceof String) {     
			if(stringHandler.isEmptyString((String)o)) {
				System.out.println("String input object is empty");          
			}
			else System.out.println("String input object !=null -->  " + o.toString()); 
		}else if(o instanceof BigDecimal) {     
			if(o==null) {
				System.out.println("BigDecimal input object is null");          
			}
			else System.out.println("BigDecimal input object !=null -->  " + o.toString()); 
		}else if(o instanceof Date) {     
			if(o==null) {
				System.out.println("Date input object is null");          
			}
			else System.out.println("Date input object !=null -->  " + o.toString()); 
		}else { 
			
			
		}
			
		
	}

}
