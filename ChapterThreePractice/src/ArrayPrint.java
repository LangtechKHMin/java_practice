import java.util.Random;
public class ArrayPrint {
	public static void main(String[] args) {
		Random r = new Random();
		int intArray[][] = new int[4][4];
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[0].length; j++) {
				intArray[i][j] = r.nextInt(10);
			}
		}
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("[ ");
			for (int j = 0; j < intArray[0].length; j++) {
				System.out.print(intArray[i][j]+" ");
			}
			System.out.print("]\n");
		}		
	}

}
