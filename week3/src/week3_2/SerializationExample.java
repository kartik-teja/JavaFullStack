package week3_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee ("Krishna", new Date(),"Resarch","Analyst",520000.02 );
		
		serializeEmployee(emp);
	}
	
	private static void serializeEmployee(Employee employee) {
		try {
        FileOutputStream fout = new FileOutputStream("data.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(employee);
        System.out.println("Serialization is completed");
        out.close();
    }catch(IOException e) {
    	System.out.println("A Problem has occured while serializing"+e.getMessage());
    }
		}

}
