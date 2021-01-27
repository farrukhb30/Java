/**
 *
 * @author toros
 */
package polymorphism;

import java.util.*;

import static polymorphism.MainPoly.*;

public class Methods {

    static Scanner sc = new Scanner(System.in);
    static String choice1stMenu;
    static String choiceAddEmployee;
    static String choiceEmployeeManagement;

    public static void runProgram() {

        System.out.println("Welcome to the Employee Management System!");
        System.out.println("Please input number to choose from the menu.");
        System.out.println("1. Employee Management");
        System.out.println("2. Statistics");
        System.out.println("3. Input dummy data");
        System.out.println("0. Exit");

        choice1stMenu = sc.nextLine();

        switch (choice1stMenu) {
            case "1":
                employeeManagament();
                break;
            case "2":
                statistics();
                break;
            case "3":
                MainPoly.loadDB();
                break;
            case "0":
                System.exit(0);
            default:
                System.out.println("Invalid input. Please try again.");
        }
    }

    private static void employeeManagament() {
        System.out.println("1. Add employee");
        System.out.println("2. Update employee");
        System.out.println("3. Remove employee");
        System.out.println("4. Show information about all employees");
        System.out.println("5. Show information about a specific employee");
        System.out.println("6. Calculate salary and bonus for each employee");

        choiceEmployeeManagement = sc.nextLine();

        switch (choiceEmployeeManagement) {
            case "1":
                addEmployee();
                break;
            case "2":
                updateEmployeeByID();
                break;
            case "3":
                removeEmployee();
                break;
            case "4":
                printAllEmployees();
                break;
            case "5":
                printByID();
                break;
            case "6":
                calculateSalaryAndBonus();
                break;
            case "0":
                System.exit(0);
            default:
                System.out.println("Invalid input. Please try again.");
        }

    }

    private static void statistics() {
        System.out.println("1. Average salary");
        System.out.println("2. Gender distribution");
        System.out.println("3. Bonus payments");
        System.out.println("4. Highest salary in company");
        System.out.println("5. Lowest salary in company");
    }

    //add diff emp
    private static void addEmployee() {
        System.out.println("What kind of employee?");
        System.out.println("1. Programmer");
        System.out.println("2. Graphic Designer");
        System.out.println("3. Test Specialist");
        System.out.println("0. Exit");

        choiceAddEmployee = sc.nextLine();

        switch (choiceAddEmployee) {
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

        System.out.println("Input name:");
        p.setName(sc.nextLine());
        System.out.println("Input gender:");
        p.setGender(sc.nextLine());
        System.out.println("Input salary:");
        p.setSalary(sc.nextDouble());
        sc.nextLine();
        System.out.println("Input bonus:");
        p.setBonus(sc.nextDouble());
        sc.nextLine();
        System.out.println("Input programming language:");
        p.setCodeLang(sc.nextLine());
        employees.add(p);
    }

    private static void addGraphicDesigner() {
        GraphicDesigner g = new GraphicDesigner();

        System.out.println("Input name:");
        g.setName(sc.nextLine());
        System.out.println("Input gender:");
        g.setGender(sc.nextLine());
        System.out.println("Input salary:");
        g.setSalary(sc.nextDouble());
        sc.nextLine();
        System.out.println("Input bonus:");
        g.setBonus(sc.nextDouble());
        sc.nextLine();
        System.out.println("Input Tech Stack:");
        g.setTechStack(sc.nextLine());
        employees.add(g);
    }

    private static void addTestSpecialist() {
        TestSpecialist t = new TestSpecialist();

        System.out.println("Input name:");
        t.setName(sc.nextLine());
        System.out.println("Input gender:");
        t.setGender(sc.nextLine());
        System.out.println("Input salary:");
        t.setSalary(sc.nextDouble());
        sc.nextLine();
        System.out.println("Input bonus:");
        t.setBonus(sc.nextDouble());
        sc.nextLine();
        System.out.println("Is Test Specialist ISTQB certified? Write true or false");
        t.setISTQBcertified(sc.nextBoolean());
        employees.add(t);
    }

    private static void updateEmployeeByID() {
        Employee e = new Employee();
        printAllEmployees();
        System.out.println("Please input employee number:");
        int empNr = sc.nextInt();
        sc.nextLine();
        for (Employee employee : employees) {
            if (employee.getEmployeeNr() == empNr) {
                e = employee;
                System.out.println(employee);
                checkEmployeeType();
                updateEmployee(e);
            } else if (employee.getEmployeeNr() != empNr) {
                //System.out.println("Not found.");
            }
        }
    }

    private static void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static void updateEmployee(Employee e) {
        System.out.println("What would You like to update?");
        System.out.println("1. Name:");
        System.out.println("2. Gender:");
        System.out.println("3. Salary:");
        System.out.println("4. Bonus:");
        int choiceUpdate = sc.nextInt();
        sc.nextLine();

        switch (choiceUpdate) {
            case 1:
                e.setName(sc.nextLine());
                printAllEmployees();
                break;
            case 2:
                e.setGender(sc.nextLine());
                printAllEmployees();
                break;
            case 3:
                e.setSalary(sc.nextDouble());
                sc.nextLine();
                printAllEmployees();
                break;
            case 4:
                e.setBonus(sc.nextDouble());
                sc.nextLine();
                printAllEmployees();
            default:
                System.out.println("Invalid input. Please try again.");
        }
    }

    private static void checkEmployeeType(Employee e) {
        if(e instanceof Programmer) {
            System.out.println("Would You like to update code language?");
            sc.
        }
    }
}
