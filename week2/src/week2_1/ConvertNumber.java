package week2_1;

public class ConvertNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		System.out.println("Given Number: "+n);
		System.out.println("Binary equivalent: "+Integer.toBinaryString(n));
		System.out.println("Octal equivalnt: "+Integer.toOctalString(n));
		System.out.println("Hexadecimal equivalent: "+Integer.toHexString(n));
		
	}

}
