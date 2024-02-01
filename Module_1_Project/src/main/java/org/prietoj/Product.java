package org.prietoj;

import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable
{
    private String upc;
    private String description;
    private BigDecimal price;
    private Integer stock;


    //getters and setters related to the Product

    //get products ID number
    public String getUpc(){
        return upc;
    }

    //get description of the product
    public String getDescription(){
        return description;
    }

    //get price of the product
    public BigDecimal getPrice(){
        return price;
    }

    //get the amount of the product that is in stock
    public Integer getStock(){
        return stock;
    }

    //set the products ID num
    public void setUpc(String upc){
        this.upc = upc;
    }

    //set the description of the product
    public void setDescription(String description){
        this.description = description;
    }

    //sets the price of product
    public void setPrice(BigDecimal price){
        this.price = price;
    }

    //sets the amount of product stock that is available
    public void setStock(Integer stock){
        this.stock = stock;
    }


}
