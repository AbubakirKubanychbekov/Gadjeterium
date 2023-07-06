public class Mentor {
    private Long id;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String group;

    public Mentor(Long id, String phoneNumber, String firstName, String lastName, String group) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Mentor - " +
                " \nid: " + id +
                " phoneNumber: " + phoneNumber +
                " \n firstName: " + firstName +
                " lastName: " + lastName +
                " \n group: " + group ;
    }
}
