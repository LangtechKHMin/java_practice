import java.util.Scanner;
import java.util.Vector;
public class ProductInfo {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		while (true) {
			System.out.print("Add<1>, List<2>, Quit<3> >>>");
			switch (userInput.nextInt()) {
				case 1:
					System.out.print("Product Type Book<1>, CompactDisc<2>, ConversationBook<3> >>>");
					switch (userInput.nextInt()) {
					case 1:
						Book obj1 = new Book();
						System.out.print("Description>>>");
						obj1.setDescription(userInput.next());
						System.out.print("Producer>>>");
						obj1.setProducer(userInput.next());
						System.out.print("Price>>>");
						obj1.setPrice(userInput.next());
						System.out.print("ISBN>>>");
						obj1.setIsbn(userInput.next());
						System.out.print("Author>>>");
						obj1.setAuthor(userInput.next());
						System.out.print("Title>>>");
						obj1.setTitle(userInput.next());
						Product.pArray.add(obj1);
						break;
					case 2:
						CompactDisc obj2 = new CompactDisc();
						System.out.print("Description>>>");
						obj2.setDescription(userInput.next());
						System.out.print("Producer>>>");
						obj2.setProducer(userInput.next());
						System.out.print("Price>>>");
						obj2.setPrice(userInput.next());
						System.out.print("Album_Title>>>");
						obj2.setAlbumtitle(userInput.next());
						System.out.print("Singer>>>");
						obj2.setSinger(userInput.next());
						Product.pArray.add(obj2);
						break;
					case 3:
						ConversationBook obj3 = new ConversationBook();
						System.out.print("Description>>>");
						obj3.setDescription(userInput.next());
						System.out.print("Producer>>>");
						obj3.setProducer(userInput.next());
						System.out.print("Price>>>");
						obj3.setPrice(userInput.next());
						System.out.print("ISBN>>>");
						obj3.setIsbn(userInput.next());
						System.out.print("Author>>>");
						obj3.setAuthor(userInput.next());
						System.out.print("Title>>>");
						obj3.setTitle(userInput.next());
						System.out.print("Language>>>");
						obj3.setLanguage(userInput.next());
						Product.pArray.add(obj3);
						break;
					}
					break;
				case 2:
					for(int j=0; j<Product.pArray.size();j++) {
						System.out.print("ID :"+j+"\n");
						Product.pArray.get(j).call();
					}
					break;
				case 3:
					System.exit(1);
				}
			}
		}
}

	class Product{
		public static Vector<Product> pArray = new Vector<Product>(10);
		protected String description;
		protected String producer;
		protected String price;
		public static int n = 0;
		
		protected void setDescription(String s) {
			this.description = s;
		}
		
		protected void setProducer(String s) {
			this.producer = s;
		}
		protected void setPrice(String s) {
			this.price = s;
		}
		protected void call() {
			System.out.print("Description :"+this.description+"\nProducer :"+this.producer+"\nPrice :"+this.price);
		}
	}
	
	class Book extends Product {
		protected String isbn;
		protected String author;
		protected String title;
		protected void setIsbn(String s) {
			this.isbn = s;
		}
		protected void setAuthor(String s) {
			this.author = s;
		}
		protected void setTitle(String s) {
			this.title = s;
		}
		protected void call() {
			System.out.print("Description :"+this.description+"\nProducer :"+this.producer+"\nPrice :"+this.price);
			System.out.print("\nISBN :"+this.isbn+"\nAuthor :"+this.author+"\nTitle :"+this.title+"\n");
		}
	}
	
	class CompactDisc extends Product {
		protected String albumtitle;
		protected String singer;
		protected void setAlbumtitle(String s) {
			this.albumtitle = s;
		}
		protected void setSinger(String s) {
			this.singer = s;
		}
		protected void call() {
			System.out.print("Description :"+this.description+"\nProducer :"+this.producer+"\nPrice :"+this.price);
			System.out.print("\nAlbum_Title :"+this.albumtitle+"\nSinger :"+this.singer+"\n");
		}
	}
	
	class ConversationBook extends Book {
		protected String language;
		protected void setLanguage(String s) {
			this.language = s;
		}
		protected void call() {
			System.out.print("Description :"+this.description+"\nProducer :"+this.producer+"\nPrice :"+this.price);
			System.out.print("\nISBN :"+this.isbn+"\nAuthor :"+this.author+"\nTitle :"+this.title);
			System.out.print("\nLanguage :"+this.language+"\n");
		}
	}
	
