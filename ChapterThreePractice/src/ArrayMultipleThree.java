import java.util.Scanner;
public class ArrayMultipleThree {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int intArray[] = new int[10];
		for (int i=0; i<intArray.length; i++) {
			intArray[i] = n.nextInt();
		}
		for (int i=0; i<intArray.length; i++) {
			if (intArray[i]%3 == 0)
				System.out.print(intArray[i]+" ");
		}
	}

}
