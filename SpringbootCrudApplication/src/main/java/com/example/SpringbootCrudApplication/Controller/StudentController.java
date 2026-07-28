package com.example.SpringbootCrudApplication.Controller;

import com.example.SpringbootCrudApplication.Entity.Student;
import com.example.SpringbootCrudApplication.Service.StudentService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // create student
    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student addStudent = studentService.addNewStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(addStudent);
    }

    // Find all student
    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student> student = studentService.getAllStudents();

        if(student == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(student);
    }

    // Find by ID
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        Student student = studentService.getStudentById(id);

        if(student == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(student);
    }

    // Update by ID
    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student){
        Student students = studentService.updateStudent(id, student);

        if(students == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(students);
    }

    // Delete by ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudentById(@PathVariable Long id){
        boolean isDeleted = studentService.deleteStudentById(id);

        if(!isDeleted){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok("Student record deleted successfully");
    }

}
