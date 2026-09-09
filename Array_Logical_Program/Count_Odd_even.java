package Array_Logical_Program;

public class Count_Odd_even {

	public static void main(String[] args) {
		
	int numbers[]= {458,111, 45,26,459,47,485,55, 222, 444};
		
		int even=0;;
		int odd=0;
		
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i] % 2 ==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		
		System.out.println("Even numbers:" +even);
		System.out.println("Odd numbers:" +odd);

	}

}
