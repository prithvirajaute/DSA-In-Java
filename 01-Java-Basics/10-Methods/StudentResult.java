public class StudentResult {
  static double total = 0 ;

  public static void calculateTotal(){
    int physic = 78;
    int chemistry = 85;
    int maths = 92;
    total = physic + chemistry + maths;
    System.out.println("Total: " + total);
  }

  public static void calculateAverage(){
    double average = total / 3;
    System.out.println("Average: " + average);
  }

  public static void main(String[] args) {
    calculateTotal();;
   calculateAverage(); 
  }
}
