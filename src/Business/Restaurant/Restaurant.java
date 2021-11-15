/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Order.Order;
import Business.Organization;
import Business.Role.Role;
import com.db4o.collections.ArrayList4;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class Restaurant extends Organization{
    
    String name;
    String address;
    String restaurantAdminUsername;
    List<Menu> menu;
    List<Order> restOrders;

    
    public Restaurant(String name, String restaurantAdminUsername, String address) {
        super(name);
        this.name = name;
        this.address = address;
        this.restaurantAdminUsername = restaurantAdminUsername;
        this.menu = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    
    public void setAddress() {
        this.address = address;
    }

    public String getRestaurantAdminUsername() {
        return restaurantAdminUsername;
    }

    public void setRestaurantAdminUsername(String restaurantAdminUsername) {
        this.restaurantAdminUsername = restaurantAdminUsername;
    }

    public List<Menu> getMenu() {
        if(menu == null)
        {
            menu = new ArrayList();
        }
        return menu;
    }

    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }

    public List<Order> getRestOrders() {
        if(this.restOrders == null)
        {
            restOrders = new ArrayList();
        }
        return restOrders;
    }

    public void setRestOrders(List<Order> restOrders) {
        this.restOrders = restOrders;
    }
       
    
    @Override
    public String toString() {
        return this.getRestaurantAdminUsername();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
