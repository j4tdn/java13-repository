package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project {
	
	@Id
	@Column(name="pro_id")
	private String pro_id;
	
	@Column(name="pro_name")
	private String pro_name;
	
	@Column(name="budget")
	private Double budget;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="dept_id", referencedColumnName="dept_id")
	private Department department;
	
	public Project() {
	}

	public Project(String pro_id, String pro_name, Double budget, Department department) {
		this.pro_id = pro_id;
		this.pro_name = pro_name;
		this.budget = budget;
		this.department = department;
	}

	public String getPro_id() {
		return pro_id;
	}

	public void setPro_id(String pro_id) {
		this.pro_id = pro_id;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Project [pro_id=" + pro_id + ", pro_name=" + pro_name + ", budget=" + budget + ", department="
				+ department + "]";
	}
}
