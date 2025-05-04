/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nihad
 */
public class Gift {
    private String name;
    private int weight;
    
    
    public Gift(String name, int weight) {
        if (weight > 0) {
            this.name = name;
            this.weight = weight;
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return "Gift: " + this.name + "(" + this.weight + ")";
    }
    
}
