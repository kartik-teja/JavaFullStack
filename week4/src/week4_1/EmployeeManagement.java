package week4_1;


public class EmployeeManagement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDB eDB = new EmployeeDB();
		Employee emp = new Employee (2654,"Krishna","krishna@gmail.com","M",(float) 52000.02);
		
		eDB.addEmployee(emp);
		System.out.println(eDB.showPayslip(2654));
		eDB.deleteEmployee(2654);
	}

}
