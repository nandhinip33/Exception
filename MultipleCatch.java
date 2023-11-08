package Exception;

public class MultipleCatch {
	public static void main (String [] args) {
		try {
			String [] vals = {"ram","raja",null};
			System.out.println(vals[0]);
			System.out.println(vals[0].charAt(11));
			}
		catch(NullPointerException a) {
			System.out.println(a);
		}
		catch(StringIndexOutOfBoundsException ar) {
			System.out.println(ar);
		}
		catch(Exception ac) {
			System.out.println(ac);
		}
		
	}

}
