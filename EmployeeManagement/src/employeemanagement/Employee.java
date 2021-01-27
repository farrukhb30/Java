package employeemanagement;

class Employee {

    static int idGenerator = 1;
    private int employeeId;
    private String employeeName;
    private GenderType employeeGender;
    private double employeeYearsOfExperience;
    private double employeeSalary;

    public Employee() {
    }
    
    public Employee(String employeeName, GenderType employeeGender, double employeeYearsOfExperience, double employeeSalary) {
        this.employeeId = idGenerator++;
        this.employeeName = employeeName;
        this.employeeGender = employeeGender;
        this.employeeYearsOfExperience = employeeYearsOfExperience;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public GenderType getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(GenderType employeeGender) {
        this.employeeGender = employeeGender;
    }

    public double getEmployeeYearsOfExperience() {
        return employeeYearsOfExperience;
    }

    public void setEmployeeYearsOfExperience(double employeeYearsOfExperience) {
        this.employeeYearsOfExperience = employeeYearsOfExperience;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Id:" + employeeId + ", Name:" + employeeName + ", Gender:" + employeeGender + ", YearsOfExperience:" + employeeYearsOfExperience + ", Salary:" + employeeSalary ;
    }

    
    

    
}
