
package polymorphism;

import java.util.ArrayList;


public interface StaffManagement{

    public static ArrayList<Employee> employees = new ArrayList<>();

    void addEmployee();

    void bonus();

    String toString();

    void update();
    
}