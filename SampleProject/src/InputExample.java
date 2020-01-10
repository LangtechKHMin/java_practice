//import java.io.*;
import java.util.Scanner;
public class InputExample {
	public static void main(String[] args) {
		//InputStreamReader rd = new InputStreamReader(System.in);
		Scanner a = new Scanner(System.in);
		System.out.println(a);
		System.out.println("Type your Age, Weight, Height sequently:\n");
		System.out.println("Your Age is "+a.nextInt()+".");
		System.out.println("Your Weight is "+a.nextDouble()+".");
		System.out.println("Your Height is "+a.nextDouble()+".");
		/*
		try {
			while (true) {
				int a = rd.read();
				if (a == 'a') //'a' : input termination
					break;
				System.out.println((char)a);
			}
		}
		catch (IOException e) {
			System.out.println("Input Error!");
		}
		*/
	}

}
