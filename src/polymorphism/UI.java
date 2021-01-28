
package polymorphism;

import static polymorphism.Methods.*;
import static polymorphism.EmployeeManagement.*;
import static polymorphism.Utilities.*;


public class UI {

    public static void runProgram() {
        System.out.println("Welcome to the Employee Management System!");
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

    public static void employeeManagament() {
        System.out.println("1. Add employee");
        System.out.println("2. Update employee");
        System.out.println("3. Remove employee by ID");
        System.out.println("4. Remove employee by name");
        System.out.println("5. Show information about all employees");
        System.out.println("6. Show information about a specific employee");
        System.out.println("7. Calculate salary and bonus for each employee");

        switch (readInt()) {
            case 1:
                addEmployee();
                break;
            case 2:
                updateEmployeeByID();
                break;
            case 3:
                removeEmployeeByID();
                break;
            case 4:
                removeEmployeeByName();
                break;
            case 5:
                printAllEmployees();
                break;
            case 6:
                //                printByID();
                break;
            case 7:
                //                calculateSalaryAndBonus();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Invalid input. Please try again.");
        }
    }
        public static void statistics() {
        System.out.println("1. Average salary");
        System.out.println("2. Gender distribution");
        System.out.println("3. Bonus payments");
        System.out.println("4. Highest salary in company");
        System.out.println("5. Lowest salary in company");
        
        switch(readInt()){
        
            case 1 -> calculateAverageSalaray();
            case 2 -> genderDistribution();
            case 3 -> System.out.println("3. Bonus payments");
            case 4 -> System.out.println("4. Highest salary in company");
            case 5 -> System.out.println("5. Lowest salary in company");
            default -> {
            }
                
        }
        
    }
        


}
