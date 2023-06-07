package main;

public abstract class Employee {
    private String name;
    private int ni;
    private double salary;

    public Employee(String name, int ni, double salary) {
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && name != "") {
            this.name = name;
        }
    }

    public int getNi() {
        return ni;
    }

    public void setNi(int ni) {
        this.ni = ni;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(double increase){
        if(increase > 0) {
            this.salary += increase;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }

}
