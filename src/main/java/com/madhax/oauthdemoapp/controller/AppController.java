package com.madhax.oauthdemoapp.controller;

import com.madhax.oauthdemoapp.constants.AppConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping(AppConstants.HEALTH_CHECK_URI)
    public ResponseEntity<String> healthCheck() {
        ResponseEntity<String> responseEntity =
                new ResponseEntity<>(
                        "Service is up!",
                        HttpStatus.OK
                );

        return responseEntity;
    }

}
