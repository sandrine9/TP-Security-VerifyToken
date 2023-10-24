package com.bnpp.epita.spring.exposition;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {
    @GetMapping("/getHello")
    public String sayHello(){
        System.out.println("HELLO");
        return "Hello USER";
    }
    @GetMapping("/admin/getAdminHello")
    public String adminHello(){
        return "Hello ADMIN";
    }
}
