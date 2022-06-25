package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name ="emp_id")
	private String empId;
	
	@Column(name="emp_name")
	private String name;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="salary")
	private Double salary;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dept_id", referencedColumnName = "dept_id")
	private Department  department;

	public Employee() {
	}
	
	

	public Employee(String empId, String name, Integer age, Double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	


	public Employee(String empId, String name, Integer age, Double salary, Department department) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}



	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", salary=" + salary + ", department="
				+ department + "]";
	}
	
	
	
	
	
}