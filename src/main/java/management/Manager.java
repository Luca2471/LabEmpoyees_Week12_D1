package management;

import staff.Employee;

public class Manager extends Employee {

    String deptName;


    public Manager(String name, String nin, String deptName) {
        super(name, nin);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

}
