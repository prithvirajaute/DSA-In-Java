import java.util.Scanner;

public class AlphaNumericRightIsosceles{

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the no: ");
    int n  = scanner.nextInt();

    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= i; j++){
        System.out.print(j);
        
      }
      System.out.println((char)(i+64));

  }
}
}

  
  

