package Exception;

public class Calculator {
	public static void main (String [] args) {
		System.out.println("Welcome");
		int num = 5;
		int num1 = 0;
		
		try {
			int num2 = num/num1;
			System.out.println(num2);
		}
		catch(ArithmeticException ae) {
			System.out.println("We can't divide any numbers using zero " +ae);
		}
		System.out.println("Thank you");
		
	}

}
