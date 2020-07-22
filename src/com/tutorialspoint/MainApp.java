package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("D:/ws/code/HelloSpring/src/beans.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.setMessage("I'm object A");
        objA.getMessage();
        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        objB.getMessage();

        HelloWorld objC = (HelloWorld) context.getBean("helloWorldP");
        objC.setMessage("I'm object C");
        objC.getMessage();
        HelloWorld objD = (HelloWorld) context.getBean("helloWorldP");
        objD.getMessage();
        context.registerShutdownHook();
    }
}
