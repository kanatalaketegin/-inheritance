public class Developer extends Employee{


    private String grades = "Middle";

    public Developer(String name, int age, double salary, String grades) {
        super(name, age, salary);
        this.grades = grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public void print() {
        System.out.println("name: " + getName() + ", age: " + getAge() +  ", salary: " + getSalary() + ", grades: " + grades);
    }

    public void writeCode() {
        System.out.println("I am writing my awesome algorithm!\n");
    }
}
