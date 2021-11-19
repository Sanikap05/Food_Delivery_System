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
    
    private List<DeliveryMan> deliverymanList;

    public DeliveryManDirectory() {
        deliverymanList = new ArrayList();
    }

//    public List<DeliveryMan> getDeliverymanList() {
//        return deliverymanList;
//    }
//
//    public void setDeliverymanList(List<DeliveryMan> deliverymanList) {
//        this.deliverymanList = deliverymanList;
//    }
    
    

    public List<DeliveryMan> getDeliverymanList() {
        return deliverymanList;
    }

    public void setDeliverymanList(List<DeliveryMan> deliverymanList) {
        this.deliverymanList = deliverymanList;
    }

 
    public DeliveryMan createDeliveryman(String name, String username){
       
      DeliveryMan deliveryman = new DeliveryMan(name, username);
        deliverymanList.add(deliveryman);
      return deliveryman;
    }
    
    public void deleteDeliveryman(DeliveryMan d) {
        deliverymanList.remove(d);
    }
}
