
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
public class Hold {

    private ArrayList<Suitcase> hold = new ArrayList<>();
    private int maximumWeight = 0;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maximumWeight) {
            hold.add(suitcase);
        }
    }

    public int totalWeight() {
        int sum = 0;

        for (Suitcase suitcase : hold) {
            sum += suitcase.totalWeight();
        }

        return sum;
    }

    @Override
    public String toString() {
        if (hold.isEmpty()) {
            return "no suitcases (0 kg)";
        }

        String measure = hold.size() == 1 ? "suitcase" : "suitcases";
        return hold.size() + " " + measure + "(" + this.totalWeight() + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : hold) {
            suitcase.printItems();
        }
    }

}
