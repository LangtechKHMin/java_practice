import java.util.Scanner;
public class CountOneBinary {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		String bNum = Integer.toBinaryString(num);
		System.out.println(bNum);
		int len = bNum.length();
		//System.out.println(len);
		int count = 0;
		for (int i=0;i<len;i++) {
			//System.out.println(bNum.charAt(i));
			if (bNum.charAt(i) == '1') {
				count += 1;
			}
		}
		System.out.println(count);
		//for (String e : nNums)
		//	System.out.println(e);
	}

}
