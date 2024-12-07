package week4_3;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapOperations {

	public static void main(String[] args) {
		HashMap<String,String> H1 = new HashMap<String,String>();
		H1.put("Key1", "Value1");
		
		System.out.println(H1.containsKey("Key1"));
		System.out.println(H1.containsValue("Value1"));
		
		Iterator<String> i = H1.keySet().iterator();
		while(i.hasNext()) {
			String key = i.next();
			System.out.println(key+" "+H1.get(key));
		}

	}

}
