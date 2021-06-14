package oop.assignment2.ex40.base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Filtering_RecordsTest {

    String employee1 = "Sarah,Smithson,Accountant,2020-12-01";
    String employee2 = "Tom,White,Civil Engineer,2019-11-12";
    String employee3 = "Smith,Adam,Floor Manager,2014-2-19";
    String employee4 = "Leah,Whitehead,Cashier, ";
    String employee5 = "Smith,Johns,HR, ";
    String employee6 = "Deborah,Ashley,Customer Service,2014-11-19";

    String[] employeeString = {employee1,employee2,employee3,employee4,employee5,employee6};

    @Test
    void employeeListMaker() {

        List<Map<String, String>> listOfEmployees = Filtering_Records.employeeListMaker(employeeString);
        String expected = "Adam";
        String actual = listOfEmployees.get(2).get("lastName");

        Assertions.assertTrue(actual.equals(expected));

    }

    @Test
    void stringArrayMaker() {

        String[] employeeStringArray = Filtering_Records.stringArrayMaker(employeeString[4]);
        String expected = "Johns";
        String actual = employeeStringArray[1];

        Assertions.assertTrue(actual.equals(expected));

    }

    @Test
    void employeeMapMaker() {
        String[] employeeStringArray = Filtering_Records.stringArrayMaker(employeeString[5]);
        Map<String, String> employee = Filtering_Records.employeeMapMaker(employeeStringArray);

        String expected = "Customer Service";
        String actual = employee.get("position");

        Assertions.assertTrue(actual.equals(expected));


    }

    @Test
    void employeeSearchFunction() {

        // checking to see if index 1 of the string array will match the function.  Here "mi" was repeated 3 times in in
        //index 0, 2 & 4 so searchResult = {"0", "2", "4"} so SearchResult [1] should == "2"
        List<Map<String, String>> listOfEmployees = Filtering_Records.employeeListMaker(employeeString);
        String[] searchResult=Filtering_Records.employeeSearchFunction(listOfEmployees, "mi");

        String expected = "2";
        String actual = searchResult[1];

        Assertions.assertTrue(actual.equals(expected));


    }


}