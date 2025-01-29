package co.microservices.students.daisy.service.interfaces;

import co.microservices.students.daisy.entity.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();

    Student findById(Long id);

    Student save(Student student);

    Student delete(Long id);

    List<Student> findByCourseId(Long courseId);

}
