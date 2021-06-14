package oop.assignment2.ex40.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sahar Sheikholelsami
 */
/*
xercise 40 - Filtering Records
Sorting records is helpful, but sometimes you need to filter down the results to find or display only what you’re looking for.

Given the following data set create a program that lets a user locate all records that match the search string by comparing the search string to the first or last name field.

First Name	Last Name	Position	Separation Date
John	Johnson	Manager	2016-12-31
Tou	Xiong	Software Engineer	2016-10-05
Michaela	Michaelson	District Manager	2015-12-19
Jake	Jacobson	Programmer
Jacquelyn	Jackson	DBA
Sally	Webber	Web Developer	2015-12-18


Example Output
Enter a search string: Jac

Results:

Name                | Position          | Separation Date
--------------------|-------------------|----------------
Jacquelyn Jackson   | DBA               |
Jake Jacobson       | Programmer        |
Constraint
Store the data using a list of maps.
Challenges
Make the search case insensitive.
Add the option to search by position.
Add the option to find all employees where their separation date is six months ago or more.
Read in the data from a file.

 */


import java.security.PublicKey;
import java.util.*;

public class Filtering_Records {

    public static void main(String[] args) {

        String[] employeeString = employeeStringMaker();
        List<Map<String, String>> listOfEmployees = employeeListMaker(employeeString);
        String[] searchResult=employeeSearchFunction(listOfEmployees, searchKeyAsker());
        printSearchedTable(searchResult, listOfEmployees);


    }

    public static String[] employeeStringMaker(){

        String employee1 = "John,Johnson,Manager,2016-12-31";
        String employee2 = "Tou,Xiong,Software Engineer,2016-10-05";
        String employee3 = "Michaela,Michaelson,District Manager,2015-12-19";
        String employee4 = "Jake,Jacobson,Programmer, ";
        String employee5 = "Jacquelyn,Jackson,DBA, ";
        String employee6 = "Sally,Webber,Web Developer,2015-12-18";

        String[] employeeString = {employee1,employee2,employee3,employee4,employee5,employee6};

        return employeeString;
    }
    public static List<Map<String, String >> employeeListMaker (String[] employee){

        List<Map<String, String>> listOfEmployees = new ArrayList<Map<String, String>>();

        for(int i=0; i< employee.length; i++) {
            String[] employeeStringArray = stringArrayMaker(employee[i]);
            listOfEmployees.add(employeeMapMaker(employeeStringArray));
        }
        //employee map maker

        return listOfEmployees;

    }

    public static String[] stringArrayMaker (String employee){


        String[] slicedString = employee.split(",");


        return slicedString;
    }

    public static Map<String , String > employeeMapMaker (String[] employeeStringArray){

        Map<String, String> employee = new HashMap<String, String>();
        int i=0;


        employee.put("firstName", employeeStringArray[i++]);
        employee.put("lastName", employeeStringArray[i++]);
        employee.put("position", employeeStringArray[i++]);
        employee.put("SeparationDate", employeeStringArray[i++]);


        return employee;
    }

    public static String searchKeyAsker(){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a search string: ");
        String searchKey = input.nextLine();

        return searchKey;
    }

    public static String[] employeeSearchFunction(List<Map<String , String>> employeeList, String searchKey){



        int i;
        String index ="";



        for (i=0; i<employeeList.size(); i++){

            if( (employeeList.get(i).get("firstName").contains(searchKey)) || (employeeList.get(i).get("lastName").contains(searchKey))) {
                index += i;

                index += ",";
            }



        }

        String[] slicedIndex = stringArrayMaker(index);



        return slicedIndex;

    }

    public static void printSearchedTable  (String[] searchResult, List<Map<String,String>> listOfEmployees){

        int [] index = new int [searchResult.length];
        for(int i=0; i<searchResult.length; i++) {
            index[i] = Integer.parseInt(searchResult[i]);
        }

        System.out.printf("Name\t\t\t\t| Position\t\t\t  | Separation Date\n" +
                "--------------------|---------------------|----------------\n");



        for (int i = searchResult.length-1 ; i >=0; i--) {


            System.out.printf("%-20s| %-20.17s| %-100.30s \n",
                    (listOfEmployees.get(index[i]).get("firstName") + " " + listOfEmployees.get(index[i]).get("lastName")),
                    listOfEmployees.get(index[i]).get("position"), listOfEmployees.get(index[i]).get("SeparationDate"));


        }

    }
}
