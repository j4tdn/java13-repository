package javaot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {
//    @RequestMapping(path="hello", method= RequestMethod.GET)
    @GetMapping("hello")
    public String helloWorld(){
        return "name/name-form";
    }

//    @RequestMapping("process")
    @PostMapping("process")

    public String processHello(@RequestParam("fullName") String content, Model model){
        model.addAttribute("fullName", content);
        return "name/name";
    }
}
