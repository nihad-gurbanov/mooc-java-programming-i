
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Duration");
            String durationInput = scanner.nextLine();

            try {
                int duration = Integer.parseInt(durationInput);
                programs.add(new TelevisionProgram(name, duration));
            } catch (NumberFormatException e) {
                System.out.println("Wrong number format!");
            }
        }

        System.out.println("Program's maximum duration?");

        try {
            int askedDuration = Integer.parseInt(scanner.nextLine());
            for (TelevisionProgram tvProgram : programs) {
                if (tvProgram.getDuration() <= askedDuration) {
                    System.out.println(tvProgram);
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("Wrong number format!");
        }

    }

}
