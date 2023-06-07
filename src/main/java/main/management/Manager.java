package main.management;

import main.Employee;

public class Manager extends Employee {

    private String depName;


    public Manager(String name, int ni, double salary, String depName) {
        super(name, ni, salary);
        this.depName = depName;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
}
