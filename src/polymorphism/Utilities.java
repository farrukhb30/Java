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

}
