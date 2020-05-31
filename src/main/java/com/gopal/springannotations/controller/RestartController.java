package com.gopal.springannotations.controller;

import com.gopal.springannotations.SpringAnnotationsApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestartController {

    @PostMapping("/restart")
    public void restart(){
        SpringAnnotationsApplication.restart();
    }
}
