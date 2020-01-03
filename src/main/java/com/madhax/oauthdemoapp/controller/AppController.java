package com.madhax.oauthdemoapp.controller;

import com.madhax.oauthdemoapp.constants.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    private final Logger log = LoggerFactory.getLogger(AppController.class);

    @GetMapping(AppConstants.HEALTH_CHECK_URI)
    public ResponseEntity<String> healthCheck() {

        log.debug("{} endpoint called.", AppConstants.HEALTH_CHECK_URI);
        ResponseEntity<String> responseEntity =
                new ResponseEntity<>(
                        "Service is up!",
                        HttpStatus.OK
                );

        return responseEntity;
    }

    @GetMapping(AppConstants.USER_CHECK_URI)
    public ResponseEntity<String> userCheck() {

        log.debug("{} endpoint called.", AppConstants.USER_CHECK_URI);
        ResponseEntity<String> responseEntity =
                new ResponseEntity<>(
                        "User check endpoint accessed!",
                        HttpStatus.OK
                );

        return responseEntity;
    }

    @GetMapping(AppConstants.ADMIN_CHECK_URI)
    public ResponseEntity<String> adminCheck() {

        log.debug("{} endpoint called.", AppConstants.ADMIN_CHECK_URI);
        ResponseEntity<String> responseEntity =
                new ResponseEntity<>(
                        "Admin check endpoint accessed!",
                        HttpStatus.OK
                );

        return responseEntity;
    }

}
