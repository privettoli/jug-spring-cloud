package ua.jug.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableFeignClients
@SpringBootApplication
public interface ZuulApplication {
	static void main(String... args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
}
