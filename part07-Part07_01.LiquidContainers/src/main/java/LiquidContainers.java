
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            int change = Integer.valueOf(parts[1]);

            if (parts[0].equals("add") && change > 0) {
                first += change;
                if (first > 100) {
                    first = 100;
                }
            } else if (parts[0].equals("move") && change > 0 && first > 0) {
                if (first >= change) {
                    first -= change;
                    second += change;
                    if (second > 100) {
                        second = 100;
                    }
                } else {
                    second += first;
                    first = 0;
                    if (second > 100) {
                        second = 100;
                    }
                }

            } else if (parts[0].equals("remove") && change > 0 && second > 0) {
                second -= change;
                if (second < 0) {
                    second = 0;
                }
            }

        }

    }

}
