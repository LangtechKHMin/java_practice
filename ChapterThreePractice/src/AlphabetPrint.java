import java.util.Scanner;
public class AlphabetPrint {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		char c = n.nextLine().charAt(0);
		int a = (int)c;
		for (int j = a; j > 96; j--) {
		for (int i = 97; i < j+1; i++)
			System.out.print((char)i);
		System.out.print('\n');
		}
	}
}
