package pl.edu.wszib.models;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Entity
public class Product {

    private String name;
    private String manufacturer;
    private int quantity;
    private int product_id;


    public Product(){

    }

    public Product(String name, String manufacturer, int quantity, int product_id) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.product_id = product_id;
    }

    public void lowerQuantity(){
        this.quantity--;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void show(){
        System.out.println("Show must go on");
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", quantity=" + quantity +
                ", product_id=" + product_id +
                '}';
    }
}
