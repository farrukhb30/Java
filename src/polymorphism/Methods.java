package polymorphism;

import java.util.*;
import static polymorphism.Utilities.*;
import static polymorphism.MainPoly.*;

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
        employees.remove(getEmployeeById(readInt()));

        printAllEmployees();
    }

    public static Employee getEmployeeById(int employeeId) {
        Employee e;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmployeeNr() == employeeId) {
                e = employees.get(i);
                return e;
            }
        }
        return null;
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
        }

        printAllEmployees();
    }

    public static void printAllEmployees() {

        tableHeader();
        for (Employee employee : employees) {

            System.out.println(employee);
        }
    }

    public static void calculateAverageSalary() {

        double averageSalaray = 0;

        for (int i = 0; i < employees.size(); i++) {

            averageSalaray = employees.get(i).getSalary() + averageSalaray;
        }

        System.out.println("The average salaray for all the employees: " + averageSalaray / employees.size());
    }

    public static void genderDistribution() {

        System.out.printf("Male employees percentage: %.2f\n", (double)((Employee.getNoOfMaleEmployees() * 100) / employees.size()));
        System.out.printf("Female employees percentage : %.2f\n", (double)((Employee.getNoOfFemaleEmployees() * 100) / employees.size()));

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

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).getSalary() > employees.get(highestSalary).getSalary()) {

                highestSalary = i;
            }
        }

        double highest = employees.get(highestSalary).getSalary();

        if (highestSalary != 0) {
            tableHeader();
        }

        for (Employee employee : employees) {
            if (employee.getSalary() == highest) {
                System.out.println(employee);
            }
        }

        //System.out.println(employees.get(highestSalary));
    }

    public static void findLowestPaidEmployee() {

        int lowestSalary = 0;

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).getSalary() < employees.get(lowestSalary).getSalary()) {

                lowestSalary = i;
            }
        }
        double lowest = employees.get(lowestSalary).getSalary();

        if (lowestSalary != 0) {
            tableHeader();
        }

        for (Employee employee : employees) {
            if (employee.getSalary() == lowest) {
                System.out.println(employee);
            }
        }
    }

    public static void totalBonusPayments() {

        double totalBonus = 0;

        for (Employee employee : employees) {

            totalBonus = employee.getBonus() + totalBonus;

        }
        System.out.println("Total bonus for all the employees: " + totalBonus);
    }

    public static void totalProgrammersBonusPayments() {

        double totalProgrammerBonus = 0;

        for (Employee employee : employees) {

            if (employee instanceof Programmer) {
                totalProgrammerBonus = employee.getBonus() + totalProgrammerBonus;
            }

        }
        System.out.println("Total bonus for all the Programmers: " + totalProgrammerBonus);
    }

    public static void totalGraphicDesignerBonusPayments() {

        double totalGraphicDesignerBonus = 0;

        for (Employee employee : employees) {

            if (employee instanceof GraphicDesigner) {
                totalGraphicDesignerBonus = employee.getBonus() + totalGraphicDesignerBonus;
            }

        }
        System.out.println("Total bonus for all the Graphic Designers: " + totalGraphicDesignerBonus);
    }

    public static void totalTestSpecialistBonusPayments() {

        double totalTestSpecialistBonus = 0;

        for (Employee employee : employees) {

            if (employee instanceof TestSpecialist) {
                totalTestSpecialistBonus = employee.getBonus() + totalTestSpecialistBonus;
            }

        }
        System.out.println("Total bonus for all the Test Specialists: " + totalTestSpecialistBonus);
    }

    public static void printEmployeeByID() {

        printAllEmployees();

        System.out.println("\n\nPlease input employee number:");
        System.out.println(getEmployeeById(readInt()));

        System.out.println("");
    }

}
