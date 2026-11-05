import java.util.Scanner;
public class RightIsoscelesTriangleAlphabet {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the no: ");
    int n = scanner.nextInt();

    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= i; j++){
        System.out.print((char)(j + 64));
      }
      System.out.println();
    }

  }
  
}
