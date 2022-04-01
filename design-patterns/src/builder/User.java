package builder;

/**
 * Root cause :: Could not use constructor to initial complex objects
 * 2,3,4,5, n parameters
 */
public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String address;
    private User(){

    }
    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }
    public static Builder builder(){
        return new Builder();
    }
    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private String phone;
        private String address;
        private Builder(){

        }
        public Builder firstName(String pFirstName) {
            this.firstName = pFirstName;
            return this;
        }

        public Builder lastName(String pLastName) {
            this.lastName = pLastName;
            return this;
        }

        public Builder age(int pAge) {
            this.age = pAge;
            return this;
        }

        public Builder phone(String pPhone) {
            this.phone = pPhone;
            return this;
        }

        public Builder address(String pAddress) {
            this.address = pAddress;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
