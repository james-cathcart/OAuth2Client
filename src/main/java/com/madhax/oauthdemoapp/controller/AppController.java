package com.madhax.oauthdemoapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    public ResponseEntity<String> healthCheck() {
        ResponseEntity<String> responseEntity =
                new ResponseEntity<>(
                        "Service is up!",
                        HttpStatus.OK
                );

        return responseEntity;
    }

}
