import java.util.List;
import java.util.Map;
import java.util.Set;


public class Test {

	private List fruites;
	private Set cricketers;
	private Map CountryAndCaptitals;
	public List getFruites() {
		return fruites;
	}
	public void setFruites(List fruites) {
		this.fruites = fruites;
	}
	public Set getCricketers() {
		return cricketers;
	}
	public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}
	public Map getCountryAndCaptitals() {
		return CountryAndCaptitals;
	}
	public void setCountryAndCaptitals(Map CountryAndCaptitals) {
		this.CountryAndCaptitals = CountryAndCaptitals;
	}
	
	public void printData(){
		System.out.println("Fruites...............");
		for(Object fruite : fruites){
			System.out.println(fruite);
		}
	
		System.out.println("cricketers...............");
		for(Object cricketer : cricketers){
			System.out.println(cricketer);
		}
		
		System.out.println("CountryAndCaptitals...............");
		Set keys= CountryAndCaptitals.keySet();
		for(Object key: keys){
			System.out.println("Country:"+key + ""+ "Captital:"+CountryAndCaptitals.get(key));
		}
	}
	
	
}
