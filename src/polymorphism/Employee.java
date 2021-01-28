/**
 *
 * @author toros
 */
package polymorphism;


public class Employee {
    public static int employeeNumberGenerator = 1; 
    private int employeeNr;
    private String name;
    private String gender;
    private double salary;
    private double bonus;
    
    public Employee() {
        this.employeeNr = employeeNumberGenerator++;
        
    }
    
    public Employee(String name, String gender, double salary, double bonus) {
        
        this.employeeNr = employeeNumberGenerator++;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
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

    @Override
    public String toString() {
        return "ID:" + employeeNr + ", Name:" + name + ", Gender:" + gender + ", Salary:" + salary + ", Bonus:" + bonus ;
    }
    
    
}


