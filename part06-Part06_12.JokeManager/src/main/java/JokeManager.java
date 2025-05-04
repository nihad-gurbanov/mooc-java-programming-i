
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nihad
 */
public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.size() > 0) {
            Random draw = new Random();
            int random = draw.nextInt(jokes.size());
            return jokes.get(random);
        }
        return "Jokes are in short supply.";

    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }

}
