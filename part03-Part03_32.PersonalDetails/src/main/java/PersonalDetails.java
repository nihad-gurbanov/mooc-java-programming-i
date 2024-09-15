
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumAge = 0;
        int countAge = 0;
        int longestNameLength = 0;
        String longestName = "";
        
        while(true){
            String input = scanner.nextLine();            
            if (input.isEmpty()) {
                break;
            } else {
                String[] data = input.split(",");
                int age = Integer.parseInt(data[1].trim());
                sumAge += age;
                countAge += 1;
                
                String name = data[0].trim();
                        if (name.length() > longestNameLength) {
                            longestNameLength = name.length();
                            longestName = name;
                        }
            }
        }
        double averageYear = (double) sumAge / countAge;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageYear);
    }
}
