package staff;

public abstract class Employee {

    String name;
    String nin;
    protected int salary;

    public Employee(String name, String nin, int salary) {
        this.name = name;
        this.nin = nin;
        this.salary = salary;
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
        if (raise > 0 ) {
            salary += raise;
        }
    }

    public double payBonus() {
        salary *= 0.01;
        return salary;
    }

    public void setName(String name) {
        if (name != null && name != "") {
            this.name = name;
        }
    }
}
