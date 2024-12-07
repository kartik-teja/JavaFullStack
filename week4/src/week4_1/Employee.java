package week4_1;

public class Employee {
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
	public int getEmpId() {
		return empid;
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}
	public float getSalary() {
		return salary;
	}
	public void setEmpId(int empid) {
		this.empid=empid;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public void setEmail(String email) {
		this.email= email;
	}
	public void setGender(String gender) {
		this.gender= gender;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void GetEmployeeDetails() {
       System.out.println("Employee[Id: "+empid+",Name: "+empName+",email: "+email+",gender: "+gender+",salary: "+salary);
    }

}