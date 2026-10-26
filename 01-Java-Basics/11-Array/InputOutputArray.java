
import java.util.Scanner;

public class InputOutputArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of the array:");

        int arr[] = new int[7];

        for (int i = 0; i < arr.length; i++) {
            int x = scanner.nextInt();
            arr[i] = x;
        }

        System.out.println("Array elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        
    }
}

