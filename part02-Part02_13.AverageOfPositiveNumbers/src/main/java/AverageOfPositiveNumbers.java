
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        double sum = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number > 0) {
                sum += number;
                count += 1;
            } else if (number == 0 && sum == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (number == 0) {
                double avg = sum / count;
                System.out.println(avg);
                break;
            }
        }
    }
}
