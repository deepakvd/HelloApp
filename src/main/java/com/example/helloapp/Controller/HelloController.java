package com.example.helloapp.Controller;

import com.example.helloapp.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController
{
    private final HelloService helloService;

    // Dependency Injection: Spring automatically injects HelloService
    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    // GET API - Fetch the stored message
    @GetMapping
    public String getMessage() {
        return helloService.getMessage();
    }

    // POST API - Set a new message
    @PostMapping
    public void setMessage(@RequestBody String message) {
        helloService.setMessage(message);
    }
}
