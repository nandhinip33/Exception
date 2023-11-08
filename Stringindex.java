package Exception;

public class Stringindex {
	public static void main (String [] args) {
		String val = "ram";
		try {
			char val1 = val.charAt(10);
			System.out.println(val1);
		}
		catch (StringIndexOutOfBoundsException au) {
			System.out.println(au);
		}
	}

}
