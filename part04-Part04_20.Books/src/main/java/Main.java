
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Books> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages");
            String pagesInput = scanner.nextLine();

            System.out.println("Publication year:");
            String yearInput = scanner.nextLine();

            try {
                int pages = Integer.parseInt(pagesInput);
                int year = Integer.parseInt(yearInput);
                books.add(new Books(title, pages, year));

            } catch (NumberFormatException e) {
                System.out.println("Wrong number format!");
            }

        }

        System.out.println("What information will be printed?");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("everything")) {
            for (Books book : books) {
                System.out.println(book);
            }
        } else if (choice.equals("name")) {
            for (Books book : books) {
                System.out.println(book.getTitile());
            }
        }

    }
}
