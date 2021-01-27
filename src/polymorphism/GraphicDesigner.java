/**
 *
 * @author toros
 */
package polymorphism;


public class GraphicDesigner extends Employee{
    private String techStack;
    
    public GraphicDesigner() {
        
    }

    public GraphicDesigner(String techStack, String name, String gender, double salary, double bonus) {
        super(name, gender, salary, bonus);
        this.techStack = techStack;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    @Override
    public String toString() {
        return super.toString() + "techStack=" + techStack + '}';
    }
    
    
}
