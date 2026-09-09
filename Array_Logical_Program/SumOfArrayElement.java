package Array_Logical_Program;

public class SumOfArrayElement {

	public static void main(String[] args) {
		
		//Sum of all element
		int array[]= {45,12,48,88,4,57,99,65,100};
		
		int sum=0;
//		for(int i=0; i<array.length; i++)
//		{
//			sum= sum+array[i];
//		}
//		System.out.println("Sum of Array: " +sum);
		
		//************************
		
//		//Print sum of only even number
//		
//		for(int i=0; i<array.length; i++)
//		{
//			if(array[i] % 2 == 0)
//			{
//				sum= sum + array[i];
//				
//			}
//			System.out.println(sum);
//		}
		
//**************************************************
		//Print sum of only odd number
		
				for(int i=0; i<array.length; i++)
				{
					if(array[i] % 2 != 0)
					
						sum= sum + array[i];
					
				}
				System.out.println("Sum of Ood element: " +sum);
	}

}
