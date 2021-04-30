package com.company.People;

public class Instructer extends Person{
    private static final String   DESCREPTION="INSTRUCTOR";




    String branch;
    String specialistDegree;
    String educationState;
    Student[] students;
    //...









    // this class getter and setters...
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSpecialistDegree() {
        return specialistDegree;
    }

    public void setSpecialistDegree(String specialistDegree) {
        this.specialistDegree = specialistDegree;
    }

    public String getEducationState() {
        return educationState;
    }

    public void setEducationState(String educationState) {
        this.educationState = educationState;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }








    // super class overrides...

    @Override
    public String getDescreption() {
        return DESCREPTION;
    }


}
