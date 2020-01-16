
public class Goods {
	String name;
	int price;
	int numberOfStock;
	int sold;
	
	public static void main(String[] args) {
		Goods camera = new Goods();//Object Generation
		camera.name = "Nikon";
		camera.numberOfStock = 30;
		camera.sold = 50;
		System.out.println("Goods name :"+camera.name);
	}
}
