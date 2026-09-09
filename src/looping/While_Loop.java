package looping;

import java.util.Scanner;

public class While_Loop {

	public static void main(String[] args) {

		// Will use while loop when we dont know the itterations. 
		//while retrive data from Database, while retrive data from file
		
		Scanner sc = new Scanner(System.in);
		
		
		// Unlimited attemps to enter password
//		int i=1;
//		while(true)
//		{
//			System.out.println("Enter your password");
//		    String password = sc.next();
//		    
//		    if(password.equals("aadi1212"))
//		    {
//		    	System.out.println("Password Verified.....");
//		    	break;
//		    }
//		    else
//		    {
//		    	System.out.println("Incurrect password... Try again...!!!");
//		    }
//		}
		
		
		// LImited attempts to enter password
		int attemps=0;
		while(attemps<3)
		{
			System.out.println("Enter your password");
		    String password = sc.next();
		    
		    if(password.equals("aadi1212"))
		    {
		    	System.out.println("Password Verified.....");
		    	break;
		    }
		    else
		    {
		    	attemps++;
		    	System.out.println("Incurrect password... Try again...!!!");
		    }
		}
	}

}