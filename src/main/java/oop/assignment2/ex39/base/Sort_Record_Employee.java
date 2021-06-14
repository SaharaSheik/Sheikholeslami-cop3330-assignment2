package oop.assignment2.ex39.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sahar Sheikholelsami
 */
/*
Exercise 39 - Sorting Records
When you’re looking at results, you’ll want to be able to sort them so you can find what you’re looking for quickly or do some quick visual comparisons.

Given the following data set, create a program that sorts all employees by last name and prints them to the screen in a tabular format.

First Name	Last Name	Position	Separation Date
John	Johnson	Manager	2016-12-31
Tou	Xiong	Software Engineer	2016-10-05
Michaela	Michaelson	District Manager	2015-12-19
Jake	Jacobson	Programmer
Jacquelyn	Jackson	DBA
Sally	Webber	Web Developer	2015-12-18


Example Output
Name                | Position          | Separation Date
--------------------|-------------------|----------------
Jacquelyn Jackson   | DBA               |
Jake Jacobson       | Programmer        |
John Johnson        | Manager           | 2016-12-31
Michaela Michaelson | District Manager  | 2015-12-19
Sally Weber         | Web Developer     | 2015-12-18
Tou Xiong           | Software Engineer | 2016-10-05
Constraint
Store the data using a list of maps.
Challenges
Prompt for how the records should be sorted. Allow sorting by separation date, position, or last name.
Use a database such as MySQL, or a key-value store such as Redis, to store the employee records. Retrieve the records from the data store.
 */

import java.util.*;

public class Sort_Record_Employee {

    public static void main(String[] args) {


        List<Map<String, String>> unsortedListOfEmployees = listOfEmployeeMapMaker();
        List<Map<String, String>> sortedListOfEmployees = sortEmployeeFunction(unsortedListOfEmployees);
        printEmployees(sortedListOfEmployees);
    }


    public static List<Map<String, String>> listOfEmployeeMapMaker() {

        List<Map<String, String>> listOfEmployees = new ArrayList<Map<String, String>>();

        Map<String, String> employee1 = new HashMap<String, String>();
        Map<String, String> employee2 = new HashMap<String, String>();
        Map<String, String> employee3 = new HashMap<String, String>();
        Map<String, String> employee4 = new HashMap<String, String>();
        Map<String, String> employee5 = new HashMap<String, String>();
        Map<String, String> employee6 = new HashMap<String, String>();


        employee1.put("firstName", "John");
        employee1.put("lastName", "Johnson");
        employee1.put("position", "Manager");
        employee1.put("SeparationDate", "2016-12-31");

        employee2.put("firstName", "Tou");
        employee2.put("lastName", "Xiong");
        employee2.put("position", "Software Engineer");
        employee2.put("SeparationDate", "2016-10-05");

        employee3.put("firstName", "Michaela");
        employee3.put("lastName", "Michaelson");
        employee3.put("position", "District Manager");
        employee3.put("SeparationDate", "2015-12-19");

        employee4.put("firstName", "Jake");
        employee4.put("lastName", "Jacobson");
        employee4.put("position", "Programmer");
        employee4.put("SeparationDate", "");

        employee5.put("firstName", "Jacquelyn");
        employee5.put("lastName", "Jackson");
        employee5.put("position", "DBA");
        employee5.put("SeparationDate", "");

        employee6.put("firstName", "Sally");
        employee6.put("lastName", "Webber");
        employee6.put("position", "Web Developer");
        employee6.put("SeparationDate", "2015-12-18");

        listOfEmployees.add(employee1);
        listOfEmployees.add(employee2);
        listOfEmployees.add(employee3);
        listOfEmployees.add(employee4);
        listOfEmployees.add(employee5);
        listOfEmployees.add(employee6);

        //Collections.sort(listOfEmployees, (p1, p2) -> p1.get("lastName").compareTo(p2.get("lastName")));

        return listOfEmployees;


    }

    public static List<Map<String, String>> sortEmployeeFunction (List<Map<String, String>> unsortedEmployeeList){

        Collections.sort(unsortedEmployeeList, (p1, p2) -> p1.get("lastName").compareTo(p2.get("lastName")));

        return unsortedEmployeeList;
    }

    public static void printEmployees(List<Map<String, String>> sortedListOfEmployees) {

        System.out.printf("Name\t\t\t\t| Position\t\t\t  | Separation Date\n" +
                "--------------------|---------------------|----------------\n");



        for (int i = 0; i < 6; i++) {


            System.out.printf("%-20s| %-20.17s| %-100.30s \n",
                    (sortedListOfEmployees.get(i).get("firstName") + " " + sortedListOfEmployees.get(i).get("lastName")),
                    sortedListOfEmployees.get(i).get("position"), sortedListOfEmployees.get(i).get("SeparationDate"));


        }

    }

}

