package com.lori.apollodemo.controller;

import com.lori.apollodemo.config.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private Person person;

    @GetMapping("/index")
    public String index(){
        return person.toString();
    }
}