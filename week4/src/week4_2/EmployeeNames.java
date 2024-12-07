package week4_2;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> eNames = new HashSet<String>();
		eNames.add("Kartik");
		eNames.add("Kavya");
		eNames.add("Charan");
		eNames.add("Babu");
		Iterator<String> i = eNames.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
