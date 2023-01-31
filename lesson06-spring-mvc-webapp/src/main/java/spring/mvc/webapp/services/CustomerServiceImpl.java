package spring.mvc.webapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.mvc.webapp.dao.CustomerDao;
import spring.mvc.webapp.entity.Customer;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    @Transactional
    public List<Customer> findAllCustomers() {
        return customerDao.findAllCustomers();
    }

    @Override
    @Transactional
    public void save(Customer customer) {
        customerDao.save(customer);
    }

    @Override
    @Transactional
    public Customer get(Integer id) {
        return customerDao.get(id);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        customerDao.delete(id);
    }


    @Override
    @Transactional
    public List<Customer> findAllCustomers(Integer pageNum, String property, String direction, String keyword) {
        return customerDao.findAllCustomers(pageNum, property, direction, keyword);
    }

    @Override
    @Transactional
    public Integer getTotalCustomers(String keyword) {
        return customerDao.getTotalCustomers(keyword);
    }


}
