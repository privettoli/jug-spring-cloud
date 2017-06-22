package ua.jug.springcloud.web;


import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static lombok.AccessLevel.PRIVATE;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RefreshScope
@RestController
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class StoryTellerController {
    Story story;

    @Autowired
    public StoryTellerController(@Value("${story.author}") String author,
                                 @Value("${story.content}") String content) {
        this.story = new Story(author, content);
    }

    @GetMapping(value = "story", produces = APPLICATION_JSON_UTF8_VALUE)
    public Story story() {
        return story;
    }
}
