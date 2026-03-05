package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1=context.getBean("alien", Alien.class);
        System.out.println(obj1.age);
        obj1.code();



    }
}
