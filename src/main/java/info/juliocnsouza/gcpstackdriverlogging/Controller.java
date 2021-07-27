package info.juliocnsouza.gcpstackdriverlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/foo")
    public String bar() {
        logger.info("Test log");
        logger.debug("debug log");
        logger.error("error log", new RuntimeException("exception thrown"));
        return "bar";
    }
}
