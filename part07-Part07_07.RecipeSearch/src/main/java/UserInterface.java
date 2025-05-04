
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nihad
 */
public class UserInterface {
    
    Scanner scanner;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }
    
    
    public void start() {
        ArrayList<Recipe> recipes = new ArrayList<>();

        System.out.println("File to read:");
        String fileName = scanner.nextLine();

        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                String name = file.nextLine().trim();
                if (name.isEmpty()) {
                    continue;
                }
                int cookingTime = Integer.valueOf(file.nextLine());

                ArrayList<String> ingredients = new ArrayList<>();
                while (file.hasNextLine()) {
                    String line = file.nextLine();
                    if (line.isEmpty()) {
                        break;
                    }
                    ingredients.add(line);
                }

                Recipe recipe = new Recipe(name, cookingTime, ingredients);
                recipes.add(recipe);

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        while (true) {
            System.out.println("\nCommands:");
            System.out.println("list - lists the recipes\n"
                    + "stop - stops the program\n"
                    + "find name - searches recipes by name\n"
                    + "find cooking time - searches recipes by cooking time\n"
                    + "find ingredient - searches recipes by ingredient");
            System.out.println("Enter command:");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                return;
            } else if (command.equals("list")) {
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
                break;
            } else if (command.equals("find name")) {
                System.out.println("Searched word:");
                String word = scanner.nextLine();
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getName().toLowerCase().contains(word.toLowerCase())) {
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int maxTime = Integer.parseInt(scanner.nextLine());
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getCookingTime() <= maxTime) {
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getIngredients().contains(ingredient)) {
                        System.out.println(recipe);
                    }
                }
            }

        }

    }
    
    
}
