import java.util.Scanner;
public class DecisionPoint {
	public static void main(String[] args) {
		final int X1 = 50;
		final int Y1 = 50;
		final int X2 = 100;
		final int Y2 = 100;
		int a, b;
		Scanner points = new Scanner(System.in);
		a = points.nextInt();
		System.out.println(a);
		b = points.nextInt();
		System.out.println(b);
		System.out.println("Your points ("+a+", "+b+")");
		if ((a > X1 && a < X2) && (b > Y1 && b < Y2))
			System.out.println("Included!");
		else
			System.out.println("Excluded!");
		
	}

}
