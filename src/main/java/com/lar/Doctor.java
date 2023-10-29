package com.lar;

import org.springframework.stereotype.Component;

public class Doctor implements Staff {

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    private String qualification;

    public void assist() {
        System.out.println("Doctor is assisting");
    }


}
