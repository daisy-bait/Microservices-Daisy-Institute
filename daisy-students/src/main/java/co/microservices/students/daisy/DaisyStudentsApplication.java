package co.microservices.students.daisy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DaisyStudentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaisyStudentsApplication.class, args);
	}

}
