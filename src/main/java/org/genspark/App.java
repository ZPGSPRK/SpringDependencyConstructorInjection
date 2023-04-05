package org.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        // Creates an ApplicationContext instance using Spring's ClassPathXmlApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        // Retrieves a bean named "student" from the context and casts it to a Student object
        Student student = (Student) context.getBean("student");

        // Prints the student's information to the console
        System.out.println(student);
    }
}
