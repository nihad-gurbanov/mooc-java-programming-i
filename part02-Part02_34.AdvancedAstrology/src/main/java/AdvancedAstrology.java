
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 1;
        while (i <= size) {
            printSpaces(size-i);
            printStars(i);
            i++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int h = 0; // height
        int s = 1; // spaces
        int st = 1; // stars
        while (h < height) {
            printSpaces(height - s);
            s++;

            printStars(st);
            st += 2;

            h++;
        }
        
        for(int i = 0; i < 2; i++) {
            printSpaces((st-4) / 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
