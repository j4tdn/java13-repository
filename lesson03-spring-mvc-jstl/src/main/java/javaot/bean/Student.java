package javaot.bean;

public class Student {
    private Integer id;
    private String fullName;
    private Integer age;
    public Student(){

    }

    public Student(Integer id, String fullName, Integer age) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
