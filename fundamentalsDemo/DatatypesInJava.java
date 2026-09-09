package fundamentalsDemo;

public class DatatypesInJava {

	public static void main(String[] args) {

		// Ecommerce application;
		
		double productPrice = 450.00;
		 
		//Give 10% discount
		
		double discount = productPrice * 0.10;
		
		System.out.println("Discount:" +discount);
		
		double finalPrice = productPrice - discount;
		
		System.out.println("Final Price:" +finalPrice);
		
		
	}

}
