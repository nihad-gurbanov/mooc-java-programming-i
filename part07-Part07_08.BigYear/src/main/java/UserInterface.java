
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
    private ArrayList<Bird> birds;
    private Scanner scanner;
    
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
        this.birds = new ArrayList<>();
    }
    
    public void start() {
        System.out.println("?");
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("Quit")) {
                return;
            } else if (input.equals("Add")) {
                add();
            } else if (input.equals("Observation")) {
                addObservation();
            } else if (input.equals("All")) {
                printBirds();
            } else if (input.equals("One")) {
                printOne();
            }
        }
        
    }
    
    private void add() {
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Name in Latin:");
        String latinName = scanner.nextLine();
        Bird bird = new Bird(name, latinName);
        birds.add(bird);
    }
    
    private void addObservation() {
        System.out.println("Bird?");
        String searchedBird = scanner.nextLine();
        boolean found = false;
        
        for (Bird bird: birds) {
            if (bird.getName().equals(searchedBird)) {
                bird.addObservation();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not a bird!");
        }
    }
    
    private void printBirds() {
        for (Bird bird: birds) {
            System.out.println(bird);
        }
    }
    
    private void printOne() {
        System.out.println("Bird?");
        
        String name = scanner.nextLine();
        boolean found = false;
        
        for (Bird bird: birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                found = true;
                break;
            }
        }
  
        if(!found) {
            System.out.println("Not a bird!");
        }   
    }
}
