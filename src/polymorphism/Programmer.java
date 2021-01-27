/**
 *
 * @author toros
 */
package polymorphism;


public class Programmer extends Employee{
    private String codeLang;
    
    public Programmer() {
        
    }

    public Programmer(String codeLang, String name, String gender, double salary, double bonus) {
        super(name, gender, salary, bonus);
        this.codeLang = codeLang;
    }

    public String getCodeLang() {
        return codeLang;
    }

    public void setCodeLang(String codeLang) {
        this.codeLang = codeLang;
    }

    @Override
    public String toString() {
        return super.toString() + "codeLang=" + codeLang + '}';
    }
    
    
}
