package week3_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = deserializeEmployee();
		if (emp == null) {
	    	System.out.println("A Problem has occured while serializing");
		}
		else {
			System.out.println(emp);
		}
		
	}
	
	private static Employee deserializeEmployee()  {
		Employee emp = null;
		try {
			FileInputStream fin = new FileInputStream("data.txt");
			ObjectInputStream in = new ObjectInputStream(fin);
			emp=(Employee) in.readObject();
			in.close();

	        System.out.println("Deserialization is completed");
    }catch(IOException e) {
    	System.out.println("A Problem has occured while deserializing"+e.getMessage());
    } catch (ClassNotFoundException e) {
		e.printStackTrace();
	}		return emp;
		}

}