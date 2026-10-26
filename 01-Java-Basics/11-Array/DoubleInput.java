
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        // Take input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Display original values
        System.out.println("\nValues in the array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Display doubled values
        System.out.println("\n\nDoubled values:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print((arr[i] * 2) + " ");
        }

        System.out.println();

        scanner.close();
    }
}

