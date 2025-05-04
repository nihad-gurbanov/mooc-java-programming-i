
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int change = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(change);
            } else if (command.equals("remove")) {
                second.remove(change);
            } else if (command.equals("move") && change > 0) {
                if (first.contains() >= change) {
                    first.remove(change);
                    second.add(change);
                } else {
                    int all = first.contains();
                    first.remove(all);
                    second.add(all);
                }
            }
        }
    }

}
