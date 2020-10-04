public class Specialist extends Employee {

    private int levels;

    public Specialist(String name, int age, double salary, int levels) {
        super(name, age, salary);
        this.levels = levels;
    }

    public void print() {
        System.out.println("name: " + getName() + ", age: " + getAge() + ", salary: " + getSalary() + ", levels: " + levels);
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }


    public void workWithClient() {
        System.out.println("I can do all the work in my specialty\n");
    }

}
