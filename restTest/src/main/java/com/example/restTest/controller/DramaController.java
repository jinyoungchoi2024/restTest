package com.example.restTest.controller;

import com.example.restTest.model.Drama;
import com.example.restTest.model.DramaRepository;
import com.example.restTest.model.DramaRequestDto;
import com.example.restTest.service.DramaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class DramaController {
    //private final DramaService dramaService;
    //private final DramaRepository dramaRepository;

    @GetMapping
    public String test(){
        return "Hello World";
    }

    @GetMapping("/name")
    ResponseEntity<?> getHelloWorld(){
        return new ResponseEntity<>("Hello world by get method", HttpStatus.OK);
    }
    @PostMapping("/name")
    ResponseEntity<?> postHelloWorld(){
        return new ResponseEntity<>("Hello world by post method", HttpStatus.OK);
    }
    @PutMapping("/name")
    ResponseEntity<?> putHelloWorld(){
        return new ResponseEntity<>("Hello world by put method", HttpStatus.OK);
    }
    @DeleteMapping("/name")
    ResponseEntity<?> deleteHelloWorld(){
        return new ResponseEntity<>("Hello world by delete method", HttpStatus.OK);
    }


}
