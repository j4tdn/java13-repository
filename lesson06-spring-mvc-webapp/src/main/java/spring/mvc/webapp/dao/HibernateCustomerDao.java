package spring.mvc.webapp.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.mvc.webapp.entity.Customer;

import java.util.List;

@Repository
public class HibernateCustomerDao extends AbstractHibernateDao implements CustomerDao {
    @Override
    public List<Customer> findAllCustomers() {
        return openSession().createQuery("FROM Customer", Customer.class).getResultList();
    }
}
