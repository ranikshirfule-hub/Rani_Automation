package fundamentalsDemo;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Enter your age: ");
		
		int age = sc.nextInt();
		
		String Eligibility =  age>=18 ? "Eligibal for voting" : "Not eligibal for voting" ;
		
		System.out.println(Eligibility);*/
		
		
		
		/*System.out.println("Enter your experiance: ");
		
		int exp = sc.nextInt();
		
		double salary = 45000.00;
		
		double finalSalary = exp>5 ? salary + 5000 : salary + 2000;
		
		System.out.println(finalSalary);*/
		
		
		System.out.println("Enter your marks:");
		
		int marks = sc.nextInt();
		
		String result =
			         marks >=90 ? "A" :
			        	 marks >=75 ? "B" : 
			        		 marks >=50 ? "c" : "Fail";
		
			        		 System.out.println(result);

	}

}
