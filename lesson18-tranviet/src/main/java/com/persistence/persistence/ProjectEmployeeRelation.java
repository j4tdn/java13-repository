package com.persistence.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "project_employee")
public class ProjectEmployeeRelation {

    @Embeddable
    public static class ProjectEmployeeID implements Serializable {
        public static final long serialVersionUID = 709951244112937908L;
        @Column(name = "pro_id")
        private String projectId;
        @Column(name = "emp_id")
        private String employeeId;

        public String getProjectId() {
            return projectId;
        }

        public void setProjectId(String projectId) {
            this.projectId = projectId;
        }

        public String getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(this instanceof ProjectEmployeeID)) return false;
            final ProjectEmployeeID that = (ProjectEmployeeID) obj;
            return getEmployeeId() == that.getEmployeeId() && getProjectId() == that.getProjectId();
        }

        @Override
        public String toString() {
            return "pro_id = " + projectId + ", emp_id = " + employeeId;
        }

        @Override
        public int hashCode() {
            return Objects.hash(getEmployeeId(), getProjectId());
        }
    }

    @EmbeddedId
    private ProjectEmployeeID id;
    @Column(name = "start_date")
    private Date date;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="pro_id", referencedColumnName = "pro_id", insertable = false, updatable = false)
//    private Project project;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="emp_id", referencedColumnName = "emp_id", insertable = false, updatable = false)
//    private Employee employee;
//    public ProjectEmployeeRelation() {
//
//    }

    public ProjectEmployeeRelation(ProjectEmployeeID id, Date date) {
        this.id = id;
        this.date = date;
    }

    public ProjectEmployeeRelation(ProjectEmployeeID id, Date date, Project project, Employee employee) {
        this.id = id;
        this.date = date;
//        this.project = project;
//        this.employee = employee;
    }

    public ProjectEmployeeID getId() {
        return id;
    }

    public void setId(ProjectEmployeeID id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

//    public Project getProject() {
//        return project;
//    }
//
//    public void setProject(Project project) {
//        this.project = project;
//    }
//
//    public Employee getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }

    @Override
    public String toString() {
        return "ProjectEmployeeRelation{" +
                "id=" + id +
                ", date=" + date +
//                ", project=" + project +
//                ", employee=" + employee +
                '}';
    }
}
