package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.loginModel;
import com.example.demo.Models.response;
import com.example.demo.Service.EmailServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class demoController {
    @Autowired
    private EmailServiceImpl emailServiceImpl;

    @GetMapping("/")
    public String hello() {
        return "Hello world";
    }

    @PostMapping("/login")
    public response postMethodName(@RequestBody loginModel model) {
        return new response(200, "Logged in successfully", null);
    }

    @GetMapping("/sendDummyMail")
    public String sendDummyMail() {
        try {
            emailServiceImpl.sendEmail();
            return "Mail sent successfully";
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
        return "Sent mail successfully";
    }
    
    

    @GetMapping("/about")
    public String about() {
        return "Welcome to about page";
    }
    
}
