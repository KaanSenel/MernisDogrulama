package customerPackage;

import java.util.Date;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private long nationalityId;
    private int birthdayYear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public long getNationalityId() {
        return nationalityId;
    }

    public int getBirthdayYear() {
        return birthdayYear;
    }

    public void setNationalityId(long nationalityId) {
        this.nationalityId = nationalityId;
    }

    public void setBirthdayYear(int birthdayYear) {
        this.birthdayYear = birthdayYear;
    }
}
