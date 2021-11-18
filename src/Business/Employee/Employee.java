/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author Raunak
 */
public class Employee {
    
    private String name;
    private int id;
    private static int count = 1;

    public Employee(String name) {
        this.name = name;
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return this.getName();
    }
    
    
}
