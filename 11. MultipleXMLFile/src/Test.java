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
	String files[]=new String[]{"Address.xml","Employee.xml"};
     
    ApplicationContext ap = new ClassPathXmlApplicationContext(files);//For Two XML:  It will load both class and constructor of
    																  //both classes will be invoked
      
    
    Employee e=(Employee)ap.getBean("obj");  
    e.displayInfo();  
      
}  
}  