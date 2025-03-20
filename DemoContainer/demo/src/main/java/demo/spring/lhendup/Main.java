package demo.spring.lhendup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");

        // Alien obj = new Alien();
        // obj.code();

        // Way to create IOC container using XML
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Getting the object                                                                    
        Alien obj =  (Alien) context.getBean("alien");
        // obj.code();
        // System.out.println(obj.getAge());

        // Alien obj1 =  (Alien) context.getBean("alien");
        // obj1.code();
    }
}