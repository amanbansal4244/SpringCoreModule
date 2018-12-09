


public class Employee {  
	private int id;  
	private String name;  
	private Address address;  //Dependent Object
	  
	public Employee(){
		System.out.println(" Employee Constructor");
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}



	void displayInfo(){  
	    System.out.println("ID:"+id+" "+"Name:"+name);  
	    System.out.println("Address:"+address.getAddressLine1()+" " +address.getCity()+" " +address.getCountry()+" " +address.getState());  
	}  
}  