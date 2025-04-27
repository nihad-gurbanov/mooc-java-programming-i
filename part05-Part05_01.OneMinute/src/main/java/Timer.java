/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nihad
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand hunderths;
    
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hunderths = new ClockHand(100);
    }
    
    public void advance() {
        hunderths.advance();
        if (this.hunderths.value() == 0) {
            this.seconds.advance();
        }
    }
    
    public String toString() {
        return seconds + ":" + hunderths;
    }
}
