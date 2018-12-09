public class Employee {  
	
	private int id;  
	private String name;  
	  
	public Employee() {System.out.println("def cons");}  
	  
	public Employee(int id) 
	{
		System.out.println("cons 1");
		this.id = id;
	}  
	  
	public Employee(String name) 
	{
		System.out.println("cons 2");
		this.name = name;
	}  
	  
	public Employee(int id, String name) {
		System.out.println("cons 2");
	    this.id = id;  
	    this.name = name;  
	}  
	  
	void show(){  
	    System.out.println(id+" "+name);  
	}  
  
}  