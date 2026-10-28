package com.pluralsight;

import java.util.*;
import java.io.*;


public class Employees {


    //Create variables to construct
    //Create getter/setter

private int employeeId;
private String Name;
private double hoursWorked;
private double payRate;


//Setup myEmployees
Employees myEmployees = new Employees(employeeId, Name, hoursWorked, payRate );

//Get constructor
    public Employees(int employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        Name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }


    //Create getters and setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

//Setup getGrossPay() and getEmployeeId()
    public double getGrossPay(double hoursWorked){
        return this.getGrossPay(hoursWorked * payRate);
    }




}
