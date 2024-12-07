package week4_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CountryCapitalManager {
    private Map<String, String> countryCapitalMap;

    public CountryCapitalManager() {
        countryCapitalMap = new HashMap<>();
    }

    public Map<String, String> saveCountryCapital(String countryName, String capital) {
        countryCapitalMap.put(countryName, capital);
        return countryCapitalMap;
    }

    public String getCapital(String countryName) {
        return countryCapitalMap.get(countryName);
    }

    public String getCountry(String capital) {
        for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
            if (entry.getValue().equals(capital)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public Map<String, String> createCapitalCountryMap() {
        Map<String, String> capitalCountryMap = new HashMap<>();
        for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
            capitalCountryMap.put(entry.getValue(), entry.getKey());
        }
        return capitalCountryMap;
    }

    public List<String> getAllCountries() {
        ArrayList<String> list = new ArrayList<String>();
        Iterator<String> i = (countryCapitalMap.keySet()).iterator();
        while(i.hasNext()) {
        	list.add((String) i.next());
        }
        return list;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CountryCapitalManager manager = new CountryCapitalManager();
        manager.saveCountryCapital("India", "New Delhi");
        manager.saveCountryCapital("USA", "Washington D.C.");
        manager.saveCountryCapital("France", "Paris");
        manager.saveCountryCapital("Japan", "Tokyo");

        System.out.println("Capital of USA: " + manager.getCapital("USA"));
        System.out.println("Country of Paris: " + manager.getCountry("Paris"));
        System.out.println("All countries: " + manager.getAllCountries());
        Map<String,String> CapitalMap = manager.createCapitalCountryMap();
        System.out.println(CapitalMap);
    }
}