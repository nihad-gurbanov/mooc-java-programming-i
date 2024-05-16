
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        // implement here a program that reads user input
        // until the user enters 9999
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        Integer input = scanner.nextInt();
        
        while (input != 9999) {
            list.add(input);
            input = scanner.nextInt();
            }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        Integer min = list.get(0);
        int min_index = 0;

        for (int i = 0; i < list.size(); i++) {
             if (list.get(i) < min) {
                min = list.get(i);
                min_index = i;
            } 
        }
        System.out.println("Smallest number: " + min + 
                "\nFound at index: " + min_index);

    }
}
