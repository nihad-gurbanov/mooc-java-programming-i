/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nihad
 */
public class Counter {
    private int startValue;
    
    public Counter() {
        this.startValue = 0;
    }
    
    public Counter(int startValue) {
        this.startValue = startValue;
    }
    
    public int value() {
        return startValue;
    }
    
    public void increase() {
//        startValue += 1;
        this.increase(1);
    }
    
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            startValue += increaseBy;
        }        
    }
    
    public void decrease() {
//        startValue -= 1;
        this.decrease(1);
    }
    
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            startValue -= decreaseBy;
        }        
    }
    
    
}
