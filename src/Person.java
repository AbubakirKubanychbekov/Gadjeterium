public class Person {
    private String name;
    private int age;
    private String lastName;
    private String phoneNumber;

    public Person(String name, int age, String lastName, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person: " +
                "\nname= " + name  +
                "\nage= " + age +
                "\nlastName= " + lastName  +
                "\nphoneNumber= " + phoneNumber ;
    }
}
