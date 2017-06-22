package ua.jug.springcloud.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public interface HystrixApplication {
	static void main(String... args) {
		SpringApplication.run(HystrixApplication.class, args);
	}
}
