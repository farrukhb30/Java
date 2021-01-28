
package polymorphism;


public class TestSpecialist extends Employee{
    private boolean ISTQBcertified;
    
    public TestSpecialist() {
        
    }


    public TestSpecialist(boolean ISTQBcertified, String name, String gender, double salary) {
        super(name, gender, salary);
        this.ISTQBcertified = ISTQBcertified;
    }

    public boolean isISTQBcertified() {
        return ISTQBcertified;
    }

    public void setISTQBcertified(boolean ISTQBcertified) {
        this.ISTQBcertified = ISTQBcertified;
    }

    @Override
    public void bonus() {
//        this.setSalaryWithBonus(this.getSalary()*(1.02));
        this.setSalaryWithBonus(this.getSalary()+500);
    }
    
    @Override
    public String toString() {
        
        return super.toString() + " ISTQB Certified:" + ISTQBcertified ;
    }

    

}
