package javaot.bean;


import javax.validation.constraints.*;

public class Customer {
    @NotNull
    private String firstName;
    @NotNull
    @Size(min = 5, message = "at least 5 letters")
    private String lastName;

    @NotNull
    @Min(value=1000, message="must bigger than 1000")
    @Max(value=99999999, message="")
    private Integer freePasses;
    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;

    public Customer(String firstName, String lastName, Integer freePasses, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.freePasses = freePasses;
        this.postalCode = postalCode;
    }
    public Customer() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", freePasses=" + freePasses +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
