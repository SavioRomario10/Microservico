package com.savioromario.produtos_api.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api")
public class StatusController {

  @GetMapping("/status")
  public ResponseEntity<HashMap<String, Object>>getApiStatus(){
    
    var response = new HashMap<String, Object>();

    response.put("service", "produtos-api");
    response.put("status", "up");
    response.put("httpStatus", HttpStatus.OK.value());
    
    return ResponseEntity.ok(response);
  }
  
}