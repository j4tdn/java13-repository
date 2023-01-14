package javaot.controller;

import javaot.bean.Student;
import javaot.common.MockData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import static javaot.common.Application.STUDENT_FORM_PAGE;
import static javaot.common.Application.STUDENT_INFO_PAGE;

@Controller
public class StudentController {
    @RequestMapping("student-process")
    public String studentProcess(Model model, @ModelAttribute("student") Student student) {
        model.addAttribute("student", student);
        return STUDENT_INFO_PAGE;
    }

    @RequestMapping("student")
    public String studentForm(Model model) {
        Student student = new Student();
        student.setAge(10);
        model.addAttribute("student", student);
        model.addAttribute("countries", MockData.getAllCountries());
        model.addAttribute("operatingSystems", MockData.getAllOperatingSystems());
        model.addAttribute("favoriteLanguages", MockData.getAllFavoriteLanguages());
        return STUDENT_FORM_PAGE;
    }
}
