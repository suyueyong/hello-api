package com.example.helloapi.service;

import com.example.helloapi.controller.HelloResponse;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public HelloResponse getHelloMessage() {
        return new HelloResponse("Hello");
    }
}
