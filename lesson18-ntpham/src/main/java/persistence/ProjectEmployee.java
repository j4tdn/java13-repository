package persistence;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="project_employee")
public class ProjectEmployee {
	
	@EmbeddedId
	private Id id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pro_id", referencedColumnName = "pro_id", insertable = false, updatable = false)
	private Project project;
	
	@ManyToOne
	@JoinColumn(name = "emp_id", referencedColumnName = "emp_id", insertable = false, updatable = false)
	private Employee employee;
	
	@Column(name="DATE")
	private Date date;
	
	public ProjectEmployee() {
	}
	
	public ProjectEmployee(Id id, Project project, Employee employee, Date date) {
		this.id = id;
		this.project = project;
		this.employee = employee;
		this.date = date;
	}

	@Embeddable
	public static class Id implements Serializable{

		private static final long serialVersionUID = -8920584312296553819L;
		
		@Column(name="pro_id")
		private String pro_id;
		
		@Column(name="emp_id")
		private String emp_id;
		
		public Id() {
		}

		public Id(String pro_id, String emp_id) {
			this.pro_id = pro_id;
			this.emp_id = emp_id;
		}

		public String getPro_id() {
			return pro_id;
		}

		public void setPro_id(String pro_id) {
			this.pro_id = pro_id;
		}

		public String getEmp_id() {
			return emp_id;
		}

		public void setEmp_id(String emp_id) {
			this.emp_id = emp_id;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public String toString() {
			return "Id [pro_id=" + pro_id + ", emp_id=" + emp_id + "]";
		}
	}

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ProjectEmployee [id=" + id + ", project=" + project + ", employee=" + employee + ", date=" + date + "]";
	}
}
