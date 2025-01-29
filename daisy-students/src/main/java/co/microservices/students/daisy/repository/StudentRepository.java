package co.microservices.students.daisy.repository;

import co.microservices.students.daisy.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    //@Query("select s from Student s where s.courseId = :courseId")
    List<Student> findByCourseId(Long courseId);

}
