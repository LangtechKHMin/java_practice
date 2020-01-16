import java.util.Scanner;
public class Reserve {
	public static String rArray[][] = new String[3][10];
	private String name;
	private int seat, index;

	
	public static void main(String[] args) {
		String cname;
		for (int i=0; i<3; i++) {
			for (int j=0; j<10; j++) {
				Reserve.rArray[i][j] = "___";
			}
		}
		
		int task;
		Scanner userInput = new Scanner(System.in);
		while (true)
		{
		System.out.println("Reserve<1>, List<2>, Cancel<3>, Quit<4> >>>");
		task = userInput.nextInt();
		if (task == 4)
			break;
		else
		{
		switch (task) {
		case 1:
			System.out.println("What is your type of seat? S<1>, A<2>, B<3> >>>");
			int tmp = userInput.nextInt();
			switch (tmp) {
			case 1:
				System.out.print("S>>>");
				break;
			case 2:
				System.out.print("A>>>");
				break;
			case 3:
				System.out.print("B>>>");
				break;
			}
			for (int i=0; i<10; i++)
				System.out.print(Reserve.rArray[tmp-1][i]+" ");
			System.out.print("\n");
			Reserve obj;
			obj = new Reserve();
			obj.seat = tmp-1;
			System.out.print("NAME>>>");
			obj.name = userInput.next();
			System.out.print("NUMBER>>>");
			obj.index = userInput.nextInt()-1;
			Reserve.rArray[obj.seat][obj.index] = obj.name;
			break;
		case 2:
			System.out.println("<List System>");
			System.out.print("S>>>");
			for (int i=0; i<10; i++)
				System.out.print(Reserve.rArray[0][i]+" ");
			System.out.print("\n");
			System.out.print("A>>>");
			for (int i=0; i<10; i++)
				System.out.print(Reserve.rArray[1][i]+" ");
			System.out.print("\n");
			System.out.print("B>>>");
			for (int i=0; i<10; i++)
				System.out.print(Reserve.rArray[2][i]+" ");
			System.out.print("\n");
			break;
		case 3:
			System.out.println("<Cancel System>");
			System.out.println("What is your type of seat? S<1>, A<2>, B<3> >>>");
			int ctmp = userInput.nextInt();
			switch (ctmp) {
			case 1:
				System.out.print("S>>>");
				break;
			case 2:
				System.out.print("A>>>");
				break;
			case 3:
				System.out.print("B>>>");
				break;
			}
			for (int i=0; i<10; i++)
				System.out.print(Reserve.rArray[ctmp-1][i]+" ");
			System.out.print("\n");
			System.out.print("NAME>>>");
			cname = userInput.next();
			for (int i=0; i<10; i++)
			{
				if (cname.equals(Reserve.rArray[ctmp-1][i]))
					Reserve.rArray[ctmp-1][i] = "___";
				else
					continue;
			}
			break;
		}
		}
	}
}
}
