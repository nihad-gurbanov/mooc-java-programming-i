
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            
        
            if (input.isEmpty()) {
            break;
        } else {
                String[] data = input.split(" ");
                System.out.println(data[0]);
            }
        }
    }
}
