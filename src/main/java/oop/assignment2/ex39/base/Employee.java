package oop.assignment2.ex39.base;

import java.util.Date;
public class Employee {
    String firstName;
    String lastName;
    String position;
    String separationDate;

    public Employee(){}


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSeparationDate() {
        return separationDate;
    }

    public void setSeparationDate(String separationDate) {
        this.separationDate = separationDate;
    }

    public String[] getEmployeeData() {

        String [] employeeData = {this.firstName, this.lastName, this.position, this.separationDate};
        return employeeData;
    }

    public void setEmployeeData(String firstName, String lastName, String position, String separationDate) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;

    }


}

/*
First Name	Last Name	Position	Separation Date
John	Johnson	Manager	2016-12-31
Tou	Xiong	Software Engineer	2016-10-05
Michaela	Michaelson	District Manager	2015-12-19
Jake	Jacobson	Programmer
Jacquelyn	Jackson	DBA
Sally	Webber	Web Developer	2015-12-18

 */