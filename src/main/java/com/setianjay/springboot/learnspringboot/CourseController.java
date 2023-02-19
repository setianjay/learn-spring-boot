package com.setianjay.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping(value = {"/courses"})
    public List<Course> retrieveCourses() {
        return Arrays.asList(
                new Course(1, "Learn Kotlin", "Hari Setiaji"),
                new Course(2, "Learn Java", "Hari Setiaji"),
                new Course(3, "Learn Android", "Hari Setiaji"),
                new Course(4, "Learn Spring", "Hari Setiaji")
        );
    }
}
