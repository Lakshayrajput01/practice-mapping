package com.example.Mapping.Practice.service;

import com.example.Mapping.Practice.model.Course;
import com.example.Mapping.Practice.repositories.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    ICourseRepo iCourseRepo;

    public String addCourse(Course course) {
        Course isAdded = iCourseRepo.save(course);

        if(isAdded != null){
            return "Added Course successfully..!!!";
        }
        return "failed to add..!!!";
    }

    public List<Course> getAllCourses() {
        return iCourseRepo.findAll();
    }

    public List<Course> getCoursesBasedOnTitle(String title) {
        return iCourseRepo.findByTitle(title);
    }

    public void removeCourseByDuration(String duration) {
        iCourseRepo.deleteByDuration(duration);
    }

    public String updateTitleBasedOnId(Long id, String title) {
        Course course = iCourseRepo.findById(id).get();

        if(course == null){
            return "This id is not Exist.";
        }
        course.setTitle(title);
        iCourseRepo.save(course);
        return "updated title for "+id;
    }
}
