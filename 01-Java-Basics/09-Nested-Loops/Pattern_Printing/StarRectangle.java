import java.util.Scanner;

public class StarRectangle {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter no of row: ");
    int row = scanner.nextInt();
    
    System.out.println("Enter no of column: ");
    int cloumn = scanner.nextInt();

    for(int i = 1; i <= row; i++){
      for(int j = 1; j <= cloumn; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
