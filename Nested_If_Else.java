package com.ConditinalStatemnet;

public class Nested_If_Else {

	public static void main(String[] args) {
		 //Bank Account open
		
		
		boolean AdharAvailable = true;
		boolean PanAvialable = true;
		double amount = -10000.00;
		
		
	   if(AdharAvailable)
	   {
		   if(PanAvialable)
		   {
			   if(amount>=10000)
			   {
				   if(amount>0)
				   {
				   System.out.println("Cheque can accept for account opening");
			   }
			   
			   else 
			   {
				   System.out.println("Cheque can not accept for account opening, Insufficiant amount");
			   }
			   System.out.println("Eligible for OPen Account");
		   }
		   else
		   {
			   System.out.println("not Eligible for OPen Account");
		   }  
		   
	   }
	   
		
		

}
}
}