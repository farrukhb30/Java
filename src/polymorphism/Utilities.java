package polymorphism;

import java.util.InputMismatchException;
import static polymorphism.Methods.*;

public class Utilities {
    
        public static double readDouble() {

        boolean loop = true;
        double number = -1;

        while (loop) {
            try {
                number = sc.nextDouble();
                sc.nextLine();
                loop = false;
            }
            
            catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Invalid input. Please try again.");
            }
        } // loop
        return number;
    }

//    public static boolean readBoolean() {
//        boolean choice = Methods.sc.nextBoolean();
//        Methods.sc.nextLine();
//        return choice;
//    }
    
        public static boolean readBoolean() {

        boolean loop = true;
        boolean certificate = false;

        while (loop) {
            try {
                certificate = sc.nextBoolean();
                sc.nextLine();
                loop = false;
            }
            
            catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Invalid input. Please try again.");
            }
        } // loop
        return certificate;
    }

    public static int readInt() {

        boolean loop = true;
        int number = -1;

        while (loop) {
            try {
                number = sc.nextInt();
                sc.nextLine();
                loop = false;
            }
            
            catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Invalid input. Please try again.");
            }
        } // loop
        return number;
    }

    public static String theStringTrimmer(String s) {
        if (s.length() < 15) {
            int max = 15 - s.length();
            for (int i = 0; i <= max; i++) {
                s = s + " ";
            }
        } else {
            s = s.substring(0, 15);
        }
        return s;
    }

    public static void tableHeader() {
        System.out.println("ID              Name            Gender          Salary          Salary & Bonus  Qualifications");
    }
    
        public static void loadDB() {

        Programmer p1 = new Programmer("Java", "Toros Kutlu", "male", 50000.25);
        Programmer p2 = new Programmer("Python", "Lara Karlsson", "female", 60000.50);
        GraphicDesigner g1 = new GraphicDesigner("PhotoShop", "Sara Anderson", "female", 40000);
        GraphicDesigner g2 = new GraphicDesigner("Gimp", "Urban Petri", "male", 35000.999);
        TestSpecialist t1 = new TestSpecialist(true, "Maria Pirat", "female", 6500);
        TestSpecialist t2 = new TestSpecialist(false, "Pajeet Singh", "male", 6500);
        TestSpecialist t3 = new TestSpecialist(false, "Lara Karlsson", "female", 165000.8776554435);

        
        StaffManagement.employees.add(p1);
        StaffManagement.employees.add(p2);
        StaffManagement.employees.add(g1);
        StaffManagement.employees.add(g2);
        StaffManagement.employees.add(t1);
        StaffManagement.employees.add(t2);
        StaffManagement.employees.add(t3);
       
        for (Employee employee : StaffManagement.employees) {
            employee.bonus();
        }


        Methods.printAllEmployees();
        System.out.println("");
    }
}
