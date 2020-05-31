package com.gopal.springannotations;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAnnotationsApplication {

    private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        context = SpringApplication.run(SpringAnnotationsApplication.class, args);
        context.getBean(ApplicationArguments.class);
    }

    public static void restart() {

        ApplicationArguments arguments = context.getBean(ApplicationArguments.class);

        Thread thread = new Thread(() -> {
            context.close();
            context = SpringApplication.run(SpringAnnotationsApplication.class, arguments.getSourceArgs());
        });

        thread.setDaemon(false);
        thread.start();
    }
}
