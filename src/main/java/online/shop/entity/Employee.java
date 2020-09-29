package online.shop.entity;

public class Employee extends Person {
    int age;
    String position;
    double salary;
    double workExperience;

    public Employee(String firstName, String lastname, Sex sex, int age, String position, double salary, double workExperience) {
        super(firstName, lastname, sex);
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.workExperience = workExperience;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(double workExperience) {
        this.workExperience = workExperience;
    }

    void about() {

    }
}
