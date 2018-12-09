public class Customer {
	
	
	  private Person person;
	  private int type;
	  private String action;
	
	  public Person getPerson() {
	    return person;
	  }
	
	  public void setPerson(Person person) {
	    this.person = person;
	  }
	
	  public int getType() {
	    return type;
	  }
	
	  public void setType(int type) {
	    this.type = type;
	  }
	
	  public String getAction() {
	    return action;
	  }
	
	  public void setAction(String action) {
	    this.action = action;
	  }
	
	  @Override
	  public String toString() {
	    return "Customer [person=" + person + ", type=" + type + ", action="
	        + action + "]";
	  }
	  
	  public void printData(){
		  System.out.println("Person Details:"+person.getAddress()+" "+ person.getAge()+""+person.getName());
		  System.out.println("Type:"+type + " "+ "Action:"+ action) ;
	  }
}