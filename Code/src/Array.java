
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intArray = new int[10];
		
		intArray[4] = 18;
		
		System.out.println(intArray[4]);
		
		int [] intArraySecond = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i =0;i<10;i++) {
			System.out.println("The value at"+  (i+1) + "initialization" + "is:"+ intArraySecond[i]);
		}
		
		int[] arrayThird = new int[10];
		
		for (int i =0 ; i<arrayThird.length ; i++) {
			arrayThird[i] = i*10;
		}
		for(int i =0; i<arrayThird.length;i++) {
			System.out.println("The Value at" + (i+1) + "third Initialization"+ "is:" + arrayThird[i]);
		}
	}

}
