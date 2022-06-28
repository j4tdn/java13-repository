package dao;
import java.util.List;

import persistence.Employees;

public interface EmployeeDao {
	List<Employees> getEmloyeeById (String deptId);
    List<Employees> getAllEmp ();
}
