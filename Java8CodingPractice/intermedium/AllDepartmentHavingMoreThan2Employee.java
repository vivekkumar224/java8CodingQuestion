package org.example.Java8CodingPractice.intermedium;

import org.example.Java8CodingPractice.intermedium.dto.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AllDepartmentHavingMoreThan2Employee {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"John", "HR", 50000),
                new Employee(2,"Jane", "IT", 70000),
                new Employee(3,"Mike", "IT", 80000),
                new Employee(4,"Sara", "Finance", 60000),
                new Employee(5,"Paul", "HR", 55000),
                new Employee(5,"vivek", "IT", 58000),
                new Employee(5,"Khushi", "HR", 57000)


        );

        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(collect);

        List<String> collect1 = collect.entrySet().stream().filter(e -> e.getValue() > 2).map(e1 -> e1.getKey()).collect(Collectors.toList());
        System.out.println(collect1);

    }
}
