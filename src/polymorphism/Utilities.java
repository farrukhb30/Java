
package polymorphism;

public class Utilities {

    public static double readDouble() {
        double choice = Methods.sc.nextDouble();
        Methods.sc.nextLine();
        return choice;
    }

    public static boolean readBoolean() {
        boolean choice = Methods.sc.nextBoolean();
        Methods.sc.nextLine();
        return choice;
    }

    public static int readInt() {
        int choice = Methods.sc.nextInt();
        Methods.sc.nextLine();
        return choice;
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
    
}
