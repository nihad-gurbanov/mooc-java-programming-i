
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        System.out.print("Search for? ");
        System.out.println("");
        Integer number = scanner.nextInt();
        
        for (int i = 0; i < list.size(); i++) {
            if (number.equals(list.get(i))) {
                System.out.println(number + " is at index " + i);
            }
        }    
    }
}
