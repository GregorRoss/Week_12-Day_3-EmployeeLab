package main.management;

public class Director extends Manager{

    private double budget;
    public Director(String name, int ni, double salary, String depName, double budget) {
        super(name, ni, salary, depName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double payBonus(){
        return this.getSalary() * 0.02;
    }
}
