package ua.jug.springcloud.zuul;

import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static lombok.AccessLevel.PRIVATE;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class RibbonController {
    NodeIdentityClient client;

    @Autowired
    public RibbonController(NodeIdentityClient client) {
        this.client = client;
    }

    @GetMapping(value = "uniqueWebValue", produces = APPLICATION_JSON_UTF8_VALUE)
    public String uniqueWebValue() {
        return client.uniqueValue();
    }
}
