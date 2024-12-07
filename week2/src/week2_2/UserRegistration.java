package week2_2;

import java.util.Scanner;

public class UserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user,country;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		user = scan.nextLine();
		System.out.println("Enter your country: ");
		country = scan.nextLine();
		try {
			registerUser(user,country);
			System.out.println("User registration done successfully");
		}catch(InvalidCountryException e) {
			System.err.println(e.getMessage());
		}
		finally {
			scan.close();
		}
	}
	public static void registerUser(String username, String userCountry) throws InvalidCountryException {
         if (!userCountry.equals("India")) {
        	 throw new InvalidCountryException();
         }
    }


}
