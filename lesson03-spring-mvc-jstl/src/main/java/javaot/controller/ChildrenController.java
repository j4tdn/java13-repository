package javaot.controller;

import javaot.bean.Children;
import javaot.common.MockupData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static javaot.common.Application.*;

@Controller

public class ChildrenController {
    List<Children> children;
    @GetMapping("children")
    public String showIndexPage(Model model){
        children = MockupData.getAllChildren();
        model.addAttribute("children", children);
        return CHILDREN_INDEX_PAGE;
    }
    @GetMapping("add-children-form")
    public String addChildrenForm(Model model){
        model.addAttribute("children", new Children());
        return CHILDREN_FORM_PAGE;
    }

    @PostMapping("add-children")
    public String addChildren(@ModelAttribute("children") Children children, Model model){
        System.out.println("children" + children);
        return CHILDREN_INFO_PAGE;
    }
}
