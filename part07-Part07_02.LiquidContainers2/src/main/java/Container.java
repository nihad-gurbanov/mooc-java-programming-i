/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nihad
 */
public class Container {
    private int volume;
    
    public Container() {
        this.volume = 0;       
    }
    
    public int contains() {
        return this.volume;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.volume += amount;
            if (this.volume > 100) {
                this.volume = 100;
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            volume -= amount;
            if (volume < 0) {
                volume = 0;
            }
        }
    }
    
    @Override
    public String toString() {
        return this.volume + "/100";
    }
    
}
