
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        System.out.print("Give a string: ");
        System.out.print("");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        
        if (input.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
        

    }
}
