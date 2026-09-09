package com.ConditinalStatemnet;

import java.util.Scanner;

public class If_else_Statemnt {

	public static void main(String[] args) {
		
		/*int num=100;
		
		if(num>0)
		{
			System.out.println("Number is Positive");
			
		}
		else
		{
			System.out.println("NUmber is Negative");
		}
*/
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Enter User name");
		String username = sc.next();
		
		System.out.println("Enter User name");
		String password = sc.next();
		
		if(username.equals("aadi") && password.equals("aadi1212"))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.err.println("Login Failed");
		}*/
		
		double balance = 45000.00;
		
		System.out.println("Enetr withdrawal amount...");
		
		double amount = sc.nextDouble();
		
		if(amount<=balance)
		{
			balance = balance-amount;
			System.out.println("Withdrowal sucessful... Remaning Balance" +balance);
		}
		else
		{
			System.out.println("Insufficiant fund");
		}
	}

}