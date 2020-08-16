
//question-3



package com.company;

public class Person {
    int  empid;
    String empName;
  double empSalary;
    String empLocation;
    String empDesignation;
    Person(int  empid, String empName, double empSalary, String empLocation, String empDesignation)
    {
        this.empid=empid;
        this.empName=empName;
        this.empSalary=empSalary;
        this.empDesignation=empDesignation;
        this.empLocation=empLocation;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpLocation() {
        return empLocation;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }
}
