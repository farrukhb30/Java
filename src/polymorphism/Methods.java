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
        System.out.println("0. Go back to main menu");

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
                break;
            default:
                System.out.println("Invalid input. Please try again.");
        }
        printAllEmployees();
        System.out.println("");
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

        System.out.println("ID              Name            Gender          Salary          Salary & Bonus  Qualifications");
        for (Employee employee : employees) {

            System.out.println(employee);
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
                    e.setSalaryWithBonus(readDouble());
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
                    e.setSalaryWithBonus(readDouble());
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
                    e.setSalaryWithBonus(readDouble());
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
        p.bonus();
    }

    public static void calculateAverageSalary() {

        double averageSalaray = 0;

        for (int i = 0; i < employees.size(); i++) {

            averageSalaray = employees.get(i).getSalary() + averageSalaray;
        }

        System.out.println("The average salaray for all the employees: " + averageSalaray / employees.size());
    }

    public static void genderDistribution() {

        double maleDistribution = 0;
        double femaleDistribution = 0;
        double maleProgrammers = 0;
        double femaleProgrammers = 0;
        double maleGraphicDesigner = 0;
        double femaleGraphicDesigner = 0;
        double maleTestSpecialists = 0;
        double femaleTestSpecialists = 0;
        double programmers = 0;
        double graphicDesigner = 0;
        double testSpecialists = 0;

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).getGender().equalsIgnoreCase("male")) {

                maleDistribution++;

                if (employees.get(i) instanceof Programmer) {

                    programmers++;
                    maleProgrammers++;
                }
                if (employees.get(i) instanceof GraphicDesigner) {

                    graphicDesigner++;
                    maleGraphicDesigner++;
                }
                if (employees.get(i) instanceof TestSpecialist) {

                    testSpecialists++;
                    maleTestSpecialists++;
                }

            } else if (employees.get(i).getGender().equalsIgnoreCase("female")) {

                femaleDistribution++;

                if (employees.get(i) instanceof Programmer) {

                    programmers++;
                    femaleProgrammers++;
                }
                if (employees.get(i) instanceof GraphicDesigner) {

                    graphicDesigner++;
                    femaleGraphicDesigner++;
                }
                if (employees.get(i) instanceof TestSpecialist) {

                    testSpecialists++;
                    femaleTestSpecialists++;
                }

            }

        }
        System.out.printf("Male employees percentage: %.2f\n", ((maleDistribution * 100) / employees.size()));
        System.out.printf("Female employees percentage : %.2f\n", ((femaleDistribution * 100) / employees.size()));

        System.out.println("Gender distribution among employees respective their professional role");

        System.out.printf("Male programmers percentage: %.2f\n", ((maleProgrammers * 100) / programmers));
        System.out.printf("Female programmers percentage : %.2f\n", ((femaleProgrammers * 100) / programmers));

        System.out.printf("Male graphic designres percentage: %.2f\n", ((maleGraphicDesigner * 100) / graphicDesigner));
        System.out.printf("Female graphic designers percentage : %.2f\n", ((femaleGraphicDesigner * 100) / graphicDesigner));

        System.out.printf("Male programmers percentage: %.2f\n", ((maleTestSpecialists * 100) / testSpecialists));
        System.out.printf("Female programmers percentage : %.2f\n", ((femaleTestSpecialists * 100) / testSpecialists));
    }

    public static void findHighestPaidEmployee() {

        int highestSalary = 0;

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).getSalary() > employees.get(highestSalary).getSalary()) {

                highestSalary = i;
            }

        }

        System.out.println(employees.get(highestSalary));

    }

    public static void findLowestPaidEmployee() {

        int lowestSalary = 0;

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).getSalary() < employees.get(lowestSalary).getSalary()) {

                lowestSalary = i;
            }
        }
        System.out.println(employees.get(lowestSalary));
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
}
