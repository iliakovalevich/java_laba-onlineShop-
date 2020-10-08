package online.shop.entity.persons;

public class Employee extends Person {
    private String passportNumber;
    private int age;
    private String post;
    private double salary;
    private double workExperience;

    public Employee(String passportNumber, String firstName, String lastName, int age, String post, double salary, double workExperience) {
        super(firstName, lastName);
        this.passportNumber = passportNumber;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.workExperience = workExperience;
    }

    public Employee() {

    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
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

    @Override
    public String toString() {
        return "Employee{" +
                "passportNumber='" + passportNumber + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                ", workExperience=" + workExperience +
                '}';
    }
}
