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
        Nurse nurse = (Nurse) context.getBean("nurse"); // We get data as an object
        nurse.assist();

        System.out.println("Method from Nurse.class and Doctor.class via the Staff interface");
        Staff staff1 = context.getBean(Doctor.class);
        staff1.assist();
        Staff staff2 = context.getBean(Nurse.class);
        staff2.assist();

        Doctor staffWithMB = context.getBean(Doctor.class);
        System.out.println(staffWithMB.getQualification());


    }




}