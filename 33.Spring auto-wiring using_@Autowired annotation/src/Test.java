import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class Test {

	 public static void main(String[] args) {
	  ApplicationContext context = new ClassPathXmlApplicationContext(
	    "applicationContext.xml");
	  
	  PaymentGateway paymentGateway = (PaymentGateway) context.getBean("paymentGateway");
      System.out.println(paymentGateway.toString());
	 }
 
}
