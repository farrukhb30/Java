/**
 *
 * @author toros
 */
package polymorphism;

import static polymorphism.Utilities.*;


public class GraphicDesigner extends Employee{
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
    public void bonus() {
        
        this.setSalaryWithBonus(this.getSalary()*(1.025));
        
        this.setBonus(this.getSalary()*(0.025));
        
    }
    
    @Override
    public String toString() {
        return super.toString() + "TechStack:" + theStringTrimmer(techStack) ;
    }
    
    
}
