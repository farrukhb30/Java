
package polymorphism;

import static polymorphism.MainPoly.employees;
import static polymorphism.Methods.sc;
import static polymorphism.Utilities.*;

public class GraphicDesigner extends Employee {

    private String techStack;

    public GraphicDesigner() {

    }

    public GraphicDesigner(String techStack, String name, String gender, double salary) {
        super(name, gender, salary);
        this.techStack = techStack;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    @Override
    public void add() {

        super.add();
        
        System.out.println("Input Tech Stack:");
        this.setTechStack(sc.nextLine());
        
        employees.add(this);
    }

    @Override
    public void update() {
        System.out.println("4. Tech Stack?");
            System.out.println("0. Exit");

            switch (readInt()) {
                case 1:
                    this.setName(sc.nextLine());
                    break;
                case 2:
                    this.setGender(sc.nextLine());
                    break;
                case 3:
                    this.setSalary(readDouble());
                    break;
                case 4:
                    this.setTechStack(sc.nextLine());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input. Please try again.");
            }
    }
    
    

    @Override
    public void bonus() {

        this.setSalaryWithBonus(this.getSalary() * (1.025));

        this.setBonus(this.getSalary() * (0.025));
    }

    @Override
    public String toString() {
        return super.toString() + "TechStack:" + theStringTrimmer(techStack);
    }

}
