package dao;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import persistence.Employee;

public class HibernateEmployeeDao extends EntityDao {
	public List<Employee> getAll(){
		Session session = openSession();
		String query = "SELECT * FROM employee";
		NativeQuery<Employee> employees = session.createNativeQuery(query, Employee.class);
		System.out.println(employees);
		return employees.getResultList();
		
	}
	
	public List<Employee> getEmployeesByDeptId(String deptId){
		Session session = openSession();
		String query = "SELECT * FROM employee WHERE dept_id='" +deptId+"'";
		NativeQuery<Employee> employees = session.createNativeQuery(query, Employee.class);
		return employees.getResultList();
		
	}
	
	public List<Employee> getEmployeesSortByDeptId(){
		Session session = openSession();
		String query = "SELECT * FROM employee ORDER BY dept_id";
		NativeQuery<Employee> employees = session.createNativeQuery(query, Employee.class);
		return employees.getResultList();
		
	}
	
	public static void main(String[] args) {
		try {
			new HibernateEmployeeDao().getEmployeesByDeptId("mgm-dn").stream().forEach(e -> System.out.println(e));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
