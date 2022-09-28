package org.gihan.testservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllerTwo {
    @GetMapping("/hello")
    public String testFunc(){
        System.out.println("\nHello from non-base path");
        return "Hello from non-base path";
    }
}
