/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    private List<Restaurant> restaurant_List;

    public RestaurantDirectory() {
        restaurant_List = new ArrayList();
    }

    public List<Restaurant> getRestaurantList() {
        return restaurant_List;
    }

    public void setRestaurantList(List<Restaurant> restaurant_List) {
        this.restaurant_List = restaurant_List;
    }
    
    public void addRestaurant(Restaurant restaurant){
        this.restaurant_List.add(restaurant);
    }
    
    public void deleteRestaurant(Restaurant r) {
        this.restaurant_List.remove(r);
    }
}
