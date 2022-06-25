package com.persistence.persistence;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="department")

public class Department {
    @Id
    @Column(name="dept_id")
    private String id;
    @Column(name="dept_name")
    private String name;
//    @OneToMany(mappedBy = "department")
//    private List<Project> projects;
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
    public Department(){

    }
    public Department(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department(String id, String name, List<Project> projects, List<Employee> employees) {
        this.id = id;
        this.name = name;
//        this.projects = projects;
        this.employees = employees;
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

//    public List<Project> getProjects() {
//        return projects;
//    }
//
//    public void setProjects(List<Project> projects) {
//        this.projects = projects;
//    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
//                ", projects=" + projects +
                ", employees=" + employees +
                '}';
    }
}
