
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        double sum = 0;
        int count = 0;

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        while(true) {
            double input = scanner.nextDouble();
            if (input == -1) {
                break;
            }
            sum += input;
            count++;
        }
        double average = sum / count;
        
        System.out.println("Average: " + average);
    }
}
