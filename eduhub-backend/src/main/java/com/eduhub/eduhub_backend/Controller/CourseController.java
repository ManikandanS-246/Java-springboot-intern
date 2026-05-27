package com.eduhub.eduhub_backend.Controller;

import com.eduhub.eduhub_backend.Component.Course;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {

    @GetMapping
    public Course getCourse() {

        Course course = new Course();

        course.setCourseCode("CS101");
        course.setCourseName("Java Programming");
        course.setCredits(4);

        return course;
    }

    @PostMapping("/create")
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {

        System.out.println(course.getCourseCode());
        System.out.println(course.getCourseName());
        System.out.println(course.getCredits());

        return ResponseEntity.ok(course);
    }

    @PutMapping("/{code}/update")
    public ResponseEntity updateCourse(
            @PathVariable("code") String courseCode,
            @RequestBody Course course) {

        System.out.println(courseCode);
        System.out.println(course.getCourseName());
        System.out.println(course.getCredits());

        return ResponseEntity.accepted().body("Course Updated Successfully");
    }
}