package week4_2;

import java.util.HashSet;
import java.util.Iterator;

public class CountryManager {
	private HashSet<String> h1;
	
	public CountryManager() {
		h1 = new HashSet<>();
	}
	public HashSet<String> saveCountryNames (String CountryName){
		h1.add(CountryName);
		return h1;
	}
	
	public String getCountry(String CountryName) {
		Iterator<String> i = h1.iterator();
		while(i.hasNext()) {
			String country = i.next();
			if (country.equalsIgnoreCase(CountryName)){
				return country;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryManager countries = new CountryManager();
		countries.saveCountryNames("India");
		countries.saveCountryNames("China");
		countries.saveCountryNames("Russia");
		countries.saveCountryNames("Japan");
		if(countries.getCountry("India").equals("India")) {
			System.out.println("India Exits in the CountryManager");
		}
		else {
			System.out.println("The mentioned country is not in the Country Manager");
		}
	}

}
