import java.util.Scanner;

public class AlphanumericIsoscelesRightAngledTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print((char)('1' + (1 - i % 2) * 16 + j) + " ");
            }

            System.out.println();
        }
    }
}