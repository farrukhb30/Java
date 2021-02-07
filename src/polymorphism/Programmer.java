/**
 *
 * @author toros
 */
package polymorphism;

import static polymorphism.Methods.sc;
import static polymorphism.Utilities.*;

public class Programmer extends Employee implements StaffManagement {

    private String codeLang;
    private static int noOfProgrammers;
    private static int noOfMaleProgrammers;
    private static int noOfFemaleProgrammers;

    // how does this work ?
    { 
        noOfProgrammers += 1;
    }

    public Programmer() {

    }

    public Programmer(String codeLang, String name, String gender, double salary) {
        super(name, gender, salary);
        this.codeLang = codeLang;

        if (gender.equalsIgnoreCase("male")) {
            noOfMaleProgrammers += 1;
        } else if (gender.equalsIgnoreCase("female")) {
            noOfFemaleProgrammers += 1;
        }
    }

    public static int getNoOfProgrammers() {
        return noOfProgrammers;
    }

    public static void setNoOfProgrammers(int aNoOfProgrammers) {
        noOfProgrammers = aNoOfProgrammers;
    }

    public static int getNoOfMaleProgrammers() {
        return noOfMaleProgrammers;
    }

    public static void setNoOfMaleProgrammers(int aNoOfMaleProgrammers) {
        noOfMaleProgrammers = aNoOfMaleProgrammers;
    }

    public static int getNoOfFemaleProgrammers() {
        return noOfFemaleProgrammers;
    }

    public static void setNoOfFemaleProgrammers(int aNoOfFemaleProgrammers) {
        noOfFemaleProgrammers = aNoOfFemaleProgrammers;
    }

    public String getCodeLang() {
        return codeLang;
    }

    public void setCodeLang(String codeLang) {
        this.codeLang = codeLang;
    }

    @Override
    public void bonus() { // polymorphism ?

        this.setSalaryWithBonus(this.getSalary() * (1.01));

        this.setBonus(this.getSalary() * (0.01));

    }

    @Override
    public void addEmployee() {

        super.add(); // add() method from super class first and then below

        System.out.println("Input programming language:");
        this.setCodeLang(sc.nextLine()); // this ??

        if (this.getGender().equalsIgnoreCase("male")) {
            noOfMaleProgrammers += 1; // noOfMaleProgrammers++ ?
        } else if (this.getGender().equalsIgnoreCase("female")) {
            noOfFemaleProgrammers += 1;
        }

        StaffManagement.employees.add(this); // this ??
    }

    @Override
    public void update() { // polymorphism ??
        System.out.println("4. Code language?");
        System.out.println("0. Exit");

        switch (readInt()) {
            case 1:
                System.out.print("New name: ");
                this.setName(sc.nextLine());
                break;
            case 2:
                System.out.print("New gender: ");
                this.setGender(sc.nextLine());
                break;
            case 3:
                System.out.print("New salary: ");
                this.setSalary(readDouble());
                this.bonus();
                break;
            case 4:
                System.out.print("New code language: ");
                this.setCodeLang(sc.nextLine());
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong input. Please try again.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "CodeLang=" + Utilities.theStringTrimmer(codeLang);
    }
}
