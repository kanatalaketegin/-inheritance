
public class Main {
	public static void main (String[] args) {

		Employee kanat = new Employee();
		kanat.name = "Канат Алакетегин";
		kanat.age = 34;
		kanat.position = "Программист";
		kanat.salary = 200000;
		System.out.println("ФИО работника " + kanat.name);
		System.out.println("возраст работника " + kanat.age);
		System.out.println("должность работника " + kanat.position);
		System.out.println("заработная плата работника " + kanat.salary + " сом");
		System.out.println();

		Employee ali = new Employee();
		ali.name = "Али Алибаев";
		ali.age = 29;
		ali.position = "Врач";
		ali.salary = 5000;
		System.out.println("ФИО работника " + ali.name);
		System.out.println("возраст работника " + ali.age);
		System.out.println("должность работника " + ali.position);
		System.out.println("заработная плата работника " + ali.salary + " сом");
		System.out.println();

		Employee alina = new Employee("Алина Кабаева", 33, "Экономист", 40000);
		System.out.println("ФИО работника " + alina.name);
		System.out.println("возраст работника " + alina.age);
		System.out.println("должность работника " + alina.position);
		System.out.println("заработная плата работника " + alina.salary + " сом");
		System.out.println();

		Employee katya = new Employee("Екатерина Кыргызка", 31, "Бухгалтер", 50000);
		System.out.println("ФИО работника " + katya.name);
		System.out.println("возраст работника " + katya.age);
		System.out.println("должность работника " + katya.position);
		System.out.println("заработная плата работника " + katya.salary + " сом");


	}
}