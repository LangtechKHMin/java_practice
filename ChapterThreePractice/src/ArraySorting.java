import java.util.Scanner;
public class ArraySorting {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int intArray[] = new int[5];
		int temp, max_val, max_idx;
		for (int i=0; i<intArray.length; i++) {
			intArray[i] = n.nextInt();
		}
		
		for (int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
		System.out.print("\n");
		
		for (int j = intArray.length-1; j > 0; j--) {
			max_val = intArray[j];
			max_idx = j;
			for (int i=0; i<j; i++) {
				if (intArray[i] > max_val) {
					max_val = intArray[i];
					max_idx = i;
				}
				else
					continue;
			}
			temp = intArray[j];
			intArray[j] = intArray[max_idx];
			intArray[max_idx] = temp;
		}
		for (int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
	}
}
