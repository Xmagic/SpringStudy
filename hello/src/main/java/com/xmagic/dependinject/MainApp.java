package com.xmagic.dependinject;
//http://www.tutorialspoint.com/spring/spring_injecting_collection.htm
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("**/SpellCheck.xml");

      TextEditor te = (TextEditor) context.getBean("textEditor");

      te.getSpellChecker().checkSpelling();
   }
}
