package com.udemy.johnpurcell;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        //Without Spring
        Person person = new Person();
        person.speak();

        //With Spring Bean
//        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); //must be work in the same way
        Person person1 = (Person) context.getBean("person");
        person1.speak();
        ((ClassPathXmlApplicationContext)context).close();


    }

}
