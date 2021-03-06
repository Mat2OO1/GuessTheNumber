package academy.learnprogramming.console;

import academy.learnprogramming.config.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static final Logger log = LoggerFactory.getLogger((Main.class));

    public static void main(String[] args) {
        log.info("Guess the number game ");

        //create context (container)
        ConfigurableApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        //close context
        context.close();

    }
}