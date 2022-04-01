import java.math.BigDecimal;

public class Operation {
	public static BigDecimal sum(BigDecimal a, BigDecimal b) {
		return a.add(b);
	}
	
	public static BigDecimal sub(BigDecimal a, BigDecimal b) {
		 return a.subtract(b);
	}
	
	public static BigDecimal mul(BigDecimal a, BigDecimal b) {
		 return a.multiply(b);
	}
	
	public static BigDecimal div(BigDecimal a, BigDecimal b) {
		 return a.divide(b);
	}
	
	public static BigDecimal mod(BigDecimal a, BigDecimal b) {
		 return a.remainder(b);
	}
}
