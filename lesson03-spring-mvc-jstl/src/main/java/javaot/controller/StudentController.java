package javaot.controller;

import javaot.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController
{
//    @RequestMapping("student-process")
//    public String studentProcess(@RequestParam Integer id,
//                                 @RequestParam String fullName,
//                                 @RequestParam Integer age,
//                                 Model model){
//        Student student = new Student(id, fullName, age);
//        model.addAttribute("student", student);
//        return "student/student";
//    }
    @RequestMapping("student-process")
    public String studentProcess(Model model, @ModelAttribute("student") Student student){
        model.addAttribute("student", student);
        return "student/student";
    }

    @RequestMapping("student")
    public String studentForm(Model model){
        Student student = new Student();
        student.setAge(10);
        model.addAttribute("student", student);
        model.addAttribute("countries", new String[]{"VietNam", "America", "France", "China", "Indonesia"});
        return "student/student-form";
    }
}
