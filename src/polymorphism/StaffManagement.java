/**
 *
 * @author toros
 */
package polymorphism;

import static polymorphism.MainPoly.employees;

public class StaffManagement {

    public static void loadDB() {

        Programmer p1 = new Programmer("Java", "Toros Kutlu", "male", 50000, 2000);
        Programmer p2 = new Programmer("Python", "Lara Karlsson", "female", 60000, 2500);
        GraphicDesigner g1 = new GraphicDesigner("PhotoShop", "Sara Anderson", "female", 40000, 1000);
        GraphicDesigner g2 = new GraphicDesigner("Gimp", "Urban Petri", "male", 35000, 1500);
        TestSpecialist t1 = new TestSpecialist(true, "Maria Pirat", "female", 55000, 3000);
        TestSpecialist t2 = new TestSpecialist(false, "Pajeet Singh", "male", 65000, 3500);

        employees.add(p1);
        employees.add(p2);
        employees.add(g1);
        employees.add(g2);
        employees.add(t1);
        employees.add(t2);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("");
    }
}
