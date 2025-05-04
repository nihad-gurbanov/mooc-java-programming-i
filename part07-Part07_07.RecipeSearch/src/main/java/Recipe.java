
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
public class Recipe {

    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookTime, ArrayList ingredients) {
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = ingredients;
    }

    public String getName() {
        return this.name;
    }

    public int getCookingTime() {
        return this.cookTime;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookTime;
    }

}
