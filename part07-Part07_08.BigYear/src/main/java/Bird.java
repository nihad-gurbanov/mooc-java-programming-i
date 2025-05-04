/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nihad
 */
public class Bird {
    private String name;
    private String latinName;
    private int observation = 0;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    public int getObservation() {
        return this.observation;
    }
    
    public void addObservation() {
        this.observation += 1;
    }
    
    @Override
    public String toString() {
        return this.name + "(" + this.latinName + "): " + this.observation + " observations";
    }
}
