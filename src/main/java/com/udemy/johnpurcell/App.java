package com.udemy.johnpurcell;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        //Without Spring
        Person person = new Person();
        person.speak();

        //With Spring Beannjhj
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
        Person person1 = (Person) context.getBean("person");
        person1.speak();
    }

}
