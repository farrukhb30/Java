
package employeemanagement;

import static employeemanagement.EmployeeMain.employees;

public class EmployeeManagement {


    public static void loadDB (){
    
        Programmer p = new Programmer("Java", "Farrukh", GenderType.MALE, 1.5, 50000);
        Programmer p1 = new Programmer("Pyhton", "Faiza", GenderType.FEMALE, 2.5, 65000);
        
        GraphicDesigner g = new GraphicDesigner("Adobe Photoshop", "Peter Ashberg", GenderType.MALE, 2, 45000);
        GraphicDesigner g1 = new GraphicDesigner("AutoCAD", "Maria Ericsson", GenderType.FEMALE, 2, 75000);
        
        TestSpecialist t = new TestSpecialist(true, "Marcus Persson", GenderType.MALE, 5.5, 78000);
        TestSpecialist t1 = new TestSpecialist(false, "Johan Wedin", GenderType.MALE, 6.5, 88000);
        
        employees.add(p);
        employees.add(p1);
        employees.add(g);
        employees.add(g1);
        employees.add(t);
        employees.add(t1);
    }
    
    static void startProg(){
    
        System.out.println(">>>>>Employee Management System<<<<<");
        System.out.println("    Choose from a menu below:");
        System.out.println("1. Add Employee");
        System.out.println("2. Update Employee");
        System.out.println("3. Remove Employee");
        System.out.println("4. Employee Statistics");
        System.out.println("0. Exit");
    }
    
}
