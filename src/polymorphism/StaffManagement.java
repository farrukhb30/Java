/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import java.util.ArrayList;

/**
 *
 * @author toros
 */
public interface StaffManagement{

    public static ArrayList<Employee> employees = new ArrayList<>();
    
    // public static final
    // double CONSTANTPI = 3.14;

    // public
    void addEmployee();

    void bonus();

    String toString();

    void update();
    
}