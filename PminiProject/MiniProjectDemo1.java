package PminiProject;

import java.util.Scanner;

public class MiniProjectDemo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Java Subject Marks: ");
		
		double java = sc.nextDouble();
		
        System.out.println("Enter Python Subject Marks: ");
		
		double python = sc.nextDouble();
		
        System.out.println("Enter C++ Subject Marks: ");
		
		double cpp = sc.nextDouble();
		
        System.out.println("Enter c Subject Marks: ");
		
		double c = sc.nextDouble();
		
		double totalMarks = java + python + cpp + c ;
		
		System.out.println("Total marks: " +totalMarks);
		
		double percentage = totalMarks/4;
		
		System.out.println("Percentage: " +percentage);
		
	}

}
