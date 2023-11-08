package Exception;

public class Product {
	public static void main(String [] args) throws MyProductException {
		int price = 5000;
		if(price >15000) {
			System.out.println("Available");
		}
		else {
			throw new MyProductException("Not Available");
		}
	}

}
