package spring.mvc.webapp.services;

import spring.mvc.webapp.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAllCustomers();
}
