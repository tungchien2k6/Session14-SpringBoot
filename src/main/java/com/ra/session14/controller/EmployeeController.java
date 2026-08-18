package com.ra.session14.controller;

import com.ra.session14.model.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @GetMapping
    public List<Employee> getEmployees() {
        return List.of(
                Employee.builder().id(1L).fullName("Nguyễn Công Hưởng").salary(5000.0).build(),
                Employee.builder().id(2L).fullName("Phạm Tuấn Bình").salary(5000.0).build(),
                Employee.builder().id(3L).fullName("Nguyễn Văn A").salary(3000.0).build()
        );
    }
}
