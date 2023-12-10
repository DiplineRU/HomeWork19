package org.example.RestControllers;

import org.example.Services.DepartmentsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class Departments {
    private final DepartmentsService departmentsService;
    public Departments(DepartmentsService departmentsService) {
        this.departmentsService = departmentsService;
    }
    @GetMapping("/max-salary")
    public List maxSalary(@RequestParam(name = "departmentId") int departmentId) {
        return departmentsService.maxSalary(departmentId);
    }
    @GetMapping("/min-salary")
    public List minSalary(@RequestParam(name = "departmentId") int departmentId) {
        return departmentsService.minSalary(departmentId);
    }
    @GetMapping(value = "/all", params = {"departmentId"})
    public List<Object> all(@RequestParam(name = "departmentId") int departmentId) {
        return departmentsService.allForDepartments(departmentId);
    }
    @GetMapping(value = "/all")
    public List<Object> all() {
        return departmentsService.all();
    }
}