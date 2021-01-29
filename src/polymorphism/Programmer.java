/**
 *
 * @author toros
 */
package polymorphism;

import static polymorphism.Utilities.*;


public class Programmer extends Employee{
    private String codeLang;
    
    public Programmer() {
        
    }

    public Programmer(String codeLang, String name, String gender, double salary) {
        super(name, gender, salary);
        this.codeLang = codeLang;
    }

    public String getCodeLang() {
        return codeLang;
    }

    public void setCodeLang(String codeLang) {
        this.codeLang = codeLang;
    }

    @Override
    public void bonus() {
        
        this.setSalaryWithBonus(this.getSalary()*(1.01));
        
        this.setBonus(this.getSalary()*(0.01));
        
    }

    
    
    @Override
    public String toString() {
        return super.toString() + "CodeLang=" + Utilities.theStringTrimmer(codeLang) ;
    }
    
    
}
