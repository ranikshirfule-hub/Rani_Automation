package Array_Logical_Program;



public class Linear_search {

	public static void main(String[] args) {
		
		//*********search method. its a linear search it will break after element found. not search after that. time save
		
//		int numbers[]={458,111, -45,26,459,-47,485,-55, 222, 444, 0, 00};
//		
//		int search =26;
//		boolean found=false;
//		
//		for(int i=0; i<numbers.length; i++)
//		{
//			if(numbers[i]==search)
//			{
//				found=true;
//				break;
//			}
//			
//		}
//		
//		if(found==true)
//		{
//			System.out.println("Element found......");
//		}
//		else
//		{
//			System.out.println("Element not present in the array.....");
//		}
//		

		//*********search and print count the number from array
		
		int numbers[]={458,111, -45,26,459,-47,485,26, 222, 444, 0, 26};
		
		int count=0;
		int search=26;
		boolean found=false;
		
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i]==search)
			{
				found=true;
				count++;
			}
		}
		if(found=true)
		{
			System.out.println("Element found....");
		}
		else
		{
			System.out.println("Element not present in the array....");
		}
		
		System.out.println("Element count:  " +count);
	}

}
