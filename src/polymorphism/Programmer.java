/**
 *
 * @author toros
 */
package polymorphism;

import static polymorphism.MainPoly.employees;
import static polymorphism.Methods.sc;
import static polymorphism.Utilities.*;

public class Programmer extends Employee {

    private String codeLang;

    public Programmer() {

    }

    public Programmer(String codeLang, String name, String gender, double salary) {
        super(name, gender, salary);
        this.codeLang = codeLang;
    }

    public String getCodeLang() {
        return codeLang;
    }

    public void setCodeLang(String codeLang) {
        this.codeLang = codeLang;
    }

    @Override
    public void bonus() {

        this.setSalaryWithBonus(this.getSalary() * (1.01));

        this.setBonus(this.getSalary() * (0.01));

    }

    @Override
    public void add() {

        super.add();

        System.out.println("Input programming language:");
        this.setCodeLang(sc.nextLine());

        employees.add(this);
    }

    @Override
    public void update() {
        System.out.println("4. Code language?");
        System.out.println("0. Exit");

        switch (readInt()) {
            case 1:
                this.setName(sc.nextLine());
                break;
            case 2:
                this.setGender(sc.nextLine());
                break;
            case 3:
                this.setSalary(readDouble());
                break;
            case 4:
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
