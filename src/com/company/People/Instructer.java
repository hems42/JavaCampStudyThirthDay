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
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public String getNationalIdentityNumber() {
        return super.getNationalIdentityNumber();
    }

    @Override
    public void setNationalIdentityNumber(String nationalIdentityNumber) {
        super.setNationalIdentityNumber(nationalIdentityNumber);
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    public String getContact() {
        return super.getContact();
    }

    @Override
    public void setContact(String contact) {
        super.setContact(contact);
    }

    @Override
    public String getDescreption() {
        return DESCREPTION;
    }


}
