/*
 * HealthOSLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AllFoodRestaurantsResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5224784580927728642L;
    private String restaurantName;
    private String foodRestaurantId;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("restaurant_name")
    public String getRestaurantName ( ) { 
        return this.restaurantName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("restaurant_name")
    public void setRestaurantName (String value) { 
        this.restaurantName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("food_restaurant_id")
    public String getFoodRestaurantId ( ) { 
        return this.foodRestaurantId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("food_restaurant_id")
    public void setFoodRestaurantId (String value) { 
        this.foodRestaurantId = value;
    }
 
}
 