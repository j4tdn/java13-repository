package com.persistence.persistence;

public class DepartmentDto {
    public static String DEPARTMENT_NAME = "dept_id";
    public static String PROJECT_DETAILS = "project_details";
    public static String SUM_BUDGET = "budget";
    private String dept_id;
    private String project_details;
    private Double budget;

    public DepartmentDto() {

    }

    public DepartmentDto(String dept_id, String project_details, Double budget) {
        this.dept_id = dept_id;
        this.project_details = project_details;
        this.budget = budget;
    }

    public static String getDepartmentName() {
        return DEPARTMENT_NAME;
    }

    public static void setDepartmentName(String departmentName) {
        DEPARTMENT_NAME = departmentName;
    }

    public static String getProjectDetails() {
        return PROJECT_DETAILS;
    }

    public static void setProjectDetails(String projectDetails) {
        PROJECT_DETAILS = projectDetails;
    }

    public static String getSumBudget() {
        return SUM_BUDGET;
    }

    public static void setSumBudget(String sumBudget) {
        SUM_BUDGET = sumBudget;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
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
        return "DepartmentDto{" +
                "dept_id='" + dept_id + '\'' +
                ", project_details='" + project_details + '\'' +
                ", budget=" + budget +
                '}';
    }
}
