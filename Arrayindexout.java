package Exception;

public class Arrayindexout {
	public static void main (String [] args) {
		int [] num = {1,2,3};
		try {
			int num1 = num[10];
			System.out.println(num1);
		}
		catch(ArrayIndexOutOfBoundsException ar) {
			System.out.println(ar);
		}
		
	}

}
