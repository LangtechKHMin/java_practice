import java.util.Scanner;
public class RectangleCrush {
	public static void main(String[] args) {
		final int X1 = 50;
		final int Y1 = 50;
		final int X2 = 100;
		final int Y2 = 100;
		int a, b, c, d;
		Scanner points = new Scanner(System.in);
		a = points.nextInt();
		b = points.nextInt();
		c = points.nextInt();
		d = points.nextInt();
		System.out.println("Your points ("+a+", "+b+"), ("+c+", "+d+")");
		if ((((a > X1 && a < X2) && (b > Y1 && b < Y2))) || (((c > X1 && c < X2) && (d > Y1 && d < Y2))))
			System.out.println("Included!");
		else
			System.out.println("Excluded!");
		
	}

}
