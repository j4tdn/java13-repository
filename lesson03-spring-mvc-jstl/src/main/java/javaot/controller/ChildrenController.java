package javaot.controller;

import javaot.bean.Child;
import javaot.common.MockData;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import java.util.List;

import static javaot.common.Application.CHILDREN_FORM_PAGE;
import static javaot.common.Application.CHILDREN_INDEX_PAGE;

@Controller

public class ChildrenController {
    @InitBinder
    public void preHandler(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }
    List<Child> children;

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct#init");
        children = MockData.getAllChildren();
    }

    @GetMapping("children")
    public String showIndexPage(Model model) {
        model.addAttribute("children", children);
        return CHILDREN_INDEX_PAGE;
    }

    @GetMapping("add-child-form")
    public String addChildrenForm(Model model) {
        model.addAttribute("child", new Child());
        return CHILDREN_FORM_PAGE;
    }

    @PostMapping("add-child")
    public String addChildren(@Valid @ModelAttribute("child") Child child,
                              BindingResult bindingResult,
                              Model model) {
        System.out.println("bindingResult: " + bindingResult);
        System.out.println("\n\n");
        if (bindingResult.hasErrors()){
            return CHILDREN_FORM_PAGE;
        }
        children.add(child);
        model.addAttribute("children", children);
        return "redirect:/children";
    }
}
