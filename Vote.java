package Exception;

public class Vote {
	public static void main(String [] args) throws InvaildAgeException {
		int age = 16;
		if(age>=18) {
			System.out.println("Eligible");
			}
		else {
			throw new InvaildAgeException("Not Eligible vote age is less than 18");
		}
	}

}
