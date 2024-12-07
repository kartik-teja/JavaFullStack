package week4_2;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tSet = new TreeSet<String>();
		tSet.add("First");
		tSet.add("Second");
		tSet.add("Third");
		tSet.add("Fourth");
		tSet.add("Fifth");
		
		NavigableSet<String> descendingSet = tSet.descendingSet();
		
		String target = "Sixth";
		Iterator<String> i = tSet.iterator();
		boolean flag = false;
		while(i.hasNext()) {
			if(i.next() == target) {
				flag=true;
				break;
			}
		}
		if (flag) {
			System.out.println(target+" is in the TreeSet");
		}else {
			System.out.println(target+" is not in the TreeSet");
		}
		System.out.println("Elements in descending order:");
        for (String element : descendingSet) {
            System.out.println(element);
        }
	}

}
