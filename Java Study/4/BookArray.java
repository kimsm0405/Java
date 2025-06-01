import java.util.Scanner;

class Book1 {
	String title, author;
	public Book1(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {

	public static void main(String[] args) {
		Book1 [] book1 = new Book1[2];
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<book1.length; i++) {
			System.out.println("제목>>");
			String title = scanner.nextLine();
			System.out.println("저자>>");
			String author = scanner.nextLine();
			book1[i] = new Book1(title, author);
		}
		
		for(int i=0; i<book1.length; i++)
			System.out.println("(" + book1[i].title + ", " + book1[i].author + ")");
		
		scanner.close();
	}
}
