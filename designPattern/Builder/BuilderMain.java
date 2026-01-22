package org.example.designPattern.Builder;

public class BuilderMain {

    public static void main(String[] args) {

        Employee employee = new Employee.EmpBuilder().
                setEmp_id(12).
                setEmp_Name("vivek")

                .build();

        System.out.println(employee);
    }
}
