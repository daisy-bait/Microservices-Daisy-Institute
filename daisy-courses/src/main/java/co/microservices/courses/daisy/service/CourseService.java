package co.microservices.courses.daisy.service;

import co.microservices.courses.daisy.client.StudentClient;
import co.microservices.courses.daisy.controller.dto.StudentDTO;
import co.microservices.courses.daisy.entity.Course;
import co.microservices.courses.daisy.http.response.StudentsByCourseResponse;
import co.microservices.courses.daisy.repository.CourseRepository;
import co.microservices.courses.daisy.service.interfaces.ICourseService;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements ICourseService {

    @Autowired
    private CourseRepository courseRepo;

    @Autowired
    private StudentClient studentClient;

    @Override
    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepo.findById(id)
                .orElseThrow(EntityExistsException::new);
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public Course deleteCourseById(Long id) {

        Course courseToDelete = getCourseById(id);
        courseRepo.delete(courseToDelete);

        return courseToDelete;
    }

    @Override
    public StudentsByCourseResponse getStudentsByCourse(Long courseId) {

        Course course = getCourseById(courseId);
        List<StudentDTO> students = studentClient.findAllStudentsByCourseId(courseId);

        return StudentsByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .students(students)
                .build();
    }

}
