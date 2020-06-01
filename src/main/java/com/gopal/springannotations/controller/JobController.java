package com.gopal.springannotations.controller;

import com.gopal.springannotations.model.JobName;
import com.gopal.springannotations.model.Status;
import com.gopal.springannotations.service.StatusService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/job")
public class JobController {

    private StatusService statusService= new StatusService();

    @GetMapping(path = "/details/{name}")
    public JobName getDetails(@PathVariable("name") String taskName){

        JobName jobName = new JobName();
        jobName.setTaskName(taskName);
        return jobName;
    }

    @GetMapping(path = "/status/{code}")
    public Status getHttpStatus(@PathVariable("code") String httpCode){
        return statusService.getResponse(httpCode);
    }
}
