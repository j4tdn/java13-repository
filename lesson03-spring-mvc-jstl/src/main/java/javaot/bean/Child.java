package javaot.bean;

import javax.validation.constraints.*;
import java.time.LocalDateTime;

public class Child {
    @NotNull
    private String fullName;
    @NotNull
    private Integer id;
    @NotNull
    private Integer yearOfBirth;

    public Child() {

    }

    public Child(Integer id, String fullName, Integer yearOfBirth) {
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

    public Integer getAge() {
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
