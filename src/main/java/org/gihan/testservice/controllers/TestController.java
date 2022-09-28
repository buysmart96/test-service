package org.gihan.testservice.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/buysmartdotcom-test-service")
public class TestController {

    @GetMapping("/hello")
    public String testFunction(){
        System.out.println("\nHi from test base path");
        return "Hi from test base path";
    }


}
