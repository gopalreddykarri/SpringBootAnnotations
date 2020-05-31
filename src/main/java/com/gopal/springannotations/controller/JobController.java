package com.gopal.springannotations.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/job")
public class JobController {

    @GetMapping(path = "/details/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getDetails(@PathVariable("name") String taskName){

        return "Job Details :" + taskName;
    }
}
