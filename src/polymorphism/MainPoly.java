/**
 *
 * @author toros
 */
package polymorphism;

import java.util.ArrayList;

public class MainPoly {

    public static ArrayList<Employee> employees = new ArrayList<>();

    // for loadDB()
    static Programmer p1 = new Programmer("Java", "Toros Kutlu", "male", 50000, 2000);
    static Programmer p2 = new Programmer("Python", "Lara Karlsson", "female", 60000, 2500);
    static GraphicDesigner g1 = new GraphicDesigner("PhotoShop", "Sara Anderson", "female", 40000, 1000);
    static GraphicDesigner g2 = new GraphicDesigner("Gimp", "Urban Petri", "male", 35000, 1500);
    static TestSpecialist t1 = new TestSpecialist(true, "Maria Pirat", "female", 55000, 3000);
    static TestSpecialist t2 = new TestSpecialist(false, "Pajeet Singh", "male", 65000, 3500);
    static TestSpecialist t3 = new TestSpecialist(false, "Lara Karlsson", "female", 165000, 53500);

    public static void main(String[] args) {

        loadDB();
        while (true) {
            Methods.runProgram();
        }
    }

    public static void loadDB() {
        employees.add(p1);
        employees.add(p2);
        employees.add(g1);
        employees.add(g2);
        employees.add(t1);
        employees.add(t2);
        employees.add(t3);

        employees.forEach(employee -> {
            System.out.println(employee);
        });
        System.out.println("");
    }

}
