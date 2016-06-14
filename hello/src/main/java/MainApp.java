import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//http://www.tutorialspoint.com/spring/spring_injecting_collection.htm
public class MainApp {
   public static void main(String[] args) {

      AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
      context.registerShutdownHook();
   }
}