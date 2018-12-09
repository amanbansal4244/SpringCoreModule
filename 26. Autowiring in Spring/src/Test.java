import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  

public class Test {  
public static void main(String[] args) {  
	//byType.xml
	ApplicationContext context=new ClassPathXmlApplicationContext("byType.xml");  
    A a = (A)context.getBean("a");  
    a.display(); 
    
    
   
    //byName.xml
   /* ApplicationContext context=new ClassPathXmlApplicationContext("byName.xml");  
    A a=(A) context.getBean("a");  
    a.display(); */
    
    //constructor.xml
   /* ApplicationContext context=new ClassPathXmlApplicationContext("constructor.xml");  
    A a=(A) context.getBean("a");  
    a.display();*/
    
	
	//no.xml
	/*ApplicationContext context=new ClassPathXmlApplicationContext("no.xml");  
    A a=(A) context.getBean("a");  
    a.display();*/
	
}  
}  