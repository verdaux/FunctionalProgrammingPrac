package com.exerciseFuncProgs;

public class Employee
{
    private Integer salary;
    private String name;
    private String department;

    public Employee(Integer salary, String name, String department)
    {
        this.salary = salary;
        this.name = name;
        this.department = department;
    }

    public Integer getSalary()
    {
        return salary;
    }

    public void setSalary(Integer salary)
    {
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }
}
