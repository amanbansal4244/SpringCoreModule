import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class Test {

	 public static void main(String[] args) {
	  AbstractApplicationContext context = new ClassPathXmlApplicationContext(
	    "applicationContext.xml");
	  
	  context.registerShutdownHook();
	  PaymentGateway paymentGateway = (PaymentGateway) context.getBean("paymentGateway");
      System.out.println(paymentGateway.toString());
	 }
 
}
