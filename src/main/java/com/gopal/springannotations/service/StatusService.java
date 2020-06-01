package com.gopal.springannotations.service;

import com.gopal.springannotations.command.StatusCommand;
import com.gopal.springannotations.model.Status;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StatusService {

    StatusCommand statusCommand = new StatusCommand(new RestTemplate());


    public Status getResponse(String statusCode){
        String url = new StringBuilder("https://httpstat.us/").append(statusCode).toString();
        return statusCommand.execute(url);

    }

}
