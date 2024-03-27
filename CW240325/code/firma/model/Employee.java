package firma.model;

public class Employee {

    //fields
    private int id;
    private String name;
    private String lastName;
    private int age;
    private boolean gender;
    private double salary;

    //constructor
    public Employee(int id, String name, String lastName, int age, boolean gender, double salary) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    //getters and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        //формирование строки в JSON
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }

    public void work (){
        System.out.println(name + " " + lastName + " is working! ");
    }

    public void lunch (){
        System.out.println(name + " " + lastName + " is eating lunch. ");
    }

    public void sleep (){
        System.out.println(name + " " + lastName + " age: " + age + " is sleeping. ");
    }
}
