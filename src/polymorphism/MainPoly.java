/**
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

}

