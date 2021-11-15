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
 * @author Sanik
 */
public class Menu {
    
    String foodItem;
    Float price;

    public Menu(String foodItem, Float price) {
        this.foodItem = foodItem;
        this.price = price;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.getFoodItem();
    }
    
    
}
