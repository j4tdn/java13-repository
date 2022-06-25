package com.persistence.persistence;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="project")
public class Project {
    @Id
    @Column(name = "pro_id")
    private String id;
    @Column(name = "pro_name")
    private String name;
    @Column(name = "budget")
    private Double budget;

//    @OneToMany(mappedBy = "project")
//    private List<ProjectEmployeeRelation> employees;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "dept_id", referencedColumnName = "dept_id")
//    private Department department;

    public Project(String id, String name, Double budget) {
        this.id = id;
        this.name = name;
        this.budget = budget;
    }

    public Project(String id, String name, Double budget, List<ProjectEmployeeRelation> employees, Department department) {
        this.id = id;
        this.name = name;
        this.budget = budget;
//        this.employees = employees;
//        this.department = department;
    }

    public Project() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

//    public List<ProjectEmployeeRelation> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(List<ProjectEmployeeRelation> employees) {
//        this.employees = employees;
//    }

//    public Department getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Department department) {
//        this.department = department;
//    }

    @Override
    public String toString() {
        return "Project{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", budget=" + budget +
//                ", employees=" + employees +
//                ", department=" + department +
                '}';
    }
}
