package org.example.Java8CodingPractice.intermedium;

import org.example.Java8CodingPractice.intermedium.dto.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfEmployeeBySalary {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"John", "HR", 50000),
                new Employee(2,"Jane", "IT", 70000),
                new Employee(3,"Mike", "IT", 80000),
                new Employee(4,"Sara", "Finance", 60000),
                new Employee(5,"Paul", "HR", 55000)
        );


        System.out.println("List of Employee in sorted in Ascending order");
        List<Employee> sortedEmployees = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println("List of Employee in sorted in Ascending order");
        System.out.println(sortedEmployees);
        List<Employee> sortedEmployeesDesc = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println("List of Employee in sorted in descending order");
        System.out.println(sortedEmployeesDesc);



    }
}
