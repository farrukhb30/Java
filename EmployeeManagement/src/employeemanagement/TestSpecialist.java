
package employeemanagement;

public class TestSpecialist extends Employee {
    
    private boolean certifiedISTQB;

    public TestSpecialist() {
    }

    public TestSpecialist(boolean certifiedISTQB, String employeeName, GenderType employeeGender, double employeeYearsOfExperience, double employeeSalary) {
        super(employeeName, employeeGender, employeeYearsOfExperience, employeeSalary);
        this.certifiedISTQB = certifiedISTQB;
    }

    public boolean isCertifiedISTQB() {
        return certifiedISTQB;
    }

    public void setCertifiedISTQB(boolean certifiedISTQB) {
        this.certifiedISTQB = certifiedISTQB;
    }

    @Override
    public String toString() {
        return super.toString() + "\tCertifiedISTQB:" + certifiedISTQB;
    }
    
    
}
