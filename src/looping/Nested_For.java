package looping;

public class Nested_For {

	public static void main(String[] args) {
		
		int count=0;
		int x=0;
		
		for(int i=1; i<=5; i++)
		{
			x++;
			for(int j=1; j<=5; j++)
			{
				count++;
				System.out.println("Ram :" +count);
			}
		}
		
		System.out.println("Count:" +count);
		System.out.println("X:" +x);

	}

}