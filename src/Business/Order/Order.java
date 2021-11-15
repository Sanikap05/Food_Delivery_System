/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Restaurant.Menu;
import Business.Restaurant.Restaurant;
import java.security.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Sanik
 */
public class Order {
    
    int orderId;
    List<Menu> orderItems;
    Map<String, Float> orderMap;
    float total;
    private static int count = 1;

    public Order(Map<String, Float> orderMap, float total) {
        this.orderMap = orderMap;
        this.total = total;
    }
    
    public int getOrderId() {
        return orderId;
    }
    
    public void setOrderId()
    {
        //long id = System.currentTimeMillis();
       
        this.orderId = count;
        count++;
    }

    public List<Menu> getOrderItems() {
        return orderItems;
    }

    public Map<String, Float> getOrderMap() {
        if(this.orderMap == null)
        {
           return new HashMap();
        }
        return this.orderMap;
    }

    public void setOrderMap(Map<String, Float> orderMap) {
        this.orderMap = orderMap;
    }
 
    
    public void setOrderItems(List<Menu> orderItems) {
        this.orderItems = orderItems;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
   
}
