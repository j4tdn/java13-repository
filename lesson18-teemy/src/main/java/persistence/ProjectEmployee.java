package persistence;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "project_employee")
public class ProjectEmployee  {
    @EmbeddedId
    private Id id;

    @Column(name = "start_date",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date start_date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pro_id",referencedColumnName = "pro_id",insertable = false,updatable = false)
    private Project project;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_id",referencedColumnName = "emp_id",insertable = false,updatable = false)
    private Employee employee;

    public ProjectEmployee() {
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

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    @Override
    public String toString() {
        return "Project_Employee{" +
                "id=" + id +
                ", start_date=" + start_date +
                ", project=" + project +
                ", employee=" + employee +
                '}';
    }

    @Embeddable
    class Id implements Serializable{
        private static final long serialVersionUID = -7774813629925126939L;

        @Column(name = "pro_id",length = 10,nullable = false)
        private String pro_id;
        @Column(name="emp_id",length = 10,nullable = false)
        private String emp_id;

        public Id() {
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

        @Override
        public String toString() {
            return "Id{" +
                    "pro_id='" + pro_id + '\'' +
                    ", emp_id='" + emp_id + '\'' +
                    '}';
        }
    }



} 