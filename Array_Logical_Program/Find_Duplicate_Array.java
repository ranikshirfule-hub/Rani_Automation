package Array_Logical_Program;

public class Find_Duplicate_Array {

	public static void main(String[] args) {

		 int numbers[] = {485, 111, 45, 111, 459, 485, 26, 222, 444, 26, 111, 111, 26};

	        for (int i = 0; i < numbers.length; i++) {

	            int count = 1;

	            // Check if this number was already processed
	            boolean alreadyCounted = false;

	            for (int k = 0; k < i; k++) {
	                if (numbers[i] == numbers[k]) {
	                    alreadyCounted = true;
	                    break;
	                }
	            }

	            if (alreadyCounted) {
	                continue;
	            }

	            // Count how many times the number occurs
	            for (int j = i + 1; j < numbers.length; j++) {

	                if (numbers[i] == numbers[j]) {
	                    count++;
	                }
	            }

	            // Print only duplicate numbers
	            if (count > 1) {
	                System.out.println(numbers[i] + " = " + count + " times");
	            }
	        }
	}

}
