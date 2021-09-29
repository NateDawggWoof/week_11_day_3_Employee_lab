package staff.management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String niNumber, Double salary, String departmentName, Double budget) {
        super(name, niNumber, salary, departmentName);
        this.budget = budget;
    }



        public double getBudget() {
            return budget;
        }


    }
