package info.juliocnsouza.gcpstackdriverlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GcpStackdriverLoggingApplication {

    public static void main(final String[] args) {
        SpringApplication.run(GcpStackdriverLoggingApplication.class, args);
    }

}

@RestController
class Foo {

    private static final Logger logger = LoggerFactory.getLogger(Foo.class);

    @GetMapping("/foo")
    public String bar() {
        logger.info("Test log");
        logger.debug("debug log");
        logger.error("error log", new RuntimeException("exception thrown"));
        return "bar";
    }
}
