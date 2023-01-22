package spring.mvc.webapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.mvc.webapp.dao.CustomerDao;
import spring.mvc.webapp.entity.Customer;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> findAllCustomers() {
        return customerDao.findAllCustomers();
    }
}
