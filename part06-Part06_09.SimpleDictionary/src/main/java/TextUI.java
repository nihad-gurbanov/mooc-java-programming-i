
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
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");

            String input = scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            processCommand(input);
            System.out.println();
        }
    }

    private void processCommand(String command) {
        switch (command) {
            case "add":
                add();
                break;
            case "search":
                search();
                break;
            default:
                System.out.println("Unknown command");
        }
    }

    private void add() {
        System.out.println("Word:");
        String word = scanner.nextLine();
        System.out.println("Translation:");
        String translation = scanner.nextLine();

        dictionary.add(word, translation);
    }

    private void search() {
        System.out.println("To be translated:");
        String search = scanner.nextLine();

        String translated = dictionary.translate(search);

        if (translated == null) {
            System.out.println("Word " + search + " was not found");
        } else {
            System.out.println("Translation: " + translated);

        }
    }

}
