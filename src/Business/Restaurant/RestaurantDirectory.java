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
    
    private List<Restaurant> restaurantList;

    public RestaurantDirectory() {
        restaurantList = new ArrayList();
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(List<Restaurant> restaurant_List) {
        this.restaurantList = restaurant_List;
    }
    
    public void addRestaurant(Restaurant restaurant){
        this.restaurantList.add(restaurant);
    }
    
    public void deleteRestaurant(Restaurant r) {
        this.restaurantList.remove(r);
    }
}
