package spring.mvc.webapp.services;

import spring.mvc.webapp.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAllCustomers();

    void save(Customer customer);

    Customer get(Integer id);

    void delete(Integer id);

    List<Customer> findAllCustomers(Integer pageNum, String property, String direction, String keyword);

    Integer getTotalCustomers(String keyword);
}
