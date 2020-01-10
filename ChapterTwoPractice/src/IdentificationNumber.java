import java.util.Scanner;
public class IdentificationNumber {
	public static void main(String[] args) {
		int post, key;
		Scanner num = new Scanner(System.in).useDelimiter("~|-|\\s");
		System.out.println(num.nextInt());
		post = num.nextInt();
		key = num.nextInt();
		switch(key) {
			case 1 :
				System.out.println(post);
				break;
			case 0 :
				System.out.println("confidentials!!!");
				break;
		}
		
	}

}
