/**
 *
 * @author toros
 */
package polymorphism;
import static polymorphism.MainPoly.*;
import java.text.DecimalFormat;


public class Employee {
    DecimalFormat df = new DecimalFormat("###.##");

    public static int employeeNumberGenerator = 1; 
    private int employeeNr;
    private String name;
    private String gender;
    private double salary;
    private double bonus;
    private double salaryWithBonus;
    
    public Employee() {
        this.employeeNr = employeeNumberGenerator++;
        
    }
    
    public Employee(String name, String gender, double salary) {
        
        this.employeeNr = employeeNumberGenerator++;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.salaryWithBonus = salary;
    }

    public double getSalaryWithBonus() {
        return salaryWithBonus;
    }

    public void setSalaryWithBonus(double salaryWithBonus) {
        this.salaryWithBonus = salaryWithBonus;
    }

    public int getEmployeeNr() {
        return employeeNr;
    }

    public void setEmployeeNr(int employeeNr) {
        this.employeeNr = employeeNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
    public void bonus(){
    }

//    @Override
//    public String toString() {
//       
//       return "ID:" + employeeNr + " Name:" + name + " Gender:" + gender + " Salary:" + df.format(salary) + " Salary With Bonus:" + df.format(salaryWithBonus);
//
//    }
    
    @Override
    public String toString() {

        return "ID:" + methodName(String.valueOf(employeeNr)) + " Name:" + methodName(name) + " Gender:" + methodName(gender) + " Salary:" + methodName(df.format(salary)) + " Salary With Bonus:" + methodName(df.format(salaryWithBonus));

    }
    
    
    
}


