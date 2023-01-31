package spring.mvc.webapp.dao;

import org.springframework.stereotype.Repository;
import spring.mvc.webapp.entity.Customer;
import spring.mvc.webapp.utils.CustomerUtils;

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

    @Override
    public List<Customer> findAllCustomers(Integer pageNum, String property, String direction, String keyword) {
        String sql = "select * from Customer" +
                " where first_name LIKE '%" + keyword + "%' or last_name LIKE '%" + keyword + "%' or email LIKE '%" + keyword + "%'" +
                " order by " + property + (direction.equals("desc") ? " desc" : "") +
                " limit " + CustomerUtils.getOffset(pageNum) + "," + CustomerUtils.customerPerPage;
        return getCurrentSession().createNativeQuery(sql, Customer.class).getResultList();
    }

    @Override
    public Integer getTotalCustomers(String keyword) {
        String sql = "select * from Customer" +
                " where first_name LIKE '%" + keyword + "%' or last_name LIKE '%" + keyword + "%' or email LIKE '%" + keyword + "%'";
        return Math.toIntExact(getCurrentSession().createNativeQuery(sql, Customer.class).getResultList().stream().count());
    }


}
