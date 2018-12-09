public class Employee {  
private int id;  
private String name;  
private String email;

public Employee() {System.out.println("def cons");}  
  
public Employee(int id) {
	System.out.println("1");
	this.id = id;
	}  
  
public Employee(String name) { 
	System.out.println("2");
	this.name = name;
	}  
  
public Employee(int id, String name) {  
	System.out.println("3");
    this.id = id;  
    this.name = name;  
}  
  
public Employee( String name,int id, String email) {  
	System.out.println("4");
	this.name = name;  
    this.id = id;  
    this.email = email;  
}  

void show(){  
    System.out.println("ID:"+ id+" "+"Name:"+ name+" "+"Email:"+ email);  
}  
  
}  