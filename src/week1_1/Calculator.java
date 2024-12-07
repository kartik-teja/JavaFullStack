package week1_1;

public class Calculator {
	
	public static int powerInt(int num1, int num2) {
		return (int) Math.pow(num1,num2);
	}
	public static double powerDouble(double num1, int num2) {
		return Math.pow(num1,num2);
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2 raised to power 3 is "+powerInt(2,3));
		System.out.println("1.6 raised to power 5 is "+powerDouble(1.6,5));
	}

}
