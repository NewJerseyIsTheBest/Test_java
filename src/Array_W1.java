import java.util.Scanner;
public class Array_W1 {
	static void orderEvenBeforeOdd(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.print(arr[i] + ", ");}		
		}
		for(int j = 0; j < arr.length; j++)
			if(arr[j] % 2 == 1)
				System.out.print(arr[j] + ", ");
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array1 = new int[10];
		System.out.println("Please enter " + array1.length + " numbers ");
		for(int i = 0; i < array1.length; i++) {
			array1[i] = input.nextInt();
		}
		int[] array2 = {2, 4, 6, 1, 8};
		int[] array3 = {2, 4, 6, 8, 1};
		System.out.print("The array after excution is ");
		orderEvenBeforeOdd(array1);
		System.out.println();
		System.out.print("The array after excution is ");
		orderEvenBeforeOdd(array2);
		System.out.println();
		System.out.print("The array after excution is ");
		orderEvenBeforeOdd(array3);
		
		
	}
	
}
