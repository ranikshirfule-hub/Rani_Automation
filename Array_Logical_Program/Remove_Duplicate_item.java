package Array_Logical_Program;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate_item {

	public static void main(String[] args) {

		int numbers[]={485,111, 45,111,459,485,26, 222, 444,26, 111,111, 26};
		
		// //before i used Hashset, but hashset says..."I will remove duplicates, but I don't promise to keep the original order.
		//thats why we used here LInked hashset. it will maintained order
		
		 LinkedHashSet<Integer> set = new LinkedHashSet<>();   
		
		for(int num:numbers)
		{
			set.add(num);
		}
		
		System.out.println("Array after removing duplicate items.....:");
		
		for(int num : set)
		{
			System.out.print(num +" ");
		}
		
		
		
	}

}
