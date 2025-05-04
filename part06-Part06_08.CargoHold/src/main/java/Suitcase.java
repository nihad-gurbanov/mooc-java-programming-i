import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nihad
 */
public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> items = new ArrayList<>();
    
    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }
    
    
    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maximumWeight) {
            items.add(item);
        }
    }
    
    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
                
        String measure = items.size() == 1 ? "item" : "items";
        
        return items.size() + " " + measure +" (" + this.totalWeight() + " kg)";
    }
    
    public void printItems() {
        for (Item item: items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {  
        int sum = 0;
        for (Item item: items) {
            sum += item.getWeight();
        }
        return sum;
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        
        Item heaviest = items.get(0);
        
        for (Item item: items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
}
