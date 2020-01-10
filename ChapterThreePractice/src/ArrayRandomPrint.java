import java.util.Random;
public class ArrayRandomPrint {
	public static void main(String[] args) {
		Random r = new Random();
		int intArray[][] = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		int a, b, c;
		
		for (int i = 0; i<8;i++) {
			while (true) {
			a = r.nextInt(4);
			b = r.nextInt(4);
			if (intArray[a][b] != 0)
				continue;
			else
				break;
			}
			while (true) {
			c = r.nextInt(10);
			if (c!=0)
			{
				intArray[a][b] = c;
				break;
			}
			else
				continue;
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