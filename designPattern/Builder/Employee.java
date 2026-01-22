package org.example.designPattern.Builder;

import java.util.Locale;

public class Employee {
    private Integer emp_id;
    private String emp_name;
    private Double emp_salary;



    public Employee(EmpBuilder empBuilder )
    {
        this.emp_id=empBuilder.emp_id;
        this.emp_name=empBuilder.emp_name;
        this.emp_salary=empBuilder.emp_salary;


    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public Double getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(Double emp_salary) {
        this.emp_salary = emp_salary;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_salary=" + emp_salary +
                '}';
    }




    public static class EmpBuilder {

        private Integer emp_id;
        private String emp_name;
        private Double emp_salary;

        public EmpBuilder setEmp_id(Integer emp_id)
        {
            this.emp_id=emp_id;
            return this;
        }
        public EmpBuilder setEmp_Name(String emp_name)
        {
            this.emp_name=emp_name;
            return this;
        }
        public EmpBuilder setEmp_Salary(Double emp_salary)
        {
            this.emp_salary=emp_salary;
            return this;
        }
        public Employee build()
        {
           return new Employee(this);
        }
    }
}
