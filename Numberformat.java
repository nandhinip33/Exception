package Exception;

public class Numberformat {
	public static void main (String [] args) {
		String val = "hi";
		try {
			int num = Integer.parseInt(val);
			System.out.println(num);
		}
		catch(NumberFormatException ac) {
			System.out.println(ac);
		}
	}

}
