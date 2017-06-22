package ua.jug.springcloud.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public interface WebApplication {
	static void main(String... args) {
		SpringApplication.run(WebApplication.class, args);
	}
}
