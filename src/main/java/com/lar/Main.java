package com.lar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        System.out.println("Hello world!");
        System.out.println("Nice! :)");

        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
//        Nurse nurse = context.getBean(Nurse.class);
        Nurse nurse = (Nurse) context.getBean("nurse");
        nurse.assist();

    }




}