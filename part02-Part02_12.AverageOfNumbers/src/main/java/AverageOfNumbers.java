
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else if (number != 0) {
                count += 1;
                sum += number;
            }
        }
        double avg = sum / count;
        System.out.println("Average of the numbers: " + avg);
    }
}
