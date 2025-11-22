package com.uday.DoctorApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @GetMapping("/test")
    public String testGitActions(){
        return "i am working";
    }
}
