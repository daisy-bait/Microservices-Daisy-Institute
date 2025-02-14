package co.microservices.config.daisy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DaisyConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaisyConfigApplication.class, args);
	}

}
