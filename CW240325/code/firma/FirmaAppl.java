package firma;

import firma.model.Employee;

public class FirmaAppl {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Leonid", "Kleiman", 60, true, 7000);
        Employee e2 = new Employee(2, "Alex", "Podlitrus", 50, true, 6000);
        Employee e3 = new Employee(3, "Maria", "Fieldscher", 40, false, 7800);
        Employee e4 = new Employee(4, "Anna", "Morova", 35, false, 1700);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        double totalCelery = e1.getSalary() + e2.getSalary() + e3.getSalary() + e4.getSalary();

        System.out.println("Total celery: " + totalCelery);

        System.out.println("\n** What are they doing:");

        e1.lunch();
        e2.sleep();
        e3.work();
        e4.work();

    }
}
