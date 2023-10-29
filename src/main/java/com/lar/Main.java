package com.lar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("MBBS");
        System.out.println(doctor);

        Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1);

        // Both give this result because of the use of the SINGLETON Bean scope!
//        Doctor is assisting
//        Doctor{qualification='MBBS'}
//        Doctor{qualification='MBBS'}

        // 5 Types of Bean Scopes:
        // Singleton
        // Prototype
        // Request
        // Session
        // Global Session

    }




}