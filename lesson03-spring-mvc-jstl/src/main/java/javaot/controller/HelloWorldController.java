package javaot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("helloworld")
public class HelloWorldController {
	
	// --> endpoint(servlet) url=helloworld/showForm
	//                       method=get(url params)/post(request body)
	// @RequestMapping(path = "showForm", method = RequestMethod.GET)
	@GetMapping("showForm")
	public String showHelloWorldForm() {
		return "helloworld/helloworld-form";
	}
	
	// @RequestMapping(path = "processForm", method = RequestMethod.POST)
	@PostMapping("processForm")
	public String processForm(@RequestParam("fullname") String content, Model model) {
		model.addAttribute("studentName", content.toLowerCase() + "!!!");
		return "helloworld/helloworld";
	}
	
}
