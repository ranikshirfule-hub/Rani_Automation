package com.ConditinalStatemnet;

import java.util.Scanner;

public class Else_If_Statement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your choice..... 1 to 4");
		System.out.println("1. Laptop - 30000");
		System.out.println("2. IPhone - 120000");
		System.out.println("3. Tshirt - 1800 Rs");
		System.out.println("4. TV - 11000 Rs");

        System.out.println("Enter your choice to purchase any product 1 to 4");
     
        int choice = sc.nextInt();
        
		String product ="";
		double price = 0;
		double discount =0;
		double finalprice = 0;
		int    qty        = 0;
		double totalprice =0;
		
		if(choice ==1)
		{
			System.out.println("you selected Laptop....");
			product = "Laptop";
			price = 30000.00;
			System.out.println("How many quantity you want....");
			qty = sc.nextInt();
			
			
			totalprice = price * qty;
			
			//I want to give discount to user
			if(totalprice > 50000)
			{
				System.out.println("Eligibla for 5% discount");
				discount = 5;
				double x = totalprice * 0.05;
				finalprice = totalprice -x;
				
			}
			else
			{
				System.out.println("No Discount");
				discount = 0;
				finalprice = totalprice;
			}
					
		}
		
		else if(choice ==2)
		{
			System.out.println("You selected Iphone.....");
			product = "Iphone";
			price=120000.00;
			System.out.println("How many quantity you want......?");
			qty=sc.nextInt();
			
			totalprice = price * qty;
			
			if(totalprice > 150000)
			{
				System.out.println("Eligible for 5% dscount..");
				discount = 5;
				double x= totalprice *0.05;
				finalprice = totalprice -x;
				
			}
			else
			{
				System.out.println("No Discount");
				discount =0;
				finalprice = totalprice;
			}
			
			
		}
		
		System.out.println("=========================Receipt==================");
		System.out.println("Product Name:" +product);
		System.out.println("No Of Quantity:" +qty);
		System.out.println("Total Price:" +totalprice);
		System.out.println("Discount:" +discount);
		System.out.println("Final Price:" +finalprice + "Rs");
		System.out.println("Your product booked successfully");

		
		
	
	}
	
	

}