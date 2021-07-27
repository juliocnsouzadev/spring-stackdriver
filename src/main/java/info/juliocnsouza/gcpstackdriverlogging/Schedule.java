package info.juliocnsouza.gcpstackdriverlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {

    private static final Logger logger = LoggerFactory.getLogger(Schedule.class);

    @Scheduled(fixedRate = 10000)
    public void log() {
        logger.info("info log");
        logger.debug("debug log");
        logger.error("error log", new RuntimeException("exception thrown"));
    }
}
