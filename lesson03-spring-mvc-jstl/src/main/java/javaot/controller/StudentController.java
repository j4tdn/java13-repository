package javaot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javaot.bean.Customer;
import javaot.bean.Student;

@Controller
@RequestMapping("student")
public class StudentController {

	@GetMapping("showForm")
	public String showStudentForm(Model model) {
		// data-binding
		// binding object from controller with form
		Student student = new Student();
		// student.setId("159357");
		// student.setFullName("qwertyuierty");
		model.addAttribute("student", student);
		return "student/student-form";
	}
	
	@PostMapping("processForm")
	public String processStudentForm(Model model, @ModelAttribute("student") Student student) {
		model.addAttribute("studentInfo", student);
		return "student/student";
	}
	
}
