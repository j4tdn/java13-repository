package dao;

import java.util.List;

import persistences.Employee;

public class HibernateEmployeeImpl extends AbstractHibernateDao implements EmployeeDao{
	
	private static final String Q_GET_ALL_EMPLOYEE_BY_DEPTID = "SELECT * \n"
															+ "FROM employee \n"
															+ "WHERE dept_id = :dept_id";
	
	private static final String Q_GET_ALL_EMPLOYEE_OF_ALL_DEPT = "SELECT e.* \n"
															+ "FROM employee e \n"
															+ "JOIN department d ON e.dept_id = d.dept_id";			
	
	public List<Employee> getAllEmployeeByDepartment(String dept_id) {
		
		return openSession().createNativeQuery(Q_GET_ALL_EMPLOYEE_BY_DEPTID, Employee.class)
					.setParameter("dept_id", dept_id)
					.getResultList();
	}
	
	@Override
	public List<Employee> getAllEmployee() {
		return openSession().createNativeQuery(Q_GET_ALL_EMPLOYEE_OF_ALL_DEPT, Employee.class)
					.getResultList();
	}

}
