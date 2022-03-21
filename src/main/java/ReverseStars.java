import java.util.Scanner;

public class ReverseStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number for diamond: ");
        int n = scanner.nextInt();


        for (int i = 1; i < n; i++) {

            for (int k = 0; k < (i + 1); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j < (2 * (n - i)); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}