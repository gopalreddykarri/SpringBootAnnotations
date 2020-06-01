package com.gopal.springannotations.command;

import com.gopal.springannotations.model.Status;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Component
public class StatusCommand {

   private RestTemplate restTemplate;

    public StatusCommand(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Status execute(String url){

        ResponseEntity<String> exchange = restTemplate.exchange(URI.create(url), HttpMethod.GET, HttpEntity.EMPTY, String.class);
        Status status = new Status();
        status.setStatusCode(exchange.getStatusCode().toString());
        status.setResponse(exchange.getBody());
        return status;
    }
}
