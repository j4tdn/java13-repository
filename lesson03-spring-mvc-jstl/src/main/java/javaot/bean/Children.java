package javaot.bean;

import java.time.LocalDateTime;

public class Children {
    private Integer id;
    private String fullName;
    private Integer yearOfBirth;
    public Children(){

    }
    public Children(Integer id, String fullName, Integer yearOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Integer getAge(){
        return LocalDateTime.now().getYear() - yearOfBirth;
    }
    @Override
    public String toString() {
        return "Children{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
