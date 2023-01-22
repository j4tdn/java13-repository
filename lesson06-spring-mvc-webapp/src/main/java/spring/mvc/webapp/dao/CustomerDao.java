package spring.mvc.webapp.dao;

import spring.mvc.webapp.entity.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> findAllCustomers();
}
