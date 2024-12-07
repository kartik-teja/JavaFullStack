package week4_1;

import java.util.Iterator;
import java.util.Enumeration;
import java.util.Vector;

public class EmployeeVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Employee> employees = new Vector<Employee>();
		for (int i = 0; i < 5; i++) {
            employees.add(new Employee(
                i + 1,
                "Employee " + (i + 1),
                "employee" + (i + 1) + "@example.com", 
                i % 2 == 0 ? "Male" : "Female", 
                50000.0f + i * 1000.0f 
            ));
        }
		System.out.println("Using Iterator: ");
		Iterator<Employee> i = employees.iterator();
		
		while (i.hasNext()) {
			i.next().GetEmployeeDetails();
		}
		System.out.println("Using Enumeration: ");
		Enumeration <Employee> j = employees.elements();
		 while (j.hasMoreElements()) {
	           j.nextElement().GetEmployeeDetails();;
	            
	        }
	}

}
