
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"alex", "emma"};
        String[] passwords = {"sunshine", "haskell"};
        
        System.out.print("Enter username: ");
        String name = scanner.nextLine();
        System.out.println("");
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.println("");
        
        if ((name.equals(names[0]) && password.equals(passwords[0]))
                || (name.equals(names[1]) && password.equals(passwords[1]))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
