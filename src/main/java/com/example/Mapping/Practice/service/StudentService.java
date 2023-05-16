package com.example.Mapping.Practice.service;

import com.example.Mapping.Practice.model.Student;
import com.example.Mapping.Practice.repositories.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public String studentDetails(Student mystudent) {
        Student IsAdded = studentRepo.save(mystudent);

        if(IsAdded!=null){
            return"Added Successfully";
        }
        return "failed...!";
    }


    public List<Student> allStudents() {
        return studentRepo.findAll();
    }

    public void deleteById(Long id) {
        studentRepo.deleteById(id);
    }

    public String  updateDepartmentBasedOnPhoneNo(String phoneNumber, String department) {
        Student isExist = studentRepo.findByPhoneNumber(phoneNumber);
        if (isExist == null) {
            return "PhoneNumber Not Exist";
        }
        isExist.setDepartment(department);
        studentRepo.save(isExist);
        return"Updated Successfully";
    }
}
