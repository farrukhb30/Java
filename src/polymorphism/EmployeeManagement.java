/**
 *
 * @author toros
 */
package polymorphism;

import static polymorphism.MainPoly.employees;


public class EmployeeManagement {

    public static void loadDB() {

        Programmer p1 = new Programmer("Java", "Toros Kutlu", "male", 50000.25);
        Programmer p2 = new Programmer("Python", "Lara Karlsson", "female", 60000.50);
        GraphicDesigner g1 = new GraphicDesigner("PhotoShop", "Sara Anderson", "female", 40000);
        GraphicDesigner g2 = new GraphicDesigner("Gimp", "Urban Petri", "male", 35000.999);
        TestSpecialist t1 = new TestSpecialist(true, "Maria Pirat", "female", 55000);
        TestSpecialist t2 = new TestSpecialist(false, "Pajeet Singh", "male", 65000);
        TestSpecialist t3 = new TestSpecialist(false, "Lara Karlsson", "female", 165000.8776554435);

        
        employees.add(p1);
        employees.add(p2);
        employees.add(g1);
        employees.add(g2);
        employees.add(t1);
        employees.add(t2);
        employees.add(t3);
       
        for (Employee employee : employees) {
            employee.bonus();
        }


        Methods.printAllEmployees();
        System.out.println("");
    }
}
