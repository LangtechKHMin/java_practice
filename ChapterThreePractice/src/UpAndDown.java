import java.util.Random;
import java.util.Scanner;
public class UpAndDown {
	public static void main(String[] args) {
		int low = 0;
		int high = 99;
		int num;
		Random r = new Random();
		int answer = r.nextInt(100);
		System.out.println("I chose the number, catch my number [0 ~ 100]! (ovo)");
		Scanner trial = new Scanner(System.in);
		while (true) {
			num = trial.nextInt();
			if (num == answer)
			{
				System.out.println("You are Correct!");
				System.out.println("Do you want to try again? (y/n)");
				if(trial.next().equals("n")) {
					break;
				}
				else {
					System.out.println("I chose the number, catch my number ! (ovo)");
					answer = r.nextInt(100); 
					}
			}
			else {
				if (answer > num) {
					low = num;
					System.out.println(low+"-"+high+" Much higher");
				}
				else {
					high = num;
					System.out.println(low+"-"+high+" Much lower");
					}
				}
		}
	}
}
