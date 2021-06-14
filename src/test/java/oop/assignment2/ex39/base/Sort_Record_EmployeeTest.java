package oop.assignment2.ex39.base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Sort_Record_EmployeeTest {

    @Test
    void sortEmployeeFunction_Test() {

        List<Map<String, String>> listOfEmployees = new ArrayList<Map<String, String>>();

        Map<String, String> employee1 = new HashMap<String, String>();
        Map<String, String> employee2 = new HashMap<String, String>();
        Map<String, String> employee3 = new HashMap<String, String>();


        employee1.put("firstName", "Sarah");
        employee1.put("lastName", "Smith");
        employee1.put("position", "Accountant");
        employee1.put("SeparationDate", "2020-12-01");

        employee2.put("firstName", "Tom");
        employee2.put("lastName", "White");
        employee2.put("position", "Civil Engineer");
        employee2.put("SeparationDate", "2017-10-15");

        employee3.put("firstName", "Maria");
        employee3.put("lastName", "Cattan");
        employee3.put("position", "Regional Director");
        employee3.put("SeparationDate", "2014-11-10");


        listOfEmployees.add(employee1);
        listOfEmployees.add(employee2);
        listOfEmployees.add(employee3);

        List<Map<String, String>> sortedEmployeeList = Sort_Record_Employee.sortEmployeeFunction(listOfEmployees);
        String expected = "Cattan";
        String actual = sortedEmployeeList.get(0).get("lastName");


        Assertions.assertTrue(expected.equals(actual));

    }
}