import java.util.Scanner;

public class ArrayScanner {
	private static Scanner scanner;

	public static void main(String[] args) {

	scanner = new Scanner(System.in);
	
	System.out.println("Enter the number of elements you want in the array\n");
	int[] intArray = new int[scanner.nextInt()];
	
	System.out.println("Enter the"+ "elements\n");
	
	for (int i =0; i<intArray.length;i++) {
		intArray[i] = scanner.nextInt();
	}
	
	for(int i =0;i<intArray.length;i++) {
		System.out.println("Your Array is:"+intArray[i]);
	}
		
	}
		
}
