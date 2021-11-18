/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author harold
 */
public class Menu {
    
    String food_Item;
    Float value;

    public Menu(String food_Item, Float value) {
        this.food_Item = food_Item;
        this.value = value;
    }

    public String getFoodItem() {
        return food_Item;
    }

    public void setFoodItem(String foodItem) {
        this.food_Item = foodItem;
    }

    public Float getPrice() {
        return value;
    }

    public void setPrice(Float price) {
        this.value = price;
    }

    @Override
    public String toString() {
        return this.getFoodItem();
    }
    
    
}
