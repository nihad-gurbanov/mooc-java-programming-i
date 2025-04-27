/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nihad
 */
public class Product {
    private double price;
    private int quantity;
    private String name;
    
    public Product(String initialName, double initialPrice, int initalQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initalQuantity;     
    }
    
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }
    
}
