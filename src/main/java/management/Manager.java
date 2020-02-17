package management;

import staff.Employee;

public class Manager extends Employee {

    String deptName;

    public Manager(String name, String nin, int salary, String deptName) {
        super(name, nin, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

}
