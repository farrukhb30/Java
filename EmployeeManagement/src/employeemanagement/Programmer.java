
package employeemanagement;

public class Programmer extends Employee {
    
    private String codingLanguage;

    public Programmer() {
    }

    public Programmer(String codingLanguage, String employeeName, GenderType employeeGender, double employeeYearsOfExperience, double employeeSalary) {
        super(employeeName, employeeGender, employeeYearsOfExperience, employeeSalary);
        this.codingLanguage = codingLanguage;
    }

    public String getCodingLanguage() {
        return codingLanguage;
    }

    public void setCodingLanguage(String codingLanguage) {
        this.codingLanguage = codingLanguage;
    }

    @Override
    public String toString() {
        return super.toString() + "\tCodeLanguage:" + codingLanguage;
    }

    
    
    
}
