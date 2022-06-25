package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.Department;
import persistence.DepartmentDto;
import persistence.Employee;

public class HibernateDepartmentDao extends EntityDao {
	public List<DepartmentDto> getBudgetOfDepartments(){
		Session session = openSession();
		String query = "SELECT dept_name deptName, group_concat(concat(pro_name,' ',budget)) projectDetails, SUM(budget) budget FROM project p\r\n"
				+ "JOIN department d\r\n"
				+ "ON p.dept_id = d.dept_id\r\n"
				+ "GROUP BY p.dept_id";
		NativeQuery<?> departments = session.createNativeQuery(query);
		departments.setResultTransformer(Transformers.aliasToBean(DepartmentDto.class));
		return safeList(departments);
	}
	
	public List<DepartmentDto> getBudgetOfDepartmentsByMaxBudgetAndYear(int year){
		Session session = openSession();
		String query = "SELECT dept_name deptName, pro_name projectDetails, budget budget FROM project p\r\n"
				+ "JOIN department d\r\n"
				+ "ON p.dept_id = d.dept_id\r\n"
				+ "JOIN project_employee e\r\n"
				+ "ON e.pro_id = p.pro_id\r\n"
				+ "WHERE YEAR(start_date) = '"+ year +"'\r\n"
				+ "AND budget = (SELECT budget FROM project ORDER BY budget DESC LIMIT 1)\r\n"
				+ "GROUP BY dept_name";
		NativeQuery<?> departments = session.createNativeQuery(query);
		departments.setResultTransformer(Transformers.aliasToBean(DepartmentDto.class));
		return safeList(departments);
	}
	
	public void save(Department department) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(department);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
	}
}
