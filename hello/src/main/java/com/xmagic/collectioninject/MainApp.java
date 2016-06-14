package com.xmagic.collectioninject;
//http://www.tutorialspoint.com/spring/spring_injecting_collection.htm
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("**/JavaCollections.xml");

      JavaCollections jc=(JavaCollections)context.getBean("javaCollections");

      jc.getAddressList();
      jc.getAddressSet();
      jc.getAddressMap();
      jc.getAddressProp();
   }
}
