package staff;

public abstract class Employee {

    String name;
    String nin;
    int salary;

    public Employee(String name, String nin) {
        this.name = name;
        this.nin = nin;
        this.salary = 100;
    }
    public String getName() {
        return name;
    }

    public String getNin() {
        return nin;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(double raise) {
        salary += raise;
    }

    public double payBonus() {
        salary += salary*0.01;
        return salary;
    }

}
