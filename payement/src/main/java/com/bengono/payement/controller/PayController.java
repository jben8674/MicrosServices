package com.bengono.payement.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PayController {

    @GetMapping("/say")
    public String getMethodName() {
        return new String("HII I am from Payment MS ");
    }

    @GetMapping("/name")
    public String getName(){
        return "Hugues";
    }
}