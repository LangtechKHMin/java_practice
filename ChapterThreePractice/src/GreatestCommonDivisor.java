import java.util.Scanner;
public class GreatestCommonDivisor {
	public static void main(String[] args) {
		System.out.println("Type the two integers:");
		Scanner n = new Scanner(System.in);
		int A = n.nextInt();
		int B = n.nextInt();
		System.out.println(A+" "+B);
		int C, GCD = 1;
		while (true) {
			if (A > B) {
				C = A-B;
				if (C == 0)
					break;
				else
				{
				GCD = C;
				A = C;
				System.out.println(A+" "+B);
				}
			}
			else
			{
				C = B-A;
				if (C == 0)
					break;
				else
				{
				GCD = C;
				B = C;
				System.out.println(A+" "+B);
				}
			}
		}
		System.out.println("GCD : "+GCD);
	}
}
