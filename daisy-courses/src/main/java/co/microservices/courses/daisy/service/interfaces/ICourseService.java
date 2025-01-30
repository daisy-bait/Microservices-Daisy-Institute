package co.microservices.courses.daisy.service.interfaces;

import co.microservices.courses.daisy.entity.Course;
import co.microservices.courses.daisy.http.response.StudentsByCourseResponse;

import java.util.List;

public interface ICourseService {

    List<Course> getAllCourses();

    Course getCourseById(Long id);

    Course addCourse(Course course);

    Course deleteCourseById(Long id);

    StudentsByCourseResponse getStudentsByCourse(Long courseId);

}
