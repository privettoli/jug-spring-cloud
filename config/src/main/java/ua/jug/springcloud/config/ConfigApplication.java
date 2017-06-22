package ua.jug.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public interface ConfigApplication {
	static void main(String... args) {
		SpringApplication.run(ConfigApplication.class, args);
	}
}
