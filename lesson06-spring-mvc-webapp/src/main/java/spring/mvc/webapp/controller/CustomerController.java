package spring.mvc.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring.mvc.webapp.entity.Customer;
import spring.mvc.webapp.services.CustomerService;

import javax.validation.Valid;
import java.util.List;

import static common.Application.*;
import static common.Message.*;
import static spring.mvc.webapp.utils.CustomerUtils.*;

@Controller
@RequestMapping("customer")
public class CustomerController {
    List<Customer> customerList;
    @Autowired
    private CustomerService customerService;

    public static void addAttributes(Model model, String direction, String property, Integer pageNum, Integer totalPage, List<Customer> customerList, String keyword) {
        model.addAttribute("direction", direction);
        model.addAttribute("property", property);
        model.addAttribute("currentPage", pageNum);
        model.addAttribute("totalPage", totalPage);
        model.addAttribute("customers", customerList);
        model.addAttribute("keyword", keyword);

    }

    @GetMapping
    public String index(Model model, @RequestParam(required = false, name = "keyword") String keyword) {
        if (keyword == null) {
            keyword = defaultKeyword;
        }
        Integer totalCustomers = customerService.getTotalCustomers(keyword);
        System.out.println("totalCustomers: " + totalCustomers);
        customerList = customerService.findAllCustomers(defaultPage, defaultPro, defaultDir, keyword);
        addAttributes(model, defaultDir, defaultPro, defaultPage, getTotalPage(totalCustomers), customerList, keyword);
        return CUSTOMER_INDEX_PAGE;
    }

    @GetMapping("/page/{pageNum}")
    public String pagination(Model model, @PathVariable String pageNum, @RequestParam("direction") String direction, @RequestParam("property") String property, @RequestParam(required = false, name = "keyword") String keyword) {
        Integer pageNumAsInt = Integer.parseInt(pageNum);
        customerList = customerService.findAllCustomers(pageNumAsInt, property, direction, keyword);
        Integer totalCustomers = customerService.getTotalCustomers(keyword);
        Integer totalPage = getTotalPage(totalCustomers);
        pageNumAsInt = pageNumAsInt > totalPage ? totalPage : pageNumAsInt;
        addAttributes(model, direction, property, pageNumAsInt, totalPage, customerList, keyword);
        return CUSTOMER_INDEX_PAGE;
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("customer", new Customer());
        return CUSTOMER_FORM_PAGE;
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") Integer id, Model model) {
        model.addAttribute("customer", customerService.get(id));
        return CUSTOMER_FORM_PAGE;
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        try {
            customerService.delete(id);
        } catch (Exception ignored) {
            return CUSTOMER_REDIRECT_PAGE + MESSAGE_PARAM + DELETE_UNSUCCESSFUL;
        }
        return CUSTOMER_REDIRECT_PAGE + MESSAGE_PARAM + DELETE_SUCCESS;
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute Customer customer) {
        boolean isCreated = customer.getId() == null;
        try {
            customerService.save(customer);
        } catch (Exception ignored) {
            return CUSTOMER_REDIRECT_PAGE + MESSAGE_PARAM +
                    (isCreated ? ADD_UNSUCCESSFUL : UPDATE_UNSUCCESSFUL);
        }
        return CUSTOMER_REDIRECT_PAGE + MESSAGE_PARAM +
                (isCreated ? ADD_SUCCESS : UPDATE_SUCCESS);
    }
}
