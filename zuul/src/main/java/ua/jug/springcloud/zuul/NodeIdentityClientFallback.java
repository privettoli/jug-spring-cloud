package ua.jug.springcloud.zuul;

import org.springframework.stereotype.Component;

@Component
public class NodeIdentityClientFallback implements NodeIdentityClient {
    @Override
    public String uniqueValue() {
        return "No WEB service instances are up at the moment";
    }
}




