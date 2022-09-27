package org.gihan.testservice.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello/{name}")
    public String testFunction(@PathVariable String name){
        System.out.println("HI "+ name);
        return "Hi " + name;
    }


}
