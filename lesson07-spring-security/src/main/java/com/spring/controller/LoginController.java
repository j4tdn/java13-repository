package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.RequestContextHolder;


@Controller
public class LoginController {
    @GetMapping({"/login"})
    public String login() {
        System.out.println("JSESSIONID: " + RequestContextHolder.currentRequestAttributes().getSessionId());
        return "login";
    }

    @GetMapping({"/access-denied"})
    public String access_denied() {
        System.out.println("JSESSIONID: " + RequestContextHolder.currentRequestAttributes().getSessionId());
        return "access-denied";
    }
}
