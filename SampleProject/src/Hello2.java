/*
 * Chapter 2-1
 */
public class Hello2 {
	
	public static int sum(int n, int m) {
		return n+m;
	}

	public static void main(String[] args) {
		int i = 20;
		int s;
		char a;
		
		s = sum(i, 10); //method call
		a = '?';
		System.out.println(a);
		System.out.println("Hello2");
		System.out.println(s);
	}
}