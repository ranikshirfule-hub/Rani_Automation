package looping;

public class Do_while_Loop {

	public static void main(String[] args) {
		
		//retry example
		

//        int attempt = 1;
//        boolean success = false;
//
//        do {
//            System.out.println("Trying operation... Attempt: " + attempt);
//
//            // Assume this represents some operation
//            if (attempt == 3) {
//                success = true;
//                System.out.println("Operation successful!");
//            } else {
//                System.out.println("Operation failed.");
//            }
//
//            attempt++;
//
//        } while (!success && attempt <= 3);
//
//        if (!success) {
//            System.out.println("Operation failed after 3 attempts.");
//        }
		
		
		
		int i=1;
		do
		{
			int j=2;
			do 
			{
				if(j==3)
				{
					j++;
					continue; //It will skip this itteration
				}
				System.out.print(i * j + "\t");
				j++;
			}
			while(j<=30);
			System.out.println();
			i++;
		}
		while(i<=10);
	}

}