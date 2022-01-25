
import java.util.Scanner;
public class test {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] array1 = new int[10];
    System.out.println("Please enter " + array1.length + " numbers to have them sorted: ");
    for(int i = 0; i < array1.length; i++) {
      array1[i] = input.nextInt();
    }
    
    System.out.print("Original Array: ");
      for (int i = 0; i < array1.length; i++) {
       System.out.print(array1[i]+" ");
      }
      
    System.out.print("\nResult: ");
    orderEvenBeforeOdd(array1);
    System.out.println();

  }
  static void orderEvenBeforeOdd(int[] array1) {
    for(int i = 0; i < array1.length; i++) {
      if(array1[i] % 2 == 0) {
        System.out.print(array1[i] + ", ");}    
    }
    for(int j = 0; j < array1.length; j++)
      if(array1[j] % 2 == 1)
        System.out.print(array1[j] + ", ");
    
  }
  
  
}
