package lab_09_01;

public class Employee {

    private String name;
    private int salary;

    public Employee() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public int setSalary(int salary) {
        this.salary = salary;
        return salary;
    }
}
