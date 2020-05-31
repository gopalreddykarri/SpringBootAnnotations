package com.gopal.springannotations.scheduler;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;

@Configuration
@EnableScheduling
public class TaskConfig {

    private static int i = 0;

    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    @Scheduled(fixedRate = 60000)
    private void doTask(){
        System.out.println("Executed "+ ++i +" Time now : " + formatter.format(System.currentTimeMillis()));
    }
}
