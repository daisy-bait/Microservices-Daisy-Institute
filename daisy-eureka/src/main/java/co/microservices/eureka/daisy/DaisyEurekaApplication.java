package co.microservices.eureka.daisy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DaisyEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaisyEurekaApplication.class, args);
	}

}
