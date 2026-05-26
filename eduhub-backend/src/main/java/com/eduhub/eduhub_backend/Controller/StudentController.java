package com.eduhub.eduhub_backend.Controller;
import com.eduhub.eduhub_backend.component.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class StudentController {
    @GetMapping("Student")
    public ResponseEntity<Student> getStudent() {
        Student student=new Student(1,"Manikandan","S");
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
    @GetMapping("Students")
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> studentList=new ArrayList<>();
         studentList.add(new Student(1,"Manikandan","S"));
        studentList.add(new Student(2,"Rathish","AR"));
        studentList.add(new Student(3,"Elango","S"));
        studentList.add(new Student(4,"Ram","P"));
        return new ResponseEntity<>(studentList,HttpStatus.OK);

    }
    @GetMapping("{id}/{first-name}/{last-name}")
    public  ResponseEntity<Student> studentPathVariable(@PathVariable("id") int studentid, @PathVariable String firstName, @PathVariable String lastName){}
}
