package ua.jug.springcloud.zuul;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient("web")
public interface NodeIdentityClient {
    @RequestMapping(value = "uniqueValue", method = GET)
    String uniqueValue();
}
