package ua.jug.springcloud.zuul;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class NodeIdentityClientFallbackFactory implements FallbackFactory<NodeIdentityClient> {
    @Override
    public NodeIdentityClient create(Throwable cause) {
        return () -> "No WEB instances can answer about their uniqueness. " + cause.getMessage();
    }
}





