
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number? ");
        int n = scanner.nextInt();
        
        int sum = 0;
        int sequence_start = 0;
        for (int i = 0; i <= n; i++) {
            sum += sequence_start;
            sequence_start += 1;
            
        }
        System.out.println("The sum is " + sum);
    }
}
