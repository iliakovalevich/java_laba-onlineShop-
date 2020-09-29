package online.shop.entity;

abstract class Person {
    String firstName;
    String lastName;
    Sex sexPerson;

    abstract void about();

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

    public Sex getSexPerson() {
        return sexPerson;
    }

    public void setSexPerson(Sex sexPerson) {
        this.sexPerson = sexPerson;
    }

    public Person(String firstName, String lastName, Sex sexPerson) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sexPerson = sexPerson;
    }

}
