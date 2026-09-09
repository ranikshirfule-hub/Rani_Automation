package Array_Logical_Program;

public class Count_Positive_negative {

	public static void main(String[] args) {
		
		int numbers[]= {458,111, -45,26,459,-47,485,-55, 222, 444, 0, 00};
		
		int positive=0;
		int negative =0;
		int zero=0;
		
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i]>0)
			{
				positive++;
			}
			else if(numbers[i] ==0)
			{
				zero++;
			}
			else
			{
				negative++;
			}
		}
		
		System.out.println("Postive numbers :" +positive);
		System.out.println("negative numbers :" +negative);
		System.out.println("zero numbers :" +zero);
	}

}
