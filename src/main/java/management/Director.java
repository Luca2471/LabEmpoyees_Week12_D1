package management;

public class Director extends Manager{

    private double budget;

    public Director(String name, String nin, int salary, String deptName, double budget) {
        super(name, nin, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus(){
        salary *= 0.02;
        return salary;
    }
}
