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
    
    private String customerUsername;

    public String getCustomerUsername() {
        return customerUsername;
    }

    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }
    
    private String name;
    private List<Order> CustOrders;
    private String customerAdd;
    private String CustomerCode;
    
    public Customer(String name, String customerUsername,String customerAdd, String CustomerCode) {
        this.name = name;
        this.customerUsername=customerUsername;
        this.CustomerCode=CustomerCode;
        this.customerAdd=customerAdd;
    }

    public String getCustomerAdd() {
        return customerAdd;
    }

    public void setCustomerAdd(String customerAdd) {
        this.customerAdd = customerAdd;
    }

    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String CustomerCode) {
        this.CustomerCode = CustomerCode;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getCustOrders() {
        if(CustOrders == null)
        {
            CustOrders = new ArrayList();
        }
        return CustOrders;
    }

    public void setCustOrders(List<Order> custOrders) {
        this.CustOrders = custOrders;
    }
    

    @Override
    public String toString() {
        return this.getName();
    }
  
}
