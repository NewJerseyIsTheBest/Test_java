import java.util.Scanner;
public class Array_exercise_2 {
	static void flipHorizontally(int[][] arr1) {
		int temp;
		for(int i = 0; i < arr1.length; i++) { 
			for(int j = 0; j < arr1[i].length; j++) {
				temp = arr1[i][0];
				arr1[i][0] = arr1[i][2];
				arr1[i][2] = temp;
				System.out.print(arr1[i][j]);
				
			}
		System.out.println();
		}
			
	}
	static void flipVertically(int[][] arr2) {
		int temp;
		for(int i = 0; i < arr2.length; i++) { 
			for(int j = 0; j < arr2[i].length; j++) {
				temp = arr2[0][j];
				arr2[0][j] = arr2[2][j];
				arr2[2][j] = temp;
				System.out.print(arr2[i][j]);
				
			}
		System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*int[][] array1 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}};*/
		int[][] array1 = new int[3][3];
		System.out.println("Plese enter " + array1.length + " rows and " + array1[0].length + " columns ");
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array1[i].length; j++) {
				
				array1[i][j] = input.nextInt();
				}
			}
		int[][] array2 = {
				{1, 1, 4, 4},
				{2, 2, 5, 5},
				{3, 3, 6, 6}};
		
 		System.out.println("Before excuting the method: ");
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array1[i].length; j++) {
				System.out.print(array1[i][j]);
				}
			System.out.println();
			}
		System.out.println("After excuting the method for flipping horizontally: ");
		flipHorizontally(array1);
		
		System.out.println("Before excuting the method: ");
		for(int i = 0; i < array2.length; i++) {
			for(int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j]);
				}
			System.out.println();
			}
		System.out.println("After excuting the method for flipping vertically: ");
		flipVertically(array2);
	}
}
