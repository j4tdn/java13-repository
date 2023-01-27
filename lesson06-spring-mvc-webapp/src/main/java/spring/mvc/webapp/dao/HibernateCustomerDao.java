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
        return getCurrentSession().createQuery("FROM Customer", Customer.class).getResultList();
    }

    @Override
    public void save(Customer customer) {
        getCurrentSession().saveOrUpdate(customer);
    }

    @Override
    public Customer get(Integer id) {
        return getCurrentSession().get(Customer.class, id);
    }

    @Override
    public void delete(Integer id) {
        getCurrentSession().delete(get(id));
    }
}
