package co.microservices.students.daisy.service;

import co.microservices.students.daisy.entity.Student;
import co.microservices.students.daisy.repository.StudentRepository;
import co.microservices.students.daisy.service.interfaces.IStudentService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository studentRepo;

    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepo.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Student save(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student delete(Long id) {

        Student studentToDelete = studentRepo.findById(id)
                .orElseThrow(EntityNotFoundException::new);
        studentRepo.delete(studentToDelete);

        return studentToDelete;
    }

    @Override
    public List<Student> findByCourseId(Long courseId) {
        return studentRepo.findByCourseId(courseId);
    }
}
