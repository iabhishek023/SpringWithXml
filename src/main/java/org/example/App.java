package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //Java Based
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Alien alien=context.getBean(Alien.class);
        alien.code();

//        Desktop dt=context.getBean(Desktop.class);
//        dt.compile();
//
//        Desktop dt1=context.getBean(Desktop.class);
//        dt1.compile();

        /*Xml Approach refer spring.xml*/
        /*ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1=context.getBean("alien", Alien.class);
        System.out.println(obj1.age);
        obj1.code();*/



    }
}
