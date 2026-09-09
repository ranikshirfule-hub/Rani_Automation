package Array_Logical_Program;

import java.util.Arrays;

public class Copy_Array {

	public static void main(String[] args) {
		
		int numbers[]={458,111, -45,26,459,-47,485,26, 222, 444, 0, 26};
		
		int copy[]=new int[numbers.length];
		
		for(int i=0; i<numbers.length; i++)
		{
			if(copy[i]<0)
			{
				continue;
			}
			copy[i] = numbers[i];
		}
		
		System.out.println(Arrays.toString(copy));
		

	}

}
