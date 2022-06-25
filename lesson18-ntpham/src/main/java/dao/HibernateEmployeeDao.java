package dao;

import java.util.List;
import java.util.Optional;

import persistence.Employee;

public class HibernateEmployeeDao extends AbstractHibernateDao implements EmployeeDao{
	
	private static final String Q_GET_EMPLOYEE_BY_DEPT_ID = "SELECT ep FROM Employee ep WHERE ep.dept_id = :dept_id";
	
	private static final String Q_GET_EMPLOYEE_OF_EACH_DEPARTMENT = "SELECT dp FROM Department dp\n"
																	+ "join Employee ep\n"
																	+ "on ep.dept_id = dp.dept_id \n"
																	+ "Order by dp.dept_id ASC";
	
	public Optional<Employee> get(String dept_id) {
		return Optional.ofNullable(openSession()
				.createQuery(Q_GET_EMPLOYEE_BY_DEPT_ID, Employee.class)
				.setParameter("dept_id", dept_id)
				.getSingleResult());
	}
	
	@Override
	public List<Employee> get() {
		return openSession().createQuery(Q_GET_EMPLOYEE_OF_EACH_DEPARTMENT, Employee.class)
				.getResultList();
	}
}
