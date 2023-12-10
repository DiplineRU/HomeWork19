package org.example;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private final String lastName;
    private final String firstName;
    private final int departmentId;
    private final double salary;
    public Employee(String lastName, String firstName, int departmentId, float salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentId = departmentId;
        this.salary = salary;
    }
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        salary = 0;
        departmentId = 0;
    }
    public int getDepartment(){
        return this.departmentId;
    }
    // 3 реализация
    public double getSalary(){
        return this.salary;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String toKey() {
        return firstName + lastName;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(this.firstName+this.lastName);
    }
    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Employee c2 = (Employee) other;
        return this.firstName.equals(c2.firstName) && this.lastName.equals(c2.lastName);
    }
}