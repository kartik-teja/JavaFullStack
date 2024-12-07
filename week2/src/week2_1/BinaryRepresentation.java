package week2_1;

import java.util.Scanner;

public class BinaryRepresentation {

	public static void main(String[] args) {
		int i=-1;
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		while (i>256 | i<0) {
			System.out.print("Enter number bwtween 1 and 255: ");
			i = sc.nextInt();
		}
		sc.close();
		System.out.println("Binary Representation of "+i+" is "+Integer.toBinaryString(i));		
	}

}
