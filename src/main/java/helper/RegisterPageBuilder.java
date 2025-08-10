package helper;

public class RegisterPageBuilder {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String ssn;
    private String username;
    private String password;
    private String repeatedPassword;

    public RegisterPageBuilder(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.address = builder.address;
        this.city = builder.city;
        this.state = builder.state;
        this.zipCode = builder.zipCode;
        this.phoneNumber = builder.phoneNumber;
        this.ssn = builder.ssn;
        this.username = builder.username;
        this.password = builder.password;
        this.repeatedPassword = builder.repeatedPassword;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAddress() {
        return address;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getZipCode() {
        return zipCode;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getSsn() {
        return ssn;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getRepeatedPassword() {
        return repeatedPassword;
    }
    public static class Builder {
        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String state;
        private String zipCode;
        private String phoneNumber;
        private String ssn;
        private String username;
        private String password;
        private String repeatedPassword;
        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }
        public Builder setCity(String city) {
            this.city = city;
            return this;
        }
        public Builder setState(String state) {
            this.state = state;
            return this;
        }
        public Builder setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }
        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Builder setSocialSecurityNumber(String ssn) {
            this.ssn = ssn;
            return this;
        }
        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }
        public Builder setPassword(String passwd) {
            this.password = passwd;
            return this;
        }
        public Builder setRepeatedPassword(String passwdRepeated) {
            this.repeatedPassword = passwdRepeated;
            return this;
        }
        public RegisterPageBuilder build() {
            return new RegisterPageBuilder(this);
        }
    }
}
