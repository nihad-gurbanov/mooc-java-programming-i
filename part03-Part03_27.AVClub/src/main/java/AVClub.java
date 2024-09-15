
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean play = true;
        while(play) {
            String input = scanner.nextLine();   

            if (input.isEmpty()) {
                play = false;
            } else {
                for (String word: input.split(" ")) {
                    if (word.contains("av")) {
                        System.out.println(word);
                    }
                }
            }
        }
    }
}
