package ua.jug.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public interface EurekaApplication {
	static void main(String... args) {
		SpringApplication.run(EurekaApplication.class, args);
	}
}
