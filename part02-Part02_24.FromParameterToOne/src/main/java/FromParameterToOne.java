

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    public static void printFromNumberToOne(int number) {
        int i = number;
        while (1 <= i) {
            System.out.println(i);
            i--;
        }
    }

}
