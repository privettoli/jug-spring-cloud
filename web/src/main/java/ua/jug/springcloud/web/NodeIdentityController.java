package ua.jug.springcloud.web;

import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static lombok.AccessLevel.PRIVATE;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class NodeIdentityController {
    String uniqueValue;

    @Autowired
    public NodeIdentityController(@Value("${random.value}") String uniqueValue) {
        this.uniqueValue = uniqueValue;
    }

    @GetMapping(value = "uniqueValue", produces = APPLICATION_JSON_UTF8_VALUE)
    public String uniqueValue() {
        return uniqueValue;
    }
}
