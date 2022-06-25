package persistence;

public class DepartmentDto {
	private String deptName;
	private String projectDetails;
	private Double budget;
	public DepartmentDto() {
		
	}
	public DepartmentDto(String deptName, String projectDetails, Double budget) {
		super();
		this.deptName = deptName;
		this.projectDetails = projectDetails;
		this.budget = budget;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getProjectDetails() {
		return projectDetails;
	}
	public void setProjectDetails(String projectDetails) {
		this.projectDetails = projectDetails;
	}
	public Double getBudget() {
		return budget;
	}
	public void setBudget(Double budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "DepartmentDto [deptName=" + deptName + ", projectDetails=" + projectDetails + ", budget=" + budget
				+ "]";
	}
	
}
