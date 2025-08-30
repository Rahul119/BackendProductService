package com.scaler.backendproductservice.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;


@ControllerAdvice
public class ExceptionAdvices {

    public ResponseEntity<String> rahul(Exception exception) {
        return new ResponseEntity<>("Code Phat Gaya", HttpStatus.OK);
    }
}
