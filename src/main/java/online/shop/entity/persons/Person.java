package online.shop.entity.persons;

abstract class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
