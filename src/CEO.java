public class CEO extends Employee{
    private boolean hasCompanyCar = true;

    public CEO(String name, int age, double salary, boolean hasCompanyCar) {
        super(name, age, salary);
        this.hasCompanyCar = hasCompanyCar;
    }

    public void print () {
        System.out.println("name: " + getName() + ", age: " + getAge() +  ", salary: " + getSalary() + ", has company car: " + hasCompanyCar);
    }

    public void goPublic() {
        System.out.println("глава компании");
    }
}
