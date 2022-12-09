package javaot.bean;

public class Customer {
    private String fn;
    private String ln;
    private Integer age;
    public Customer(){

    }

    public Customer(String fn, String ln, Integer age) {
        this.fn = fn;
        this.ln = ln;
        this.age = age;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "fn='" + fn + '\'' +
                ", ln='" + ln + '\'' +
                ", age=" + age +
                '}';
    }
}
