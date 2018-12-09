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
          
        HelloWorld objA = (HelloWorld) factory.getBean("helloWorld");

        objA.getMessage1();
        objA.getMessage2();

        HelloIndia objB = (HelloIndia) factory.getBean("helloIndia");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();

          
    }  
}  