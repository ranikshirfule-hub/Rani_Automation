package com.ConditinalStatemnet;

public class Nested_If {

	public static void main(String[] args) {
		
		boolean accountActive = true;
		double balance = 25000.00;
		double withdrowalAmount = 30000.00;
		
		if(accountActive)
		{
			if(withdrowalAmount>0)
			{
			if(balance>=withdrowalAmount)	
			{
				System.out.println("Withdrwal secessfull....");
			}
			else
			{
				System.out.println("Insufficient balance....");
			}
		}
		else
		{
			System.out.println("invalid amount....");
		}
		}
			else
			{
				System.out.println("Inactive Acount...");
			}
		
		}
	 
		

}