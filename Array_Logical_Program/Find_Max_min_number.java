package Array_Logical_Program;

public class Find_Max_min_number {

	public static void main(String[] args) {
		
		//**********Find Maximum number
		
		int numbers[]= {458,111, 45,26,459,47,485,55};
		
		int max=numbers[0];
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i]>max)
				max=numbers[i];
		}
		
		System.out.println(max);
		
		
		//**********Find Minimum number

//		int min=numbers[0];
//		
//		for(int i=0; i<numbers.length; i++)
//		{
//			if(numbers[i]<min)
//			{
//		    min =numbers[i];
//		    }
//		}
//		System.out.println(min);
	}
	

}
