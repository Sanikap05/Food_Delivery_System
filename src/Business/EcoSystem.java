/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private RestaurantDirectory restaurantDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private Map<UserAccount,Customer>  userCust;
    
     private EcoSystem(){
        super(null);
        userCust = new HashMap();
        customerDirectory = new CustomerDirectory();
        restaurantDirectory = new RestaurantDirectory();
        deliveryManDirectory = new DeliveryManDirectory();
    }
     
    public DeliveryManDirectory getDeliveryManDirectory() {
        if(deliveryManDirectory == null)
        {
            deliveryManDirectory = new DeliveryManDirectory();
        }
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    public Map<UserAccount, Customer> getUserCust() {
        if(userCust == null){
            userCust = new HashMap();
        }
        return userCust;
    }

    public void setUserCust(Map<UserAccount, Customer> userCust) {
        this.userCust = userCust;
    }
    

    public CustomerDirectory getCustomerDirectory() {
        if(customerDirectory == null)
        {
            customerDirectory = new CustomerDirectory();
        }
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
     
    public Restaurant createRestaurant(String name, String address, String username){
      Restaurant restaurant = new Restaurant(name, address, username);
      restaurantDirectory.addRestaurant(restaurant);
       return restaurant;
    }

    public RestaurantDirectory getRestaurantDirectory() {
        if(restaurantDirectory == null)
        {
            restaurantDirectory = new RestaurantDirectory();
        }
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }
    
    
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
       if(this.getUserAccountDirectory().checkIfUsernameIsUnique(userName))
       {
           return true;
       }
       else
       {
         return false;
       }
    }
}
