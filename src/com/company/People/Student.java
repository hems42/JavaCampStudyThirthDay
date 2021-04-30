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
    public String getDescreption() {
        return DESCREPTION;
    }



}
