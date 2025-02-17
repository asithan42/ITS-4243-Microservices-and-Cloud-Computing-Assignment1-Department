package com.example.department.controller;

import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
    @Autowired
    private DepartmentRepository repository;

    @PostMapping
    public Department saveDepartment(@RequestBody Department department) {
        return repository.save(department);
    }

    @GetMapping
    public List<Department> getDepartments() {
        return repository.findAll();
    }
}
