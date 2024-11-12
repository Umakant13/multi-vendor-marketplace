package com.zosh.ai.controllers;

import com.zosh.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/ai")
public class AiHomeController {

    @GetMapping()
    public ResponseEntity<ApiResponse> AiHome(){
        ApiResponse response = new ApiResponse();
        response.setMessage("welcome to ai world");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
