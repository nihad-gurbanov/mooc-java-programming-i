
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        while(true) {
            String userInput = scanner.nextLine();
            
            if (userInput.toLowerCase().equals("end")) {
                break;
            }
            try {
                int number = Integer.parseInt(userInput);
                System.out.println(number * number * number);
            } catch (NumberFormatException e) {
                System.out.println("Wrong number format!");
            }
        }

    }
}
