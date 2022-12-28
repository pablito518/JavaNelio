package entities;

import java.text.MessageFormat;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public Product(){
        
    }

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}, $ {1}, {2} units, Total: $ {3}", name, String.format("%.2f",price), quantity, totalValueInStock());
    }
}
