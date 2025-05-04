
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

    private Scanner scanner;
    private TodoList todolist;

    public UserInterface( TodoList todolist, Scanner scanner) {
        this.scanner = scanner;
        this.todolist = todolist;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
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
            case "list":
                list();
                break;
            case "remove":
                remove();
                break;
            default:
                System.out.println("Unknown command");

        }
    }

    private void add() {
        System.out.println("To add:");
        String task = scanner.nextLine();
        todolist.add(task);
    }

    private void list() {
        todolist.print();
    }

    private void remove() {
        System.out.println("Which one is removed?");
        int id = Integer.valueOf(scanner.nextLine());

        todolist.remove(id);
    }
}
