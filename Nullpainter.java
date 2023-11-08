package Exception;

public class Nullpainter {
	public static void main (String [] args) {
		String name = null;
		try {
			String name1 = name.toUpperCase();
			System.out.println(name1);
		}
		catch(NullPointerException ax) {
			System.out.println(ax);
		}
		
	}

}
