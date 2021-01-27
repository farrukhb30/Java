/**
 *
 * @author toros
 */
package polymorphism;


public class TestSpecialist extends Employee{
    private boolean ISTQBcertified;
    
    public TestSpecialist() {
        
    }


    public TestSpecialist(boolean ISTQBcertified, String name, String gender, double salary, double bonus) {
        super(name, gender, salary, bonus);
        this.ISTQBcertified = ISTQBcertified;
    }

    public boolean isISTQBcertified() {
        return ISTQBcertified;
    }

    public void setISTQBcertified(boolean ISTQBcertified) {
        this.ISTQBcertified = ISTQBcertified;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TestSpecialists{ISTQBcertified=").append(ISTQBcertified);
        sb.append('}');
        return super.toString() + sb.toString();
    }

    

}
