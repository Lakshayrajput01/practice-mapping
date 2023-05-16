package com.example.Mapping.Practice.controller;

import com.example.Mapping.Practice.model.Student;
import com.example.Mapping.Practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/")
    public String addStudentDetails(@RequestBody Student Mystudent){
        return studentService.studentDetails(Mystudent);
    }

    @GetMapping("/all")
    public List<Student> getAllStudent(){
        return studentService.allStudents();
    }

    @DeleteMapping("/Id/{id}")
    public void deleteById(@PathVariable Long id ){
        studentService.deleteById(id);
    }

    @PutMapping("/byPhoneNo/{phoneNumber}/updateDepartment/{department}")
    public String updateDepartmentBasedOnPhoneNo(@PathVariable String phoneNumber ,@PathVariable String department){
       return studentService.updateDepartmentBasedOnPhoneNo(phoneNumber,department);
    }

}
