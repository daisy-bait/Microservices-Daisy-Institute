package co.microservices.courses.daisy.service.interfaces;

import co.microservices.courses.daisy.entity.Course;

import java.util.List;

public interface ICourseService {

    List<Course> getAllCourses();

    Course getCourseById(Long id);

    Course addCourse(Course course);

    Course deleteCourseById(Long id);

}
