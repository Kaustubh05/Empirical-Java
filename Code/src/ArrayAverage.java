import java.util.Scanner;

public class ArrayAverage {
	private static Scanner scanner;

	public static void main(String[] args) {

	scanner = new Scanner(System.in);
	int sum =0;
	
	System.out.println("Enter the number of elements you want in the array\n");
	int[] intArray = new int[scanner.nextInt()];
	
	System.out.println("Enter the"+ "elements\n");
	
	for (int i =0; i<intArray.length;i++) {
		intArray[i] = scanner.nextInt();
	}
	
	for(int i =0;i<intArray.length;i++) {
		System.out.println("Your Array is:"+intArray[i]);
	}
	
	for(int i =0;i<intArray.length;i++) {
	sum = sum + intArray[i];
	}
	int average = sum/intArray.length;
	
	System.out.println("The Average is:" + average);
	}
		
}
