package looping;

import java.util.Scanner;

public class Nested_For_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int attempts = 3;
		double balance = 1000.00;
		
		
		for(int i=1; i<=attempts;)
		{
			System.out.println("Enter your pin...");
			int pin = sc.nextInt();
			
			if(pin==1212)
			{
				System.out.println("Pin verified Success..");
				
				for(;;)
				{
				
				System.out.println("1. Check Balance");
				System.out.println("2. Deposite");
				System.out.println("3. Withdrowal");
				System.out.println("1. Exit");
				
				System.out.println("Enter your chice...");
				
				int choice = sc.nextInt();
				
				if(choice == 1)
				{
					System.out.println("Your corrent Balance is .." +balance);
				}
				else if(choice ==2)
				{
					System.out.println("Enter your Deposite..");
					double amount =sc.nextDouble();
					
					if(amount>0)
					{   balance+=amount;
						System.out.println("Amount Deposited Sucessfully...Available Balance" +balance);
					}
					else
					{
						System.out.println("Invalid amount..");
					}
				}
				else if(choice ==3)
				{
					System.out.println("Enter your withdrowal amount..");
					double withdrowalAmount = sc.nextDouble();
					
					if(withdrowalAmount<0)
					{
						System.out.println("Invalid amount");
					}
					else
					{
						if(withdrowalAmount<=balance)
						{
							balance -=withdrowalAmount;
							System.out.println("Withdrwal Sucessful...Available balance" +balance);
						}
						else
						{
							System.out.println("Insufficient balance");
						}
					}
				}
				else if(choice ==4)
				{
					System.out.println("Thank you.....");
					return;
				}

				}
			}
			else
			{
				attempts--;
				if(attempts==0)
				System.out.println("Account Blocked..Due to 3 Incorrect attemps..");
				//break;
			}
		}

	}

}