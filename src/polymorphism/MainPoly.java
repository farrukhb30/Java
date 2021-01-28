/**
 *
 * @author Toros Kutlu - Farrukh Mahmood
 * @Date 2021-01-28
 */
package polymorphism;

import java.util.ArrayList;
import static polymorphism.EmployeeManagement.*;

public class MainPoly {

    public static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {

        loadDB();
        while (true) {
            UI.runProgram();
        }
    }

    public static String methodName(String s) {

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

