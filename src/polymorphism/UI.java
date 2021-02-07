package polymorphism;

import static polymorphism.Methods.*;
import static polymorphism.Utilities.*;

public class UI {

    //The first menu runs when the program starts.
    public static void runProgram() {
        System.out.println("\nWelcome to the Employee Management System!");
        System.out.println("Please input number to choose from the menu.");
        System.out.println("1. Employee Management");
        System.out.println("2. Statistics");
        System.out.println("3. Input dummy data");
        System.out.println("0. Exit");

        switch (readInt()) {
            case 1:
                employeeManagament();
                break;
            case 2:
                statistics();
                break;
            case 3:
                loadDB();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Invalid input. Please try again.");
        }
    }

    //Shows the menu for employee management when you get into subcategory of main menu.
    public static void employeeManagament() {
        System.out.println("1. Add employee");
        System.out.println("2. Update employee");
        System.out.println("3. Remove employee by ID");
        System.out.println("4. Remove employee by name");
        System.out.println("5. Show information about all employees");
        System.out.println("6. Show information about a specific employee");
        System.out.println("0. Go back to main menu");

        switch (readInt()) {
            case 1 ->
                addEmployeeByUser();
            case 2 ->
                updateEmployeeByID();
            case 3 ->
                removeEmployeeByID();
            case 4 ->
                removeEmployeeByName();
            case 5 ->
                printAllEmployees();
            case 6 -> 
                printEmployeeByID();
            case 0 -> {
            }
            default ->
                System.out.println("Invalid input! Please try again.");
        }
        //                printByID(); // remove?
    }

    //Shows the menu for statistics when you get into subcategory of main menu.
    public static void statistics() {
        System.out.println("1. Average salary");
        System.out.println("2. Gender distribution");
        System.out.println("3. Bonus payments");
        System.out.println("4. Highest salary in company");
        System.out.println("5. Lowest salary in company");
        System.out.println("0. Go back to main menu");

        switch (readInt()) {

            case 1 ->
                calculateAverageSalary();
            case 2 ->
                genderDistribution();
            case 3 ->
                bonusMenu();
            case 4 ->
                findHighestPaidEmployee();
            case 5 ->
                findLowestPaidEmployee();
            case 0 -> {
            }
            default ->
                System.out.println("Invalid input! Please try again.");

        }

    }

    //Generates bonus Menu for calculation of Bonus based on different professional roles.
    public static void bonusMenu() {

        System.out.println("1. Total bonus for all employees ");
        System.out.println("2. Total bonus for all programmers");
        System.out.println("3. Total bonus for all graphic designers");
        System.out.println("4. Total bonus for all test specialists");
        System.out.println("0. Go back to main menu"); // go back to previous menu ?

        switch (readInt()) {
            
            case 1:
                totalBonusPayments();
                break;
            case 2:
                totalProgrammersBonusPayments();
                break;
            case 3:
                totalGraphicDesignerBonusPayments();
                break;
            case 4:
                totalTestSpecialistBonusPayments();
                break;
            case 0:
                break;
            default :
                System.exit(0);

        }
    }

    //Adds the employee by asking different fields of employee from User.
    public static void addEmployeeByUser() {
        System.out.println("What kind of employee?");
        System.out.println("1. Programmer");
        System.out.println("2. Graphic Designer");
        System.out.println("3. Test Specialist");
        System.out.println("0. Go back to main menu");
        switch (Methods.sc.nextLine()) { // import scanner?
            case "1":
                Programmer p = new Programmer();
                p.addEmployee();
                break;
            case "2":
                GraphicDesigner g = new GraphicDesigner();
                g.addEmployee();
                break;
            case "3":
                TestSpecialist t = new TestSpecialist();
                t.addEmployee();
                break;
            case "0":
                break;
            default:
                System.out.println("Invalid input. Please try again.");
        }
        Methods.printAllEmployees();
        System.out.println("");
    }

}
