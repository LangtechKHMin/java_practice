import java.util.Scanner;
public class ArithmeticOperator {
	public static void main(String[] args) {
		int time;
		int second;
		int minute;
		int hour;
		Scanner input = new Scanner(System.in);
		System.out.println("Type the Interger in seconds:");
		time = input.nextInt();
		second = time%60;
		minute = (time/60)%60;
		hour = (time/60)/60;
		System.out.println(hour+"h "+minute+"min "+second+"sec");
	}

}
