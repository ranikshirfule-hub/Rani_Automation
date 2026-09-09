package fundamentalsDemo;

public class ExplicitTypeCasting {

	public static void main(String[] args) {
		
		//long mobile = 9022154508L;
		
		long mobile = 9922;
		
		int x = (int)mobile;
		

		System.out.println(x);   // output 432219916 (data loss for long data)
		System.out.println(x);  // no data lost in short data
		
		short s = (short)x;
		
		System.out.println(x);
		
		byte b= (byte)s;
		
		System.out.println(b);
		
		
	}

}
