package week4_2;

class Employee implements Comparable<Employee> {
    int empid;
    String empName;
    String email;
    String gender;
    float salary;

    public Employee(int empid, String empName, String email, String gender, float salary) {
    	this.empid = empid;
		this.empName = empName;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
    }

    void GetEmployeeDetails() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + empName);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: " + salary);
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.empid, other.empid);
    }
}
