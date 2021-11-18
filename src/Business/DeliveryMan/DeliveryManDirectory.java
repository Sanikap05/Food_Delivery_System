/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Customer.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sanik
 */
public class DeliveryManDirectory {
    
    private List<DeliveryMan> deliveryList;

    public DeliveryManDirectory() {
        deliveryList = new ArrayList();
    }

    public List<DeliveryMan> getDeliverymanList() {
        return deliveryList;
    }

    public void setDeliverymanList(List<DeliveryMan> deliverymanList) {
        this.deliveryList = deliverymanList;
    }

 
    public DeliveryMan createDeliveryman(String name, String username){
       
      DeliveryMan deliveryman = new DeliveryMan(name, username);
        deliveryList.add(deliveryman);
      return deliveryman;
    }
    
    public void deleteDeliveryman(DeliveryMan d) {
        deliveryList.remove(d);
    }
}
