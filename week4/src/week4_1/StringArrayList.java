package week4_1;

import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("hi");
		strings.add("hello");
		printAll(strings);
	}
	
	public static void printAll(ArrayList<String> list) {
		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println(); 
    }


}
