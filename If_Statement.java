package com.ConditinalStatemnet;

import java.util.Scanner;

public class If_Statement {

	public static void main(String[] args) {
		
		/*if(false)
		{

		System.out.println("My Name is Rani");
		
		System.out.println("I am from Pune");
		
		System.out.println("My age is 32");
		}
		
		System.out.println("I am Full Stack Java Developer");
		
	   }*/
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
	/*	System.out.println("Enter your number: ");
		
		int num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Number is Positive");
			
		}
		
		if(num<0)
		{
			System.out.println("Number is Negative");
		}
		
		*/
		
		
		
		/*	System.out.println("Enter your age: ");
			
			int age = sc.nextInt();
			
			if(age<18)
			{
				System.out.println("You are Child");
				
			}
			
			if(age>18 && age<= 40)
			{
				System.out.println("You are Adult");
			}
			
			if(age > 41)
			{
				System.out.println("You are Old");
			}
			
			*/
		
		
		System.out.println("Enter user name: ");
		
		String userName = sc.next();
		
        System.out.println("Enter your Password");
		
		String password = sc.next();
		
		/*if(userName.length()>5)
		{
			System.out.println("Valid User name :" +userName);
			
		}
		if(userName.length()<5)
		{
			System.err.println("Invalid UserName, Please enter Valid User Name");
		}
		
		System.out.println("Enter your Password");
		
		String password = sc.next();
		
		if(password.length()>8)
		{
			System.out.println("Valid Password");
			
		}
		if(password.length()<8)
		{
			System.err.println("Invalid UserName, Please enter Valid password");
		}
		*/
		
		// Login Functinality
		
		if(userName.equals("aadiandjava") && password.equals("adi1212"))
		{
			System.out.println("Login Suscess....");
		}
		
		if(!userName.equals("aadiandjava") || !password.equals("adi1212"))
		{
			System.err.println("Login Failed....");
		}
		
		
		

}
}