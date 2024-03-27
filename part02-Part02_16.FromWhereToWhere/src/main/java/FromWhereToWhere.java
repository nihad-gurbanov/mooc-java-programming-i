
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int n = scanner.nextInt();
        
        System.out.print("Where from? ");
        int m = scanner.nextInt();
        
        for (int i = m; i <= n; i++) {
            System.out.println(i);
        }
    }
}
