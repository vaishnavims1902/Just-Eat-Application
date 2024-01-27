package com.justeat.justeatapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "foodItems")
public class FoodItems {
   @Id
   @GeneratedValue
   private int foodId;

   private String foodName;
   private double price;
   private String category;

   @ManyToOne
    private Restaurants restaurant;
    
    @ManyToOne
    private Orders order;
public int getFoodId() {
    return foodId;
}
public void setFoodId(int foodId) {
    this.foodId = foodId;
}
public String getFoodName() {
    return foodName;
}
public void setFoodName(String foodName) {
    this.foodName = foodName;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
}
public String getCategory() {
    return category;
}
public void setCategory(String category) {
    this.category = category;
}
@Override
public String toString() {
    return "FoodItems [foodId=" + foodId + ", foodName=" + foodName + ", price=" + price + ", category=" + category
            + "]";
}
   


}
