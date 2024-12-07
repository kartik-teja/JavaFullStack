package week4_1;

import java.util.ArrayList;

public class NumberArrayList {

	
	public static void main(String[] args) {
		ArrayList<Number> arr = new ArrayList<Number>();
		arr.add(8);
		arr.add(8.2);
		arr.add(8.264660460);
		printAllNumbers(arr);
	}
	public static void printAllNumbers(ArrayList<Number> list) {
        for (Number number : list) {
            System.out.println(number+" "+number.getClass().getName());
        }
    }

}
