package org.example.Java8CodingPractice.hard;

import org.example.Java8CodingPractice.intermedium.dto.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostComonFirstLetter {
    public static void main(String[] args) {


        List<Employee> employees = List.of(
                new Employee(1,"John", "IT", 60000),
                new Employee(2,"Alice", "HR", 55000),
                new Employee(3,"Bob", "IT", 75000),
                new Employee(4,"Carol", "HR", 70000),
                new Employee(5,"David", "Finance", 65000),
                new Employee(6,"Eve", "IT", 80000),
                new Employee(7,"Frank", "Finance", 64000),
                new Employee(8,"Ala", "Operations", 44000)
        );

        Character key = employees.stream().map(e -> e.getName().charAt(0)).
                collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

        System.out.println(key);


    }
}
