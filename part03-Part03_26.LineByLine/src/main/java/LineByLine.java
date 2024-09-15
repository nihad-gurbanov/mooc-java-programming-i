
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean play = true;
        
        while (play) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                play = false;
            } else {
                for (String word: input.split(" ")){
                    System.out.println(word);
                }
            }
        }
    }
}
