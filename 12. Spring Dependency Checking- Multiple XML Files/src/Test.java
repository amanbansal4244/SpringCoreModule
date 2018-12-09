import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class Test {  
public static void main(String[] args) {  
	
	/*//dependency checking:none
    Resource resource=new ClassPathResource("none.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
      
     Customer c=(Customer)factory.getBean("myCustomer");  
     c.printData();  
    */

	
   /*//dependency checking:simple->
    Resource resource=new ClassPathResource("simple.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
      
    Customer c=(Customer)factory.getBean("myCustomer");  
    c.printData(); */
    
    //dependency checking:objects->
    /*Resource resource=new ClassPathResource("Object.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
      
    Customer c=(Customer)factory.getBean("myCustomer");  
    c.printData(); */
    
	//dependency checking:all->
    Resource resource=new ClassPathResource("all.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
      
    Customer c=(Customer)factory.getBean("myCustomer");  
    c.printData(); 
    
}  
}  