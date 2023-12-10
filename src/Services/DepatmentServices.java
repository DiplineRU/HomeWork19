package org.example.Services;

import org.example.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeService {
    private final Map<String, Employee> employeesList = new TreeMap<>();

    public List<Object> add(String firstName, String lastName, int departmentId, float salary) {
        Employee employee = new Employee(firstName,lastName,departmentId,salary);
        List<Object> employees = new ArrayList<>();
        employeesList.put(employee.toKey(), employee);
        employeesList.forEach((key,value) ->
                employees.add(value)
        );
        return employees;
    }
    public Employee remove(String firstName, String lastName) {
        Employee employee = new Employee(firstName,lastName);
        Employee removedEmployee = employeesList.get(employee.toKey());
        employeesList.remove(employee.toKey());
        return removedEmployee;
    }
    public Employee find(String firstName, String lastName) {
        Employee employee = new Employee(firstName,lastName);
        return employeesList.get(employee.toKey());
    }
    public Map<String,Employee> getEmployees(){
        return this.employeesList;
    }
}