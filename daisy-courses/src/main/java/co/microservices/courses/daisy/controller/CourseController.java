package co.microservices.courses.daisy.controller;

import co.microservices.courses.daisy.entity.Course;
import co.microservices.courses.daisy.service.CourseService;
import co.microservices.courses.daisy.service.interfaces.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    ICourseService courseService;

    @GetMapping("/find")
    ResponseEntity<List<Course>> getAllCourses() {
        return ResponseEntity.ok(courseService.getAllCourses());
    }

    @GetMapping("/find/{id}")
    ResponseEntity<Course> getCourseById(@PathVariable Long id) {
        return ResponseEntity.ok(courseService.getCourseById(id));
    }

    @PostMapping("/save")
    ResponseEntity<Course> saveCourse(@RequestBody Course course) {
        return ResponseEntity.status(HttpStatus.CREATED).body(courseService.addCourse(course));
    }

    @DeleteMapping("/disable/{id}")
    ResponseEntity<Course> disableCourse(@PathVariable Long id) {
        return ResponseEntity.ok(courseService.deleteCourseById(id));
    }

}
