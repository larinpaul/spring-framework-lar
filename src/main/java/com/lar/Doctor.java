package com.lar;

public class Doctor implements Staff {

    public Doctor(String qualification) {
        this.qualification = qualification;
    }

    private String qualification;
//    private Nurse nurse;
//
//    public Nurse getNurse() {
//        return nurse;
//    }
//
//    public void setNurse(Nurse nurse) {
//        this.nurse = nurse;
//    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist() {
        System.out.println("Doctor is assisting");
    }


}
