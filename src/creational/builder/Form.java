package creational.builder;

import java.util.Date;

//Builder - defines components of object
public class Form {
    private String firstName = "";
    private String middleName = "";
    private String lastName = "";
    private String address = "";
    private Date birthdate;
    private String spouseFirstName = "";
    private String spouseLastName = "";
    private String spouseMiddleName = "";

    private Form(FormBuilder builder) {
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.address = builder.address;
        this.birthdate = builder.birthdate;
        this.spouseFirstName = builder.spouseFirstName;
        this.spouseLastName = builder.spouseLastName;
        this.spouseMiddleName = builder.spouseMiddleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getSpouseFirstName() {
        return spouseFirstName;
    }

    public void setSpouseFirstName(String spouseFirstName) {
        this.spouseFirstName = spouseFirstName;
    }

    public String getSpouseLastName() {
        return spouseLastName;
    }

    public void setSpouseLastName(String spouseLastName) {
        this.spouseLastName = spouseLastName;
    }

    public String getSpouseMiddleName() {
        return spouseMiddleName;
    }

    public void setSpouseMiddleName(String spouseMiddleName) {
        this.spouseMiddleName = spouseMiddleName;
    }

    public static class FormBuilder {
        private String firstName = "";
        private String middleName = "";
        private String lastName = "";
        private String address = "";
        private Date birthdate;
        private String spouseFirstName = "";
        private String spouseLastName = "";
        private String spouseMiddleName = "";

        public FormBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public FormBuilder addMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public FormBuilder addAddress(String address) {
            this.address = address;
            return this;
        }

        public FormBuilder addBirthdate(Date birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        public FormBuilder addSpouseFirstName(String spouseFirstName) {
            this.spouseFirstName = spouseFirstName;
            return this;
        }

        public FormBuilder addSpouseLastName(String spouseLastName) {
            this.spouseLastName = spouseLastName;
            return this;
        }

        public FormBuilder addSpouseMiddleName(String spouseMiddleName) {
            this.spouseMiddleName = spouseMiddleName;
            return this;
        }

        public Form build(){
            Form form = new Form(this);
            return form;
        }

    }
}
