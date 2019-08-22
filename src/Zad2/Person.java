package Zad2;

public class Person{
    private String firstName;
    private String lastName;
    private int pesel;

    public Person() {
    }

    public Person(String firstName, String lastName, int pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
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

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + '(' + pesel +")";
    }
//
//    @Override
//    public int compareTo(Person o) {
//        if(!)
//    }
}
