package persistence;

public class DepartmentDetailBuget {

    public final static String DEPARTMENT_NAME ="dept_name";
    public final static String PROJECT_DETAILS ="project_details";
    public final static String SUM_BUDGET = "budget";


    private String dept_name;
    private String project_details;
    private Double budget;

    public DepartmentDetailBuget() {
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getProject_details() {
        return project_details;
    }

    public void setProject_details(String project_details) {
        this.project_details = project_details;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "DepartmentDetailBudget{" +
                "dept_name='" + dept_name + '\'' +
                ", project_details='" + project_details + '\'' +
                ", budget=" + budget +
                '}';
    }
} 