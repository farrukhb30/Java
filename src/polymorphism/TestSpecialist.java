package polymorphism;

import static polymorphism.Methods.sc;
import static polymorphism.Utilities.readBoolean;
import static polymorphism.Utilities.readDouble;
import static polymorphism.Utilities.readInt;

public class TestSpecialist extends Employee implements StaffManagement{

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
    public void addEmployee() {

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
            case 1 -> {
                System.out.print("New name: ");
                this.setName(sc.nextLine());
            }
            case 2 -> {
                System.out.print("New gender: ");
                this.setGender(sc.nextLine());
            }
            case 3 -> {
                System.out.print("New salary: ");
                this.setSalary(readDouble());
                this.bonus();
            }
            case 4 -> {
                System.out.println("ISTQB Certified (true / false): ");
                this.setISTQBcertified(Utilities.readBoolean());
            }
            case 0 -> System.exit(0);
            default -> System.out.println("Wrong input. Please try again.");
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
