package co.microservices.courses.daisy.http.response;

import co.microservices.courses.daisy.controller.dto.StudentDTO;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentsByCourseResponse {

    private String courseName;
    private String teacher;
    private List<StudentDTO> students;

}
