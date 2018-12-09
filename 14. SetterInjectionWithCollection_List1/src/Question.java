import java.util.Iterator;  
import java.util.List;  

/*Note: 
 * In this example, we are taking the example of Forum where One question can have multiple answers.
 * This class contains three properties with setters and getters and displayInfo() method that prints
 *  the information. Here, we are using List to contain the multiple answers.
 * */
public class Question {  
private int id;  
private String name;  
private List<String> answers;  
  

  
public void displayInfo(){  
    System.out.println(id+" "+name);  
    System.out.println("answers are:");  
    Iterator<String> itr=answers.iterator();  
    while(itr.hasNext()){  
        System.out.println(itr.next());  
    }  
}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getAnswers() {
		return answers;
	}
	
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}  
	  
}  