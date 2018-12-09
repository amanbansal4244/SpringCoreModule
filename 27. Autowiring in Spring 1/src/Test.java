import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
    		//no.xml
           /* ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("no.xml");
            Cat cat = (Cat) context.getBean("cat");
            System.out.println(cat.toString());*/

    	//noName.xml
    	/*ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("byName.xml");
        Dog dog = (Dog) context.getBean("dog");
        System.out.println(dog.toString());
        */
        
        //byType.xml
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("byType.xml");

       /* Cat cat = (Cat) context.getBean("cat");

        System.out.println(cat.toString());
        
        Dog dog = (Dog) context.getBean("dog");        

        System.out.println(dog.toString());*/

        Elephant elephant = (Elephant) context.getBean("elephant");        

        System.out.println(elephant.toString());   

            

            
          //Constructor.xml
            /*ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("constructor.xml");

            Cat cat = (Cat) context.getBean("cat");

            System.out.println(cat.toString());
            
            Dog dog = (Dog) context.getBean("dog");        

            System.out.println(dog.toString());

             Elephant elephant = (Elephant) context.getBean("elephant");        

                System.out.println(elephant.toString());   

                Frog frog = (Frog) context.getBean("frog");

                System.out.println(frog.toString());*/
            /*Tiger tiger = (Tiger) context.getBean("tiger");

            System.out.println(tiger.toString());*/

            context.close();

    }
}
