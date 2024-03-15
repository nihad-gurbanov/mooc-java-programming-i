
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        int sum = first + second;
        int subtract = first - second;
        int product = first * second;
        double division = first / (double)second;
        
        System.out.println(first + " + " + second + " = " + sum);
        System.out.println(first + " - " + second + " = " + subtract);
        System.out.println(first + " * " + second + " = " + product);
        System.out.println(first + " / " + second + " = " + division);

    }
}
