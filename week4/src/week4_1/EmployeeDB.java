package week4_1;

import java.util.ArrayList;

public class EmployeeDB {
	ArrayList<Employee> list = new ArrayList<Employee>();
	boolean addEmployee (Employee e) {
		return list.add(e);
	}
	boolean deleteEmployee(int empid) {
		for (Employee e : list) {
			if (e.getEmpId() == empid) {
			 list.remove(e);
			 return true;
			}
		}
		return false;
	}
	String showPayslip(int empid) {
		for (Employee e : list) {
			if (e.getEmpId() == empid) {
			 return ""+e.getSalary();
			}
		}
		return "NOT FOUND";
	}

}
