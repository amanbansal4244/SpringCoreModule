import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  
public class Test {  
    public static void main(String[] args) {  
        ApplicationContext factory=new ClassPathXmlApplicationContext("applicationContext.xml");  
          
        Triangle obj = (Triangle) factory.getBean("triangleParent");
  	    obj.draw();   
  	    
  	    Circle obj1 = (Circle) factory.getBean("circleParent");
	    obj1.draw();
	    
	    
	    // but we should not use above technique, we should use interface 
	    // using below approach, Test class does not know which shape would come at run time.
	    Shape shape = (Shape) factory.getBean("triangleParent");
	    shape.draw();
	    
    }  
}  