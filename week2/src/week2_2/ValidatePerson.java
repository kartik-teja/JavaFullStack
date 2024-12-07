package week2_2;

import java.util.Scanner;

public class ValidatePerson {

	public static void main(String[] args) {
			int age;
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter your age: ");
			age=scan.nextInt();
			try {
				validateAge(age);
				System.out.println("Person is Eligible to vote");
			}catch(InvalidAgeException e) {
				System.out.println(e.getMessage());
			}
			scan.close();
	    }

	    public static void validateAge(int age) throws InvalidAgeException {
	        if (age>=18 & age<60) {
	        }else {
		        throw new InvalidAgeException();
	        }
	    }

	}
