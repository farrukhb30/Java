package polymorphism;

import java.util.*;
import static polymorphism.Utilities.*;
import static polymorphism.MainPoly.*;
// we can remove StaffManagement. by importing class StaffManagement.

public class Methods {

    static Scanner sc = new Scanner(System.in);

    public static void updateEmployeeByID() {

        Employee e;
        printAllEmployees();

        System.out.println("Please input employee number:");
        e = getEmployeeById(readInt());

        System.out.println("What would You like to update?");
        System.out.println("Input number to choose from menu:");
        System.out.println("1. Name");
        System.out.println("2. Gender");
        System.out.println("3. Salary");

        e.update();

        printAllEmployees();
    }

    public static void removeEmployeeByID() {

        printAllEmployees();

        System.out.println("Please input employee number:");
        StaffManagement.employees.remove(getEmployeeById(readInt()));

        printAllEmployees();
    }

    public static Employee getEmployeeById(int employeeId) {
        Employee e;
        for (int i = 0; i < StaffManagement.employees.size(); i++) {
            if (StaffManagement.employees.get(i).getEmployeeNr() == employeeId) {
                e = StaffManagement.employees.get(i);
                return e;
            }
        }
        return null; // or return System.out.println("Sorry, no employee with that ID was found.");
    }

    public static void removeEmployeeByName() {

        Employee e = new Employee(); // ??

        printAllEmployees();

        System.out.println("Please input employee name:");
        String empName = sc.nextLine();

        for (int i = (StaffManagement.employees.size() - 1); i > 0; i--) { // loop backwards
            if (StaffManagement.employees.get(i).getName().equalsIgnoreCase(empName)) {
                e = StaffManagement.employees.get(i);
                StaffManagement.employees.remove(e);
            }
        }

        printAllEmployees();
    }

    public static void printAllEmployees() {

        tableHeader();
        for (Employee employee : StaffManagement.employees) {

            System.out.println(employee);
        }
    }

    public static void calculateAverageSalary() {

        double averageSalary = 0;

        for (int i = 0; i < StaffManagement.employees.size(); i++) {

            averageSalary = StaffManagement.employees.get(i).getSalary() + averageSalary;
        }

        System.out.println("The average salaray for all the employees: " + averageSalary / StaffManagement.employees.size());
    }

    public static void genderDistribution() {

        // what is printf ??
        // what is %.2f ?? 
        // Why multiply by 100 ??
        System.out.printf("Male employees percentage: %.2f\n", (double)((Employee.getNoOfMaleEmployees() * 100) / StaffManagement.employees.size()));
        System.out.printf("Female employees percentage : %.2f\n", (double)((Employee.getNoOfFemaleEmployees() * 100) / StaffManagement.employees.size()));

        System.out.println("\nGender distribution among employees respective their professional role");

        System.out.printf("Male programmers percentage: %.2f\n", (double)((Programmer.getNoOfMaleProgrammers() * 100) / Programmer.getNoOfProgrammers()));
        System.out.printf("Female programmers percentage : %.2f\n", (double)((Programmer.getNoOfFemaleProgrammers() * 100) / Programmer.getNoOfProgrammers()));

        System.out.printf("Male graphic designres percentage: %.2f\n", (double)((GraphicDesigner.getNoOfMaleGraphicDesigners() * 100) / GraphicDesigner.getNoOfGraphicDesigners()));
        System.out.printf("Female graphic designers percentage : %.2f\n", (double)((GraphicDesigner.getNoOfFemaleGraphicDesigners() * 100) / GraphicDesigner.getNoOfGraphicDesigners()));

        System.out.printf("Male programmers percentage: %.2f\n", (double)((TestSpecialist.getNoOfMaleTestSpecialists() * 100) / TestSpecialist.getNoOfTestSpecialists()));
        System.out.printf("Female programmers percentage : %.2f\n", (double)((TestSpecialist.getNoOfFemaleTestSpecialists() * 100) / TestSpecialist.getNoOfTestSpecialists()));
    }

    public static void findHighestPaidEmployee() {

        int highestSalary = 0;

        for (int i = 0; i < StaffManagement.employees.size(); i++) {

            if (StaffManagement.employees.get(i).getSalary() > StaffManagement.employees.get(highestSalary).getSalary()) {

                highestSalary = i;
            }
        }

        // below ??
        double highest = StaffManagement.employees.get(highestSalary).getSalary();

        if (highestSalary != 0) {
            tableHeader();
        }

        for (Employee employee : StaffManagement.employees) {
            if (employee.getSalary() == highest) {
                System.out.println(employee);
            }
        }

        //System.out.println(employees.get(highestSalary));
    }

    public static void findLowestPaidEmployee() {

        int lowestSalary = 0;

        for (int i = 0; i < StaffManagement.employees.size(); i++) {

            if (StaffManagement.employees.get(i).getSalary() < StaffManagement.employees.get(lowestSalary).getSalary()) {

                lowestSalary = i;
            }
        }
        double lowest = StaffManagement.employees.get(lowestSalary).getSalary();

        if (lowestSalary != 0) {
            tableHeader();
        }

        for (Employee employee : StaffManagement.employees) {
            if (employee.getSalary() == lowest) {
                System.out.println(employee);
            }
        }
    }

    public static void totalBonusPayments() {

        double totalBonus = 0;

        for (Employee employee : StaffManagement.employees) {

            totalBonus = employee.getBonus() + totalBonus;

        }
        
        // totalBonus visar för många decimaler. Borde klippas bort xxx.xx
        System.out.println("Total bonus for all the employees: " + totalBonus);
    }

    // Detta är arv. Inte polymorfism.
    public static void totalProgrammersBonusPayments() {

        double totalProgrammerBonus = 0;

        for (Employee employee : StaffManagement.employees) {

            if (employee instanceof Programmer) {
                totalProgrammerBonus = employee.getBonus() + totalProgrammerBonus;
            }

        }
        // visar för många decimaler. Borde klippas bort xxx.xx
        System.out.println("Total bonus for all the Programmers: " + totalProgrammerBonus);
    }

    public static void totalGraphicDesignerBonusPayments() {

        double totalGraphicDesignerBonus = 0;

        for (Employee employee : StaffManagement.employees) {

            if (employee instanceof GraphicDesigner) {
                totalGraphicDesignerBonus = employee.getBonus() + totalGraphicDesignerBonus;
            }

        }
        // visar för många decimaler. Borde klippas bort xxx.xx
        System.out.println("Total bonus for all the Graphic Designers: " + totalGraphicDesignerBonus);
    }

    public static void totalTestSpecialistBonusPayments() {

        double totalTestSpecialistBonus = 0;

        for (Employee employee : StaffManagement.employees) {

            if (employee instanceof TestSpecialist) {
                totalTestSpecialistBonus = employee.getBonus() + totalTestSpecialistBonus;
            }

        }
        // visar för många decimaler. Borde klippas bort xxx.xx
        System.out.println("Total bonus for all the Test Specialists: " + totalTestSpecialistBonus);
    }

    public static void printEmployeeByID() {

        printAllEmployees();

        System.out.println("\n\nPlease input employee number:");
        System.out.println(getEmployeeById(readInt()));

        System.out.println("");
    }

}
