package fundamentalsDemo;

public class UnaryOperator {

	public static void main(String[] args) {

		
		// Unary plus (+) and Unary minus(-)
		
		//int x = 100;
		
		
		//System.out.println(-x);
		
		//  + - = -
		//  + +  = +
		//  -  + = -
		//  +  + = +
		
		// Increament and decreament operator
		
		/*int a= 10;
		
		a++;
		a++;
		
		a--;
		
		System.out.println(a);*/
		
		// Post increment and pre increment and post decrement and pre decrement operator
		
		int a=10; int b=5;
		
		/*int sum= a++ + b++;
		
		System.out.println(sum);
		
		// post increment = increases the value after operation performed
		// pre increment = increases the value before operation performed
		
		System.out.println("vaule of a: " +a);
		System.out.println("Value of b: " +b);
		*/
		
		int x=10; int y=20;
		
		int sum = --x + --y;
		
		System.out.println(sum);
		
		// pre increment = increases the value before operation performed
		// pre decrement = decreases the value before operation performed
		
		System.out.println("vaule of a: " +x);
		System.out.println("Value of b: " +y);
		
		
	}

}
