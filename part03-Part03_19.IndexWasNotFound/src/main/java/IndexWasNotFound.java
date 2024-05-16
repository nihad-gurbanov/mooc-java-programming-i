

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        System.out.println("");
        int searching = Integer.valueOf(scanner.nextLine());
        boolean isSearching = true;
        int i = 0;
        
        while(isSearching && i < array.length) {
            if (array[i] == searching) {
                System.out.println(searching + " is at index " + i + ".");
                isSearching = false;
            }
            i++;
        }
        if (isSearching) {
            System.out.println(searching + " was not found.");

        }
    }

}
