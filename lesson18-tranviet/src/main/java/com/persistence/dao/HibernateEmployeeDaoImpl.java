package com.persistence.dao;

import com.persistence.connection.HibernateProvider;
import com.persistence.persistence.Employee;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

public class HibernateEmployeeDaoImpl extends AbstractHibernateDao implements HibernateEmployeeDao{
    private Session session;
    public HibernateEmployeeDaoImpl(){
        session = HibernateProvider.getSessionFactory().openSession();
    }



    @Override
    public List<Employee> employeesOfDepartment(String dept_id) {
        String Q_GET_EMPLOYEE = "SELECT * FROM employee WHERE dept_id = '" + dept_id + "'";
        return openSession().createNativeQuery(Q_GET_EMPLOYEE, Employee.class).getResultList();

    }

    @Override
    public List<Employee> employeesOfEachDepartment() {
        String Q_GET_EMPLOYEE_EACH_DEPARTMENT = "SELECT * FROM employee em\n" +
                "JOIN department dp ON em.dept_id = dp.dept_id\n" +
                "ORDER BY dp.dept_id;";
        return openSession().createNativeQuery(Q_GET_EMPLOYEE_EACH_DEPARTMENT, Employee.class).getResultList();
    }

}
