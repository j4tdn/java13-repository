package persistence;

public class DepartmentHighestBudgetDto {
	public static String DEPT_NAME = "dept_name";
	public static String PRO_NAME = "pro_name";
	public static String BUDGET = "budget";
	
	private String dept_name;
	private String pro_name;
	private Double budget; 
	
	public DepartmentHighestBudgetDto() {
	}

	public DepartmentHighestBudgetDto(String dept_name, String pro_name, Double budget) {
		this.dept_name = dept_name;
		this.pro_name = pro_name;
		this.budget = budget;
	}

	public static String getDEPT_NAME() {
		return DEPT_NAME;
	}

	public static void setDEPT_NAME(String dEPT_NAME) {
		DEPT_NAME = dEPT_NAME;
	}

	public static String getPRO_NAME() {
		return PRO_NAME;
	}

	public static void setPRO_NAME(String pRO_NAME) {
		PRO_NAME = pRO_NAME;
	}

	public static String getBUDGET() {
		return BUDGET;
	}

	public static void setBUDGET(String bUDGET) {
		BUDGET = bUDGET;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
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

	@Override
	public String toString() {
		return "DepartmentHighestBudgetDto [dept_name=" + dept_name + ", pro_name=" + pro_name + ", budget=" + budget
				+ "]";
	}
}
