package persistences;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@Column(name = "emp_id")
	private String emp_id;
	
	@Column(name = "emp_name")
	private String emp_name;
	
	@Column(name = "age")
	private Integer age;
	
	@Column(name = "salary")
	private Double salary;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dept_id", referencedColumnName = "dept_id")
	private Department department;
	
	public Employee() {
		
	}

	public Employee(String emp_id, String emp_name, Integer age, Double salary) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.age = age;
		this.salary = salary;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", age=" + age + ", salary=" + salary
				+ "]";
	}

	
	
}
