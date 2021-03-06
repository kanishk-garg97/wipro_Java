import java.util.*;

public class Q1 {
	//instance variable
	HashSet<String> h1 = new HashSet<String>();
	
	public HashSet<String> addCountryNames(String CountryName) {
		h1.add(CountryName);
		return h1;
	}
	
	public String getCountry(String CountryName) {
		Iterator<String> i = h1.iterator();
		while(i.hasNext()) {
			String name = i.next();
			if(name.equals(CountryName)) {
				return CountryName;
			}
		}
		// returns null if there is no match 
		return null;
	}
	public static void main(String[] args) {
		Q1 obj = new Q1();
		obj.addCountryNames("India");
		obj.addCountryNames("USA");
		obj.addCountryNames("Russia");
		obj.addCountryNames("Spain");
		System.out.println(obj.getCountry("Brazil"));
	}
}
