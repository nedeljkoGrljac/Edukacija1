package test;



/**
 *
 * @author vu00209
 */
public class TestnaKlasa {
	/**
     * @param args
     */
    public static void main(String[] args) throws Exception{
    	System.out.println("main");
    	dummyCall();
    }
    
    private static void dummyCall(){
    	System.out.println("dummyCall");
    	dummyCallTwo();
    }
    
    private static void dummyCallTwo(){
    	System.out.println("dummyCallTwo");
	    //dummyCallThree();
    }
	
	private static void dummyCallThree(){
    	System.out.println("dummyCallThree");
    }
    
}

