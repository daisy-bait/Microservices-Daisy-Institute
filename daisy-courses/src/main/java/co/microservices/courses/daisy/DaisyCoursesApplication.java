package co.microservices.courses.daisy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DaisyCoursesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaisyCoursesApplication.class, args);
	}

}
