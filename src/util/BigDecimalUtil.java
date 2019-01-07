package util;

import java.math.BigDecimal;

public class BigDecimalUtil implements UtilConstants{

	public static void main(String[] args) {

	}

	public boolean isNullBigDecimal(BigDecimal b) {     
		if(b==null){     
			return true;
		}

		return false;     
	}
	
	public boolean isZeroOrTenBigDecimal(BigDecimal b) {     
		if(isZeroBigDecimal(b) || isTenBigDecimal(b)) return true;

		return false;     
	}

	public boolean isZeroBigDecimal(BigDecimal b) {     
		if(b!=null && b.compareTo(BigDecimal.ZERO)==0){     
			return true;
		}

		return false;     
	}

	public boolean isTenBigDecimal(BigDecimal b) {     
		if(b!=null && b.compareTo(BigDecimal.TEN)==0){     
			return true;
		}

		return false;     
	}
}