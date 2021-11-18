/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.Order;
import Business.Restaurant.Menu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Harold
 */
public class Customer {
    
    private String custuser;

    public String getCustomerUsername() {
        return custuser;
    }

    public void setCustomerUsername(String customerUsername) {
        this.custuser = customerUsername;
    }
    
    private String cust_name;
    private List<Order> custorder;
    
    public Customer(String name, String customerUsername) {
        this.cust_name = name;
        this.custuser=customerUsername;
    }
    
    public String getName() {
        return cust_name;
    }

    public void setName(String name) {
        this.cust_name = name;
    }

    public List<Order> getCustOrders() {
        if(custorder == null)
        {
            custorder = new ArrayList();
        }
        return custorder;
    }

    public void setCustOrders(List<Order> custOrders) {
        this.custorder = custOrders;
    }
    

    @Override
    public String toString() {
        return this.getName();
    }
  
}
