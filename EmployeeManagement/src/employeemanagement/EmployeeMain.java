
package employeemanagement;

import java.util.ArrayList;

public class EmployeeMain {
    
    static ArrayList<Employee> employees = new ArrayList<>();
    static boolean loopIterator = true;
    
    public static void main(String[] args) {
        
        EmployeeManagement.loadDB();
        
        GenderType.byOrdinal(2);
        
        do{
            
            UI.startProgMenu();
            loopIterator = false;
            
            
            employees.forEach((e) -> {
                System.out.println(e);
            });
            
        }while(loopIterator);
       

        
    }
    
}
