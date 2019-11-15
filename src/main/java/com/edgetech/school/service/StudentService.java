package com.edgetech.school.service;
import org.springframework.stereotype.Component;

import com.edgetech.school.model.Course;
import com.edgetech.school.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class StudentService {
    private static List<Student> students = new ArrayList<>();

    static {
        Course course1 = new Course(1, "Java", "Java with Spring Boot",
                Arrays.asList("Learn Java Language", "Learn Collections", "JDBC", "Learn Spring Boot"));
        Course course2 = new Course(2, "C#", ".NET ASP MVC",
                Arrays.asList("Learn C#", "Learn ASP MVC", "Entity Framework", "LINQ"));

        Student freeda = new Student(1, "Freeda Steadham", "Always on Time Freeda",
                Arrays.asList(course1, course2));

        students.add(freeda);
    }
}
