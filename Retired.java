package Exception;

public class Retired {
	public static void main(String [] args) throws RetiredException {
		int age = 51;
		if(age >=60) {
			System.out.println("Eligible");
		}
		else {
			throw new RetiredException("Not Eligible age less than 60");
		}
	}

}
