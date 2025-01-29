package co.microservices.students.daisy.controller;

import co.microservices.students.daisy.entity.Student;
import co.microservices.students.daisy.service.interfaces.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    IStudentService studentService;

    @GetMapping("/find")
    ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(studentService.findAll());
    }

    @GetMapping("/find/{id}")
    ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.findById(id));
    }

    @PostMapping("/save")
    ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.save(student));
    }

    @DeleteMapping("/disable/{id}")
    ResponseEntity<Student> disableStudent(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.delete(id));
    }

    @GetMapping("/find-by-course/{courseId}")
    ResponseEntity<List<Student>> getStudentsByCourse(@PathVariable Long courseId) {
        return ResponseEntity.ok(studentService.findByCourseId(courseId));
    }

}
