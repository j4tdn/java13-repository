package dao;

import java.util.List;

import persistence.Employee;

public class HibernateEmployeeDao extends AbstractHibernateDao implements EmployeeDao {

	private static final String Q_GET_ALL_EMPLOYEE_BY_DEPT_ID = "SELECT * FROM employee WHERE dept_id  = :p_id"; 
	private static final String Q_GET_ALL_EMPLOYEE_SORT_BY_DEPTID = "SELECT * FROM employee ORDER BY dept_id DESC";
	
	public List<Employee> getEmployee(String dept_id) {
		return openSession()
				.createNativeQuery(Q_GET_ALL_EMPLOYEE_BY_DEPT_ID, Employee.class)
				.setParameter("p_id", dept_id)
				.getResultList();
	}
	
	@Override
	public List<Employee> getAllEmployeeSortByDept_id() {
		return openSession()
				.createNativeQuery(Q_GET_ALL_EMPLOYEE_SORT_BY_DEPTID, Employee.class)
				.getResultList();
	}
}
