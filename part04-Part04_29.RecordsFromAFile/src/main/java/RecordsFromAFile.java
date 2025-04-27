
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        
        String file = scanner.nextLine();
        
        try (Scanner fileName = new Scanner(Paths.get(file))) {
            while (fileName.hasNextLine()) {
                String row = fileName.nextLine();
                String[] list = row.split(",");
                
                String name = list[0];
                int age = Integer.valueOf(list[1]);
                
                System.out.println(name + ", age: " + age + (age == 1? " year": " years"));
            }
        } catch (Exception e) {
            
        }
 
    }
}
