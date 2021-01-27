
package employeemanagement;

public class GraphicDesigner extends Employee{
    
    private String toolOfExpertise;

    public GraphicDesigner() {
    }

    public GraphicDesigner(String toolOfExpertise, String employeeName, GenderType employeeGender, double employeeYearsOfExperience, double employeeSalary) {
        super(employeeName, employeeGender, employeeYearsOfExperience, employeeSalary);
        this.toolOfExpertise = toolOfExpertise;
    }

    public String getToolOfExpertise() {
        return toolOfExpertise;
    }

    public void setToolOfExpertise(String toolOfExpertise) {
        this.toolOfExpertise = toolOfExpertise;
    }

    @Override
    public String toString() {
        return super.toString() + ", ToolOfExpertise:" + toolOfExpertise;
    }
    
    
    
}
