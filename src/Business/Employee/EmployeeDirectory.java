/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Raunak
 */
public class EmployeeDirectory {
    
    private List<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee(name);
        employeeList.add(employee);
        return employee;
    }
    
    public void deleteEmployee(Employee emp) {
        this.employeeList.remove(emp);
    }
}