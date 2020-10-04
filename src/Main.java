public class Main {
    public static void main (String[] args) {

        Developer developer = new Developer("Bakyt", 34, 70000, "middle");
        developer.print();
        developer.writeCode();

        Developer developer1 = new Developer("Almaz", 25, 30000, "junior");
        developer1.print();
        developer1.writeCode();

        Developer developer2 = new Developer("Ermek", 31, 65000, "middle");
        developer2.print();
        developer2.writeCode();

        Developer developer3 = new Developer("Nurlan", 31, 250000, "senior");
        developer3.print();
        developer3.writeCode();
        
        Specialist specialist = new Specialist("Alina", 33, 40000, 2);
        specialist.print();
        specialist.workWithClient();

        Specialist specialist1 = new Specialist("Sergei", 45, 55000, 3);
        specialist1.print();
        specialist1.workWithClient();

        Specialist specialist2 = new Specialist("Kumar", 24, 35000, 1);
        specialist2.print();
        specialist2.workWithClient();

        Manager manager = new Manager("Gulzat", 31, 200000, true);
        manager.print();
        manager.writeProcedures();

        Manager manager1 = new Manager("Akyl", 32, 200000, false);
        manager1.print();
        manager1.writeProcedures();


        CEO ceo = new CEO("Kanat", 34, 300000, true);
        ceo.print();
        ceo.goPublic();
    }
}
