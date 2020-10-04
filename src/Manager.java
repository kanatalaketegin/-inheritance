public class Manager extends Employee{

    private boolean hasStocks = true;

    public Manager(String name, int age, double salary, boolean hasStocks) {
        super(name, age, salary);
        this.hasStocks = hasStocks;
    }
    public void print () {
        System.out.println("name: " + getName() + ", age: " + getAge() +  ", salary: " + getSalary() + ", has stocks: " + hasStocks);
    }

    public void writeProcedures () {
        System.out.println("акция");
    }
    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public void getHasStocks(boolean hasStocks) {

    }
}
