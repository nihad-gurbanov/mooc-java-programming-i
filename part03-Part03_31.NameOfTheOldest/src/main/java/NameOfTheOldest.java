
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name = "";
        
        while(true){
            String input = scanner.nextLine();            
            if (input.isEmpty()) {
                break;
            } else {
                String[] data = input.split(",");
                if(Integer.valueOf(data[1]) > oldest) {
                    oldest = Integer.valueOf(data[1]);
                    name = data[0];
                }
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
