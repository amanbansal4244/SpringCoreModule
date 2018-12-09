
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;


public class Test {

	private Vector fruites;
	private TreeSet cricketers;
	//private Hashtable CountryAndCaptitals;
	
	
	
	public Vector getFruites() {
		return fruites;
	}



	public void setFruites(Vector fruites) {
		this.fruites = fruites;
	}



	public TreeSet getCricketers() {
		return cricketers;
	}



	public void setCricketers(TreeSet cricketers) {
		this.cricketers = cricketers;
	}



	/*public Hashtable getCountryAndCaptitals() {
		return CountryAndCaptitals;
	}



	public void setCountryAndCaptitals(Hashtable countryAndCaptitals) {
		CountryAndCaptitals = countryAndCaptitals;
	}*/



	public void printData(){
		System.out.println("Fruites...............");
		for(Object fruite : fruites){
			System.out.println(fruite);
		}
	
		System.out.println("cricketers...............");
		for(Object cricketer : cricketers){
			System.out.println(cricketer);
		}
		
		/*System.out.println("CountryAndCaptitals...............");
		Set keys= CountryAndCaptitals.keySet();
		for(Object key: keys){
			System.out.println("Country:"+key + ""+ "Captital:"+CountryAndCaptitals.get(key));
		}*/
	}
	
	
}
