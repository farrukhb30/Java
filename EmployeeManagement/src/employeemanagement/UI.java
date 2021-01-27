package employeemanagement;

import static employeemanagement.EmployeeManagement.sc;

public class UI {

    static int choiceStartProg = 0;

    public static void startProgMenu() {

        System.out.println(">>>>>Employee Management System<<<<<");
        System.out.println("    Choose from a menu below:");
        System.out.println("1. Add Employee");
        System.out.println("2. Update Employee");
        System.out.println("3. Remove Employee");
        System.out.println("4. Employee Statistics");
        System.out.println("0. Exit");

        mainMenu(Utilities.readInt());

    }

    public static void mainMenu(int choice) {

        switch (choice) {

            case 1:
                
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 0: default:
                    System.exit(0);
        }
    }
    
    public static int addEmployeeMenu(){
    
        System.out.println("Please specify if an Employee is:");
        System.out.println("1. Programmer");
        System.out.println("2. Graphic Designer");
        System.out.println("3. Test Specialist");
        
        return Utilities.readInt();
    }
    
    public static void createEmployee(int choice){
    
        switch (choice) {
            case 1:
                Programmer p = new Programmer();
                System.out.print("Name:");
                p.setEmployeeName(sc.nextLine());
                System.out.print("Gender:");
                System.out.println("1. Male, 2.Female, 3.Unknown");
//                p.setEmployeeGender(GenderType[Utilities.readInt()]);
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }
    
//    public static Gendertype returnGender(int choice){
//    
//        return GenderType.valueOf(Male);
//    }
}
