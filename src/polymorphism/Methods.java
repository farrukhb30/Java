/**
 *
 * @author toros
 */
package polymorphism;

import java.util.*;
import static polymorphism.Utilities.*;
import static polymorphism.MainPoly.*;

public class Methods {

    static Scanner sc = new Scanner(System.in);


    //add diff emp
    public static void addEmployee() {

        System.out.println("What kind of employee?");
        System.out.println("1. Programmer");
        System.out.println("2. Graphic Designer");
        System.out.println("3. Test Specialist");
        System.out.println("0. Exit");

        switch (sc.nextLine()) {
            case "1":
                addProgrammer();
                break;
            case "2":
                addGraphicDesigner();
                break;
            case "3":
                addTestSpecialist();
                break;
            case "0":
                System.exit(0);
            default:
                System.out.println("Invalid input. Please try again.");
        }
    }

    public static void addProgrammer() {

        Programmer p = new Programmer();
        
        addEmployeeType(p);
        
        System.out.println("Input programming language:");
        p.setCodeLang(sc.nextLine());

        employees.add(p);
    }

    public static void addGraphicDesigner() {

        GraphicDesigner g = new GraphicDesigner();

        addEmployeeType(g);
        
        System.out.println("Input Tech Stack:");
        g.setTechStack(sc.nextLine());
        employees.add(g);
    }

    public static void addTestSpecialist() {
        TestSpecialist t = new TestSpecialist();

        addEmployeeType(t);
            
        System.out.println("Is Test Specialist ISTQB certified? Write true or false");
        t.setISTQBcertified(readBoolean());
        employees.add(t);
    }

    public static void updateEmployeeByID() {
        
        Employee e = new Employee();
        
        printAllEmployees();
        
        System.out.println("Please input employee number:");
        
        int empNr = readInt();
        
        for (Employee employee : employees) {
            if (employee.getEmployeeNr() == empNr) {
                e = employee;
                System.out.println(employee);
                checkEmployeeType(e);
                //updateEmployee(e);
//            } else if (employee.getEmployeeNr() != empNr) {
//                //System.out.println("Not found.");
            }
        }
        printAllEmployees();
    }

    public static void removeEmployeeByID() {
        
        Employee e = new Employee();
        
        printAllEmployees();
        
        System.out.println("Please input employee number:");
        int empNr = readInt();
        
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmployeeNr() == empNr) {
                e = employees.get(i);
                employees.remove(e);
            }
//            else {
//                System.out.println("Invalid input. Please try again.");
//            }
        }
        printAllEmployees();
    }

    public static void removeEmployeeByName() {
        
        Employee e = new Employee();
        
        printAllEmployees();
        
        System.out.println("Please input employee name:");
        String empName = sc.nextLine();
        
        for (int i = (employees.size() - 1); i > 0; i--) {
            if (employees.get(i).getName().equalsIgnoreCase(empName)) {
                e = employees.get(i);
                employees.remove(e);
            }
//            else if (employees.get(i).getName().equalsIgnoreCase(empName)){
//                System.out.println("Invalid input. Please try again.");
//            }

//        for (int i = 0; i < employees.size(); i--) {
//            if (employees.get(i).getName().equalsIgnoreCase(empName)) {
//                e = employees.get(i);
//                employees.remove(e);
//            }
//        }
        }
        printAllEmployees();
    }

    public static void printAllEmployees() {
        
        for (Employee employee : employees) {
            
            System.out.println(employee);
        }
    }

    public static void updateEmployee(Employee e) {
        
        System.out.println("What would You like to update?");
        System.out.println("1. Name:");
        System.out.println("2. Gender:");
        System.out.println("3. Salary:");
        System.out.println("4. Bonus:");

        switch (readInt()) {
            case 1:
                e.setName(sc.nextLine());
                printAllEmployees();
                break;
            case 2:
                e.setGender(sc.nextLine());
                printAllEmployees();
                break;
            case 3:
                e.setSalary(readDouble());
                printAllEmployees();
                break;
            case 4:
                e.setBonus(readDouble());
                printAllEmployees();
                break;
            default:
                System.out.println("Invalid input. Please try again.");
        }
    }

    public static void checkEmployeeType(Employee e) {
        
        if (e instanceof Programmer) {
            
            System.out.println("What would You like to update?");
            System.out.println("Input number to choose from menu:");
            System.out.println("1. Name");
            System.out.println("2. Gender");
            System.out.println("3. Salary");
            System.out.println("4. Bonus");
            System.out.println("5. Code language?");
            System.out.println("0. Exit");

            switch (readInt()) {
                case 1:
                    e.setName(sc.nextLine());
                    break;
                case 2:
                    e.setGender(sc.nextLine());
                    break;
                case 3:
                    e.setSalary(readDouble());
                    break;
                case 4:
                    e.setBonus(readDouble());
                    break;
                case 5:
                    ((Programmer) e).setCodeLang(sc.nextLine());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input. Please try again.");
            }
        } else if (e instanceof GraphicDesigner) {
            
            System.out.println("What would You like to update?");
            System.out.println("Input number to choose from menu:");
            System.out.println("1. Name");
            System.out.println("2. Gender");
            System.out.println("3. Salary");
            System.out.println("4. Bonus");
            System.out.println("5. Tech Stack?");
            System.out.println("0. Exit");

            switch (readInt()) {
                case 1:
                    e.setName(sc.nextLine());
                    break;
                case 2:
                    e.setGender(sc.nextLine());
                    break;
                case 3:
                    e.setSalary(readDouble());
                    break;
                case 4:
                    e.setBonus(readDouble());
                    break;
                case 5:
                    ((GraphicDesigner) e).setTechStack(sc.nextLine());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input. Please try again.");
            }
        } else if (e instanceof TestSpecialist) {
            
            System.out.println("What would You like to update?");
            System.out.println("Input number to choose from menu:");
            System.out.println("1. Name");
            System.out.println("2. Gender");
            System.out.println("3. Salary");
            System.out.println("4. Bonus");
            System.out.println("5. ISTQB Certified (true or false)?");
            System.out.println("0. Exit");

            switch (readInt()) {
                case 1:
                    e.setName(sc.nextLine());
                    break;
                case 2:
                    e.setGender(sc.nextLine());
                    break;
                case 3:
                    e.setSalary(readDouble());
                    break;
                case 4:
                    e.setBonus(readDouble());
                    break;
                case 5:
                    ((TestSpecialist) e).setISTQBcertified(Utilities.readBoolean());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input. Please try again.");
            }
        }
    }

    public static void addEmployeeType(Employee p) {
        
        System.out.println("Input name:");
        p.setName(sc.nextLine());
        System.out.println("Input gender:");
        p.setGender(sc.nextLine());
        System.out.println("Input salary:");
        p.setSalary(readDouble());
        System.out.println("Input bonus:");
        p.setBonus(readDouble());
    }
}
