package com.company.People;

public class Student extends Person{


    private static final String   DESCREPTION="STUDENT";

    String studentDepartment;
    String studentClass;
    int [] studentGrades;
    double avarageOfGrades;
     //...




    // this class getter and setters...


    /// calculate avarageOfGrades for this student
    public double getAvarageOfGrades() {
       double avarage;
       int total = 0;
       for(int grade:studentGrades)
       {
          total=+grade;
       }

       avarage=total/studentGrades.length;
        return avarage;
    }

    public String getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public int[] getStudentGrades() {
        return studentGrades;
    }

    public void setStudentGrades(int[] studentGrades) {
        this.studentGrades = studentGrades;
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
