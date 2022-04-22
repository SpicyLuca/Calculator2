import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Calculator {

	public Calculator() {
		char operator;
	
		BigDecimal n1, n2, result;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		
		System.out.println("Enter a first number");
		/*do {
			
		}while();*/
		n1 = input.nextBigDecimal();
		

		do {
			System.out.println("Choose an operator : +, -, *, /, %");
			operator = input.next().charAt(0);
		}while(!isAnOperator(operator));

			
		
		System.out.println("Enter a second number");
		n2 = input.nextBigDecimal();
		
		switch(operator) {
			case '+':
					result = Operation.sum(n1, n2);
					System.out.println(n1.doubleValue() + String.valueOf(operator) + n2.doubleValue() + "=" + result.doubleValue());
				break;
			
			case '-':
					result = Operation.sub(n1, n2);
					System.out.println(n1.doubleValue() + String.valueOf(operator) + n2.doubleValue() + "=" + result.doubleValue());
				break;
			
			case '*':
					result = Operation.mul(n1, n2);
					System.out.println(n1.doubleValue() + String.valueOf(operator) + n2.doubleValue() + "=" + result.doubleValue());
				break;
			
			case '/':
					result = Operation.div(n1, n2);
					System.out.println(n1.doubleValue() + String.valueOf(operator) + n2.doubleValue() + "=" + result.doubleValue());
				break;		
			
			case '%':
					result = Operation.mod(n1, n2);
					System.out.println(n1.doubleValue() + String.valueOf(operator) + n2.doubleValue() + "=" + result.doubleValue());
				break;
			
			default:
					result = BigDecimal.valueOf(-666666);
					System.out.println("Invalid operator!");
				break;
		}
		
			
	}
	
	private boolean isIntegerValue(BigDecimal bd) {
	    boolean ret;
	    
	    try {
	        bd.toBigIntegerExact();
	        ret = true;
	    } catch (ArithmeticException ex) {
	        ret = false;
	    }

	    return ret;
	}

	private boolean isAnOperator(char operator) {
		switch(operator) {
		case '+':
			return true;
		
		case '-':
			return true;
		
		case '*':
			return true;
		
		case '/':
			return true;		
		
		case '%':
			return true;
		
		default:
			System.out.println("Invalid operator!");
			return false;
		}
	
	}

	public static void main(String[] args) {
		new Calculator();
	}

}
