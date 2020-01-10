import java.util.Scanner;
public class PrintAsterisk {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		for (int i = num ; i > 0 ; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");}
			System.out.print("\n");
		}
	}
}
