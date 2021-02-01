package polymorphism;

import static polymorphism.MainPoly.*;
import static polymorphism.Methods.sc;
import static polymorphism.Utilities.readBoolean;
import static polymorphism.Utilities.readDouble;
import static polymorphism.Utilities.readInt;

public class TestSpecialist extends Employee {

    private boolean ISTQBcertified;
    private static int noOfTestSpecialists;
    private static int noOfMaleTestSpecialists;
    private static int noOfFemaleTestSpecialists;

    {
        noOfTestSpecialists += 1;
    }

    public TestSpecialist() {

    }

    public TestSpecialist(boolean ISTQBcertified, String name, String gender, double salary) {
        super(name, gender, salary);
        this.ISTQBcertified = ISTQBcertified;

        if (gender.equalsIgnoreCase("male")) {
            noOfMaleTestSpecialists += 1;
        } else if (gender.equalsIgnoreCase("female")) {
            noOfFemaleTestSpecialists += 1;
        }

    }

    public boolean isISTQBcertified() {
        return ISTQBcertified;
    }

    public void setISTQBcertified(boolean ISTQBcertified) {
        this.ISTQBcertified = ISTQBcertified;
    }

    public static int getNoOfTestSpecialists() {
        return noOfTestSpecialists;
    }

    public static void setNoOfTestSpecialists(int aNoOfTestSpecialists) {
        noOfTestSpecialists = aNoOfTestSpecialists;
    }

    public static int getNoOfMaleTestSpecialists() {
        return noOfMaleTestSpecialists;
    }

    public static void setNoOfMaleTestSpecialists(int aNoOfMaleTestSpecialists) {
        noOfMaleTestSpecialists = aNoOfMaleTestSpecialists;
    }

    public static int getNoOfFemaleTestSpecialists() {
        return noOfFemaleTestSpecialists;
    }

    public static void setNoOfFemaleTestSpecialists(int aNoOfFemaleTestSpecialists) {
        noOfFemaleTestSpecialists = aNoOfFemaleTestSpecialists;
    }

    @Override
    public void add() {

        super.add();

        System.out.println("Is Test Specialist ISTQB certified? Write true or false");
        this.setISTQBcertified(readBoolean());

        if (this.getGender().equalsIgnoreCase("male")) {
            noOfMaleTestSpecialists += 1;
        } else if (this.getGender().equalsIgnoreCase("female")) {
            noOfFemaleTestSpecialists += 1;
        }

        employees.add(this);
    }

    @Override
    public void update() {
        System.out.println("4. ISTQB Certified (true or false)?");
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
                this.setISTQBcertified(Utilities.readBoolean());
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong input. Please try again.");
        }
    }

    @Override
    public void bonus() {
//        this.setSalaryWithBonus(this.getSalary()*(1.02));
        this.setSalaryWithBonus(this.getSalary() + 500);

        this.setBonus(500.00);

    }

    @Override
    public String toString() {

        return super.toString() + "ISTQB Certified:" + Utilities.theStringTrimmer(String.valueOf(ISTQBcertified));
    }

}
