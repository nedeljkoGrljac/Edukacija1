package util;



public class StringUtil implements UtilConstants{

	public static void main(String[] args) {

	}
	
	public boolean isEmptyString(String str) {     
	if(str==null || str.trim().equals(UtilConstants.EMPTY)){     
		return true;
	}
	
	return false;     
}
}