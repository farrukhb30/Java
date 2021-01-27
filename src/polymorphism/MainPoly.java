/**
 *
 * @author toros
 */
package polymorphism;

import java.util.ArrayList;
import static polymorphism.StaffManagement.*;

public class MainPoly {

    public static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {

        loadDB();
        while (true) {
            UI.runProgram();
        }
    }
}
