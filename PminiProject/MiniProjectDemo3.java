package PminiProject;

public class MiniProjectDemo3 {

	public static void main(String[] args) {

		int mobile = 17000;
		
		int earphone = 800;
		
		int tShirt = 400;
		
		int perfume = 600;
		
		int laptop = 56000;
		
		double totalBill = mobile + earphone + tShirt + perfume + laptop;
		
		double gst = totalBill * 0.18;
		
		totalBill =  totalBill + gst;
		
		
		double discount;
		
		discount = totalBill > 50000 ? 0.10 : 0.5 ;
		
		double discountPrice= totalBill * discount;
		
		double finalBill = totalBill - discountPrice ;
		
		System.out.println("==============Receipt============ ");
		
		System.out.println("Total Bill : " +totalBill);
		
		System.out.println("GST : " +gst);
		
		System.out.println("Discount : " +discount + "%");
		
		System.out.println("Discount Price : " +discountPrice);
		
		System.out.println("Final Bill : " +finalBill);
	}

}
