package co.microservices.courses.daisy.client;

import co.microservices.courses.daisy.controller.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "daisy-students", url = "http://localhost:8080/api/student")
public interface StudentClient {

    @GetMapping("/find-by-course/{courseId}")
    List<StudentDTO> findAllStudentsByCourseId(@PathVariable Long courseId);

}
